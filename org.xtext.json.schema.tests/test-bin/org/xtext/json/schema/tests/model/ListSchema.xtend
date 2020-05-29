package org.xtext.json.schema.tests.model

import org.quicktheories.api.Pair;
import org.eclipse.xtend.lib.annotations.Accessors
import static org.quicktheories.generators.Generate.frequency
import static org.quicktheories.generators.Generate.constant
import static org.quicktheories.generators.SourceDSL.*
import java.util.List
import org.quicktheories.core.Gen
import org.xtext.json.schema.tests.StaticConfig
import java.util.Optional

class ListSchema {
	@Accessors
	var List<Schema> items;
	@Accessors
	var Schema contains;
	@Accessors
	var Boolean uniqueItems;
	@Accessors
	var Boolean additionalItemsBoolean;
	@Accessors
	var Schema additionalItemsSchema;
	@Accessors
	var Integer maxItems;
	@Accessors
	var Integer minItems;
	
	new() {
	}

	
	/**
	 * Returns a CharSequence of defined JSON Schema list keywords.
	 */
	def CharSequence toCharSequence() {
		var alreadyAdded = false;
		return '''
			«IF (items !== null && !items.isEmpty)»
				"items": [«FOR item:items SEPARATOR ","»«item.toCharSequence»«ENDFOR»]
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (contains !== null)»
				«IF(alreadyAdded)»,«ENDIF»"contains": «contains.toCharSequence»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (uniqueItems !== null)»
				«IF(alreadyAdded)»,«ENDIF»"uniqueItems": «uniqueItems»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (additionalItemsBoolean !== null)»
				«IF(alreadyAdded)»,«ENDIF»"additionalItems": «additionalItemsBoolean»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (additionalItemsSchema !== null)»
				«IF(alreadyAdded)»,«ENDIF»"additionalItems": «additionalItemsSchema.toCharSequence»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (maxItems !== null)»
				«IF(alreadyAdded)»,«ENDIF»"maxItems": «maxItems»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
			«IF (minItems !== null)»
				«IF(alreadyAdded)»,«ENDIF»"minItems": «minItems»
				«IF(alreadyAdded = true)»«ENDIF»
			«ENDIF»
		'''
	}
	
	/**
	 * Does this list schema contain any keywords or is it empty
	 */
	def boolean containsKeywords(){
		return 
			items !== null || 
			contains !== null || 
			uniqueItems !== null || 
			additionalItemsBoolean !== null || 
			additionalItemsSchema !== null || 
			maxItems !== null || 
			minItems !== null
	}
	
	
	/**
	 * Return a generator which generats a list schema where all schemas can be used. i.e. items etc generates all types
	 */
	def static Gen<ListSchema> fullListSchema() {
		fullListSchema(false)
	}
	
	/**
	 * Return a generator which generats a list schema where all schemas can be used. i.e. items etc generates all types unless the parameter is sat. 
	 * Then only schemas containing list schemas can be generated. 
	 */
	def static Gen<ListSchema> fullListSchema(boolean onlyListSchemas) {
		items(onlyListSchemas).zip(
			contains(onlyListSchemas), 
			uniqueItems(), 
			additionalItemsBoolean(),
			additionalItemsSchema(onlyListSchemas), 
			[
				Optional<List<Schema>> items, 
				Optional<Schema> contains, 
				Optional<Boolean> uniqueItems, 
				Optional<Boolean> additionalItemsBoolean, 
				Optional<Schema> additionalItemsSchema 
				| {
					var ls = new ListSchema()
					if(items.isPresent){
						ls.items = items.get()
					}
					if(contains.isPresent){
						ls.contains = contains.get()
					}
					if(uniqueItems.isPresent){
						ls.uniqueItems = uniqueItems.get()
					}
					if(additionalItemsBoolean.isPresent){
						ls.additionalItemsBoolean = additionalItemsBoolean.get()
					}else if(additionalItemsSchema.isPresent){
						ls.additionalItemsSchema = additionalItemsSchema.get()
					}
					ls
				}
			]
		).zip(
			minItems(), 
			maxItems(), 
			[
				ListSchema ls, 
				Optional<Integer> minItems, 
				Optional<Integer> maxItems 
				| {
					if(minItems.isPresent){
						ls.minItems = minItems.get()
					}
					if(maxItems.isPresent){
						ls.maxItems = maxItems.get()
					}
					ls
				}
			]
		)
	}


	/**
	 * Returns a generator for generating items which can either generate all types of schemas or just schemas with type list.
	 */
	def static Gen<Optional<List<Schema>>> items(boolean onlyListSchemas){
		if(!StaticConfig.isRecursiveItemsReached){
			StaticConfig.currentRecursiveItems+=10
			if(onlyListSchemas){
				lists.of(Schema.fullListSchema).ofSizeBetween(0, 10).toOptionals(25)
			}else{
				lists.of(Schema.fullSchema).ofSizeBetween(0, 10).toOptionals(25)
			}
		}else{
			constant(Optional.empty)
		}
	}
	
	/**
	 * Returns a generator for generating contains which can either generate all types of schemas or just schemas with type list.
	 */
	def static Gen<Optional<Schema>> contains(boolean onlyListSchemas){
		if(!StaticConfig.isRecursiveContainsReached){
			StaticConfig.currentRecursiveContains++
			if(onlyListSchemas){
				Schema.fullListSchema.toOptionals(25)
			}else{
				Schema.fullSchema.toOptionals(25)
			}
		}else{
			constant(Optional.empty)
		}
	}
	
	/**
	 * Returns a generator for generating uniqueItems
	 */
	def static Gen<Optional<Boolean>> uniqueItems(){
		booleans.all.toOptionals(25)
	}
	
	/**
	 * Returns a generator for generating additionalItems as a boolean
	 */
	def static Gen<Optional<Boolean>> additionalItemsBoolean(){
		booleans.all.toOptionals(25)
	}
	
	/**
	 * Returns a generator for generating additionalItems as a schema of any type
	 */
	def static Gen<Optional<Schema>> additionalItemsSchema(){
		additionalItemsSchema(false)
	}
	
	/**
	 * Returns a generator for generating additionalItems as a schema of list schemas only
	 */
	def static Gen<Optional<Schema>> additionalItemsSchema(boolean onlyListSchemas){
		if(!StaticConfig.isRecursiveAdditionalItemsSchemaReached){
			StaticConfig.currentRecursiveAdditionalItemsSchema++
			Schema.fullListSchema.toOptionals(25)
			if(onlyListSchemas){
				Schema.fullListSchema.toOptionals(25)
			}else{
				Schema.fullSchema.toOptionals(25)
			}
		}else{
			constant(Optional.empty)
		}
	}
	
	/**
	 * Returns a generator for generating minItems
	 */
	def static Gen<Optional<Integer>> minItems(){
		frequency(
			Pair.of(2, integers().between(1, Integer.MAX_VALUE-1).toOptionals(25)),
			Pair.of(1, constant(new Integer(1)).toOptionals(0)),
			Pair.of(1, constant(Integer.MAX_VALUE).toOptionals(0))
		);
	}
	
	/**
	 * Returns a generator for generating maxItems, this does not care about minItems
	 */
	def static Gen<Optional<Integer>> maxItems(){
		frequency(
			Pair.of(2, integers().between(1, Integer.MAX_VALUE-1).toOptionals(25)),
			Pair.of(1, constant(new Integer(1)).toOptionals(0)),
			Pair.of(1, constant(Integer.MAX_VALUE).toOptionals(0))
		);
	}
}