package org.xtext.json.schema.tests.model

import static org.quicktheories.generators.SourceDSL.*
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList
import java.util.HashSet
import org.quicktheories.core.Gen
import org.xtext.json.schema.draft7.JsonTypes

class Schema {
	@Accessors
	var ObjectSchema objectSchema
	@Accessors
	var StringSchema stringSchema
	@Accessors
	var ListSchema listSchema
	@Accessors
	var NumberSchema numberSchema
	@Accessors
	var List<String> types

	new(List<String> types){
		this.types = types;
	}

	/**
	 * Returns a CharSequence of defined schema types and their defined keywords.
	 */
	def CharSequence toCharSequence(){
		return '''
		{
			«IF(types.size > 1)»
			"type": [
			«FOR type:types SEPARATOR ","»
				«type»
			«ENDFOR»
			]«IF(containsOtherSchemas)»,«ENDIF»
			«ELSE»
			"type": «types.get(0)»«IF(containsOtherSchemas)»,«ENDIF»
			«ENDIF»

			«IF (objectSchema !== null)»
			«objectSchema.toCharSequence»
			«ENDIF»
			«IF (stringSchema !== null)»
			«stringSchema.toCharSequence»
			«ENDIF»
			«IF (listSchema !== null)»
			«listSchema.toCharSequence»
			«ENDIF»
				
			«IF (numberSchema !== null)»
			«numberSchema.toCharSequence»
			«ENDIF»
		}
		'''
	}
	
	/**
	 * Does this schema contain other keywords or just the types keyword
	 */
	def boolean containsOtherSchemas(){
		return objectSchema !== null && objectSchema.containsKeywords || stringSchema !== null && stringSchema.containsKeywords || listSchema !== null && listSchema.containsKeywords || numberSchema !== null  && numberSchema.containsKeywords
	}
	
	override toString(){
		return toCharSequence.toString
	}
	
	
	/**
	 * Generated a list of unique types with length of 1 to 6 based on all possible types
	 */
	def static Gen<List<String>> types() {
		lists().of(
			arbitrary.enumValues(JsonTypes).map(JsonTypes t | {
				t.literal
			})
		).ofSizeBetween(1, 6).map(List<String> types | {
			//remove dublicates
			new ArrayList(new HashSet(types));
		})
	}
	
	/**
	 * Only generates JSON Schemas of numbers
	 */
	def static Gen<Schema> fullNumberSchema() {
		NumberSchema.fullNumberSchema.map(
			NumberSchema ns
			| {
				var schema = new Schema(#[JsonTypes.INTEGER.literal, JsonTypes.NUMBER.literal])
				schema.numberSchema = ns
				schema
			})
	}
	
	/**
	 * Only generates JSON Schemas of objects
	 */
	def static Gen<Schema> fullObjectSchema() {
		ObjectSchema.fullObjectSchema(true).map(
			ObjectSchema os
			| {
				var schema = new Schema(#[JsonTypes.OBJECT.literal])
				schema.objectSchema = os
				schema
			})
	}
	
	/**
	 * Only generates JSON Schemas of lists
	 */
	def static Gen<Schema> fullListSchema() {
		ListSchema.fullListSchema(true).map(
			ListSchema ls
			| {
				var schema = new Schema(#[JsonTypes.ARRAY.literal])
				schema.listSchema = ls
				schema
			})
	}
	
	/**
	 * Only generates JSON Schemas of strings
	 */
	def static Gen<Schema> fullStringSchema() {
		StringSchema.fullStringSchema.map(
			StringSchema ss
			| {
				var schema = new Schema(#[JsonTypes.STRING.literal])
				schema.stringSchema = ss
				schema
			})
	}
	
	/**
	 * Generates JSON Schemas with all types interconnected
	 */
	def static Gen<Schema> fullSchema() {
		types().map([List<String> types | {
			new Schema(types)
		}]).
		zip(
			ObjectSchema.fullObjectSchema, 
			StringSchema.fullStringSchema, 
			ListSchema.fullListSchema, 
			NumberSchema.fullNumberSchema, 
			[
				Schema schema, 
				ObjectSchema os, 
				StringSchema ss, 
				ListSchema ls, 
				NumberSchema ns 
				| {
					if(schema.types.contains(JsonTypes.STRING.literal)){
						schema.stringSchema = ss
					}
					if(schema.types.contains(JsonTypes.OBJECT.literal)){
						schema.objectSchema = os
					}
					if(schema.types.contains(JsonTypes.ARRAY.literal)){
						schema.listSchema = ls
					}
					if(schema.types.contains(JsonTypes.NUMBER.literal) || schema.types.contains(JsonTypes.INTEGER.literal)){
						schema.numberSchema = ns
					}
					schema
				}
			]
		)
	}
	
}