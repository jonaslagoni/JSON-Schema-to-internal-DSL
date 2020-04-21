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
			fsa.generateFile("builder/" +model.name.toFirstUpper+"Builder.java", model.generateBuilder)
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
		root = new «model.name.toFirstUpper»();
	}
	
	'''
	}
	
	def generateRootBuilderMethod(CustomModel model){
		return '''
		«FOR property:(model.model as Schema).properties»
			«var schema = GeneratorUtils.isSchema(property.schema) ? (property.schema as Schema) : GeneratorUtils.findLocalReference(GeneratorUtils.realizeName((property.schema as Reference).uri),root)»
				«IF schema !== null && schema.type !== null»
					«var propertyName = GeneratorUtils.realizeName(property.name)»
					«IF GeneratorUtils.isObject(schema)»
						public «propertyName.toFirstUpper»Builder «propertyName»(){
							«propertyName.toFirstUpper» «propertyName.toFirstLower»Instance;
							if(root.get«propertyName.toFirstUpper»() != null){
								«propertyName.toFirstLower»Instance = root.get«propertyName.toFirstUpper»();
							} else {
								«propertyName.toFirstLower»Instance = new «propertyName.toFirstUpper»();
								root.set«propertyName.toFirstUpper»(«propertyName.toFirstLower»Instance);
							}
							return new «propertyName.toFirstUpper»Builder(this, «propertyName.toFirstLower»Instance);
						}
					«ELSE»
						public «model.name.toFirstUpper+"Builder"» set«propertyName.toFirstUpper»(«model.name.toFirstUpper» «model.name.toFirstLower»){
							root.set«propertyName.toFirstUpper»(«model.name.toFirstLower»);
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
