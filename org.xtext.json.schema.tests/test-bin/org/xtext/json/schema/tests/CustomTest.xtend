package org.xtext.json.schema.tests
import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.SourceDSL.*;
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.quicktheories.core.Gen
import org.xtext.json.schema.tests.model.Schema
import org.xtext.json.schema.tests.model.NumberSchema

@ExtendWith(InjectionExtension)
@InjectWith(Draft7InjectorProvider)
class CustomTest {
	@Inject
	ParseHelper<org.xtext.json.schema.draft7.Schema> parseHelper
	@Test
	def void SmallExample() {
		val result = parseHelper.parse('''
{
   "definitions":{
       "Reference": {
         "required": [
           "$ref"
         ],
         "properties": {
           "$ref": {
             "$ref": "#/definitions/ReferenceObject"
           }
         }
       }
   }
}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
}