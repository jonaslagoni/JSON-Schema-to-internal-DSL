package org.xtext.json.schema.generator;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.xtext.json.schema.draft7.AbstractSchema;

@SuppressWarnings("all")
public class CustomModel {
  @Accessors
  private String parentName;
  
  @Accessors
  private AbstractSchema model;
  
  @Accessors
  private String name;
  
  public CustomModel(final AbstractSchema model, final String name) {
    this.model = model;
    this.name = name;
  }
  
  @Pure
  public String getParentName() {
    return this.parentName;
  }
  
  public void setParentName(final String parentName) {
    this.parentName = parentName;
  }
  
  @Pure
  public AbstractSchema getModel() {
    return this.model;
  }
  
  public void setModel(final AbstractSchema model) {
    this.model = model;
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
}
