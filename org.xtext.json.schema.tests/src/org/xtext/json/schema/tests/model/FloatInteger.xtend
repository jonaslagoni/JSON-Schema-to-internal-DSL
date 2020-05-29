package org.xtext.json.schema.tests.model

import org.eclipse.xtend.lib.annotations.Accessors
import java.text.DecimalFormat

class FloatInteger {
	@Accessors
	var Integer integerValue;
	@Accessors
	var Float floatValue;
	
	/**
	 * Given two numbers one of them should be sat. Either double or integer
	 */
	new(Number number1, Number number2){
		var Number satNumber;
		if(number1 !== null){
			satNumber = number1
		}else if(number2 !== null){
			satNumber = number2
		}else{
			throw new NumberFormatException("None of the numbers sat")
		}
		if(satNumber instanceof Integer){
			this.integerValue = satNumber as Integer;
		}else {
			this.floatValue = satNumber as Float;
		}
	}
	new(Integer intValue){
		this.integerValue = intValue;
	}
	new(Float floatValue){
		this.floatValue = floatValue;
	}
	
	override toString(){
		return "" + (integerValue !== null ? integerValue : floatValue)
	}
}