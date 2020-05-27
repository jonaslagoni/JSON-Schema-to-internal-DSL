package org.xtext.json.schema.tests.model;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.api.Function3;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;
import org.quicktheories.generators.SourceDSL;
import org.xtext.json.schema.tests.StaticConfig;
import org.xtext.json.schema.tests.model.Schema;

@SuppressWarnings("all")
public class ObjectSchema {
  public static class ObjectSchemaOptions {
    @Accessors
    private boolean excludeAdditionalProperties = false;
    
    @Accessors
    private boolean excludeProperties = false;
    
    @Pure
    public boolean isExcludeAdditionalProperties() {
      return this.excludeAdditionalProperties;
    }
    
    public void setExcludeAdditionalProperties(final boolean excludeAdditionalProperties) {
      this.excludeAdditionalProperties = excludeAdditionalProperties;
    }
    
    @Pure
    public boolean isExcludeProperties() {
      return this.excludeProperties;
    }
    
    public void setExcludeProperties(final boolean excludeProperties) {
      this.excludeProperties = excludeProperties;
    }
  }
  
  @Accessors
  private Map<String, Schema> properties;
  
  @Accessors
  private Boolean additionalPropertiesBoolean;
  
  @Accessors
  private Schema additionalPropertiesSchema;
  
  @Accessors
  private Integer maxProperties;
  
  @Accessors
  private Integer minProperties;
  
  @Accessors
  private String propertyNamesPattern;
  
  @Accessors
  private Map<String, Schema> patternProperties;
  
  @Accessors
  private List<String> required;
  
  @Accessors
  private Map<String, List<String>> propertyDependencies;
  
  @Accessors
  private Map<String, Schema> schemaDependencies;
  
  public ObjectSchema() {
  }
  
