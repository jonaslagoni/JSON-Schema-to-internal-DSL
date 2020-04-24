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
		var allProperties = GeneratorUtils.allProperties((model.model as Schema), root)
		return '''
		package model;
		import java.util.*;
		import model.*;
		/**
		 *
		 * @author Generated
		 */
		public class «model.name.toFirstUpper» {
			«allProperties.generateModelProperties»
			«model.generateModelConstructor»
			«allProperties.generateModelGetSet»
		}
		'''
	}
	

	
	def CharSequence generateModelGetSet(List<CustomProperty> allProperties){
		return '''
		«FOR property:allProperties»
			/**
			* @param «property.propertyName» to set
			*/
			public void set«property.propertyName.toFirstUpper»(«property.typeName» «property.propertyName»){
				this.«property.propertyName» = «property.propertyName»;
			}
			
			/**
			* @return the «property.propertyName»
			*/
			public «property.typeName» get«property.propertyName.toFirstUpper»(){
				return «property.propertyName»;
			}
		«ENDFOR»
		'''
	}
	def CharSequence generateModelProperties(List<CustomProperty> allProperties){
		return '''
		«FOR property:allProperties»
			private «property.typeName» «property.propertyName»;
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