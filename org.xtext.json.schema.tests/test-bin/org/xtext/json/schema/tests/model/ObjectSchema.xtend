package org.xtext.json.schema.tests.model

import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import org.quicktheories.core.Gen

import static org.quicktheories.generators.SourceDSL.*

class ObjectSchema {
	@Accessors
	var Boolean additionalPropertiesBoolean;
	@Accessors
	var Schema additionalPropertiesSchema;
	@Accessors
	var Map<String, Schema> properties;
	@Accessors
	var Integer maxProperties;
	@Accessors
	var Integer minProperties;
	
	//TODO
	@Accessors
	var String propertyNamesPattern;
	@Accessors
	var Map<String, Schema> patternProperties
	@Accessors
	var List<String> required;
	@Accessors
	var Map<String, List<String>> propertyDependencies;
	@Accessors
	var Map<String, Schema> schemaDependencies;
	new() {
	}
	
	def static Gen<ObjectSchema> fullObjectSchema() {
		additionalPropertiesBoolean().zip(
			additionalPropertiesSchema(), 
			properties(), 
			maxProperties(),
			minProperties(), 
			[
				Boolean additionalPropertiesBoolean, 
				Schema additionalPropertiesSchema, 
				Map<String, Schema> properties, 
				Integer maxProperties, 
				Integer minProperties | {
					var os = new ObjectSchema()
					os.additionalPropertiesBoolean = additionalPropertiesBoolean
					os.additionalPropertiesSchema = additionalPropertiesSchema
					os.properties = properties
					os.maxProperties = maxProperties
					os.minProperties = minProperties
					os
				}
			]
		)
	}
	def static Gen<Boolean> additionalPropertiesBoolean(){
		return booleans.all;
	}
	def static Gen<Schema> additionalPropertiesSchema(){
		return Schema.fullSchema;
	}
	def static Gen<Map<String, Schema>> properties(){
		return maps.of(strings.allPossible.ofLengthBetween(0, Integer.MAX_VALUE), Schema.fullSchema).ofSizeBetween(0, Integer.MAX_VALUE);
	}
	def static Gen<List<String>> required(){
		return lists.of(strings.allPossible.ofLengthBetween(0, Integer.MAX_VALUE)).ofSizeBetween(0, Integer.MAX_VALUE);
	}
	def static Gen<Integer> maxProperties(){
		return integers().allPositive().map([Integer i | new Integer(i)]);
	}
	def static Gen<Integer> minProperties(){
		return integers().allPositive().map([Integer i | new Integer(i)]);
	}
}