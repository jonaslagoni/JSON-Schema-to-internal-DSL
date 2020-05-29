package org.xtext.json.schema.tests.model

import org.quicktheories.api.Pair;
import java.util.List
import static org.quicktheories.generators.Generate.frequency
import static org.quicktheories.generators.Generate.constant
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import org.quicktheories.core.Gen

import static org.quicktheories.generators.SourceDSL.*
import org.xtext.json.schema.tests.StaticConfig
import java.util.Optional

class ObjectSchema {
	@Accessors
	var Map<String, Schema> properties;
	@Accessors
	var Boolean additionalPropertiesBoolean;
	@Accessors
	var Schema additionalPropertiesSchema;
	@Accessors
	var Integer maxProperties;
	@Accessors
	var Integer minProperties;
	@Accessors
	var List<String> required;
	@Accessors
	var Schema propertyNames;
	@Accessors
	var Map<String, Schema> patternProperties;
	@Accessors
	var Map<String, List<String>> propertyDependencies;
	@Accessors
	var Map<String, Schema> schemaDependencies;
	
	new() {
	}
	
	/**
	 * Returns a CharSequence of defined JSON Schema object keywords.
	 */
	def CharSequence toCharSequence() {
		var alreadyAdded = false;
		return '''
			«IF (properties !== null && !properties.isEmpty)»
				"properties": {«FOR entry:properties.entrySet SEPARATOR ","»"«entry.key»": «entry.value.toCharSequence»«ENDFOR»}
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (additionalPropertiesBoolean !== null)»
				«IF(alreadyAdded)»,«ENDIF»"additionalProperties": «additionalPropertiesBoolean»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (additionalPropertiesSchema !== null)»
				«IF(alreadyAdded)»,«ENDIF»"additionalProperties": «additionalPropertiesSchema.toCharSequence»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (maxProperties !== null)»
				«IF(alreadyAdded)»,«ENDIF»"maxProperties": «maxProperties»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (minProperties !== null)»
				«IF(alreadyAdded)»,«ENDIF»"minProperties": «minProperties»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (required !== null)»
				«IF(alreadyAdded)»,«ENDIF»"required": «FOR requiredProp:required SEPARATOR ","»"«requiredProp»"«ENDFOR»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (propertyNames !== null)»
				«IF(alreadyAdded)»,«ENDIF»"propertyNames": «propertyNames.toCharSequence»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (patternProperties !== null && !patternProperties.isEmpty)»
				"patternProperties": {«FOR entry:patternProperties.entrySet SEPARATOR ","»"«entry.key»": «entry.value.toCharSequence»«ENDFOR»}
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (propertyDependencies !== null && !propertyDependencies.isEmpty)»
				"dependencies": {«FOR entry:propertyDependencies.entrySet SEPARATOR ","»"«entry.key»": [«FOR prop:entry.value SEPARATOR ","»"«prop»"«ENDFOR»]«ENDFOR»}
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (schemaDependencies !== null && !schemaDependencies.isEmpty)»
				"dependencies": {«FOR entry:schemaDependencies.entrySet SEPARATOR ","»"«entry.key»": «entry.value.toCharSequence»«ENDFOR»}
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
		'''
	}
	
	/**
	 * Does this object schema contain any keywords or is it empty
	 */
	def boolean containsKeywords(){
		return 
			properties !== null || 
			additionalPropertiesBoolean !== null || 
			additionalPropertiesSchema !== null || 
			maxProperties !== null ||
			minProperties !== null ||
			required !== null ||
			propertyNames !== null ||
			patternProperties !== null ||
			propertyDependencies !== null ||
			schemaDependencies !== null
	}
	
	/**
	 * Return a generator which generats an object schema where all schemas can be used. i.e. properties etc generates all types
	 */
	def static Gen<ObjectSchema> fullObjectSchema() {
		org.xtext.json.schema.tests.model.ObjectSchema.fullObjectSchema(false)
	}
	
