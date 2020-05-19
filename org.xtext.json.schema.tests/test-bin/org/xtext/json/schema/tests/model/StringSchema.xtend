package org.xtext.json.schema.tests.model

import org.quicktheories.api.Pair;
import org.eclipse.xtend.lib.annotations.Accessors
import static org.quicktheories.generators.SourceDSL.*
import org.quicktheories.core.Gen
import org.xtext.json.schema.draft7.FormatTypes
import static org.quicktheories.generators.Generate.frequency
import static org.quicktheories.generators.Generate.constant

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
	

	def static Gen<StringSchema> fullStringSchema() {
		format().zip(
			minLength(), 
			maxLength(),
			[
				String format, 
				Integer minLength, 
				Integer maxLength
				| {
					var ss = new StringSchema()
					ss.format = format
					ss.minLength = minLength
					ss.maxLength = maxLength
					ss
				}
			]
		)
	}
	def static Gen<String> format(){
		var doubleIntegerPair = Pair.of(new Integer(1), arbitrary.enumValues(FormatTypes).map(FormatTypes f | {
			f.literal
		}))
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(doubleIntegerPair, nullPair)
		
	}
	def static Gen<Integer> minLength(){
		var intPair = Pair.of(new Integer(1), integers().allPositive())
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[intPair, nullPair])
	}
	def static Gen<Integer> maxLength(){
		var intPair = Pair.of(new Integer(1), integers().allPositive())
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[intPair, nullPair])
	}
}