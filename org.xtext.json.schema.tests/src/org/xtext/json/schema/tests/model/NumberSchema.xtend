package org.xtext.json.schema.tests.model

import org.quicktheories.api.Pair;
import static org.quicktheories.generators.SourceDSL.*;
import static org.quicktheories.generators.Generate.frequency
import static org.quicktheories.generators.Generate.constant
import static org.quicktheories.generators.Generate.oneOf
import org.eclipse.xtend.lib.annotations.Accessors
import org.quicktheories.core.Gen
import java.util.Optional

class NumberSchema {
	@Accessors
	var FloatInteger multipleOf;
	@Accessors
	var FloatInteger minimum;
	@Accessors
	var FloatInteger exclusiveMinimum;
	@Accessors
	var FloatInteger maximum;
	@Accessors
	var FloatInteger exclusiveMaximum;

	new() {
	}

	/**
	 * Returns a CharSequence of defined JSON Schema number keywords.
	 */
	def CharSequence toCharSequence() {
		var alreadyAdded = false;
		return '''
			«IF (multipleOf !== null)»
				"multipleOf": «multipleOf»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (minimum !== null)»
				«IF(alreadyAdded)»,«ENDIF»"minimum": «minimum»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (exclusiveMinimum !== null)»
				«IF(alreadyAdded)»,«ENDIF»"exclusiveMinimum": «exclusiveMinimum»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (maximum !== null)»
				«IF(alreadyAdded)»,«ENDIF»"maximum": «maximum»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (exclusiveMaximum !== null)»
				«IF(alreadyAdded)»,«ENDIF»"exclusiveMaximum": «exclusiveMaximum»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
		'''

	}
	
	/**
	 * Does this number schema contain any keywords or is it empty
	 */
	def boolean containsKeywords(){
		return 
			multipleOf !== null || 
			minimum !== null || 
			exclusiveMinimum !== null || 
			maximum !== null || 
			exclusiveMaximum !== null
	}
	

	/*
	 * Return a generator which generats a Number schema with all possible keywords
	 */
	def static Gen<NumberSchema> fullNumberSchema() {
		multipleOf().zip(
			minimum(), 
			exclusiveMinimum(), 
			maximum(),
			exclusiveMaximum(), [ 
				Optional<FloatInteger> multipleOf,
				Optional<FloatInteger> minimum, 
				Optional<FloatInteger> exclusiveMinimum, 
				Optional<FloatInteger> maximum,
				Optional<FloatInteger> exclusiveMaximum |
				{
					var ns = new NumberSchema()
					if(multipleOf.isPresent){
						ns.multipleOf = multipleOf.get()
					}
					if(minimum.isPresent){
						ns.minimum = minimum.get()
					}
					if(exclusiveMinimum.isPresent){
						ns.exclusiveMinimum = exclusiveMinimum.get()
					}
					if(maximum.isPresent){
						ns.maximum = maximum.get()
					}
					if(exclusiveMaximum.isPresent){
						ns.exclusiveMaximum = exclusiveMaximum.get()
					}
					ns
				}
			]
		)
	}

	/**
	 * Returns a generator for generating multipleOf
	 */
	def static Gen<Optional<FloatInteger>> multipleOf() {
		oneOf(integerNumber(), org.xtext.json.schema.tests.model.NumberSchema.floatNumber()).map([Number i, Number d|new FloatInteger(i, d)]).toOptionals(75)
	}

	/**
	 * Returns a generator for generating minimum
	 */
	def static Gen<Optional<FloatInteger>> minimum() {
		oneOf(integerNumber(), org.xtext.json.schema.tests.model.NumberSchema.floatNumber()).map([Number i, Number d|new FloatInteger(i, d)]).toOptionals(75)
	}

	/**
	 * Returns a generator for generating exclusiveMinimum
	 */
	def static Gen<Optional<FloatInteger>> exclusiveMinimum() {
		oneOf(integerNumber(), org.xtext.json.schema.tests.model.NumberSchema.floatNumber()).map([Number i, Number d|new FloatInteger(i, d)]).toOptionals(75)
	}


	/**
	 * Returns a generator for generating maximum
	 */
	def static Gen<Optional<FloatInteger>> maximum() {
		oneOf(integerNumber(), org.xtext.json.schema.tests.model.NumberSchema.floatNumber()).map([Number i, Number d|new FloatInteger(i, d)]).toOptionals(75)
	}

	/**
	 * Returns a generator for generating exclusiveMaximum
	 */
	def static Gen<Optional<FloatInteger>> exclusiveMaximum() {
		oneOf(integerNumber(), org.xtext.json.schema.tests.model.NumberSchema.floatNumber()).map([Number i, Number d|new FloatInteger(i, d)]).toOptionals(75)
	}

	/**
	 * Returns a generator for generating float numbers
	 */
	def static Gen<Number> floatNumber() {
		frequency(
			Pair.of(2, floats().between(0, Float.MAX_VALUE)),
			Pair.of(1, constant(new Float(0))),
			Pair.of(1, constant(Float.MAX_VALUE))
		).map([Float f|new Float(f)]);
	}

	/**
	 * Returns a generator for generating integer numbers
	 */
	def static Gen<Number> integerNumber() {
		frequency(
			Pair.of(2, integers().between(1, Integer.MAX_VALUE-1)),
			Pair.of(1, constant(0)),
			Pair.of(1, constant(Integer.MAX_VALUE))
		).map([Integer i|new Integer(i)]);
	}
}
