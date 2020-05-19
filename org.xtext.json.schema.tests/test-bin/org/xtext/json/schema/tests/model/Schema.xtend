package org.xtext.json.schema.tests.model

import static org.quicktheories.generators.SourceDSL.*
import static org.quicktheories.generators.Generate.*
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data
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

	def CharSequence toCharSequence(){
		return '''
		{
			«IF(types.size > 1)»
			"type": [
			«FOR type:types SEPARATOR ","»
				«type»
			«ENDFOR»
			]
			«ELSE»
			"type": «types.get(0)»
			«ENDIF»
			
			«IF (numberSchema !== null)»
			«numberSchema.toCharSequence»
			«ENDIF»
		}
		'''
	}
	
	override toString(){
		return toCharSequence.toString
	}
	
	
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