package org.xtext.json.schema.tests.model

import org.quicktheories.api.Pair;
import org.eclipse.xtend.lib.annotations.Accessors
import static org.quicktheories.generators.SourceDSL.*
import org.quicktheories.core.Gen
import org.xtext.json.schema.draft7.FormatTypes
import static org.quicktheories.generators.Generate.frequency
import static org.quicktheories.generators.Generate.constant
import java.util.Optional

class StringSchema {
	
	@Accessors
	var Integer minLength;
	@Accessors
	var Integer maxLength;
	@Accessors
	var String format;
	 
	
	//TODO
	@Accessors
	var String pattern;
	
	new() {
	}
	
	def CharSequence toCharSequence() {
		var alreadyAdded = false;
		return '''
			«IF (format !== null)»
				«IF(alreadyAdded)»,«ENDIF»"format": «format»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (minLength !== null)»
				«IF(alreadyAdded)»,«ENDIF»"minLength": «minLength»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (maxLength !== null)»
				«IF(alreadyAdded)»,«ENDIF»"maxLength": «maxLength»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
		'''

	}

	static int usedMinlength = 0;
	def static Gen<StringSchema> fullStringSchema() {
		format().zip(
			minLength(),
			[
				Optional<String> format, 
				Optional<Integer> minLength
				| {
					var ss = new StringSchema()
					if(format.isPresent){
						ss.format = format.get()
					}
					
					if(minLength.isPresent){
						ss.minLength = minLength.get()
						usedMinlength = minLength.get()
					}
					ss
				}
			]
		).zip(maxLength(usedMinlength), [StringSchema ss, Optional<Integer> maxLength | {
			if(maxLength.isPresent){
				ss.maxLength = maxLength.get()
			}
			ss
		}])
	}
	def static Gen<Optional<String>> format(){
		arbitrary.enumValues(FormatTypes).map(FormatTypes f | {
			f.literal
		}).toOptionals(75)
		
	}
	def static Gen<Optional<Integer>> minLength(){
		integers().allPositive().toOptionals(75)
	}
	def static Gen<Optional<Integer>> maxLength(){
		maxLength(0)
	}
	def static Gen<Optional<Integer>> maxLength(int minLength){
		integers().between(minLength, Integer.MAX_VALUE).toOptionals(75)
	}
}