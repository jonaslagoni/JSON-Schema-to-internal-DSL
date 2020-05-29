package org.xtext.json.schema.tests;

@SuppressWarnings("all")
public class StaticConfig {
  public static final int maxRecursiveAdditionalSchemas = 5;
  
  public static int currentRecursiveAdditionalSchemas = 1;
  
  public static boolean isRecursiveAdditionalSchemasReached() {
    return (StaticConfig.currentRecursiveAdditionalSchemas >= StaticConfig.maxRecursiveAdditionalSchemas);
  }
  
  public static final int maxRecursiveProperties = 20;
  
  public static int currentRecursiveProperties = 1;
  
  public static boolean isRecursivePropertiesReached() {
    return (StaticConfig.currentRecursiveProperties >= StaticConfig.maxRecursiveProperties);
  }
  
  public static final int maxRecursiveItems = 20;
  
  public static int currentRecursiveItems = 1;
  
  public static boolean isRecursiveItemsReached() {
    return (StaticConfig.currentRecursiveItems >= StaticConfig.maxRecursiveItems);
  }
  
  public static final int maxRecursiveContains = 20;
  
  public static int currentRecursiveContains = 1;
  
  public static boolean isRecursiveContainsReached() {
    return (StaticConfig.currentRecursiveContains >= StaticConfig.maxRecursiveContains);
  }
  
  public static final int maxRecursiveAdditionalItemsSchema = 5;
  
  public static int currentRecursiveAdditionalItemsSchema = 1;
  
  public static boolean isRecursiveAdditionalItemsSchemaReached() {
    return (StaticConfig.currentRecursiveAdditionalItemsSchema >= StaticConfig.maxRecursiveAdditionalItemsSchema);
  }
  
  public static final int maxRecursivePatternPropertiesSchema = 20;
  
  public static int currentRecursivePatternPropertiesSchema = 1;
  
  public static boolean isRecursivePatternPropertiesSchemaReached() {
    return (StaticConfig.currentRecursivePatternPropertiesSchema >= StaticConfig.maxRecursivePatternPropertiesSchema);
  }
  
  public static final int maxRecursiveSchemaDependenciesSchema = 20;
  
  public static int currentRecursiveSchemaDependenciesSchema = 1;
  
  public static boolean isRecursiveSchemaDependenciesSchemaReached() {
    return (StaticConfig.currentRecursiveSchemaDependenciesSchema >= StaticConfig.maxRecursiveSchemaDependenciesSchema);
  }
}
