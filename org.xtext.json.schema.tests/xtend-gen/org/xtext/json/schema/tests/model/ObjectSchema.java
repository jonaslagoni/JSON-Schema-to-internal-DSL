package org.xtext.json.schema.tests.model;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.SourceDSL;

@SuppressWarnings("all")
public class ObjectSchema {
  @Accessors
  private Boolean additionalProperties;
  
  public ObjectSchema() {
  }
  
  public static Gen<Boolean> additionalProperties() {
    return SourceDSL.booleans().all();
  }
  
  @Pure
  public Boolean getAdditionalProperties() {
    return this.additionalProperties;
  }
  
  public void setAdditionalProperties(final Boolean additionalProperties) {
    this.additionalProperties = additionalProperties;
  }
}
