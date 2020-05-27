package org.xtext.json.schema.tests.model;

import java.util.List;
import java.util.Optional;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.api.Function3;
import org.quicktheories.api.Function5;
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
  
  public static Gen<ListSchema> fullListSchema() {
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
        }
        boolean _isPresent_4 = additionalItemsSchema.isPresent();
        if (_isPresent_4) {
          ls.additionalItemsSchema = additionalItemsSchema.get();
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
    return ListSchema.items().<Optional<Schema>, Optional<Boolean>, Optional<Boolean>, Optional<Schema>, ListSchema>zip(
      ListSchema.contains(), 
      ListSchema.uniqueItems(), 
      ListSchema.additionalItemsBoolean(), 
      ListSchema.additionalItemsSchema(), _function).<Optional<Integer>, Optional<Integer>, ListSchema>zip(
      ListSchema.minItems(), 
      ListSchema.maxItems(), _function_1);
  }
  
  public static Gen<Optional<List<Schema>>> items() {
    Gen<Optional<List<Schema>>> _xifexpression = null;
    boolean _isRecursiveSchemasReached = StaticConfig.isRecursiveSchemasReached();
    boolean _not = (!_isRecursiveSchemasReached);
    if (_not) {
      Gen<Optional<List<Schema>>> _xblockexpression = null;
      {
        int _currentRecursiveSchemas = StaticConfig.currentRecursiveSchemas;
        StaticConfig.currentRecursiveSchemas = (_currentRecursiveSchemas + 10);
        _xblockexpression = SourceDSL.lists().<Schema>of(Schema.fullSchema()).ofSizeBetween(0, 10).toOptionals(75);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = Generate.<Optional<List<Schema>>>constant(Optional.<List<Schema>>empty());
    }
    return _xifexpression;
  }
  
  public static Gen<Optional<Schema>> contains() {
    Gen<Optional<Schema>> _xifexpression = null;
    boolean _isRecursiveSchemasReached = StaticConfig.isRecursiveSchemasReached();
    boolean _not = (!_isRecursiveSchemasReached);
    if (_not) {
      Gen<Optional<Schema>> _xblockexpression = null;
      {
        StaticConfig.currentRecursiveSchemas++;
        _xblockexpression = Schema.fullSchema().toOptionals(75);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = Generate.<Optional<Schema>>constant(Optional.<Schema>empty());
    }
    return _xifexpression;
  }
  
  public static Gen<Optional<Boolean>> uniqueItems() {
    return SourceDSL.booleans().all().toOptionals(75);
  }
  
  public static Gen<Optional<Boolean>> additionalItemsBoolean() {
    return SourceDSL.booleans().all().toOptionals(75);
  }
  
  public static Gen<Optional<Schema>> additionalItemsSchema() {
    Gen<Optional<Schema>> _xifexpression = null;
    boolean _isRecursiveSchemasReached = StaticConfig.isRecursiveSchemasReached();
    boolean _not = (!_isRecursiveSchemasReached);
    if (_not) {
      Gen<Optional<Schema>> _xblockexpression = null;
      {
        StaticConfig.currentRecursiveSchemas++;
        _xblockexpression = Schema.fullSchema().toOptionals(75);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = Generate.<Optional<Schema>>constant(Optional.<Schema>empty());
    }
    return _xifexpression;
  }
  
  public static Gen<Optional<Integer>> minItems() {
    return SourceDSL.integers().allPositive().toOptionals(75);
  }
  
  public static Gen<Optional<Integer>> maxItems() {
    return SourceDSL.integers().allPositive().toOptionals(75);
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
