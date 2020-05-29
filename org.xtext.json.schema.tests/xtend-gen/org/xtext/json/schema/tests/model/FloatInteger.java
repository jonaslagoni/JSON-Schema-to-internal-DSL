package org.xtext.json.schema.tests.model;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class FloatInteger {
  @Accessors
  private Integer integerValue;
  
  @Accessors
  private Float floatValue;
  
  /**
   * Given two numbers one of them should be sat. Either double or integer
   */
  public FloatInteger(final Number number1, final Number number2) {
    Number satNumber = null;
    if ((number1 != null)) {
      satNumber = number1;
    } else {
      if ((number2 != null)) {
        satNumber = number2;
      } else {
        throw new NumberFormatException("None of the numbers sat");
      }
    }
    if ((satNumber instanceof Integer)) {
      this.integerValue = ((Integer) satNumber);
    } else {
      this.floatValue = ((Float) satNumber);
    }
  }
  
  public FloatInteger(final Integer intValue) {
    this.integerValue = intValue;
  }
  
  public FloatInteger(final Float floatValue) {
    this.floatValue = floatValue;
  }
  
  @Override
  public String toString() {
    Number _xifexpression = null;
    if ((this.integerValue != null)) {
      _xifexpression = this.integerValue;
    } else {
      _xifexpression = this.floatValue;
    }
    return ("" + _xifexpression);
  }
  
  @Pure
  public Integer getIntegerValue() {
    return this.integerValue;
  }
  
  public void setIntegerValue(final Integer integerValue) {
    this.integerValue = integerValue;
  }
  
  @Pure
  public Float getFloatValue() {
    return this.floatValue;
  }
  
  public void setFloatValue(final Float floatValue) {
    this.floatValue = floatValue;
  }
}
