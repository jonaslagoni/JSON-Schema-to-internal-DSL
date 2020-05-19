package org.xtext.json.schema.tests.model;

import java.util.Collections;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.api.Function3;
import org.quicktheories.api.Function5;
import org.quicktheories.api.Pair;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;
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
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<List<Schema>>> schemaPair = Pair.<Integer, Gen<List<Schema>>>of(_integer, SourceDSL.lists().<Schema>of(Schema.fullSchema()).ofSizeBetween(0, Integer.MAX_VALUE));
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<List<Schema>>> nullPair = Pair.<Integer, Gen<List<Schema>>>of(_integer_1, Generate.<List<Schema>>constant(null));
    return Generate.<List<Schema>>frequency(Collections.<Pair<Integer, Gen<List<Schema>>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<List<Schema>>>>newArrayList(schemaPair, nullPair)));
  }
  
  public static Gen<Schema> contains() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<Schema>> schemaPair = Pair.<Integer, Gen<Schema>>of(_integer, Schema.fullSchema());
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<Schema>> nullPair = Pair.<Integer, Gen<Schema>>of(_integer_1, Generate.<Schema>constant(null));
    return Generate.<Schema>frequency(Collections.<Pair<Integer, Gen<Schema>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<Schema>>>newArrayList(schemaPair, nullPair)));
  }
  
  public static Gen<Boolean> uniqueItems() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<Boolean>> booleanPair = Pair.<Integer, Gen<Boolean>>of(_integer, SourceDSL.booleans().all());
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<Boolean>> nullPair = Pair.<Integer, Gen<Boolean>>of(_integer_1, Generate.<Boolean>constant(null));
    return Generate.<Boolean>frequency(Collections.<Pair<Integer, Gen<Boolean>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<Boolean>>>newArrayList(booleanPair, nullPair)));
  }
  
  public static Gen<Boolean> additionalItemsBoolean() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<Boolean>> booleanPair = Pair.<Integer, Gen<Boolean>>of(_integer, SourceDSL.booleans().all());
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<Boolean>> nullPair = Pair.<Integer, Gen<Boolean>>of(_integer_1, Generate.<Boolean>constant(null));
    return Generate.<Boolean>frequency(Collections.<Pair<Integer, Gen<Boolean>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<Boolean>>>newArrayList(booleanPair, nullPair)));
  }
  
  public static Gen<Schema> additionalItemsSchema() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<Schema>> schemaPair = Pair.<Integer, Gen<Schema>>of(_integer, Schema.fullSchema());
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<Schema>> nullPair = Pair.<Integer, Gen<Schema>>of(_integer_1, Generate.<Schema>constant(null));
    return Generate.<Schema>frequency(Collections.<Pair<Integer, Gen<Schema>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<Schema>>>newArrayList(schemaPair, nullPair)));
  }
  
  public static Gen<Integer> minItems() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<Integer>> intPair = Pair.<Integer, Gen<Integer>>of(_integer, SourceDSL.integers().allPositive());
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<Integer>> nullPair = Pair.<Integer, Gen<Integer>>of(_integer_1, Generate.<Integer>constant(null));
    return Generate.<Integer>frequency(Collections.<Pair<Integer, Gen<Integer>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<Integer>>>newArrayList(intPair, nullPair)));
  }
  
  public static Gen<Integer> maxItems() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<Integer>> intPair = Pair.<Integer, Gen<Integer>>of(_integer, SourceDSL.integers().allPositive());
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<Integer>> nullPair = Pair.<Integer, Gen<Integer>>of(_integer_1, Generate.<Integer>constant(null));
    return Generate.<Integer>frequency(Collections.<Pair<Integer, Gen<Integer>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<Integer>>>newArrayList(intPair, nullPair)));
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