	/**
	 * Return a generator which generats an object schema where all schemas can be used. i.e. properties etc generates all types unless the parameter is sat. 
	 * Then only schemas containing objects schemas can be generated. 
	 */
	def static Gen<ObjectSchema> fullObjectSchema(boolean onlyObjectSchemas) {
		minProperties().zip(
			additionalPropertiesSchema(onlyObjectSchemas), 
			additionalPropertiesBoolean(),
			maxProperties(),
			[
				Optional<Integer> minProperties, 
				Optional<Schema> additionalPropertiesSchema,
				Optional<Boolean> additionalPropertiesBoolean,
				Optional<Integer> maxProperties | {
					var os = new ObjectSchema()
					if(additionalPropertiesBoolean.present){
						os.additionalPropertiesBoolean = additionalPropertiesBoolean.get()
					}else if(additionalPropertiesSchema.present){
						os.additionalPropertiesSchema = additionalPropertiesSchema.get()
					}
					if(minProperties.present){
						os.minProperties = minProperties.get()
					}
					if(maxProperties.present){
						os.maxProperties = maxProperties.get()
					}
					os
				}
			]
		).zip(
			properties(onlyObjectSchemas), 
			required(), 
			propertyNames(),
			patternProperties(onlyObjectSchemas),
			[
				os, 
				properties, 
				required,
				propertyNames,
				patternProperties| 
				{
					if(properties.present){
						os.properties = properties.get()
					}
					if(required.present){
						os.required = required.get()
					}
					if(propertyNames.present){
						os.propertyNames = propertyNames.get()
					}
					if(patternProperties.present){
						os.patternProperties = patternProperties.get()
					}
					os
				}
			]
		).zip(
			patternProperties(onlyObjectSchemas), 
			propertyDependencies(), 
			schemaDependencies(onlyObjectSchemas),
			[
				os, 
				patternProperties, 
				propertyDependencies,
				schemaDependencies | 
				{
					if(patternProperties.present){
						os.patternProperties = patternProperties.get()
					}
					if(propertyDependencies.present){
						os.propertyDependencies = propertyDependencies.get()
					}
					if(schemaDependencies.present){
						os.schemaDependencies = schemaDependencies.get()
					}
					os
				}
			]
		)
	}
	
	/**
	 * Returns a generator for generating additionalPropertiesBoolean
	 */
	def static Gen<Optional<Boolean>> additionalPropertiesBoolean(){
		booleans.all.toOptionals(25)
	}
	
	/**
	 * Returns a generator for generating additionalPropertiesSchema which can contain all types of schemas
	 */
	def static Gen<Optional<Schema>> additionalPropertiesSchema(){
		additionalPropertiesSchema(false)
	}
	
	/**
	 * Returns a generator for generating additionalPropertiesSchema which can either generate all types of schemas or just schemas with type object.
	 */
	def static Gen<Optional<Schema>> additionalPropertiesSchema(boolean onlyObjectSchemas){
		if(!StaticConfig.isRecursiveAdditionalSchemasReached){
			StaticConfig.currentRecursiveAdditionalSchemas++
			if(onlyObjectSchemas){
				Schema.fullObjectSchema.toOptionals(25)
			}else{
				Schema.fullSchema.toOptionals(25)
			}
		}else{
			constant(Optional.empty)
		}
	}
	
	
	/**
	 * Returns a generator for generating properties which can contain all types of schemas
	 */
	def static Gen<Optional<Map<String, Schema>>> properties(){
		properties(false)
	}
	
