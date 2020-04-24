package org.xtext.json.schema.generator

import org.eclipse.xtend.lib.annotations.Accessors
import org.xtext.json.schema.draft7.AbstractSchema
import org.xtext.json.schema.draft7.JsonTypes

class CustomProperty {
	@Accessors String propertyName;
	@Accessors String typeName;
	@Accessors JsonTypes type;
	new(String propertyName, String typeName){
		this.propertyName = propertyName
		this.typeName = typeName
	}
}