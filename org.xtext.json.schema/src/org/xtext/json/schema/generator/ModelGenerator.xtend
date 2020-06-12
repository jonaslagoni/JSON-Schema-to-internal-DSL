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
		public «model.name.toFirstUpper»(«FOR requiredProperty:(model.model as Schema).requiredProperties SEPARATOR ","»
			«var requiredPropertySchema = GeneratorUtils.isSchema(requiredProperty.schema) ? (requiredProperty.schema as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.removeQuotes((requiredProperty.schema as Reference).schemaRef),root)»
			«IF requiredPropertySchema !== null»
			«var propertyVariableName = GeneratorUtils.removeQuotes(requiredProperty.name).toFirstLower»
			«GeneratorUtils.toJavaType(requiredPropertySchema, requiredPropertySchema.type.jsonTypes.get(0), requiredProperty.name)» «propertyVariableName»
			«ENDIF»
			«ENDFOR») {
			«FOR requiredProperty:(model.model as Schema).requiredProperties»
			«var propertyVariableName = GeneratorUtils.removeQuotes(requiredProperty.name).toFirstLower»
			this.«propertyVariableName» = «propertyVariableName»;
			«ENDFOR»
		}
		'''
	}
}