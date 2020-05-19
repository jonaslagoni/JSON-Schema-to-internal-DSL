package org.xtext.json.schema.tests.model

import org.quicktheories.api.Pair;
import org.eclipse.xtend.lib.annotations.Accessors
import static org.quicktheories.generators.Generate.frequency
import static org.quicktheories.generators.Generate.constant
import static org.quicktheories.generators.SourceDSL.*
import java.util.List
import org.quicktheories.core.Gen

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
	
	def static Gen<ListSchema> fullListSchema() {
		items().zip(
			contains(), 
			uniqueItems(), 
			additionalItemsBoolean(),
			additionalItemsSchema(), 
			[
				List<Schema> items, 
				Schema contains, 
				Boolean uniqueItems, 
				Boolean additionalItemsBoolean, 
				Schema additionalItemsSchema 
				| {
					var ls = new ListSchema()
					ls.items = items
					ls.contains = contains
					ls.uniqueItems = uniqueItems
					ls.additionalItemsBoolean = additionalItemsBoolean
					ls.additionalItemsSchema = additionalItemsSchema
					ls
				}
			]
		).zip(
			minItems(), 
			maxItems(), 
			[
				ListSchema ls, 
				Integer minItems, 
				Integer maxItems 
				| {
					ls.minItems = minItems
					ls.maxItems = maxItems
					ls
				}
			]
		)
	}
	def static Gen<List<Schema>> items(){
		var schemaPair = Pair.of(new Integer(1), lists.of(Schema.fullSchema).ofSizeBetween(0, Integer.MAX_VALUE))
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[schemaPair, nullPair])
	}
	def static Gen<Schema> contains(){
		var schemaPair = Pair.of(new Integer(1), Schema.fullSchema)
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[schemaPair, nullPair])
	}
	def static Gen<Boolean> uniqueItems(){
		var booleanPair = Pair.of(new Integer(1), booleans.all)
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[booleanPair, nullPair])
	}
	def static Gen<Boolean> additionalItemsBoolean(){
		var booleanPair = Pair.of(new Integer(1), booleans.all)
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[booleanPair, nullPair])
	}
	def static Gen<Schema> additionalItemsSchema(){
		var schemaPair = Pair.of(new Integer(1), Schema.fullSchema)
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[schemaPair, nullPair])
	}
	def static Gen<Integer> minItems(){
		var intPair = Pair.of(new Integer(1), integers().allPositive())
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[intPair, nullPair])
	}
	def static Gen<Integer> maxItems(){
		var intPair = Pair.of(new Integer(1), integers().allPositive())
		var nullPair = Pair.of(new Integer(1), constant(null))
		return frequency(#[intPair, nullPair])
	}
}