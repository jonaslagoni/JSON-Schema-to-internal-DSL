package org.xtext.json.schema.tests

class StaticConfig {
	public static final int maxRecursiveAdditionalSchemas = 5;
	public static int currentRecursiveAdditionalSchemas = 1;
	def static boolean isRecursiveAdditionalSchemasReached(){
		StaticConfig.currentRecursiveAdditionalSchemas >= StaticConfig.maxRecursiveAdditionalSchemas
	}
	public static final int maxRecursiveProperties = 20;
	public static int currentRecursiveProperties= 1;
	def static boolean isRecursivePropertiesReached(){
		StaticConfig.currentRecursiveProperties >= StaticConfig.maxRecursiveProperties
	}
	public static final int maxRecursiveItems = 20;
	public static int currentRecursiveItems= 1;
	def static boolean isRecursiveItemsReached(){
		StaticConfig.currentRecursiveItems >= StaticConfig.maxRecursiveItems
	}
	public static final int maxRecursiveContains = 20;
	public static int currentRecursiveContains= 1;
	def static boolean isRecursiveContainsReached(){
		StaticConfig.currentRecursiveContains >= StaticConfig.maxRecursiveContains
	}
	public static final int maxRecursiveAdditionalItemsSchema = 5;
	public static int currentRecursiveAdditionalItemsSchema= 1;
	def static boolean isRecursiveAdditionalItemsSchemaReached(){
		StaticConfig.currentRecursiveAdditionalItemsSchema >= StaticConfig.maxRecursiveAdditionalItemsSchema
	}
	public static final int maxRecursivePatternPropertiesSchema = 20;
	public static int currentRecursivePatternPropertiesSchema= 1;
	def static boolean isRecursivePatternPropertiesSchemaReached(){
		StaticConfig.currentRecursivePatternPropertiesSchema >= StaticConfig.maxRecursivePatternPropertiesSchema
	}
	public static final int maxRecursiveSchemaDependenciesSchema = 20;
	public static int currentRecursiveSchemaDependenciesSchema= 1;
	def static boolean isRecursiveSchemaDependenciesSchemaReached(){
		StaticConfig.currentRecursiveSchemaDependenciesSchema >= StaticConfig.maxRecursiveSchemaDependenciesSchema
	}
}