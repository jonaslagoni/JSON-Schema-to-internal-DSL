package org.xtext.json.schema.tests.model

import org.quicktheories.api.Pair;
import java.util.List
import static org.quicktheories.generators.Generate.frequency
import static org.quicktheories.generators.Generate.constant
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
	static class ObjectSchemaOptions {
		@Accessors
		var boolean excludeAdditionalProperties = false;
		@Accessors
		var boolean excludeProperties = false;
		
	}
	def static Gen<ObjectSchema> fullObjectSchema() {
		fullObjectSchema(new ObjectSchemaOptions())
	}
	def static Gen<ObjectSchema> fullObjectSchema(ObjectSchemaOptions options) {
		var Gen<Schema> additionalPropertiesSchemaGen = null;
		var Gen<Boolean> additionalPropertiesBooleanGen = null;
		if(!options.excludeAdditionalProperties){
			additionalPropertiesSchemaGen = additionalPropertiesSchema()
			additionalPropertiesBooleanGen = additionalPropertiesBoolean()
		}
		var Gen<Map<String, Schema>> propertiesGen = null;
		if(!options.excludeProperties){
			propertiesGen = properties()
		}
		additionalPropertiesBooleanGen.zip(
			additionalPropertiesSchemaGen, 
			propertiesGen, 
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
		var booleanPair = Pair.of(new Integer(1), booleans.all)
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[booleanPair, nullPair])
	}
	def static Gen<Schema> additionalPropertiesSchema(){
		var schemaPair = Pair.of(new Integer(1), Schema.fullSchema)
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[schemaPair, nullPair])
	}
	def static Gen<Map<String, Schema>> properties(){
		var mapPair = Pair.of(new Integer(1), maps.of(strings.allPossible.ofLengthBetween(0, Integer.MAX_VALUE), Schema.fullSchema).ofSizeBetween(0, Integer.MAX_VALUE))
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[mapPair, nullPair])
	}
	def static Gen<List<String>> required(){
		var listPair = Pair.of(new Integer(1), lists.of(strings.allPossible.ofLengthBetween(0, Integer.MAX_VALUE)).ofSizeBetween(0, Integer.MAX_VALUE))
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[listPair, nullPair])
	}
	def static Gen<Integer> maxProperties(){
		var intPair = Pair.of(new Integer(1), integers().allPositive())
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[intPair, nullPair])
	}
	def static Gen<Integer> minProperties(){
		var intPair = Pair.of(new Integer(1), integers().allPositive())
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[intPair, nullPair])
	}
}