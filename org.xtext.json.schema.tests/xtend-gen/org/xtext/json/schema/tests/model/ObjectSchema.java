package org.xtext.json.schema.tests.model;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.api.Function5;
import org.quicktheories.api.Pair;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;
import org.quicktheories.generators.SourceDSL;
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
  private Boolean additionalPropertiesBoolean;
  
  @Accessors
  private Schema additionalPropertiesSchema;
  
  @Accessors
  private Map<String, Schema> properties;
  
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
  
  public static Gen<ObjectSchema> fullObjectSchema() {
    ObjectSchema.ObjectSchemaOptions _objectSchemaOptions = new ObjectSchema.ObjectSchemaOptions();
    return ObjectSchema.fullObjectSchema(_objectSchemaOptions);
  }
  
  public static Gen<ObjectSchema> fullObjectSchema(final ObjectSchema.ObjectSchemaOptions options) {
    Gen<ObjectSchema> _xblockexpression = null;
    {
      Gen<Schema> additionalPropertiesSchemaGen = null;
      Gen<Boolean> additionalPropertiesBooleanGen = null;
      if ((!options.excludeAdditionalProperties)) {
        additionalPropertiesSchemaGen = ObjectSchema.additionalPropertiesSchema();
        additionalPropertiesBooleanGen = ObjectSchema.additionalPropertiesBoolean();
      }
      Gen<Map<String, Schema>> propertiesGen = null;
      if ((!options.excludeProperties)) {
        propertiesGen = ObjectSchema.properties();
      }
      final Function5<Boolean, Schema, Map<String, Schema>, Integer, Integer, ObjectSchema> _function = (Boolean additionalPropertiesBoolean, Schema additionalPropertiesSchema, Map<String, Schema> properties, Integer maxProperties, Integer minProperties) -> {
        ObjectSchema _xblockexpression_1 = null;
        {
          ObjectSchema os = new ObjectSchema();
          os.additionalPropertiesBoolean = additionalPropertiesBoolean;
          os.additionalPropertiesSchema = additionalPropertiesSchema;
          os.properties = properties;
          os.maxProperties = maxProperties;
          os.minProperties = minProperties;
          _xblockexpression_1 = os;
        }
        return _xblockexpression_1;
      };
      _xblockexpression = additionalPropertiesBooleanGen.<Schema, Map<String, Schema>, Integer, Integer, ObjectSchema>zip(additionalPropertiesSchemaGen, propertiesGen, 
        ObjectSchema.maxProperties(), 
        ObjectSchema.minProperties(), _function);
    }
    return _xblockexpression;
  }
  
  public static Gen<Boolean> additionalPropertiesBoolean() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<Boolean>> booleanPair = Pair.<Integer, Gen<Boolean>>of(_integer, SourceDSL.booleans().all());
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<Boolean>> nullPair = Pair.<Integer, Gen<Boolean>>of(_integer_1, Generate.<Boolean>constant(null));
    return Generate.<Boolean>frequency(Collections.<Pair<Integer, Gen<Boolean>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<Boolean>>>newArrayList(booleanPair, nullPair)));
  }
  
  public static Gen<Schema> additionalPropertiesSchema() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<Schema>> schemaPair = Pair.<Integer, Gen<Schema>>of(_integer, Schema.fullSchema());
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<Schema>> nullPair = Pair.<Integer, Gen<Schema>>of(_integer_1, Generate.<Schema>constant(null));
    return Generate.<Schema>frequency(Collections.<Pair<Integer, Gen<Schema>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<Schema>>>newArrayList(schemaPair, nullPair)));
  }
  
  public static Gen<Map<String, Schema>> properties() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<Map<String, Schema>>> mapPair = Pair.<Integer, Gen<Map<String, Schema>>>of(_integer, SourceDSL.maps().<String, Schema>of(SourceDSL.strings().allPossible().ofLengthBetween(0, Integer.MAX_VALUE), Schema.fullSchema()).ofSizeBetween(0, Integer.MAX_VALUE));
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<Map<String, Schema>>> nullPair = Pair.<Integer, Gen<Map<String, Schema>>>of(_integer_1, Generate.<Map<String, Schema>>constant(null));
    return Generate.<Map<String, Schema>>frequency(Collections.<Pair<Integer, Gen<Map<String, Schema>>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<Map<String, Schema>>>>newArrayList(mapPair, nullPair)));
  }
  
  public static Gen<List<String>> required() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<List<String>>> listPair = Pair.<Integer, Gen<List<String>>>of(_integer, SourceDSL.lists().<String>of(SourceDSL.strings().allPossible().ofLengthBetween(0, Integer.MAX_VALUE)).ofSizeBetween(0, Integer.MAX_VALUE));
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<List<String>>> nullPair = Pair.<Integer, Gen<List<String>>>of(_integer_1, Generate.<List<String>>constant(null));
    return Generate.<List<String>>frequency(Collections.<Pair<Integer, Gen<List<String>>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<List<String>>>>newArrayList(listPair, nullPair)));
  }
  
  public static Gen<Integer> maxProperties() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<Integer>> intPair = Pair.<Integer, Gen<Integer>>of(_integer, SourceDSL.integers().allPositive());
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<Integer>> nullPair = Pair.<Integer, Gen<Integer>>of(_integer_1, Generate.<Integer>constant(null));
    return Generate.<Integer>frequency(Collections.<Pair<Integer, Gen<Integer>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<Integer>>>newArrayList(intPair, nullPair)));
  }
  
  public static Gen<Integer> minProperties() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<Integer>> intPair = Pair.<Integer, Gen<Integer>>of(_integer, SourceDSL.integers().allPositive());
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<Integer>> nullPair = Pair.<Integer, Gen<Integer>>of(_integer_1, Generate.<Integer>constant(null));
    return Generate.<Integer>frequency(Collections.<Pair<Integer, Gen<Integer>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<Integer>>>newArrayList(intPair, nullPair)));
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
  public Map<String, Schema> getProperties() {
    return this.properties;
  }
  
  public void setProperties(final Map<String, Schema> properties) {
    this.properties = properties;
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
