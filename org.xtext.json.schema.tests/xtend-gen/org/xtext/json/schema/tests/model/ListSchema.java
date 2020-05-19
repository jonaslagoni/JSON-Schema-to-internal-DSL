package org.xtext.json.schema.tests.model;

import java.util.List;
import java.util.function.Function;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.api.Function3;
import org.quicktheories.api.Function5;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.SourceDSL;
import org.xtext.json.schema.tests.model.Schema;

@SuppressWarnings("all")
public class ListSchema {
  @Accessors
  private List<Schema> items;
  
  @Accessors
  private Schema contains;
  
  @Accessors
  private Boolean uniqueItems;
  
  @Accessors
  private Boolean additionalItemsBoolean;
  
  @Accessors
  private Schema additionalItemsSchema;
  
  @Accessors
  private Integer maxItems;
  
  @Accessors
  private Integer minItems;
  
  public ListSchema() {
  }
  
  public static Gen<ListSchema> fullListSchema() {
    final Function5<List<Schema>, Schema, Boolean, Boolean, Schema, ListSchema> _function = (List<Schema> items, Schema contains, Boolean uniqueItems, Boolean additionalItemsBoolean, Schema additionalItemsSchema) -> {
      ListSchema _xblockexpression = null;
      {
        ListSchema ls = new ListSchema();
        ls.items = items;
        ls.contains = contains;
        ls.uniqueItems = uniqueItems;
        ls.additionalItemsBoolean = additionalItemsBoolean;
        ls.additionalItemsSchema = additionalItemsSchema;
        _xblockexpression = ls;
      }
      return _xblockexpression;
    };
    final Function3<ListSchema, Integer, Integer, ListSchema> _function_1 = (ListSchema ls, Integer minItems, Integer maxItems) -> {
      ListSchema _xblockexpression = null;
      {
        ls.minItems = minItems;
        ls.maxItems = maxItems;
        _xblockexpression = ls;
      }
      return _xblockexpression;
    };
    return ListSchema.items().<Schema, Boolean, Boolean, Schema, ListSchema>zip(
      ListSchema.contains(), 
      ListSchema.uniqueItems(), 
      ListSchema.additionalItemsBoolean(), 
      ListSchema.additionalItemsSchema(), _function).<Integer, Integer, ListSchema>zip(
      ListSchema.minItems(), 
      ListSchema.maxItems(), _function_1);
  }
  
  public static Gen<List<Schema>> items() {
    return SourceDSL.lists().<Schema>of(Schema.fullSchema()).ofSizeBetween(0, Integer.MAX_VALUE);
  }
  
  public static Gen<Schema> contains() {
    return Schema.fullSchema();
  }
  
  public static Gen<Boolean> uniqueItems() {
    return SourceDSL.booleans().all();
  }
  
  public static Gen<Boolean> additionalItemsBoolean() {
    return SourceDSL.booleans().all();
  }
  
  public static Gen<Schema> additionalItemsSchema() {
    return Schema.fullSchema();
  }
  
  public static Gen<Integer> minItems() {
    final Function<Integer, Integer> _function = (Integer i) -> {
      return new Integer((i).intValue());
    };
    return SourceDSL.integers().allPositive().<Integer>map(_function);
  }
  
  public static Gen<Integer> maxItems() {
    final Function<Integer, Integer> _function = (Integer i) -> {
      return new Integer((i).intValue());
    };
    return SourceDSL.integers().allPositive().<Integer>map(_function);
  }
  
  @Pure
  public List<Schema> getItems() {
    return this.items;
  }
  
  public void setItems(final List<Schema> items) {
    this.items = items;
  }
  
  @Pure
  public Schema getContains() {
    return this.contains;
  }
  
  public void setContains(final Schema contains) {
    this.contains = contains;
  }
  
  @Pure
  public Boolean getUniqueItems() {
    return this.uniqueItems;
  }
  
  public void setUniqueItems(final Boolean uniqueItems) {
    this.uniqueItems = uniqueItems;
  }
  
  @Pure
  public Boolean getAdditionalItemsBoolean() {
    return this.additionalItemsBoolean;
  }
  
  public void setAdditionalItemsBoolean(final Boolean additionalItemsBoolean) {
    this.additionalItemsBoolean = additionalItemsBoolean;
  }
  
  @Pure
  public Schema getAdditionalItemsSchema() {
    return this.additionalItemsSchema;
  }
  
  public void setAdditionalItemsSchema(final Schema additionalItemsSchema) {
    this.additionalItemsSchema = additionalItemsSchema;
  }
  
  @Pure
  public Integer getMaxItems() {
    return this.maxItems;
  }
  
  public void setMaxItems(final Integer maxItems) {
    this.maxItems = maxItems;
  }
  
  @Pure
  public Integer getMinItems() {
    return this.minItems;
  }
  
  public void setMinItems(final Integer minItems) {
    this.minItems = minItems;
  }
}
