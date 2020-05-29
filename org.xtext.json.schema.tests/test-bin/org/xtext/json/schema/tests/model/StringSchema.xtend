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
	
	
	/**
	 * Returns a CharSequence of defined JSON Schema string keywords.
	 */
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
	
	/**
	 * Does this string schema contain any keywords or is it empty
	 */
	def boolean containsKeywords(){
		return 
			format !== null || 
			minLength !== null || 
			maxLength !== null
	}

	
	/**
	 * Return a generator which generats a string schema with all possible keywords
	 */
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
					}
					ss
				}
			]
		).zip(maxLength(), [StringSchema ss, Optional<Integer> maxLength | {
			if(maxLength.isPresent){
				ss.maxLength = maxLength.get()
			}
			ss
		}])
	}
	
	/**
	 * Returns a generator for generating format
	 */
	def static Gen<Optional<String>> format(){
		arbitrary.enumValues(FormatTypes).map(FormatTypes f | {
			f.literal
		}).toOptionals(25)
		
	}
	
	/**
	 * Returns a generator for generating minLength
	 */
	def static Gen<Optional<Integer>> minLength(){
		frequency(
			Pair.of(2, integers().between(1, Integer.MAX_VALUE-1).toOptionals(50)),
			Pair.of(1, constant(new Integer(1)).toOptionals(0)),
			Pair.of(1, constant(Integer.MAX_VALUE).toOptionals(0))
		);
	}
	
	/**
	 * Returns a generator for generating maxLength, does not care about a min length.
	 */
	def static Gen<Optional<Integer>> maxLength(){
		frequency(
			Pair.of(2, integers().between(1, Integer.MAX_VALUE-1).toOptionals(50)),
			Pair.of(1, constant(new Integer(1)).toOptionals(0)),
			Pair.of(1, constant(Integer.MAX_VALUE).toOptionals(0))
		);
	}
}