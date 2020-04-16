package org.xtext.json.schema.generator

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.json.schema.draft7.*
import org.xtext.json.schema.generator.GeneratorUtils

class RootBuilderGenerator {
	
	def generateBuilderFile(CustomModel model, IFileSystemAccess2 fsa) {
		System.out.println("Test")
		fsa.generateFile("Builder/" +model.name.toFirstUpper+".java", model.generateBuilder)
	}
	def CharSequence generateBuilder(CustomModel model) '''
	import java.util.*;
	
	public class «model.name.toFirstUpper» {
		«model.generateRootBuilderConstructor»
		«model.generateRootBuilderMethod»
	}
	'''
	
	def CharSequence generateRootBuilderConstructor(CustomModel model) {
		
	//TODO Ensure when there are multiple types it should generate multiple constructors 	
	return '''
	public «model.name.toFirstUpper+"Builder"»() {
		root = new «model.name.toFirstUpper»()
	}
	'''
	}
	
	def generateRootBuilderMethod(CustomModel model){
		return '''
		«FOR property:(model.model as Schema).properties»
			«IF property.schema instanceof Schema && (property.schema as Schema).type !== null»
				«IF GeneratorUtils.isObject(property.schema as Schema)»
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
				«ENDIF»
				«IF !GeneratorUtils.isObject(property.schema as Schema)»
					public «model.name.toFirstUpper+"Builder"» set«GeneratorUtils.realizeName(property.name).toFirstUpper»(«GeneratorUtils.realizeName(property.name).toFirstUpper» «GeneratorUtils.realizeName(property.name).toFirstLower»){
						root.set«GeneratorUtils.realizeName(property.name).toFirstUpper»(«GeneratorUtils.realizeName(property.name).toFirstLower»);
					}
				«ENDIF»
			«ENDIF»
		«ENDFOR»
		'''
	}

}
