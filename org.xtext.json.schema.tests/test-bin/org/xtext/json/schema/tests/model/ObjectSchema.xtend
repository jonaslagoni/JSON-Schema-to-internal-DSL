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
		'''

	}
	static class ObjectSchemaOptions {
		@Accessors
		var boolean excludeAdditionalProperties = false;
		@Accessors
		var boolean excludeProperties = false;
		
	}
	def static Gen<ObjectSchema> fullValidObjectSchema() {
		fullValidObjectSchema(new ObjectSchemaOptions())
	}
	static int usedMinProperties = 0;
	static int usedMaxProperties = 0;
	def static Gen<ObjectSchema> fullValidObjectSchema(ObjectSchemaOptions options) {
		minProperties().zip(
			additionalPropertiesSchema(), 
			additionalPropertiesBoolean(),
			[
				Optional<Integer> minProperties, 
				Optional<Schema> additionalPropertiesSchema,
				Optional<Boolean> additionalPropertiesBoolean | {
					var os = new ObjectSchema()
					if(additionalPropertiesBoolean !== null){
						if(additionalPropertiesBoolean.present){
							os.additionalPropertiesBoolean = additionalPropertiesBoolean.get()
						}
					}else if(additionalPropertiesSchema !== null){
						if(additionalPropertiesSchema.present){
							os.additionalPropertiesSchema = additionalPropertiesSchema.get()
						}
					}
					if(minProperties.present){
						os.minProperties = minProperties.get()
						usedMinProperties = minProperties.get()
					}
					os
				}
			]
		).zip(maxProperties(usedMinProperties), [ObjectSchema os, Optional<Integer> maxProperties | {
			if(maxProperties.present){
				os.maxProperties = maxProperties.get()
			}
			os
		}]).zip(properties(usedMinProperties, usedMaxProperties), [ObjectSchema os, Optional<Map<String, Schema>> properties | {
			if(properties.present){
				os.properties = properties.get()
			}
			os
		}])
	}
	def static Gen<Optional<Boolean>> additionalPropertiesBoolean(){
		booleans.all.toOptionals(75)
	}
	def static Gen<Optional<Schema>> additionalPropertiesSchema(){
		if(!StaticConfig.isRecursiveSchemasReached){
			StaticConfig.currentRecursiveSchemas++
			Schema.fullSchema.toOptionals(75)
		}else{
			constant(Optional.empty)
		}
		
	}
	def static Gen<Optional<Map<String, Schema>>> properties(){
		properties(false, 0, Integer.MAX_VALUE)
	}
	def static Gen<Optional<Map<String, Schema>>> properties(int minNumberOfProperties, int maxNumberOfProperties){
		properties(false, minNumberOfProperties, maxNumberOfProperties)
	}
	def static Gen<Optional<Map<String, Schema>>> properties(Boolean shouldBeNull, int minNumberOfProperties, int maxNumberOfProperties){
		if(shouldBeNull || !StaticConfig.isRecursiveSchemasReached){
			maps.of(strings.allPossible.ofLengthBetween(0, Integer.MAX_VALUE), Schema.fullSchema).ofSizeBetween(0, 10).toOptionals(75)
		}else{
			constant(Optional.empty)
		}
	}
	def static Gen<Optional<List<String>>> required(){
		lists.of(strings.allPossible.ofLengthBetween(0, Integer.MAX_VALUE)).ofSizeBetween(0, 10).toOptionals(75)
	}
	def static Gen<Optional<Integer>> maxProperties(){
		maxProperties(0)
	}
	def static Gen<Optional<Integer>> maxProperties(int minProperties){
		integers().between(minProperties, Integer.MAX_VALUE).toOptionals(75)
	}
	def static Gen<Optional<Integer>> minProperties(){
		integers().allPositive().toOptionals(75)
	}
}