package org.xtext.json.schema.tests.model

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data

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
}