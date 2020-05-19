package org.xtext.json.schema.tests.model

import org.eclipse.xtend.lib.annotations.Accessors
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
		return lists.of(Schema.fullSchema).ofSizeBetween(0, Integer.MAX_VALUE);
	}
	def static Gen<Schema> contains(){
		return Schema.fullSchema;
	}
	def static Gen<Boolean> uniqueItems(){
		return booleans.all;
	}
	def static Gen<Boolean> additionalItemsBoolean(){
		return booleans.all;
	}
	def static Gen<Schema> additionalItemsSchema(){
		return Schema.fullSchema;
	}
	def static Gen<Integer> minItems(){
		return integers().allPositive().map([Integer i | new Integer(i)]);
	}
	def static Gen<Integer> maxItems(){
		return integers().allPositive().map([Integer i | new Integer(i)]);
	}
}