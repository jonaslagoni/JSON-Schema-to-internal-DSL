package org.xtext.json.schema.tests.model;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class DoubleInteger {
  @Accessors
  private Integer integerValue;
  
  @Accessors
  private Double doubleValue;
  
  /**
   * Given two numbers one of them should be sat. Either double or integer
   */
  public DoubleInteger(final Number number1, final Number number2) {
    Number satNumber = null;
    if ((number1 != null)) {
      satNumber = number1;
    } else {
      satNumber = number2;
    }
    if ((satNumber instanceof Integer)) {
      this.integerValue = ((Integer) satNumber);
    } else {
      this.doubleValue = ((Double) satNumber);
    }
  }
  
  public DoubleInteger(final Integer intValue) {
    this.integerValue = intValue;
  }
  
  public DoubleInteger(final Double doubleValue) {
    this.doubleValue = doubleValue;
  }
  
  @Override
  public String toString() {
    Number _xifexpression = null;
    if ((this.integerValue != null)) {
      _xifexpression = this.integerValue;
    } else {
      _xifexpression = this.doubleValue;
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
  public Double getDoubleValue() {
    return this.doubleValue;
  }
  
  public void setDoubleValue(final Double doubleValue) {
    this.doubleValue = doubleValue;
  }
}
