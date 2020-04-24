package org.xtext.json.schema.generator;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.xtext.json.schema.draft7.JsonTypes;

@SuppressWarnings("all")
public class CustomProperty {
  @Accessors
  private String propertyName;
  
  @Accessors
  private String typeName;
  
  @Accessors
  private JsonTypes type;
  
  public CustomProperty(final String propertyName, final String typeName) {
    this.propertyName = propertyName;
    this.typeName = typeName;
  }
  
  @Pure
  public String getPropertyName() {
    return this.propertyName;
  }
  
  public void setPropertyName(final String propertyName) {
    this.propertyName = propertyName;
  }
  
  @Pure
  public String getTypeName() {
    return this.typeName;
  }
  
  public void setTypeName(final String typeName) {
    this.typeName = typeName;
  }
  
  @Pure
  public JsonTypes getType() {
    return this.type;
  }
  
  public void setType(final JsonTypes type) {
    this.type = type;
  }
}
