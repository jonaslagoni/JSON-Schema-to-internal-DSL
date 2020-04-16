package org.xtext.json.schema.generator

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.json.schema.draft7.*
import org.xtext.json.schema.generator.GeneratorUtils
import java.util.List

class RootBuilderGenerator {
	
	
	List<CustomModel> objectList
	Schema root
	new(List<CustomModel> objectList, Schema root){
		this.objectList = objectList
		this.root = root
	}
	
	
	def generateBuilderFile(CustomModel model, IFileSystemAccess2 fsa) {
		System.out.println("Test")
		if(model.parentName === null){
			fsa.generateFile("Builder/" +model.name.toFirstUpper+"Builder.java", model.generateBuilder)
		}
	}
	def CharSequence generateBuilder(CustomModel model) { '''
	
	import java.util.*;
	import model.«model.name.toFirstUpper»;
	
	public class «model.name.toFirstUpper»Builder {
		«model.generateRootBuilderVariables»
		«model.generateRootBuilderConstructor»
		«model.generateRootBuilderMethod»
		«model.generateRootBuilderFinishMethod»
	}
	
	'''
	
	}
	
	def CharSequence generateRootBuilderVariables(CustomModel model) {
		'''
		private «model.name.toFirstUpper» root;
		
		'''
		
	}
	
	def CharSequence generateRootBuilderConstructor(CustomModel model) {
		
	//TODO Ensure when there are multiple types it should generate multiple constructors 	
	return '''
	public «model.name.toFirstUpper»Builder() {
		root = new «model.name.toFirstUpper»()
	}
	
	'''
	}
	
	def generateRootBuilderMethod(CustomModel model){
		return '''
		«FOR property:(model.model as Schema).properties»
			«var schema = GeneratorUtils.isSchema(property.schema) ? (property.schema as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((property.schema as Reference).uri),root)»
				«IF schema !== null && schema.type !== null»
					«IF GeneratorUtils.isObject(schema)»
						public «GeneratorUtils.realizeName(property.name).toFirstUpper»Builder «GeneratorUtils.realizeName(property.name)»(){
							«GeneratorUtils.realizeName(property.name).toFirstUpper» «GeneratorUtils.realizeName(property.name).toFirstLower»Instance;
							if(root.get«GeneratorUtils.realizeName(property.name).toFirstUpper»() != null){
								«GeneratorUtils.realizeName(property.name).toFirstLower»Instance = root.get«GeneratorUtils.realizeName(property.name).toFirstUpper»();
							} else {
								«GeneratorUtils.realizeName(property.name).toFirstLower»Instance = new «GeneratorUtils.realizeName(property.name).toFirstUpper»();
								root.set«GeneratorUtils.realizeName(property.name).toFirstUpper»(«GeneratorUtils.realizeName(property.name).toFirstLower»Instance);
							}
							return new «GeneratorUtils.realizeName(property.name).toFirstUpper»Builder(this, «GeneratorUtils.realizeName(property.name).toFirstLower»Instance);
						}
					«ELSE»
						public «model.name.toFirstUpper+"Builder"» set«GeneratorUtils.realizeName(property.name).toFirstUpper»(«GeneratorUtils.realizeName(property.name).toFirstUpper» «GeneratorUtils.realizeName(property.name).toFirstLower»){
							root.set«GeneratorUtils.realizeName(property.name).toFirstUpper»(«GeneratorUtils.realizeName(property.name).toFirstLower»);
							return this;
						}
					«ENDIF»
				«ENDIF»
				
		«ENDFOR»
		'''
	}
	
	def generateRootBuilderFinishMethod(CustomModel model){
		'''
			public «model.name.toFirstUpper» finish() {
				return root;
			}
			
		'''
	}

}
