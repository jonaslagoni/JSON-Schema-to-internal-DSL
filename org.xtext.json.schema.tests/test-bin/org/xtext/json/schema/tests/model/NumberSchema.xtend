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
	var DoubleInteger multipleOf;
	@Accessors
	var DoubleInteger minimum;
	@Accessors
	var DoubleInteger exclusiveMinimum;
	@Accessors
	var DoubleInteger maximum;
	@Accessors
	var DoubleInteger exclusiveMaximum;

	new() {
	}

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
			«IF (maximum !== null)»
				«IF(alreadyAdded)»,«ENDIF»"exclusiveMaximum": «exclusiveMaximum»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
		'''

	}

	def static Gen<NumberSchema> fullNumberSchema() {
		multipleOf().zip(minimum(), exclusiveMinimum(), maximum(),
				exclusiveMaximum(), [ 
					Optional<DoubleInteger> multipleOf,
					Optional<DoubleInteger> minimum, 
					Optional<DoubleInteger> exclusiveMinimum, 
					Optional<DoubleInteger> maximum,
					Optional<DoubleInteger> exclusiveMaximum |
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
			])
	}

	def static Gen<Optional<DoubleInteger>> multipleOf() {
		oneOf(integerNumber(), doubleNumber()).map([Number i, Number d|new DoubleInteger(i, d)]).toOptionals(75)
	}

	def static Gen<Optional<DoubleInteger>> minimum() {
		oneOf(integerNumber(), doubleNumber()).map([Number i, Number d|new DoubleInteger(i, d)]).toOptionals(75)
	}

	def static Gen<Optional<DoubleInteger>> exclusiveMinimum() {
		oneOf(integerNumber(), doubleNumber()).map([Number i, Number d|new DoubleInteger(i, d)]).toOptionals(75)
	}

	def static Gen<Optional<DoubleInteger>> maximum() {
		oneOf(integerNumber(), doubleNumber()).map([Number i, Number d|new DoubleInteger(i, d)]).toOptionals(75)
	}

	def static Gen<Optional<DoubleInteger>> exclusiveMaximum() {
		oneOf(integerNumber(), doubleNumber()).map([Number i, Number d|new DoubleInteger(i, d)]).toOptionals(75)
	}

	def static Gen<Number> doubleNumber() {
		return doubles().any().map([Double d|new Double(d)]);
	}

	def static Gen<Number> integerNumber() {
		return integers().allPositive().map([Integer i|new Integer(i)]);
	}
}
