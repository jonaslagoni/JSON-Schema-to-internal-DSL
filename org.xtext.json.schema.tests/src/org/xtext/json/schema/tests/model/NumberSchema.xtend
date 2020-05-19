package org.xtext.json.schema.tests.model

import org.quicktheories.api.Pair;
import static org.quicktheories.generators.SourceDSL.*;
import static org.quicktheories.generators.Generate.frequency
import static org.quicktheories.generators.Generate.constant
import static org.quicktheories.generators.Generate.oneOf
import org.eclipse.xtend.lib.annotations.Accessors
import org.quicktheories.core.Gen

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
				«IF(alreadyAdded)»,«ENDIF»"multipleOf": «multipleOf»
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
				exclusiveMaximum(), [ DoubleInteger multipleOf, DoubleInteger minimum, DoubleInteger exclusiveMinimum, DoubleInteger maximum, DoubleInteger exclusiveMaximum |
				{
					var ns = new NumberSchema()
					ns.multipleOf = multipleOf
					ns.minimum = minimum
					ns.exclusiveMinimum = exclusiveMinimum
					ns.maximum = maximum
					ns.exclusiveMaximum = exclusiveMaximum
					ns
				}
			])
	}

	def static Gen<DoubleInteger> multipleOf() {
		var doubleIntegerPair = Pair.of(new Integer(1), oneOf(integerNumber(), doubleNumber()).map([Number i, Number d|new DoubleInteger(i, d)]))
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(doubleIntegerPair, nullPair)
	}

	def static Gen<DoubleInteger> minimum() {
		var doubleIntegerPair = Pair.of(new Integer(1), oneOf(integerNumber(), doubleNumber()).map([Number i, Number d|new DoubleInteger(i, d)]))
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(doubleIntegerPair, nullPair)
	}

	def static Gen<DoubleInteger> exclusiveMinimum() {
		var doubleIntegerPair = Pair.of(new Integer(1), oneOf(integerNumber(), doubleNumber()).map([Number i, Number d|new DoubleInteger(i, d)]))
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(doubleIntegerPair, nullPair)
	}

	def static Gen<DoubleInteger> maximum() {
		var doubleIntegerPair = Pair.of(new Integer(1), oneOf(integerNumber(), doubleNumber()).map([Number i, Number d|new DoubleInteger(i, d)]))
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(doubleIntegerPair, nullPair)
	}

	def static Gen<DoubleInteger> exclusiveMaximum() {
		var doubleIntegerPair = Pair.of(new Integer(1), oneOf(integerNumber(), doubleNumber()).map([Number i, Number d|new DoubleInteger(i, d)]))
		var nullPair = Pair.of(new Integer(1), constant(new DoubleInteger(new Integer(null))))
		return frequency(doubleIntegerPair, nullPair)
	}

	def static Gen<Number> doubleNumber() {
		return doubles().any().map([Double d|new Double(d)]);
	}

	def static Gen<Number> integerNumber() {
		return integers().allPositive().map([Integer i|new Integer(i)]);
	}
}
