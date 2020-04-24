package org.xtext.json.schema.generator

import org.xtext.json.schema.draft7.*
import org.xtext.json.schema.draft7.NamedSchema
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import java.util.List

class GeneratorUtils {
	def static String toJavaType(Schema schema, JsonTypes type, AnyString objectName){
		return toJavaType(schema, type, GeneratorUtils.realizeName(objectName))
	}
		/**
	 * Returns a list of all the properties 
	 */
	def static List<CustomProperty> allProperties(Schema schema, Schema root){
		var list = new ArrayList<CustomProperty>()
		if(schema !== null){
			if(schema.additionalProperties !== null && schema.additionalProperties.allowedBoolean !== org.xtext.json.schema.draft7.Boolean.FALSE_VALUE){
				var additionalPropName = "additionalProps"
				var additionalPropKeyType = "String"
				if(schema.propertyNames !== null){
					var propNameSchema = GeneratorUtils.isSchema(schema.propertyNames) ? (schema.propertyNames as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((schema.propertyNames as Reference).uri),root)
					if(propNameSchema !== null){
						var type = propNameSchema.type.jsonTypes.get(0)
						switch(type){
							case BOOLEAN: {
								additionalPropKeyType = 'Boolean'
							}
							case INTEGER: {
								additionalPropKeyType = 'Integer'
							}
							case NUMBER: {
								additionalPropKeyType = 'Double'
							}
							case OBJECT: {
								if(GeneratorUtils.isReference(schema.propertyNames)){
									additionalPropKeyType = GeneratorUtils.getReferenceName(schema.propertyNames).toFirstUpper
								}else{
									if(propNameSchema.title !== null){
										additionalPropKeyType = "List<" + propNameSchema.title.replace(' ', '').toFirstUpper + ">"
									}else{
										//TODO what if it is a schema with no title?
										additionalPropKeyType = null 
									}
								}
							}
							case ARRAY: {
								if(propNameSchema.items !== null && propNameSchema.items.items.size > 0){
									var abstractSchemaItem = propNameSchema.items.items.get(0)
									var schemaItem = GeneratorUtils.isSchema(abstractSchemaItem) ? (abstractSchemaItem as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((abstractSchemaItem as Reference).uri),root)
									var itemType = schemaItem.type.jsonTypes.get(0)
									switch(itemType){
										case BOOLEAN: {
											additionalPropKeyType = 'List<Boolean>'
										}
										case INTEGER: {
											additionalPropKeyType = 'List<Integer>'
										}
										case NUMBER: {
											additionalPropKeyType = 'List<Double>'
										}
										case OBJECT: {
											if(GeneratorUtils.isReference(schema.propertyNames)){
												additionalPropKeyType = 'List<' + GeneratorUtils.getReferenceName(abstractSchemaItem).toFirstUpper + '>'
											}else{
												if(schemaItem.title !== null){
													additionalPropKeyType = "List<" + schemaItem.title.replace(' ', '').toFirstUpper + ">"
												}else{
													//TODO what if it is a schema with no title?
													additionalPropKeyType = null 
												}
											}
										}
										case ARRAY: {
											if(GeneratorUtils.isReference(abstractSchemaItem)){
												additionalPropKeyType = 'List<' + GeneratorUtils.getReferenceName(abstractSchemaItem).toFirstUpper + '>'
											}else{
												if(schemaItem.title !== null){
													additionalPropKeyType = "List<" + schemaItem.title.replace(' ', '').toFirstUpper + ">"
												}else{
													//TODO what if it is a schema with no title?
													additionalPropKeyType = null 
												}
											}
										}
										default: {
											additionalPropKeyType = null 
										}
									}
								}else{
									additionalPropKeyType = null 
								}
							}
							default: {
								additionalPropKeyType = null 
							}
						}
					}
				}
				if(additionalPropKeyType !== null){
					if(schema.additionalProperties.schema !== null){
						var additionalPropAbstractSchema = schema.additionalProperties.schema
						if(GeneratorUtils.isSchema(additionalPropAbstractSchema)){
							var additionalPropSchema = additionalPropAbstractSchema as Schema
							if(additionalPropSchema.title !== null){
								var customProp = new CustomProperty(additionalPropName, "Map<" + additionalPropKeyType + ", " + additionalPropSchema.title.replace(' ', '').toFirstUpper + ">")
								list.add(customProp)
							}
						}else{
							var customProp = new CustomProperty(additionalPropName, "Map<" + additionalPropKeyType + ", " + GeneratorUtils.getReferenceName(additionalPropAbstractSchema).toFirstUpper + ">")
							list.add(customProp)
						}
					}else{
						var customProp = new CustomProperty(additionalPropName, "Map<" + additionalPropKeyType + ", Object>")
						list.add(customProp)
					}
				}
			}
			if(schema.properties !== null && !schema.properties.isEmpty){
				for(prop: schema.properties){
					var propName = GeneratorUtils.realizeName(prop.name)
					var propType = ""
					var type = JsonTypes.NULL
					var propSchema = GeneratorUtils.isSchema(prop.schema) ? (prop.schema as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((prop.schema as Reference).uri),root)
					if(propSchema !== null && propSchema.type !== null && propSchema.type.jsonTypes.size > 0){
						type = propSchema.type.jsonTypes.get(0)
						switch(type){
							case BOOLEAN: {
								propType = 'Boolean'
							}
							case INTEGER: {
								propType = 'Integer'
							}
							case NUMBER: {
								propType = 'Double'
							}
							case OBJECT: {
								if(GeneratorUtils.isReference(prop.schema)){
									propType = GeneratorUtils.getReferenceName(prop.schema).toFirstUpper
								}else{
									propType = propName.toFirstUpper
								}
							}
							case STRING: {
								propType = 'String'
							}
							case ARRAY: {
								if(propSchema.items !== null && propSchema.items.items.size > 0){
									var arrayAbstractSchema = propSchema.items.items.get(0)
									if(GeneratorUtils.isReference(arrayAbstractSchema)){
										propType = 'List<' + GeneratorUtils.getReferenceName(propSchema.items.items.get(0)).toFirstUpper + '>'
									}else{
										var arraySchema = arrayAbstractSchema as Schema
										if(arraySchema.type !== null){
											var arrayType = arraySchema.type.jsonTypes.get(0)
											switch(arrayType){
												case BOOLEAN: {
													propType = 'List<Boolean>'
												}
												case INTEGER: {
													propType = 'List<Integer>'
												}
												case NUMBER: {
													propType = 'List<Double>'
												}
												case OBJECT: {
													if(GeneratorUtils.isReference(prop.schema)){
														propType = GeneratorUtils.getReferenceName(prop.schema).toFirstUpper
													}else{
														propType = propName.toFirstUpper
													}
												}
												case STRING: {
													propType = 'List<String>'
												}
												default: {
												}
											}
										}else if(arraySchema.title !== null){
											propType = "List<" + arraySchema.title.replace(' ', '').toFirstUpper + ">"
										}else{
											//TODO what if it is a schema with no title?
											propType = null 
										}
									}
								}else{
									propType = null 
								}
							}
							default: {
								propType = null 
							}
						}
					}
					if(propType !== null){
						var customProp = new CustomProperty(propName, propType)
						customProp.type = type
						list.add(customProp)
					}
				}
			}			
		}
		return list
	}
	
	
	
	def static String toJavaType(Schema schema, JsonTypes type, String objectName){
		if(schema !== null){
			if(type !== null){
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
						if(schema.propertyNames !== null){
							var propertyNamesAbstractSchema = schema.propertyNames
							if(propertyNamesAbstractSchema.isSchema){
								var propertyNamesSchema = propertyNamesAbstractSchema as Schema
								return 'Map<' + propertyNamesSchema.type.jsonTypes.get(0).name().toLowerCase.toFirstUpper +  ',' + objectName.toFirstUpper + '>'
							} 
						}else{
							return objectName.toFirstUpper
						}
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
		}
		return null 

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
	
	def static boolean isArray(AbstractSchema schema){
		if(schema.isSchema){
			if((schema as Schema).type !== null && (schema as Schema).type.jsonTypes.findFirst[t | t === JsonTypes.ARRAY] !== null){
				return true
			}
		}else{
			
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
			var localRef = recursiveFindLocalRef(propName, definitions)
			if(localRef !== null)
				return localRef.schema as Schema
		}
		return null
	}
	
	
	def static String getReferenceName(AbstractSchema schema){
		if(schema instanceof Reference){
			var ref = schema as Reference
			return getReferenceName(ref.uri.realizeName)
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