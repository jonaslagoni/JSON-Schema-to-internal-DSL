package org.xtext.json.schema.generator

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.json.schema.draft7.*
import org.xtext.json.schema.generator.GeneratorUtils
import java.util.List

class BuilderGenerator {
	
	List<CustomModel> objectList
	Schema root
	CustomModel rootObject
	new(List<CustomModel> objectList, Schema root){
		this.objectList = objectList
		this.root = root
		
		for(model: objectList){
			if(model.parentName === null){
				rootObject = model
			}
		}
	}
	
	
	def generateBuilderFile(CustomModel model, IFileSystemAccess2 fsa) {
		fsa.generateFile("builder/" +model.name.toFirstUpper+"Builder.java", model.parentName !== null ? model.generateBuilder : model.generateRootBuilder)
	}
	
	def CharSequence generateRootBuilderVariables(CustomModel model) {
		'''
		private «model.name.toFirstUpper» «model.name.toFirstLower»;
		'''
		
	}
	def CharSequence generateRootBuilder(CustomModel model) {
		var allProperties = GeneratorUtils.allProperties((model.model as Schema), root)
		return '''
		package builder;
		import java.util.*;
		import model.*;
		import builder.*;
		
		public class «model.name.toFirstUpper»Builder {
			«model.generateRootBuilderVariables»
			«model.generateRootBuilderConstructor»
			«model.generateBuilderMethod(allProperties)»
			«model.generateBuilderRootFinishMethod»
		}
		
		'''
	}
	def CharSequence generateBuilder(CustomModel model) {
		var allProperties = GeneratorUtils.allProperties((model.model as Schema), root)
		return '''
		package builder;
		import java.util.*;
		import model.*;
		import builder.*;
		
		public class «model.name.toFirstUpper»Builder {
			«model.generateBuilderVariables»
			«model.generateBuilderConstructor»
			«model.generateBuilderMethod(allProperties)»
			«model.generateParentMethod»
			«model.generateBuilderFinishMethod»
		}
		
		'''
	}
	
	def CharSequence generateBuilderVariables(CustomModel model) {
		'''
		private «model.parentName.toFirstUpper»Builder parent;
		private «model.name.toFirstUpper» «model.name.toFirstLower»;
		
		'''
		
	}
	def CharSequence generateRootBuilderConstructor(CustomModel model) {
		'''
		public «model.name.toFirstUpper»Builder() {
			«model.name.toFirstLower» = new «model.name.toFirstUpper»();
		}
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
	
	def generateBuilderMethod(CustomModel model, List<CustomProperty> allProperties){
		return '''
		«FOR property:allProperties»
			«IF property.type === JsonTypes.OBJECT»
			public «property.typeName.toFirstUpper»Builder «property.propertyName»(){
				«property.typeName.toFirstUpper» «property.propertyName.toFirstLower»Instance;
				if(«model.name.toFirstLower».get«property.propertyName.toFirstUpper»() != null){
					«property.propertyName.toFirstLower»Instance = «model.name.toFirstLower».get«property.propertyName.toFirstUpper»();
				} else {
					«property.propertyName.toFirstLower»Instance = new «property.typeName.toFirstUpper»();
					«model.name.toFirstLower».set«property.propertyName.toFirstUpper»(«property.propertyName.toFirstLower»Instance);
				}
				return new «property.typeName.toFirstUpper»Builder(this, «property.propertyName.toFirstLower»Instance);
			}
			«ELSE»
			public «model.name.toFirstUpper+"Builder"» set«property.propertyName.toFirstUpper»(«property.typeName.toFirstUpper» «property.propertyName.toFirstLower»){
				«model.name.toFirstLower».set«property.propertyName.toFirstUpper»(«property.propertyName.toFirstLower»);
				return this;
			}
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
	
	def generateBuilderRootFinishMethod(CustomModel model){
		'''
		public «model.name.toFirstUpper» finish() {
			return «model.name.toFirstLower»;
		}
		
		'''
	}
	def generateBuilderFinishMethod(CustomModel model){
		'''
		public «rootObject.name.toFirstUpper» finish() {
			return parent.finish();
		}
		
		'''
	}

}
