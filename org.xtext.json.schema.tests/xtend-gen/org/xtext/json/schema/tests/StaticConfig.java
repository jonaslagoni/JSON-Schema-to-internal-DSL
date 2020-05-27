package org.xtext.json.schema.tests;

@SuppressWarnings("all")
public class StaticConfig {
  public static final int maxRecursiveSchemas = 123;
  
  public static int currentRecursiveSchemas = 1;
  
  public static boolean isRecursiveSchemasReached() {
    return (StaticConfig.currentRecursiveSchemas >= StaticConfig.maxRecursiveSchemas);
  }
}
