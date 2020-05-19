package org.xtext.json.schema.tests.model

import static org.quicktheories.generators.SourceDSL.*
import static org.quicktheories.generators.Generate.*
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data
import java.util.ArrayList
import java.util.HashSet
import org.quicktheories.core.Gen

class Schema {
	@Accessors
	var NumberSchema ns
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
			
			«IF (ns !== null)»
			«ns.toCharSequence»
			«ENDIF»
		}
		'''
	}
	
	override toString(){
		return toCharSequence.toString
	}
	
	
	def static Gen<List<String>> types() {
		
		lists().of(
			oneOf(
				constant("\"array\""), 
				constant("\"string\""), 
				constant("\"integer\""), 
				constant("\"number\""), 
				constant("\"null\""), 
				constant("\"object\"")
			)
		).ofSizeBetween(1, 6).map(List<String> types | {
			//remove dublicates
			new ArrayList(new HashSet(types));
		})
	}
	def static Gen<Schema> fullSchema() {
		return types().map([List<String> types | {
			new Schema(types)
		}]).
		zip(NumberSchema.fullNumberSchema, [Schema schema, NumberSchema ns | {
			if(schema.types.contains("\"number\"") || schema.types.contains("\"integer\"")){
				schema.ns = ns
			}
			schema
		}])
	}
	
}