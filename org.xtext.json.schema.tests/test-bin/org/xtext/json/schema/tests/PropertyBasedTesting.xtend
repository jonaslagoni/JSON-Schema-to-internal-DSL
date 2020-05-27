package org.xtext.json.schema.tests

import com.google.inject.Inject
import java.util.List
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import static org.quicktheories.generators.Generate.*
import org.junit.jupiter.api.^extension.ExtendWith
import org.quicktheories.core.Gen
import org.xtext.json.schema.draft7.JsonTypes
import static org.quicktheories.generators.SourceDSL.*
import org.xtext.json.schema.tests.model.DoubleInteger
import org.xtext.json.schema.tests.model.NumberSchema
import org.xtext.json.schema.tests.model.Schema

import static org.quicktheories.QuickTheory.qt
import java.util.ArrayList
import java.util.HashSet

import org.quicktheories.api.Pair;
import static org.quicktheories.generators.Generate.frequency
import java.util.Optional
import org.junit.jupiter.api.Assertions

@ExtendWith(InjectionExtension)
@InjectWith(Draft7InjectorProvider)
class PropertyBasedTesting {
	@Inject
	ParseHelper<org.xtext.json.schema.draft7.Schema> parseHelper

	@Test
	def void anyValidArbitraryJsonSchemaShouldBeParsed() {
		qt().forAll(Schema.fullSchema).check([ Schema s |
			{
				if(s !== null){
					val charSequence = s.toCharSequence
					val result = parseHelper.parse(charSequence)
	
					return result !== null && result.eResource.errors.isEmpty
				}
				return false
			}
		])
	}
	@Test
	def void test() {

			val result = parseHelper.parse('''
			{
				"type": [
				"string",
				"integer"
				],
			
					
				"exclusiveMinimum": 0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004514564
			}
			''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

}
