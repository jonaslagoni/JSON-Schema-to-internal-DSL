package org.xtext.json.schema.tests.model

import static org.quicktheories.generators.SourceDSL.*;
import org.eclipse.xtend.lib.annotations.Accessors
import org.quicktheories.core.Gen

class ObjectSchema {
	@Accessors
	var Boolean additionalProperties;
	
	
	new() {
	}
	
	def static Gen<Boolean> additionalProperties(){
		return booleans.all;
	}
}