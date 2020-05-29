package org.xtext.json.schema.tests.model;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.api.Function4;
import org.quicktheories.api.Function5;
import org.quicktheories.api.Pair;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;
import org.quicktheories.generators.SourceDSL;
import org.xtext.json.schema.tests.StaticConfig;
import org.xtext.json.schema.tests.model.Schema;

@SuppressWarnings("all")
public class ObjectSchema {
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
  private List<String> required;
  
  @Accessors
  private Schema propertyNames;
  
  @Accessors
  private Map<String, Schema> patternProperties;
  
  @Accessors
  private Map<String, List<String>> propertyDependencies;
  
  @Accessors
  private Map<String, Schema> schemaDependencies;
  
  public ObjectSchema() {
  }
  
  /**
   * Returns a CharSequence of defined JSON Schema object keywords.
   */
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
    {
      if ((this.required != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"required\": ");
        {
          boolean _hasElements_1 = false;
          for(final String requiredProp : this.required) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append("\"");
            _builder.append(requiredProp);
            _builder.append("\"");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.propertyNames != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"propertyNames\": ");
        CharSequence _charSequence_2 = this.propertyNames.toCharSequence();
        _builder.append(_charSequence_2);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if (((this.patternProperties != null) && (!this.patternProperties.isEmpty()))) {
        _builder.append("\"patternProperties\": {");
        {
          Set<Map.Entry<String, Schema>> _entrySet_1 = this.patternProperties.entrySet();
          boolean _hasElements_2 = false;
          for(final Map.Entry<String, Schema> entry_1 : _entrySet_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append("\"");
            String _key_1 = entry_1.getKey();
            _builder.append(_key_1);
            _builder.append("\": ");
            CharSequence _charSequence_3 = entry_1.getValue().toCharSequence();
            _builder.append(_charSequence_3);
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
      if (((this.propertyDependencies != null) && (!this.propertyDependencies.isEmpty()))) {
        _builder.append("\"dependencies\": {");
        {
          Set<Map.Entry<String, List<String>>> _entrySet_2 = this.propertyDependencies.entrySet();
          boolean _hasElements_3 = false;
          for(final Map.Entry<String, List<String>> entry_2 : _entrySet_2) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append("\"");
            String _key_2 = entry_2.getKey();
            _builder.append(_key_2);
            _builder.append("\": [");
            {
              List<String> _value = entry_2.getValue();
              boolean _hasElements_4 = false;
              for(final String prop : _value) {
                if (!_hasElements_4) {
                  _hasElements_4 = true;
                } else {
                  _builder.appendImmediate(",", "");
                }
                _builder.append("\"");
                _builder.append(prop);
                _builder.append("\"");
              }
            }
            _builder.append("]");
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
      if (((this.schemaDependencies != null) && (!this.schemaDependencies.isEmpty()))) {
        _builder.append("\"dependencies\": {");
        {
          Set<Map.Entry<String, Schema>> _entrySet_3 = this.schemaDependencies.entrySet();
          boolean _hasElements_5 = false;
          for(final Map.Entry<String, Schema> entry_3 : _entrySet_3) {
            if (!_hasElements_5) {
              _hasElements_5 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append("\"");
            String _key_3 = entry_3.getKey();
            _builder.append(_key_3);
            _builder.append("\": ");
            CharSequence _charSequence_4 = entry_3.getValue().toCharSequence();
            _builder.append(_charSequence_4);
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
    return _builder;
  }
  
  /**
   * Does this object schema contain any keywords or is it empty
   */
  public boolean containsKeywords() {
    return ((((((((((this.properties != null) || 
      (this.additionalPropertiesBoolean != null)) || 
      (this.additionalPropertiesSchema != null)) || 
      (this.maxProperties != null)) || 
      (this.minProperties != null)) || 
      (this.required != null)) || 
      (this.propertyNames != null)) || 
      (this.patternProperties != null)) || 
      (this.propertyDependencies != null)) || 
      (this.schemaDependencies != null));
  }
  
  /**
   * Return a generator which generats an object schema where all schemas can be used. i.e. properties etc generates all types
   */
  public static Gen<ObjectSchema> fullObjectSchema() {
    return ObjectSchema.fullObjectSchema(false);
  }
  
  /**
   * Return a generator which generats an object schema where all schemas can be used. i.e. properties etc generates all types unless the parameter is sat.
   * Then only schemas containing objects schemas can be generated.
   */
  public static Gen<ObjectSchema> fullObjectSchema(final boolean onlyObjectSchemas) {
    final Function4<Optional<Integer>, Optional<Schema>, Optional<Boolean>, Optional<Integer>, ObjectSchema> _function = (Optional<Integer> minProperties, Optional<Schema> additionalPropertiesSchema, Optional<Boolean> additionalPropertiesBoolean, Optional<Integer> maxProperties) -> {
      ObjectSchema _xblockexpression = null;
      {
        ObjectSchema os = new ObjectSchema();
        boolean _isPresent = additionalPropertiesBoolean.isPresent();
        if (_isPresent) {
          os.additionalPropertiesBoolean = additionalPropertiesBoolean.get();
        } else {
          boolean _isPresent_1 = additionalPropertiesSchema.isPresent();
          if (_isPresent_1) {
            os.additionalPropertiesSchema = additionalPropertiesSchema.get();
          }
        }
        boolean _isPresent_2 = minProperties.isPresent();
        if (_isPresent_2) {
          os.minProperties = minProperties.get();
        }
        boolean _isPresent_3 = maxProperties.isPresent();
        if (_isPresent_3) {
          os.maxProperties = maxProperties.get();
        }
        _xblockexpression = os;
      }
      return _xblockexpression;
    };
    final Function5<ObjectSchema, Optional<Map<String, Schema>>, Optional<List<String>>, Optional<Schema>, Optional<Map<String, Schema>>, ObjectSchema> _function_1 = (ObjectSchema os, Optional<Map<String, Schema>> properties, Optional<List<String>> required, Optional<Schema> propertyNames, Optional<Map<String, Schema>> patternProperties) -> {
      ObjectSchema _xblockexpression = null;
      {
        boolean _isPresent = properties.isPresent();
        if (_isPresent) {
          os.properties = properties.get();
        }
        boolean _isPresent_1 = required.isPresent();
        if (_isPresent_1) {
          os.required = required.get();
        }
        boolean _isPresent_2 = propertyNames.isPresent();
        if (_isPresent_2) {
          os.propertyNames = propertyNames.get();
        }
        boolean _isPresent_3 = patternProperties.isPresent();
        if (_isPresent_3) {
          os.patternProperties = patternProperties.get();
        }
        _xblockexpression = os;
      }
      return _xblockexpression;
    };
    final Function4<ObjectSchema, Optional<Map<String, Schema>>, Optional<Map<String, List<String>>>, Optional<Map<String, Schema>>, ObjectSchema> _function_2 = (ObjectSchema os, Optional<Map<String, Schema>> patternProperties, Optional<Map<String, List<String>>> propertyDependencies, Optional<Map<String, Schema>> schemaDependencies) -> {
      ObjectSchema _xblockexpression = null;
      {
        boolean _isPresent = patternProperties.isPresent();
        if (_isPresent) {
          os.patternProperties = patternProperties.get();
        }
        boolean _isPresent_1 = propertyDependencies.isPresent();
        if (_isPresent_1) {
          os.propertyDependencies = propertyDependencies.get();
        }
        boolean _isPresent_2 = schemaDependencies.isPresent();
        if (_isPresent_2) {
          os.schemaDependencies = schemaDependencies.get();
        }
        _xblockexpression = os;
      }
      return _xblockexpression;
    };
    return ObjectSchema.minProperties().<Optional<Schema>, Optional<Boolean>, Optional<Integer>, ObjectSchema>zip(
      ObjectSchema.additionalPropertiesSchema(onlyObjectSchemas), 
      ObjectSchema.additionalPropertiesBoolean(), 
      ObjectSchema.maxProperties(), _function).<Optional<Map<String, Schema>>, Optional<List<String>>, Optional<Schema>, Optional<Map<String, Schema>>, ObjectSchema>zip(
      ObjectSchema.properties(onlyObjectSchemas), 
      ObjectSchema.required(), 
      ObjectSchema.propertyNames(), 
      ObjectSchema.patternProperties(onlyObjectSchemas), _function_1).<Optional<Map<String, Schema>>, Optional<Map<String, List<String>>>, Optional<Map<String, Schema>>, ObjectSchema>zip(
      ObjectSchema.patternProperties(onlyObjectSchemas), 
      ObjectSchema.propertyDependencies(), 
      ObjectSchema.schemaDependencies(onlyObjectSchemas), _function_2);
  }
  
  /**
   * Returns a generator for generating additionalPropertiesBoolean
   */
  public static Gen<Optional<Boolean>> additionalPropertiesBoolean() {
    return SourceDSL.booleans().all().toOptionals(25);
  }
  
  /**
   * Returns a generator for generating additionalPropertiesSchema which can contain all types of schemas
   */
  public static Gen<Optional<Schema>> additionalPropertiesSchema() {
    return ObjectSchema.additionalPropertiesSchema(false);
  }
  
  /**
   * Returns a generator for generating additionalPropertiesSchema which can either generate all types of schemas or just schemas with type object.
   */
  public static Gen<Optional<Schema>> additionalPropertiesSchema(final boolean onlyObjectSchemas) {
    Gen<Optional<Schema>> _xifexpression = null;
    boolean _isRecursiveAdditionalSchemasReached = StaticConfig.isRecursiveAdditionalSchemasReached();
    boolean _not = (!_isRecursiveAdditionalSchemasReached);
    if (_not) {
      Gen<Optional<Schema>> _xblockexpression = null;
      {
        StaticConfig.currentRecursiveAdditionalSchemas++;
        Gen<Optional<Schema>> _xifexpression_1 = null;
        if (onlyObjectSchemas) {
          _xifexpression_1 = Schema.fullObjectSchema().toOptionals(25);
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
   * Returns a generator for generating properties which can contain all types of schemas
   */
  public static Gen<Optional<Map<String, Schema>>> properties() {
    return ObjectSchema.properties(false);
  }
  
  /**
   * Returns a generator for generating properties which can either generate properties of all types of schemas or just schemas with type object.
   */
  public static Gen<Optional<Map<String, Schema>>> properties(final boolean onlyObjectSchemas) {
    Gen<Optional<Map<String, Schema>>> _xifexpression = null;
    boolean _isRecursivePropertiesReached = StaticConfig.isRecursivePropertiesReached();
    boolean _not = (!_isRecursivePropertiesReached);
    if (_not) {
      Gen<Optional<Map<String, Schema>>> _xblockexpression = null;
      {
        int _currentRecursiveProperties = StaticConfig.currentRecursiveProperties;
        StaticConfig.currentRecursiveProperties = (_currentRecursiveProperties + 10);
        Gen<Optional<Map<String, Schema>>> _xifexpression_1 = null;
        if (onlyObjectSchemas) {
          _xifexpression_1 = SourceDSL.maps().<String, Schema>of(SourceDSL.strings().allPossible().ofLengthBetween(1, 254), Schema.fullObjectSchema()).ofSizeBetween(1, 10).toOptionals(25);
        } else {
          _xifexpression_1 = SourceDSL.maps().<String, Schema>of(SourceDSL.strings().allPossible().ofLengthBetween(1, 254), Schema.fullSchema()).ofSizeBetween(1, 10).toOptionals(25);
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = Generate.<Optional<Map<String, Schema>>>constant(Optional.<Map<String, Schema>>empty());
    }
    return _xifexpression;
  }
  
  /**
   * Returns a generator for generating maxProperties, this generator does not care of any existing min properties.
   */
  public static Gen<Optional<Integer>> maxProperties() {
    Integer _integer = new Integer(1);
    return Generate.<Optional<Integer>>frequency(
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(2), SourceDSL.integers().between(1, (Integer.MAX_VALUE - 1)).toOptionals(25)), 
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(1), Generate.<Integer>constant(_integer).toOptionals(0)), 
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(1), Generate.<Integer>constant(Integer.valueOf(Integer.MAX_VALUE)).toOptionals(0)));
  }
  
  /**
   * Returns a generator for generating minProperties
   */
  public static Gen<Optional<Integer>> minProperties() {
    Integer _integer = new Integer(1);
    return Generate.<Optional<Integer>>frequency(
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(2), SourceDSL.integers().between(1, (Integer.MAX_VALUE - 1)).toOptionals(25)), 
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(1), Generate.<Integer>constant(_integer).toOptionals(0)), 
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(1), Generate.<Integer>constant(Integer.valueOf(Integer.MAX_VALUE)).toOptionals(0)));
  }
  
  /**
   * Returns a generator for generating a list of required properties, this does not care if any properties are generated, it is just a list of strings
   */
  public static Gen<Optional<List<String>>> required() {
    return SourceDSL.lists().<String>of(SourceDSL.strings().allPossible().ofLengthBetween(0, 254)).ofSizeBetween(0, 10).toOptionals(25);
  }
  
  /**
   * Returns a generator for generating propertyNames string schema
   */
  public static Gen<Optional<Schema>> propertyNames() {
    return Schema.fullStringSchema().toOptionals(25);
  }
  
  /**
   * Returns a generator for generating patternProperties which can either generate patterns for property  of all types of schemas or just schemas with type object.
   */
  public static Gen<Optional<Map<String, Schema>>> patternProperties(final boolean onlyObjectSchemas) {
    Gen<Optional<Map<String, Schema>>> _xifexpression = null;
    boolean _isRecursivePatternPropertiesSchemaReached = StaticConfig.isRecursivePatternPropertiesSchemaReached();
    boolean _not = (!_isRecursivePatternPropertiesSchemaReached);
    if (_not) {
      Gen<Optional<Map<String, Schema>>> _xblockexpression = null;
      {
        int _currentRecursivePatternPropertiesSchema = StaticConfig.currentRecursivePatternPropertiesSchema;
        StaticConfig.currentRecursivePatternPropertiesSchema = (_currentRecursivePatternPropertiesSchema + 10);
        Gen<Optional<Map<String, Schema>>> _xifexpression_1 = null;
        if (onlyObjectSchemas) {
          _xifexpression_1 = SourceDSL.maps().<String, Schema>of(SourceDSL.strings().allPossible().ofLengthBetween(1, 254), Schema.fullObjectSchema()).ofSizeBetween(1, 10).toOptionals(25);
        } else {
          _xifexpression_1 = SourceDSL.maps().<String, Schema>of(SourceDSL.strings().allPossible().ofLengthBetween(1, 254), Schema.fullSchema()).ofSizeBetween(1, 10).toOptionals(25);
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = Generate.<Optional<Map<String, Schema>>>constant(Optional.<Map<String, Schema>>empty());
    }
    return _xifexpression;
  }
  
  /**
   * Returns a generator for generating propertyDependencies.
   */
  public static Gen<Optional<Map<String, List<String>>>> propertyDependencies() {
    return SourceDSL.maps().<String, List<String>>of(
      SourceDSL.strings().allPossible().ofLengthBetween(1, 254), 
      SourceDSL.lists().<String>of(SourceDSL.strings().allPossible().ofLengthBetween(1, 254)).ofSizeBetween(1, 10)).ofSizeBetween(1, 10).toOptionals(25);
  }
  
  /**
   * Returns a generator for generating schemaDependencies which can either generate schema dependencies of all types of schemas or just schemas with type object.
   */
  public static Gen<Optional<Map<String, Schema>>> schemaDependencies(final boolean onlyObjectSchemas) {
    Gen<Optional<Map<String, Schema>>> _xifexpression = null;
    boolean _isRecursiveSchemaDependenciesSchemaReached = StaticConfig.isRecursiveSchemaDependenciesSchemaReached();
    boolean _not = (!_isRecursiveSchemaDependenciesSchemaReached);
    if (_not) {
      Gen<Optional<Map<String, Schema>>> _xblockexpression = null;
      {
        int _currentRecursiveSchemaDependenciesSchema = StaticConfig.currentRecursiveSchemaDependenciesSchema;
        StaticConfig.currentRecursiveSchemaDependenciesSchema = (_currentRecursiveSchemaDependenciesSchema + 10);
        Gen<Optional<Map<String, Schema>>> _xifexpression_1 = null;
        if (onlyObjectSchemas) {
          _xifexpression_1 = SourceDSL.maps().<String, Schema>of(SourceDSL.strings().allPossible().ofLengthBetween(1, 254), Schema.fullObjectSchema()).ofSizeBetween(1, 10).toOptionals(25);
        } else {
          _xifexpression_1 = SourceDSL.maps().<String, Schema>of(SourceDSL.strings().allPossible().ofLengthBetween(1, 254), Schema.fullSchema()).ofSizeBetween(1, 10).toOptionals(25);
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = Generate.<Optional<Map<String, Schema>>>constant(Optional.<Map<String, Schema>>empty());
    }
    return _xifexpression;
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
  public List<String> getRequired() {
    return this.required;
  }
  
  public void setRequired(final List<String> required) {
    this.required = required;
  }
  
  @Pure
  public Schema getPropertyNames() {
    return this.propertyNames;
  }
  
  public void setPropertyNames(final Schema propertyNames) {
    this.propertyNames = propertyNames;
  }
  
  @Pure
  public Map<String, Schema> getPatternProperties() {
    return this.patternProperties;
  }
  
  public void setPatternProperties(final Map<String, Schema> patternProperties) {
    this.patternProperties = patternProperties;
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
