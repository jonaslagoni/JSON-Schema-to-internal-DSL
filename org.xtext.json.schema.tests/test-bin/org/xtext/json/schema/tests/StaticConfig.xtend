package org.xtext.json.schema.tests

class StaticConfig {
	public static final int maxRecursiveSchemas = 123;
	public static int currentRecursiveSchemas = 1;
	def static boolean isRecursiveSchemasReached(){
		StaticConfig.currentRecursiveSchemas >= StaticConfig.maxRecursiveSchemas
	}
}