	/**
	 * Returns a generator for generating properties which can either generate properties of all types of schemas or just schemas with type object.
	 */
	def static Gen<Optional<Map<String, Schema>>> properties(boolean onlyObjectSchemas){
		if(!StaticConfig.isRecursivePropertiesReached){
			StaticConfig.currentRecursiveProperties += 10
			if(onlyObjectSchemas){
				maps.of(strings.allPossible.ofLengthBetween(1, 254), Schema.fullObjectSchema).ofSizeBetween(1, 10).toOptionals(25)
			}else{
				maps.of(strings.allPossible.ofLengthBetween(1, 254), Schema.fullSchema).ofSizeBetween(1, 10).toOptionals(25)
			}
		}else{
			constant(Optional.empty)
		}
	}
	
	
	/**
	 * Returns a generator for generating maxProperties, this generator does not care of any existing min properties.
	 */
	def static Gen<Optional<Integer>> maxProperties(){
		frequency(
			Pair.of(2, integers().between(1, Integer.MAX_VALUE-1).toOptionals(25)),
			Pair.of(1, constant(new Integer(1)).toOptionals(0)),
			Pair.of(1, constant(Integer.MAX_VALUE).toOptionals(0))
		);
	}
	
	/**
	 * Returns a generator for generating minProperties
	 */
	def static Gen<Optional<Integer>> minProperties(){
		frequency(
			Pair.of(2, integers().between(1, Integer.MAX_VALUE-1).toOptionals(25)),
			Pair.of(1, constant(new Integer(1)).toOptionals(0)),
			Pair.of(1, constant(Integer.MAX_VALUE).toOptionals(0))
		);
	}
	
	
	/**
	 * Returns a generator for generating a list of required properties, this does not care if any properties are generated, it is just a list of strings
	 */
	def static Gen<Optional<List<String>>> required(){
		lists.of(strings.allPossible.ofLengthBetween(0, 254)).ofSizeBetween(0, 10).toOptionals(25)
	}
	
	/**
	 * Returns a generator for generating propertyNames string schema
	 */
	def static Gen<Optional<Schema>> propertyNames(){
		Schema.fullStringSchema.toOptionals(25)
	}
	
	
	/**
	 * Returns a generator for generating patternProperties which can either generate patterns for property  of all types of schemas or just schemas with type object.
	 */
	def static Gen<Optional<Map<String, Schema>>> patternProperties(boolean onlyObjectSchemas){
		if(!StaticConfig.isRecursivePatternPropertiesSchemaReached){
			StaticConfig.currentRecursivePatternPropertiesSchema += 10
			if(onlyObjectSchemas){
				maps.of(strings.allPossible.ofLengthBetween(1, 254), Schema.fullObjectSchema).ofSizeBetween(1, 10).toOptionals(25)
			}else{
				maps.of(strings.allPossible.ofLengthBetween(1, 254), Schema.fullSchema).ofSizeBetween(1, 10).toOptionals(25)
			}
		}else{
			constant(Optional.empty)
		}
	}
	
	
	/**
	 * Returns a generator for generating propertyDependencies.
	 */
	def static Gen<Optional<Map<String, List<String>>>> propertyDependencies(){
		maps.of(
			strings.allPossible.ofLengthBetween(1, 254), 
			lists.of(strings.allPossible.ofLengthBetween(1, 254)).ofSizeBetween(1, 10)
		).ofSizeBetween(1, 10).toOptionals(25)
			
	}
	
	/**
	 * Returns a generator for generating schemaDependencies which can either generate schema dependencies of all types of schemas or just schemas with type object.
	 */
	def static Gen<Optional<Map<String, Schema>>> schemaDependencies(boolean onlyObjectSchemas){
		if(!StaticConfig.isRecursiveSchemaDependenciesSchemaReached){
			StaticConfig.currentRecursiveSchemaDependenciesSchema += 10
			if(onlyObjectSchemas){
				maps.of(strings.allPossible.ofLengthBetween(1, 254), Schema.fullObjectSchema).ofSizeBetween(1, 10).toOptionals(25)
			}else{
				maps.of(strings.allPossible.ofLengthBetween(1, 254), Schema.fullSchema).ofSizeBetween(1, 10).toOptionals(25)
			}
		}else{
			constant(Optional.empty)
		}
	}
	
	
}