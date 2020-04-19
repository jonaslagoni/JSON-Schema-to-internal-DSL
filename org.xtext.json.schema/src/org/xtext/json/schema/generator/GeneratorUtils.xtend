package org.xtext.json.schema.generator

import org.xtext.json.schema.draft7.*
import org.xtext.json.schema.draft7.NamedSchema
import org.eclipse.emf.common.util.EList

class GeneratorUtils {
	def static String toJavaType(JsonTypes type, AnyString objectName){
		return toJavaType(type, GeneratorUtils.realizeName(objectName))
	}
	def static String toJavaType(JsonTypes type, String objectName){
		switch(type){
			case BOOLEAN: {
				return 'Boolean'
			}
			case INTEGER: {
				return 'Integer'
			}
			case NULL: {
				return null
			}
			case NUMBER: {
				return 'Double'
			}
			case OBJECT: {
				return objectName.toFirstUpper
			}
			case STRING: {
				return 'String'
			}
			case ARRAY: {
				return 'List<' + objectName.toFirstUpper + '>' 
			}
			default: {
				return null
			}
		}
	}
	
	def static boolean isSchema(AbstractSchema schema){
		if(schema instanceof Schema){
			return true
		}
		return false
	}
	
	
	def static boolean isReference(AbstractSchema schema){
		if(schema instanceof Reference){
			return true
		}
		return false
	}
	
	def static boolean isObject(AbstractSchema schema){
		if(schema.isSchema){
			if((schema as Schema).type !== null && (schema as Schema).type.jsonTypes.findFirst[t | t === JsonTypes.OBJECT] !== null){
				return true
			}
		}else{
			
		}
		return false
	}
	
	def static String realizeName(AnyString anyString){
		return anyString.name !== null ? anyString.name : anyString.keyword.name().toLowerCase
	}
	
	def static Schema findLocalReference(String ref, Schema root){
		//TODO support other then "definitions"
		//TODO support nested references
		var propName = ref.getReferenceName
		if(propName !== null){
			var definitions = root.definitions
			return recursiveFindLocalRef(propName, definitions).schema as Schema
		}
		return null
	}
	
	def static String getReferenceName(String fullRef){
		var isLocal = fullRef.substring(0, 2)
		if(isLocal.equals("#/")){
			var pathsToSchema = fullRef.replace('#/definitions/', '').split("/")
			pathsToSchema.get(0)
		}else{
			System.out.println("Was not a local reference, full reference was " + fullRef)
			return null
		}
	}
	
	def private static NamedSchema recursiveFindLocalRef(String propNameToFind, EList<NamedSchema> definitions){
		var foundSchema = definitions.findFirst[prop | prop.name.realizeName.toLowerCase.equals(propNameToFind.toLowerCase)]
		if(foundSchema !== null){
			if(foundSchema.schema.isSchema){
				return foundSchema
			}else{
				var newRefToFind = (foundSchema.schema as Reference).uri.realizeName
				if(newRefToFind.getReferenceName !== null){
					return recursiveFindLocalRef(newRefToFind, definitions)
				}else{
					System.out.println("Could not find new reference for " + newRefToFind)
				}
			}
		}else{
			System.out.println("Could not find schema for " + propNameToFind)
		}
		return null
	}
}