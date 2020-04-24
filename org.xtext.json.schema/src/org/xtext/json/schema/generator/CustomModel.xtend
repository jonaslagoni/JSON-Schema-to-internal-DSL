package org.xtext.json.schema.generator

import org.eclipse.xtend.lib.annotations.Accessors
import org.xtext.json.schema.draft7.AbstractSchema

class CustomModel {
	@Accessors String parentName;
	@Accessors AbstractSchema model;
	@Accessors String name;
	new(AbstractSchema model, String name){
		this.model = model
		this.name = name
	}
}