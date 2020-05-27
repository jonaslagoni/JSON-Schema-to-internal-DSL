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
	
	def static Gen<ListSchema> fullListSchema() {
		items().zip(
			contains(), 
			uniqueItems(), 
			additionalItemsBoolean(),
			additionalItemsSchema(), 
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
					}
					if(additionalItemsSchema.isPresent){
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
	def static Gen<Optional<List<Schema>>> items(){
		if(!StaticConfig.isRecursiveSchemasReached){
			StaticConfig.currentRecursiveSchemas+=10
			lists.of(Schema.fullSchema).ofSizeBetween(0, 10).toOptionals(75)
		}else{
			constant(Optional.empty)
		}
	}
	def static Gen<Optional<Schema>> contains(){
		if(!StaticConfig.isRecursiveSchemasReached){
			StaticConfig.currentRecursiveSchemas++
			Schema.fullSchema.toOptionals(75)
		}else{
			constant(Optional.empty)
		}
	}
	def static Gen<Optional<Boolean>> uniqueItems(){
		booleans.all.toOptionals(75)
	}
	def static Gen<Optional<Boolean>> additionalItemsBoolean(){
		booleans.all.toOptionals(75)
	}
	def static Gen<Optional<Schema>> additionalItemsSchema(){
		if(!StaticConfig.isRecursiveSchemasReached){
			StaticConfig.currentRecursiveSchemas++
			Schema.fullSchema.toOptionals(75)
		}else{
			constant(Optional.empty)
		}
	}
	def static Gen<Optional<Integer>> minItems(){
		integers().allPositive().toOptionals(75)
	}
	def static Gen<Optional<Integer>> maxItems(){
		integers().allPositive().toOptionals(75)
	}
}