  public CharSequence toCharSequence() {
    boolean alreadyAdded = false;
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((this.properties != null) && (!this.properties.isEmpty()))) {
        _builder.append("\"properties\": {");
        {
          Set<Map.Entry<String, Schema>> _entrySet = this.properties.entrySet();
          boolean _hasElements = false;
          for(final Map.Entry<String, Schema> entry : _entrySet) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append("\"");
            String _key = entry.getKey();
            _builder.append(_key);
            _builder.append("\": ");
            CharSequence _charSequence = entry.getValue().toCharSequence();
            _builder.append(_charSequence);
          }
        }
        _builder.append("}");
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.additionalPropertiesBoolean != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"additionalProperties\": ");
        _builder.append(this.additionalPropertiesBoolean);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.additionalPropertiesSchema != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"additionalProperties\": ");
        CharSequence _charSequence_1 = this.additionalPropertiesSchema.toCharSequence();
        _builder.append(_charSequence_1);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.maxProperties != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"maxProperties\": ");
        _builder.append(this.maxProperties);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.minProperties != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"minProperties\": ");
        _builder.append(this.minProperties);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    return _builder;
  }
  
  public static Gen<ObjectSchema> fullValidObjectSchema() {
    ObjectSchema.ObjectSchemaOptions _objectSchemaOptions = new ObjectSchema.ObjectSchemaOptions();
    return ObjectSchema.fullValidObjectSchema(_objectSchemaOptions);
  }
  
  private static int usedMinProperties = 0;
  
  private static int usedMaxProperties = 0;
  
  public static Gen<ObjectSchema> fullValidObjectSchema(final ObjectSchema.ObjectSchemaOptions options) {
    final Function3<Optional<Integer>, Optional<Schema>, Optional<Boolean>, ObjectSchema> _function = (Optional<Integer> minProperties, Optional<Schema> additionalPropertiesSchema, Optional<Boolean> additionalPropertiesBoolean) -> {
      ObjectSchema _xblockexpression = null;
      {
        ObjectSchema os = new ObjectSchema();
        if ((additionalPropertiesBoolean != null)) {
          boolean _isPresent = additionalPropertiesBoolean.isPresent();
          if (_isPresent) {
            os.additionalPropertiesBoolean = additionalPropertiesBoolean.get();
          }
        } else {
          if ((additionalPropertiesSchema != null)) {
            boolean _isPresent_1 = additionalPropertiesSchema.isPresent();
            if (_isPresent_1) {
              os.additionalPropertiesSchema = additionalPropertiesSchema.get();
            }
          }
        }
        boolean _isPresent_2 = minProperties.isPresent();
        if (_isPresent_2) {
          os.minProperties = minProperties.get();
          ObjectSchema.usedMinProperties = (minProperties.get()).intValue();
        }
        _xblockexpression = os;
      }
      return _xblockexpression;
    };
    final BiFunction<ObjectSchema, Optional<Integer>, ObjectSchema> _function_1 = (ObjectSchema os, Optional<Integer> maxProperties) -> {
      ObjectSchema _xblockexpression = null;
      {
        boolean _isPresent = maxProperties.isPresent();
        if (_isPresent) {
          os.maxProperties = maxProperties.get();
        }
        _xblockexpression = os;
      }
      return _xblockexpression;
    };
    final BiFunction<ObjectSchema, Optional<Map<String, Schema>>, ObjectSchema> _function_2 = (ObjectSchema os, Optional<Map<String, Schema>> properties) -> {
      ObjectSchema _xblockexpression = null;
      {
        boolean _isPresent = properties.isPresent();
        if (_isPresent) {
          os.properties = properties.get();
        }
        _xblockexpression = os;
      }
      return _xblockexpression;
    };
    return ObjectSchema.minProperties().<Optional<Schema>, Optional<Boolean>, ObjectSchema>zip(
      ObjectSchema.additionalPropertiesSchema(), 
      ObjectSchema.additionalPropertiesBoolean(), _function).<Optional<Integer>, ObjectSchema>zip(ObjectSchema.maxProperties(ObjectSchema.usedMinProperties), _function_1).<Optional<Map<String, Schema>>, ObjectSchema>zip(ObjectSchema.properties(ObjectSchema.usedMinProperties, ObjectSchema.usedMaxProperties), _function_2);
  }
  
  public static Gen<Optional<Boolean>> additionalPropertiesBoolean() {
    return SourceDSL.booleans().all().toOptionals(75);
  }
  
  public static Gen<Optional<Schema>> additionalPropertiesSchema() {
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
  
  public static Gen<Optional<Map<String, Schema>>> properties() {
    return ObjectSchema.properties(Boolean.valueOf(false), 0, Integer.MAX_VALUE);
  }
  
  public static Gen<Optional<Map<String, Schema>>> properties(final int minNumberOfProperties, final int maxNumberOfProperties) {
    return ObjectSchema.properties(Boolean.valueOf(false), minNumberOfProperties, maxNumberOfProperties);
  }
  
  public static Gen<Optional<Map<String, Schema>>> properties(final Boolean shouldBeNull, final int minNumberOfProperties, final int maxNumberOfProperties) {
    Gen<Optional<Map<String, Schema>>> _xifexpression = null;
    if (((shouldBeNull).booleanValue() || (!StaticConfig.isRecursiveSchemasReached()))) {
      _xifexpression = SourceDSL.maps().<String, Schema>of(SourceDSL.strings().allPossible().ofLengthBetween(0, Integer.MAX_VALUE), Schema.fullSchema()).ofSizeBetween(0, 10).toOptionals(75);
    } else {
      _xifexpression = Generate.<Optional<Map<String, Schema>>>constant(Optional.<Map<String, Schema>>empty());
    }
    return _xifexpression;
  }
  
  public static Gen<Optional<List<String>>> required() {
    return SourceDSL.lists().<String>of(SourceDSL.strings().allPossible().ofLengthBetween(0, Integer.MAX_VALUE)).ofSizeBetween(0, 10).toOptionals(75);
  }
  
  public static Gen<Optional<Integer>> maxProperties() {
    return ObjectSchema.maxProperties(0);
  }
  
  public static Gen<Optional<Integer>> maxProperties(final int minProperties) {
    return SourceDSL.integers().between(minProperties, Integer.MAX_VALUE).toOptionals(75);
  }
  
  public static Gen<Optional<Integer>> minProperties() {
    return SourceDSL.integers().allPositive().toOptionals(75);
  }
  
  @Pure
  public Map<String, Schema> getProperties() {
    return this.properties;
  }
  
  public void setProperties(final Map<String, Schema> properties) {
    this.properties = properties;
  }
  
  @Pure
  public Boolean getAdditionalPropertiesBoolean() {
    return this.additionalPropertiesBoolean;
  }
  
  public void setAdditionalPropertiesBoolean(final Boolean additionalPropertiesBoolean) {
    this.additionalPropertiesBoolean = additionalPropertiesBoolean;
  }
  
  @Pure
  public Schema getAdditionalPropertiesSchema() {
    return this.additionalPropertiesSchema;
  }
  
  public void setAdditionalPropertiesSchema(final Schema additionalPropertiesSchema) {
    this.additionalPropertiesSchema = additionalPropertiesSchema;
  }
  
  @Pure
  public Integer getMaxProperties() {
    return this.maxProperties;
  }
  
  public void setMaxProperties(final Integer maxProperties) {
    this.maxProperties = maxProperties;
  }
  
  @Pure
  public Integer getMinProperties() {
    return this.minProperties;
  }
  
  public void setMinProperties(final Integer minProperties) {
    this.minProperties = minProperties;
  }
  
  @Pure
  public String getPropertyNamesPattern() {
    return this.propertyNamesPattern;
  }
  
  public void setPropertyNamesPattern(final String propertyNamesPattern) {
    this.propertyNamesPattern = propertyNamesPattern;
  }
  
  @Pure
  public Map<String, Schema> getPatternProperties() {
    return this.patternProperties;
  }
  
  public void setPatternProperties(final Map<String, Schema> patternProperties) {
    this.patternProperties = patternProperties;
  }
  
  @Pure
  public List<String> getRequired() {
    return this.required;
  }
  
  public void setRequired(final List<String> required) {
    this.required = required;
  }
  
  @Pure
  public Map<String, List<String>> getPropertyDependencies() {
    return this.propertyDependencies;
  }
  
  public void setPropertyDependencies(final Map<String, List<String>> propertyDependencies) {
    this.propertyDependencies = propertyDependencies;
  }
  
  @Pure
  public Map<String, Schema> getSchemaDependencies() {
    return this.schemaDependencies;
  }
  
  public void setSchemaDependencies(final Map<String, Schema> schemaDependencies) {
    this.schemaDependencies = schemaDependencies;
  }
}
