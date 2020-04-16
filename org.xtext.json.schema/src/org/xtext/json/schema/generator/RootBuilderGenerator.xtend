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
				«IF isObject(property.schema as Schema)»
					public «property.name.realizeName.toFirstUpper»Builder «property.name.realizeName»(){
						«property.name.realizeName.toFirstUpper» «property.name.realizeName.toFirstLower»Instance;
						if(root.get«property.name.realizeName.toFirstUpper»() != null){
							«property.name.realizeName.toFirstLower»Instance = root.get«property.name.realizeName.toFirstUpper»();
						} else {
							«property.name.realizeName.toFirstLower»Instance = new «property.name.realizeName.toFirstUpper»();
							root.set«property.name.realizeName.toFirstUpper»(«property.name.realizeName.toFirstLower»Instance);
						}
						return new «property.name.realizeName.toFirstUpper»Builder(this, «property.name.realizeName.toFirstLower»Instance);
					}
				«ENDIF»
				«IF !isObject(property.schema as Schema)»
					public «model.name.toFirstUpper+"Builder"» set«property.name.realizeName.toFirstUpper»(«property.name.realizeName.toFirstUpper» «property.name.realizeName.toFirstLower»){
						root.set«property.name.realizeName.toFirstUpper»(«property.name.realizeName.toFirstLower»);
					}
				«ENDIF»
			«ENDIF»
		«ENDFOR»
		'''
	}

}
