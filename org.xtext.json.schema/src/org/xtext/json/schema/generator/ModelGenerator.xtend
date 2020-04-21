package org.xtext.json.schema.generator

import java.util.List
import org.xtext.json.schema.draft7.*
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.json.schema.generator.GeneratorUtils
import java.util.ArrayList
import org.xtext.json.schema.draft7.impl.NamedSchemaImpl
import org.xtext.json.schema.draft7.impl.CustomNamedSchema
import org.xtext.json.schema.draft7.impl.CustomAnyString
import org.eclipse.emf.common.util.EList
import org.xtext.json.schema.draft7.AbstractSchema

class ModelGenerator {
	
	List<CustomModel> objectList
	Schema root
	new(List<CustomModel> objectList, Schema root){
		this.objectList = objectList
		this.root = root
	}
	
	def generateModelFile(CustomModel model, IFileSystemAccess2 fsa) {
		System.out.println("Test")
		fsa.generateFile("model/" +model.name.toFirstUpper+".java", model.generateModel)
	}
	
	def CharSequence generateModel(CustomModel model) {
		if(model.name.equals("channels")){
			System.out.println("rip")
		}
		var allProperties = (model.model as Schema).allProperties
		return '''
		package model;
		import java.util.*;
		«model.generateModelImports(allProperties)»
		/**
		 *
		 * @author Generated
		 */
		public class «model.name.toFirstUpper» {
			«model.generateModelProperties(allProperties)»
			«model.generateModelConstructor(allProperties)»
			«model.generateModelGetSet(allProperties)»
		}
		'''
	}
	
	var anonymCounter = 0
	def List<NamedSchema> allProperties(Schema schema){
		var list = new ArrayList<NamedSchema>()
		if(schema !== null){
			if(schema.properties !== null && !schema.properties.isEmpty){
				list.addAll(schema.properties)
			}
			if(schema.additionalProperties !== null){
				var additionalPropertiesSchema = schema.additionalProperties.schema
				if(additionalPropertiesSchema !== null){
					if(GeneratorUtils.isReference(additionalPropertiesSchema)){
						var newNamedSchema = new CustomNamedSchema()
						newNamedSchema.schema = additionalPropertiesSchema
						newNamedSchema.name = new CustomAnyString(GeneratorUtils.getReferenceName(additionalPropertiesSchema))
						list.add(newNamedSchema as NamedSchema)
					}else if(GeneratorUtils.isSchema(additionalPropertiesSchema)){
						list.addAll(allProperties(additionalPropertiesSchema as Schema))
					}
				}
			}
			
			if(schema.anyOfs !== null && !schema.anyOfs.isEmpty){
				list.addAll(schema.anyOfs.allComplexityProperties)
			}
			if(schema.allOfs !== null && !schema.allOfs.isEmpty){
				list.addAll(schema.allOfs.allComplexityProperties)
			}
			if(schema.oneOfs !== null && !schema.oneOfs.isEmpty){
				list.addAll(schema.oneOfs.allComplexityProperties)
			}
			
			
		}
		return list
	}
	
	def List<NamedSchema> allComplexityProperties(List<AbstractSchema> complex){
		var newComplexList = complex.clone()
		var list = new ArrayList<NamedSchema>()
		for(AbstractSchema anyOfAbstractSchema: newComplexList){
			var newNamedSchema = new CustomNamedSchema()
			newNamedSchema.schema = anyOfAbstractSchema
			if(GeneratorUtils.isReference(anyOfAbstractSchema)){
				newNamedSchema.name = new CustomAnyString(GeneratorUtils.getReferenceName(anyOfAbstractSchema))
			}else if(GeneratorUtils.isSchema(anyOfAbstractSchema)){
				var anyOfSchema = anyOfAbstractSchema as Schema
				if(anyOfSchema.title !== null){
					newNamedSchema.name = new CustomAnyString(anyOfSchema.title.replace(" ", ""))
				}else if(anyOfSchema.id !== null){
					newNamedSchema.name = new CustomAnyString(GeneratorUtils.realizeName(anyOfSchema.id).replace(" ", ""))
				}else{
					newNamedSchema.name = new CustomAnyString("anonym" + (anonymCounter++))
				}
			}
			list.add(newNamedSchema)
		}
		list
	}
	
