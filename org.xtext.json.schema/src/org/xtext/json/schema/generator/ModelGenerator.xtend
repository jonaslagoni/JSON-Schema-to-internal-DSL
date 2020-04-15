package org.xtext.json.schema.generator

import java.util.List
import org.xtext.json.schema.draft7.*
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.json.schema.generator.GeneratorUtils
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
	
	def CharSequence generateModel(CustomModel model) '''
	package model;
	import java.util.*;
	import com.fasterxml.jackson.annotation.JsonInclude;	
	«model.generateModelImports»
	/**
	 *
	 * @author Generated
	 */
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public class «model.name.toFirstUpper» {
		«model.generateModelProperties»
		«model.generateModelConstructor»
		«model.generateModelGetSet»
	}
	'''
	
	def CharSequence generateModelImports(CustomModel model){
		return '''
		«FOR property:(model.model as Schema).properties»
			«var schema = GeneratorUtils.isSchema(property.schema) ? (property.schema as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((property.schema as Reference).uri),root)»
			«IF GeneratorUtils.isObject(schema)»
			import model.«GeneratorUtils.realizeName(property.name).toFirstUpper»;
			«ENDIF»
		«ENDFOR»
		'''
	
	}
	
	def CharSequence generateModelGetSet(CustomModel model){
		return '''
		«FOR property:(model.model as Schema).properties»
			«var schema = GeneratorUtils.isSchema(property.schema) ? (property.schema as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((property.schema as Reference).uri),root)»
			«IF schema !== null && schema.type !== null»
				«FOR type:schema.type.jsonTypes»
					«IF GeneratorUtils.toJavaType(type, property) !== null»
					/**
					* @param «GeneratorUtils.realizeName(property.name).toFirstLower» to set
					*/
					public void set«GeneratorUtils.realizeName(property.name).toFirstUpper»(«GeneratorUtils.toJavaType(type, property)» «GeneratorUtils.realizeName(property.name).toFirstLower»){
						this.«GeneratorUtils.realizeName(property.name).toFirstLower» = «GeneratorUtils.realizeName(property.name).toFirstLower»;
					}
					
					/**
					* @return the «GeneratorUtils.realizeName(property.name).toFirstLower»
					*/
					public «GeneratorUtils.toJavaType(type, property)» get«GeneratorUtils.realizeName(property.name).toFirstUpper»(){
						return «GeneratorUtils.realizeName(property.name).toFirstLower»;
					}
					«ENDIF»
				«ENDFOR»
			«ENDIF»
		«ENDFOR»
		'''
	
	}
	def CharSequence generateModelProperties(CustomModel model){
		
		return '''
		«FOR property:(model.model as Schema).properties»
			«var schema = GeneratorUtils.isSchema(property.schema) ? (property.schema as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((property.schema as Reference).uri),root)»
			«IF schema !== null && schema.type !== null»
				«FOR type:schema.type.jsonTypes»
					«IF GeneratorUtils.toJavaType(type, property) !== null»
					private «GeneratorUtils.toJavaType(type, property)» «GeneratorUtils.realizeName(property.name).toFirstLower»;
					«ENDIF»
				«ENDFOR»
			«ENDIF»
		«ENDFOR»
		'''
	
	}
	
	def CharSequence generateModelConstructor(CustomModel model) {
		
	//TODO Ensure when there are multiple types it should generate multiple constructors 	
	return '''
	public «model.name.toFirstUpper»(«FOR requiredPropString:(model.model as Schema).requiredProperties SEPARATOR ","»
		«var requiredProperty = requiredPropString.getRequiredProperty(model)»
		«IF requiredProperty !== null»
			«var requiredPropertySchema = GeneratorUtils.isSchema(requiredProperty.schema) ? (requiredProperty.schema as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((requiredProperty.schema as Reference).uri),root)»
			«IF requiredPropertySchema !== null»
			«GeneratorUtils.toJavaType(requiredPropertySchema.type.jsonTypes.get(0), requiredProperty)» «GeneratorUtils.realizeName(requiredPropString).toFirstLower»
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