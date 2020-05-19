package org.xtext.json.schema.tests.model

import org.eclipse.xtend.lib.annotations.Accessors

class DoubleInteger {
	@Accessors
	var Integer integerValue;
	@Accessors
	var Double doubleValue;
	
	/**
	 * Given two numbers one of them should be sat. Either double or integer
	 */
	new(Number number1, Number number2){
		var Number satNumber;
		if(number1 !== null){
			satNumber = number1
		}else{
			satNumber = number2
		}
		if(satNumber instanceof Integer){
			this.integerValue = satNumber as Integer;
		}else {
			this.doubleValue = satNumber as Double;
		}
	}
	new(Integer intValue){
		this.integerValue = intValue;
	}
	new(Double doubleValue){
		this.doubleValue = doubleValue;
	}
	
	override toString(){
		return "" + (integerValue !== null ? integerValue : doubleValue)
	}
}