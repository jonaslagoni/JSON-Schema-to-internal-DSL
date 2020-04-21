package org.xtext.json.schema.generator

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.json.schema.draft7.*
import org.xtext.json.schema.generator.GeneratorUtils
import java.util.List

class BuilderGenerator {
	
	
	List<CustomModel> objectList
	Schema root
	new(List<CustomModel> objectList, Schema root){
		this.objectList = objectList
		this.root = root
	}
	
	
	def generateBuilderFile(CustomModel model, IFileSystemAccess2 fsa) {
		System.out.println("Test")
		if(model.parentName !== null){
			fsa.generateFile("builder/" +model.name.toFirstUpper+"Builder.java", model.generateBuilder)
		}
	}
	def CharSequence generateBuilder(CustomModel model) '''
	package builder;
	import java.util.*;
	import model.«model.name.toFirstUpper»;
	import model.«model.parentName.toFirstUpper»;
	import builder.«model.parentName.toFirstUpper»Builder;
	
	public class «model.name.toFirstUpper»Builder {
		«model.generateBuilderVariables»
		«model.generateBuilderConstructor»
		«model.generateBuilderMethod»
		«model.generateParentMethod»
		«model.generateBuilderFinishMethod»
	}
	
	'''
	def CharSequence generateBuilderVariables(CustomModel model) {
		'''
		private «model.parentName.toFirstUpper»Builder parent;
		private «model.name.toFirstUpper» «model.name.toFirstLower»;
		
		'''
		
	}
	
	def CharSequence generateBuilderConstructor(CustomModel model) {
		
	//TODO Ensure when there are multiple types it should generate multiple constructors 	
	return '''
		public «model.name.toFirstUpper»Builder(«model.parentName.toFirstUpper»Builder parent, «model.name.toFirstUpper» «model.name.toFirstLower») {
			this.parent = parent;
			this.«model.name.toFirstLower» = «model.name.toFirstLower»;
		}
		
		'''
	}
	
	def generateBuilderMethod(CustomModel model){
		return '''
		«FOR property:(model.model as Schema).properties»
			«var schema = GeneratorUtils.isSchema(property.schema) ? (property.schema as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((property.schema as Reference).uri),root)»
				«IF schema !== null && schema.type !== null»
					«IF GeneratorUtils.isObject(schema)»
				public «GeneratorUtils.realizeName(property.name).toFirstUpper»Builder «GeneratorUtils.realizeName(property.name)»(){
					«GeneratorUtils.realizeName(property.name).toFirstUpper» «GeneratorUtils.realizeName(property.name).toFirstLower»Instance;
					if(root.get«GeneratorUtils.realizeName(property.name).toFirstUpper»() != null){
						«GeneratorUtils.realizeName(property.name).toFirstLower»Instance = «model.name.toFirstLower».get«GeneratorUtils.realizeName(property.name).toFirstUpper»();
					} else {
						«GeneratorUtils.realizeName(property.name).toFirstLower»Instance = new «GeneratorUtils.realizeName(property.name).toFirstUpper»();
						«model.name.toFirstLower».set«GeneratorUtils.realizeName(property.name).toFirstUpper»(«GeneratorUtils.realizeName(property.name).toFirstLower»Instance);
					}
					return new «GeneratorUtils.realizeName(property.name).toFirstUpper»Builder(this, «GeneratorUtils.realizeName(property.name).toFirstLower»Instance);
				}
				«ELSE»
					«FOR type:schema.type.jsonTypes»
					«var schemaJsonType = GeneratorUtils.toJavaType(schema, type, property.name)»
						«IF schemaJsonType !== null»
				public «model.name.toFirstUpper+"Builder"» set«GeneratorUtils.realizeName(property.name).toFirstUpper»(«schemaJsonType» «GeneratorUtils.realizeName(property.name).toFirstLower»){
					«model.name.toFirstLower».set«GeneratorUtils.realizeName(property.name).toFirstUpper»(«GeneratorUtils.realizeName(property.name).toFirstLower»);
					return this;
				}
						«ENDIF»
					«ENDFOR»
				«ENDIF»
				«ENDIF»
				
		«ENDFOR»
		'''
	}
	
	def generateParentMethod(CustomModel model){
		'''
		public «model.parentName.toFirstUpper»Builder parent() {
			return parent;
		}
		
		'''
	}
	
	def generateBuilderFinishMethod(CustomModel model){
		'''
		public «model.parentName.toFirstUpper» finish() {
			return parent.finish();
		}
		
		'''
	}

}
