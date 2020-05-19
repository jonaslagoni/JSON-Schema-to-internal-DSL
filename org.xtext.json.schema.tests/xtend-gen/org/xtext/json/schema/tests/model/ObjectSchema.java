package org.xtext.json.schema.tests.model;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.api.Function5;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.SourceDSL;
import org.xtext.json.schema.tests.model.Schema;

@SuppressWarnings("all")
public class ObjectSchema {
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
    final Function5<Boolean, Schema, Map<String, Schema>, Integer, Integer, ObjectSchema> _function = (Boolean additionalPropertiesBoolean, Schema additionalPropertiesSchema, Map<String, Schema> properties, Integer maxProperties, Integer minProperties) -> {
      ObjectSchema _xblockexpression = null;
      {
        ObjectSchema os = new ObjectSchema();
        os.additionalPropertiesBoolean = additionalPropertiesBoolean;
        os.additionalPropertiesSchema = additionalPropertiesSchema;
        os.properties = properties;
        os.maxProperties = maxProperties;
        os.minProperties = minProperties;
        _xblockexpression = os;
      }
      return _xblockexpression;
    };
    return ObjectSchema.additionalPropertiesBoolean().<Schema, Map<String, Schema>, Integer, Integer, ObjectSchema>zip(
      ObjectSchema.additionalPropertiesSchema(), 
      ObjectSchema.properties(), 
      ObjectSchema.maxProperties(), 
      ObjectSchema.minProperties(), _function);
  }
  
  public static Gen<Boolean> additionalPropertiesBoolean() {
    return SourceDSL.booleans().all();
  }
  
  public static Gen<Schema> additionalPropertiesSchema() {
    return Schema.fullSchema();
  }
  
  public static Gen<Map<String, Schema>> properties() {
    return SourceDSL.maps().<String, Schema>of(SourceDSL.strings().allPossible().ofLengthBetween(0, Integer.MAX_VALUE), Schema.fullSchema()).ofSizeBetween(0, Integer.MAX_VALUE);
  }
  
  public static Gen<List<String>> required() {
    return SourceDSL.lists().<String>of(SourceDSL.strings().allPossible().ofLengthBetween(0, Integer.MAX_VALUE)).ofSizeBetween(0, Integer.MAX_VALUE);
  }
  
  public static Gen<Integer> maxProperties() {
    final Function<Integer, Integer> _function = (Integer i) -> {
      return new Integer((i).intValue());
    };
    return SourceDSL.integers().allPositive().<Integer>map(_function);
  }
  
  public static Gen<Integer> minProperties() {
    final Function<Integer, Integer> _function = (Integer i) -> {
      return new Integer((i).intValue());
    };
    return SourceDSL.integers().allPositive().<Integer>map(_function);
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
