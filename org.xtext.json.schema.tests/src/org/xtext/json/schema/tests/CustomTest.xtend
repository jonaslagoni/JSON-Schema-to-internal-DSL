package org.xtext.json.schema.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.json.schema.draft7.Schema

@ExtendWith(InjectionExtension)
@InjectWith(Draft7InjectorProvider)
class CustomTest {
	
	
	@Inject
	ParseHelper<Schema> parseHelper
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
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
}