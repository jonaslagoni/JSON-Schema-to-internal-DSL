/**
 * generated by Xtext 2.20.0
 */
package org.xtext.json.schema.generator;

import org.xtext.json.schema.draft7.AbstractSchema;

@SuppressWarnings("all")
public class CustomModel {
  public String parentName;
  
  public AbstractSchema model;
  
  public String name;
  
  public CustomModel(final AbstractSchema model, final String name) {
    this.model = model;
    this.name = name;
  }
}