	def CharSequence generateModelImports(CustomModel model, List<NamedSchema> allProperties){
		return '''
		«FOR property:allProperties»
			«var schema = GeneratorUtils.isSchema(property.schema) ? (property.schema as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((property.schema as Reference).uri),root)»
			«IF GeneratorUtils.isObject(schema)»
			import model.«GeneratorUtils.realizeName(property.name).toFirstUpper»;
			«ELSE»
			import model.«GeneratorUtils.getReferenceName(property.schema).toFirstUpper»;
			«ENDIF»
		«ENDFOR»
		'''
	
	}
	
	def CharSequence generateModelGetSet(CustomModel model, List<NamedSchema> allProperties){
		return '''
		«FOR property:allProperties»
			«var schema = GeneratorUtils.isSchema(property.schema) ? (property.schema as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((property.schema as Reference).uri),root)»
			«IF schema !== null && schema.type !== null»
				«FOR type:schema.type.jsonTypes»
					«IF GeneratorUtils.toJavaType(schema, type, property.name) !== null»
					/**
					* @param «GeneratorUtils.realizeName(property.name).toFirstLower» to set
					*/
					public void set«GeneratorUtils.realizeName(property.name).toFirstUpper»(«GeneratorUtils.toJavaType(schema, type, property.name)» «GeneratorUtils.realizeName(property.name).toFirstLower»){
						this.«GeneratorUtils.realizeName(property.name).toFirstLower» = «GeneratorUtils.realizeName(property.name).toFirstLower»;
					}
					
					/**
					* @return the «GeneratorUtils.realizeName(property.name).toFirstLower»
					*/
					public «GeneratorUtils.toJavaType(schema, type, property.name)» get«GeneratorUtils.realizeName(property.name).toFirstUpper»(){
						return «GeneratorUtils.realizeName(property.name).toFirstLower»;
					}
					«ENDIF»
				«ENDFOR»
			«ENDIF»
		«ENDFOR»
		'''
	}
	def CharSequence generateModelProperties(CustomModel model, List<NamedSchema> allProperties){
		return '''
		«FOR property:allProperties»
			«var schema = GeneratorUtils.isSchema(property.schema) ? (property.schema as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((property.schema as Reference).uri),root)»
			«IF schema !== null»
				«IF schema.type !== null»
					«FOR type:schema.type.jsonTypes»
						«IF GeneratorUtils.toJavaType(schema, type, property.name) !== null»
						private «GeneratorUtils.toJavaType(schema, type, property.name)» «GeneratorUtils.realizeName(property.name).toFirstLower»;
						«ENDIF»
					«ENDFOR»
				«ENDIF»
			«ENDIF»
		«ENDFOR»
		'''
	
	}
	
	def CharSequence generateModelConstructor(CustomModel model, List<NamedSchema> allProperties) {
		
		//TODO Ensure when there are multiple types it should generate multiple constructors 	
		return '''
		public «model.name.toFirstUpper»(«FOR requiredPropString:(model.model as Schema).requiredProperties SEPARATOR ","»
			«var requiredProperty = requiredPropString.getRequiredProperty(model)»
			«IF requiredProperty !== null»
				«var requiredPropertySchema = GeneratorUtils.isSchema(requiredProperty.schema) ? (requiredProperty.schema as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((requiredProperty.schema as Reference).uri),root)»
				«IF requiredPropertySchema !== null»
				«GeneratorUtils.toJavaType(requiredPropertySchema, requiredPropertySchema.type.jsonTypes.get(0), requiredProperty.name)» «GeneratorUtils.realizeName(requiredPropString).toFirstLower»
				«ENDIF»
			«ENDIF»«ENDFOR») {
			«FOR requiredProp:(model.model as Schema).requiredProperties»
			«IF requiredProp.getRequiredProperty(model) !== null»
			this.«GeneratorUtils.realizeName(requiredProp).toFirstLower» = «GeneratorUtils.realizeName(requiredProp).toFirstLower»;
			«ENDIF»
			«ENDFOR»
		}
		'''
	}
	
	def NamedSchema getRequiredProperty(AnyString requiredProp, CustomModel model){
		if(GeneratorUtils.isSchema(model.model)){
			for(i : 0 .. (model.model as Schema).properties.size-1){
				var property = (model.model as Schema).properties.get(i)
				if(GeneratorUtils.realizeName(requiredProp).equals(GeneratorUtils.realizeName(property.name))){
					return property
				}
			}
		}
		return null
	}
	
}