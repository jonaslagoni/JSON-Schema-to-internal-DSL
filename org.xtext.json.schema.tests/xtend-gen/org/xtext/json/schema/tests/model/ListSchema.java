package org.xtext.json.schema.tests.model;

import java.util.List;
import java.util.Optional;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.api.Function3;
import org.quicktheories.api.Function5;
import org.quicktheories.api.Pair;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;
import org.quicktheories.generators.SourceDSL;
import org.xtext.json.schema.tests.StaticConfig;
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
  
  /**
   * Returns a CharSequence of defined JSON Schema list keywords.
   */
  public CharSequence toCharSequence() {
    boolean alreadyAdded = false;
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((this.items != null) && (!this.items.isEmpty()))) {
        _builder.append("\"items\": [");
        {
          boolean _hasElements = false;
          for(final Schema item : this.items) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _charSequence = item.toCharSequence();
            _builder.append(_charSequence);
          }
        }
        _builder.append("]");
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.contains != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"contains\": ");
        CharSequence _charSequence_1 = this.contains.toCharSequence();
        _builder.append(_charSequence_1);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.uniqueItems != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"uniqueItems\": ");
        _builder.append(this.uniqueItems);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.additionalItemsBoolean != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"additionalItems\": ");
        _builder.append(this.additionalItemsBoolean);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.additionalItemsSchema != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"additionalItems\": ");
        CharSequence _charSequence_2 = this.additionalItemsSchema.toCharSequence();
        _builder.append(_charSequence_2);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.maxItems != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"maxItems\": ");
        _builder.append(this.maxItems);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.minItems != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"minItems\": ");
        _builder.append(this.minItems);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * Does this list schema contain any keywords or is it empty
   */
  public boolean containsKeywords() {
    return (((((((this.items != null) || 
      (this.contains != null)) || 
      (this.uniqueItems != null)) || 
      (this.additionalItemsBoolean != null)) || 
      (this.additionalItemsSchema != null)) || 
      (this.maxItems != null)) || 
      (this.minItems != null));
  }
  
  /**
   * Return a generator which generats a list schema where all schemas can be used. i.e. items etc generates all types
   */
  public static Gen<ListSchema> fullListSchema() {
    return ListSchema.fullListSchema(false);
  }
  
  /**
   * Return a generator which generats a list schema where all schemas can be used. i.e. items etc generates all types unless the parameter is sat.
   * Then only schemas containing list schemas can be generated.
   */
  public static Gen<ListSchema> fullListSchema(final boolean onlyListSchemas) {
    final Function5<Optional<List<Schema>>, Optional<Schema>, Optional<Boolean>, Optional<Boolean>, Optional<Schema>, ListSchema> _function = (Optional<List<Schema>> items, Optional<Schema> contains, Optional<Boolean> uniqueItems, Optional<Boolean> additionalItemsBoolean, Optional<Schema> additionalItemsSchema) -> {
      ListSchema _xblockexpression = null;
      {
        ListSchema ls = new ListSchema();
        boolean _isPresent = items.isPresent();
        if (_isPresent) {
          ls.items = items.get();
        }
        boolean _isPresent_1 = contains.isPresent();
        if (_isPresent_1) {
          ls.contains = contains.get();
        }
        boolean _isPresent_2 = uniqueItems.isPresent();
        if (_isPresent_2) {
          ls.uniqueItems = uniqueItems.get();
        }
        boolean _isPresent_3 = additionalItemsBoolean.isPresent();
        if (_isPresent_3) {
          ls.additionalItemsBoolean = additionalItemsBoolean.get();
        } else {
          boolean _isPresent_4 = additionalItemsSchema.isPresent();
          if (_isPresent_4) {
            ls.additionalItemsSchema = additionalItemsSchema.get();
          }
        }
        _xblockexpression = ls;
      }
      return _xblockexpression;
    };
    final Function3<ListSchema, Optional<Integer>, Optional<Integer>, ListSchema> _function_1 = (ListSchema ls, Optional<Integer> minItems, Optional<Integer> maxItems) -> {
      ListSchema _xblockexpression = null;
      {
        boolean _isPresent = minItems.isPresent();
        if (_isPresent) {
          ls.minItems = minItems.get();
        }
        boolean _isPresent_1 = maxItems.isPresent();
        if (_isPresent_1) {
          ls.maxItems = maxItems.get();
        }
        _xblockexpression = ls;
      }
      return _xblockexpression;
    };
    return ListSchema.items(onlyListSchemas).<Optional<Schema>, Optional<Boolean>, Optional<Boolean>, Optional<Schema>, ListSchema>zip(
      ListSchema.contains(onlyListSchemas), 
      ListSchema.uniqueItems(), 
      ListSchema.additionalItemsBoolean(), 
      ListSchema.additionalItemsSchema(onlyListSchemas), _function).<Optional<Integer>, Optional<Integer>, ListSchema>zip(
      ListSchema.minItems(), 
      ListSchema.maxItems(), _function_1);
  }
  
  /**
   * Returns a generator for generating items which can either generate all types of schemas or just schemas with type list.
   */
  public static Gen<Optional<List<Schema>>> items(final boolean onlyListSchemas) {
    Gen<Optional<List<Schema>>> _xifexpression = null;
    boolean _isRecursiveItemsReached = StaticConfig.isRecursiveItemsReached();
    boolean _not = (!_isRecursiveItemsReached);
    if (_not) {
      Gen<Optional<List<Schema>>> _xblockexpression = null;
      {
        int _currentRecursiveItems = StaticConfig.currentRecursiveItems;
        StaticConfig.currentRecursiveItems = (_currentRecursiveItems + 10);
        Gen<Optional<List<Schema>>> _xifexpression_1 = null;
        if (onlyListSchemas) {
          _xifexpression_1 = SourceDSL.lists().<Schema>of(Schema.fullListSchema()).ofSizeBetween(0, 10).toOptionals(25);
        } else {
          _xifexpression_1 = SourceDSL.lists().<Schema>of(Schema.fullSchema()).ofSizeBetween(0, 10).toOptionals(25);
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = Generate.<Optional<List<Schema>>>constant(Optional.<List<Schema>>empty());
    }
    return _xifexpression;
  }
  
  /**
   * Returns a generator for generating contains which can either generate all types of schemas or just schemas with type list.
   */
  public static Gen<Optional<Schema>> contains(final boolean onlyListSchemas) {
    Gen<Optional<Schema>> _xifexpression = null;
    boolean _isRecursiveContainsReached = StaticConfig.isRecursiveContainsReached();
    boolean _not = (!_isRecursiveContainsReached);
    if (_not) {
      Gen<Optional<Schema>> _xblockexpression = null;
      {
        StaticConfig.currentRecursiveContains++;
        Gen<Optional<Schema>> _xifexpression_1 = null;
        if (onlyListSchemas) {
          _xifexpression_1 = Schema.fullListSchema().toOptionals(25);
        } else {
          _xifexpression_1 = Schema.fullSchema().toOptionals(25);
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = Generate.<Optional<Schema>>constant(Optional.<Schema>empty());
    }
    return _xifexpression;
  }
  
  /**
   * Returns a generator for generating uniqueItems
   */
  public static Gen<Optional<Boolean>> uniqueItems() {
    return SourceDSL.booleans().all().toOptionals(25);
  }
  
  /**
   * Returns a generator for generating additionalItems as a boolean
   */
  public static Gen<Optional<Boolean>> additionalItemsBoolean() {
    return SourceDSL.booleans().all().toOptionals(25);
  }
  
  /**
   * Returns a generator for generating additionalItems as a schema of any type
   */
  public static Gen<Optional<Schema>> additionalItemsSchema() {
    return ListSchema.additionalItemsSchema(false);
  }
  
  /**
   * Returns a generator for generating additionalItems as a schema of list schemas only
   */
  public static Gen<Optional<Schema>> additionalItemsSchema(final boolean onlyListSchemas) {
    Gen<Optional<Schema>> _xifexpression = null;
    boolean _isRecursiveAdditionalItemsSchemaReached = StaticConfig.isRecursiveAdditionalItemsSchemaReached();
    boolean _not = (!_isRecursiveAdditionalItemsSchemaReached);
    if (_not) {
      Gen<Optional<Schema>> _xblockexpression = null;
      {
        StaticConfig.currentRecursiveAdditionalItemsSchema++;
        Schema.fullListSchema().toOptionals(25);
        Gen<Optional<Schema>> _xifexpression_1 = null;
        if (onlyListSchemas) {
          _xifexpression_1 = Schema.fullListSchema().toOptionals(25);
        } else {
          _xifexpression_1 = Schema.fullSchema().toOptionals(25);
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = Generate.<Optional<Schema>>constant(Optional.<Schema>empty());
    }
    return _xifexpression;
  }
  
  /**
   * Returns a generator for generating minItems
   */
  public static Gen<Optional<Integer>> minItems() {
    Integer _integer = new Integer(1);
    return Generate.<Optional<Integer>>frequency(
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(2), SourceDSL.integers().between(1, (Integer.MAX_VALUE - 1)).toOptionals(25)), 
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(1), Generate.<Integer>constant(_integer).toOptionals(0)), 
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(1), Generate.<Integer>constant(Integer.valueOf(Integer.MAX_VALUE)).toOptionals(0)));
  }
  
  /**
   * Returns a generator for generating maxItems, this does not care about minItems
   */
  public static Gen<Optional<Integer>> maxItems() {
    Integer _integer = new Integer(1);
    return Generate.<Optional<Integer>>frequency(
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(2), SourceDSL.integers().between(1, (Integer.MAX_VALUE - 1)).toOptionals(25)), 
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(1), Generate.<Integer>constant(_integer).toOptionals(0)), 
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(1), Generate.<Integer>constant(Integer.valueOf(Integer.MAX_VALUE)).toOptionals(0)));
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
