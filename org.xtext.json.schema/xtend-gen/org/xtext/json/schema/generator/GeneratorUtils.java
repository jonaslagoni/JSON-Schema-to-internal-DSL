package org.xtext.json.schema.generator;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.json.schema.draft7.AbstractSchema;
import org.xtext.json.schema.draft7.JsonTypes;
import org.xtext.json.schema.draft7.NamedSchema;
import org.xtext.json.schema.draft7.Reference;
import org.xtext.json.schema.draft7.Schema;
import org.xtext.json.schema.draft7.Types;
import org.xtext.json.schema.generator.CustomProperty;

@SuppressWarnings("all")
public class GeneratorUtils {
  public static String removeQuotes(final String toCheck) {
    return toCheck.replace("\"", "").replace("\'", "");
  }
  
  /**
   * Returns a list of all the properties
   */
  public static List<CustomProperty> allProperties(final Schema schema, final Schema root) {
    ArrayList<CustomProperty> list = new ArrayList<CustomProperty>();
    if ((schema != null)) {
      if (((schema.getAdditionalProperties() != null) && (schema.getAdditionalProperties().getAllowedBoolean() != org.xtext.json.schema.draft7.Boolean.FALSE_VALUE))) {
        String additionalPropName = "additionalProps";
        String additionalPropKeyType = "String";
        AbstractSchema _propertyNames = schema.getPropertyNames();
        boolean _tripleNotEquals = (_propertyNames != null);
        if (_tripleNotEquals) {
          Schema _xifexpression = null;
          boolean _isSchema = GeneratorUtils.isSchema(schema.getPropertyNames());
          if (_isSchema) {
            AbstractSchema _propertyNames_1 = schema.getPropertyNames();
            _xifexpression = ((Schema) _propertyNames_1);
          } else {
            AbstractSchema _propertyNames_2 = schema.getPropertyNames();
            _xifexpression = GeneratorUtils.findLocalReference(GeneratorUtils.removeQuotes(((Reference) _propertyNames_2).getSchemaRef()), root);
          }
          Schema propNameSchema = _xifexpression;
          if ((propNameSchema != null)) {
            JsonTypes type = propNameSchema.getType().getJsonTypes().get(0);
            if (type != null) {
              switch (type) {
                case BOOLEAN:
                  additionalPropKeyType = "Boolean";
                  break;
                case INTEGER:
                  additionalPropKeyType = "Integer";
                  break;
                case NUMBER:
                  additionalPropKeyType = "Double";
                  break;
                case OBJECT:
                  boolean _isReference = GeneratorUtils.isReference(schema.getPropertyNames());
                  if (_isReference) {
                    additionalPropKeyType = StringExtensions.toFirstUpper(GeneratorUtils.getReferenceName(schema.getPropertyNames()));
                  } else {
                    String _title = propNameSchema.getTitle();
                    boolean _tripleNotEquals_1 = (_title != null);
                    if (_tripleNotEquals_1) {
                      String _firstUpper = StringExtensions.toFirstUpper(GeneratorUtils.removeQuotes(propNameSchema.getTitle()).replace(" ", ""));
                      String _plus = ("List<" + _firstUpper);
                      String _plus_1 = (_plus + ">");
                      additionalPropKeyType = _plus_1;
                    } else {
                      additionalPropKeyType = null;
                    }
                  }
                  break;
                case ARRAY:
                  if (((propNameSchema.getItems() != null) && (propNameSchema.getItems().getItems().size() > 0))) {
                    AbstractSchema abstractSchemaItem = propNameSchema.getItems().getItems().get(0);
                    Schema _xifexpression_1 = null;
                    boolean _isSchema_1 = GeneratorUtils.isSchema(abstractSchemaItem);
                    if (_isSchema_1) {
                      _xifexpression_1 = ((Schema) abstractSchemaItem);
                    } else {
                      _xifexpression_1 = GeneratorUtils.findLocalReference(GeneratorUtils.removeQuotes(((Reference) abstractSchemaItem).getSchemaRef()), root);
                    }
                    Schema schemaItem = _xifexpression_1;
                    JsonTypes itemType = schemaItem.getType().getJsonTypes().get(0);
                    if (itemType != null) {
                      switch (itemType) {
                        case BOOLEAN:
                          additionalPropKeyType = "List<Boolean>";
                          break;
                        case INTEGER:
                          additionalPropKeyType = "List<Integer>";
                          break;
                        case NUMBER:
                          additionalPropKeyType = "List<Double>";
                          break;
                        case OBJECT:
                          boolean _isReference_1 = GeneratorUtils.isReference(schema.getPropertyNames());
                          if (_isReference_1) {
                            String _firstUpper_1 = StringExtensions.toFirstUpper(GeneratorUtils.getReferenceName(abstractSchemaItem));
                            String _plus_2 = ("List<" + _firstUpper_1);
                            String _plus_3 = (_plus_2 + ">");
                            additionalPropKeyType = _plus_3;
                          } else {
                            String _title_1 = schemaItem.getTitle();
                            boolean _tripleNotEquals_2 = (_title_1 != null);
                            if (_tripleNotEquals_2) {
                              String _firstUpper_2 = StringExtensions.toFirstUpper(GeneratorUtils.removeQuotes(schemaItem.getTitle()).replace(" ", ""));
                              String _plus_4 = ("List<" + _firstUpper_2);
                              String _plus_5 = (_plus_4 + ">");
                              additionalPropKeyType = _plus_5;
                            } else {
                              additionalPropKeyType = null;
                            }
                          }
                          break;
                        case ARRAY:
                          boolean _isReference_2 = GeneratorUtils.isReference(abstractSchemaItem);
                          if (_isReference_2) {
                            String _firstUpper_3 = StringExtensions.toFirstUpper(GeneratorUtils.getReferenceName(abstractSchemaItem));
                            String _plus_6 = ("List<" + _firstUpper_3);
                            String _plus_7 = (_plus_6 + ">");
                            additionalPropKeyType = _plus_7;
                          } else {
                            String _title_2 = schemaItem.getTitle();
                            boolean _tripleNotEquals_3 = (_title_2 != null);
                            if (_tripleNotEquals_3) {
                              String _firstUpper_4 = StringExtensions.toFirstUpper(GeneratorUtils.removeQuotes(schemaItem.getTitle()).replace(" ", ""));
                              String _plus_8 = ("List<" + _firstUpper_4);
                              String _plus_9 = (_plus_8 + ">");
                              additionalPropKeyType = _plus_9;
                            } else {
                              additionalPropKeyType = null;
                            }
                          }
                          break;
                        default:
                          additionalPropKeyType = null;
                          break;
                      }
                    } else {
                      additionalPropKeyType = null;
                    }
                  } else {
                    additionalPropKeyType = null;
                  }
                  break;
                default:
                  additionalPropKeyType = null;
                  break;
              }
            } else {
              additionalPropKeyType = null;
            }
          }
        }
        if ((additionalPropKeyType != null)) {
          AbstractSchema _schema = schema.getAdditionalProperties().getSchema();
          boolean _tripleNotEquals_4 = (_schema != null);
          if (_tripleNotEquals_4) {
            AbstractSchema additionalPropAbstractSchema = schema.getAdditionalProperties().getSchema();
            boolean _isSchema_2 = GeneratorUtils.isSchema(additionalPropAbstractSchema);
            if (_isSchema_2) {
              Schema additionalPropSchema = ((Schema) additionalPropAbstractSchema);
              String _title_3 = additionalPropSchema.getTitle();
              boolean _tripleNotEquals_5 = (_title_3 != null);
              if (_tripleNotEquals_5) {
                String _firstUpper_5 = StringExtensions.toFirstUpper(GeneratorUtils.removeQuotes(additionalPropSchema.getTitle()).replace(" ", ""));
                String _plus_10 = ((("Map<" + additionalPropKeyType) + ", ") + _firstUpper_5);
                String _plus_11 = (_plus_10 + ">");
                CustomProperty customProp = new CustomProperty(additionalPropName, _plus_11);
                list.add(customProp);
              }
            } else {
              String _firstUpper_6 = StringExtensions.toFirstUpper(GeneratorUtils.getReferenceName(additionalPropAbstractSchema));
              String _plus_12 = ((("Map<" + additionalPropKeyType) + ", ") + _firstUpper_6);
              String _plus_13 = (_plus_12 + ">");
              CustomProperty customProp_1 = new CustomProperty(additionalPropName, _plus_13);
              list.add(customProp_1);
            }
          } else {
            CustomProperty customProp_2 = new CustomProperty(additionalPropName, (("Map<" + additionalPropKeyType) + ", Object>"));
            list.add(customProp_2);
          }
        }
      }
      if (((schema.getProperties() != null) && (!schema.getProperties().isEmpty()))) {
        EList<NamedSchema> _properties = schema.getProperties();
        for (final NamedSchema prop : _properties) {
          {
            String propName = GeneratorUtils.removeQuotes(prop.getName());
            String propType = "";
            JsonTypes type_1 = JsonTypes.NULL;
            Schema _xifexpression_2 = null;
            boolean _isSchema_3 = GeneratorUtils.isSchema(prop.getSchema());
            if (_isSchema_3) {
              AbstractSchema _schema_1 = prop.getSchema();
              _xifexpression_2 = ((Schema) _schema_1);
            } else {
              AbstractSchema _schema_2 = prop.getSchema();
              _xifexpression_2 = GeneratorUtils.findLocalReference(GeneratorUtils.removeQuotes(((Reference) _schema_2).getSchemaRef()), root);
            }
            Schema propSchema = _xifexpression_2;
            if ((((propSchema != null) && (propSchema.getType() != null)) && (propSchema.getType().getJsonTypes().size() > 0))) {
              type_1 = propSchema.getType().getJsonTypes().get(0);
              if (type_1 != null) {
                switch (type_1) {
                  case BOOLEAN:
                    propType = "Boolean";
                    break;
                  case INTEGER:
                    propType = "Integer";
                    break;
                  case NUMBER:
                    propType = "Double";
                    break;
                  case OBJECT:
                    boolean _isReference_3 = GeneratorUtils.isReference(prop.getSchema());
                    if (_isReference_3) {
                      propType = StringExtensions.toFirstUpper(GeneratorUtils.getReferenceName(prop.getSchema()));
                    } else {
                      propType = StringExtensions.toFirstUpper(propName);
                    }
                    break;
                  case STRING:
                    propType = "String";
                    break;
                  case ARRAY:
                    if (((propSchema.getItems() != null) && (propSchema.getItems().getItems().size() > 0))) {
                      AbstractSchema arrayAbstractSchema = propSchema.getItems().getItems().get(0);
                      boolean _isReference_4 = GeneratorUtils.isReference(arrayAbstractSchema);
                      if (_isReference_4) {
                        String _firstUpper_7 = StringExtensions.toFirstUpper(GeneratorUtils.getReferenceName(propSchema.getItems().getItems().get(0)));
                        String _plus_14 = ("List<" + _firstUpper_7);
                        String _plus_15 = (_plus_14 + ">");
                        propType = _plus_15;
                      } else {
                        Schema arraySchema = ((Schema) arrayAbstractSchema);
                        Types _type = arraySchema.getType();
                        boolean _tripleNotEquals_6 = (_type != null);
                        if (_tripleNotEquals_6) {
                          JsonTypes arrayType = arraySchema.getType().getJsonTypes().get(0);
                          if (arrayType != null) {
                            switch (arrayType) {
                              case BOOLEAN:
                                propType = "List<Boolean>";
                                break;
                              case INTEGER:
                                propType = "List<Integer>";
                                break;
                              case NUMBER:
                                propType = "List<Double>";
                                break;
                              case OBJECT:
                                boolean _isReference_5 = GeneratorUtils.isReference(prop.getSchema());
                                if (_isReference_5) {
                                  propType = StringExtensions.toFirstUpper(GeneratorUtils.getReferenceName(prop.getSchema()));
                                } else {
                                  propType = StringExtensions.toFirstUpper(propName);
                                }
                                break;
                              case STRING:
                                propType = "List<String>";
                                break;
                              default:
                                break;
                            }
                          } else {
                          }
                        } else {
                          String _title_4 = arraySchema.getTitle();
                          boolean _tripleNotEquals_7 = (_title_4 != null);
                          if (_tripleNotEquals_7) {
                            String _firstUpper_8 = StringExtensions.toFirstUpper(GeneratorUtils.removeQuotes(arraySchema.getTitle()).replace(" ", ""));
                            String _plus_16 = ("List<" + _firstUpper_8);
                            String _plus_17 = (_plus_16 + ">");
                            propType = _plus_17;
                          } else {
                            propType = null;
                          }
                        }
                      }
                    } else {
                      propType = null;
                    }
                    break;
                  default:
                    propType = null;
                    break;
                }
              } else {
                propType = null;
              }
            }
            if ((propType != null)) {
              CustomProperty customProp_3 = new CustomProperty(propName, propType);
              customProp_3.setType(type_1);
              list.add(customProp_3);
            }
          }
        }
      }
    }
    return list;
  }
  
  public static String toJavaType(final Schema schema, final JsonTypes type, final String objectName) {
    if ((schema != null)) {
      if ((type != null)) {
        if (type != null) {
          switch (type) {
            case BOOLEAN:
              return "Boolean";
            case INTEGER:
              return "Integer";
            case NULL:
              return null;
            case NUMBER:
              return "Double";
            case OBJECT:
              AbstractSchema _propertyNames = schema.getPropertyNames();
              boolean _tripleNotEquals = (_propertyNames != null);
              if (_tripleNotEquals) {
                AbstractSchema propertyNamesAbstractSchema = schema.getPropertyNames();
                boolean _isSchema = GeneratorUtils.isSchema(propertyNamesAbstractSchema);
                if (_isSchema) {
                  Schema propertyNamesSchema = ((Schema) propertyNamesAbstractSchema);
                  String _firstUpper = StringExtensions.toFirstUpper(propertyNamesSchema.getType().getJsonTypes().get(0).name().toLowerCase());
                  String _plus = ("Map<" + _firstUpper);
                  String _plus_1 = (_plus + ",");
                  String _firstUpper_1 = StringExtensions.toFirstUpper(objectName);
                  String _plus_2 = (_plus_1 + _firstUpper_1);
                  return (_plus_2 + ">");
                }
              } else {
                return StringExtensions.toFirstUpper(objectName);
              }
              break;
            case STRING:
              return "String";
            case ARRAY:
              String _firstUpper_2 = StringExtensions.toFirstUpper(objectName);
              String _plus_3 = ("List<" + _firstUpper_2);
              return (_plus_3 + ">");
            default:
              return null;
          }
        } else {
          return null;
        }
      }
    }
    return null;
  }
  
  public static boolean isSchema(final AbstractSchema schema) {
    if ((schema instanceof Schema)) {
      return true;
    }
    return false;
  }
  
  public static boolean isReference(final AbstractSchema schema) {
    if ((schema instanceof Reference)) {
      return true;
    }
    return false;
  }
  
  public static boolean isArray(final AbstractSchema schema) {
    boolean _isSchema = GeneratorUtils.isSchema(schema);
    if (_isSchema) {
      if (((((Schema) schema).getType() != null) && (IterableExtensions.<JsonTypes>findFirst(((Schema) schema).getType().getJsonTypes(), ((Function1<JsonTypes, Boolean>) (JsonTypes t) -> {
        return Boolean.valueOf((t == JsonTypes.ARRAY));
      })) != null))) {
        return true;
      }
    } else {
    }
    return false;
  }
  
  public static boolean isObject(final AbstractSchema schema) {
    boolean _isSchema = GeneratorUtils.isSchema(schema);
    if (_isSchema) {
      if (((((Schema) schema).getType() != null) && (IterableExtensions.<JsonTypes>findFirst(((Schema) schema).getType().getJsonTypes(), ((Function1<JsonTypes, Boolean>) (JsonTypes t) -> {
        return Boolean.valueOf((t == JsonTypes.OBJECT));
      })) != null))) {
        return true;
      }
    } else {
    }
    return false;
  }
  
  public static Schema findLocalReference(final String ref, final Schema root) {
    String propName = GeneratorUtils.getReferenceName(ref);
    if ((propName != null)) {
      EList<NamedSchema> definitions = root.getDefinitions();
      NamedSchema localRef = GeneratorUtils.recursiveFindLocalRef(propName, definitions);
      if ((localRef != null)) {
        AbstractSchema _schema = localRef.getSchema();
        return ((Schema) _schema);
      }
    }
    return null;
  }
  
  public static String getReferenceName(final AbstractSchema schema) {
    if ((schema instanceof Reference)) {
      Reference ref = ((Reference) schema);
      return GeneratorUtils.getReferenceName(GeneratorUtils.removeQuotes(ref.getSchemaRef()));
    }
    return null;
  }
  
  public static String getReferenceName(final String fullRef) {
    String _xblockexpression = null;
    {
      String isLocal = fullRef.substring(0, 2);
      String _xifexpression = null;
      boolean _equals = isLocal.equals("#/");
      if (_equals) {
        String _xblockexpression_1 = null;
        {
          String[] pathsToSchema = fullRef.replace("#/definitions/", "").split("/");
          _xblockexpression_1 = pathsToSchema[0];
        }
        _xifexpression = _xblockexpression_1;
      } else {
        System.out.println(("Was not a local reference, full reference was " + fullRef));
        return null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private static NamedSchema recursiveFindLocalRef(final String propNameToFind, final EList<NamedSchema> definitions) {
    final Function1<NamedSchema, Boolean> _function = (NamedSchema prop) -> {
      return Boolean.valueOf(GeneratorUtils.removeQuotes(prop.getName()).toLowerCase().equals(propNameToFind.toLowerCase()));
    };
    NamedSchema foundSchema = IterableExtensions.<NamedSchema>findFirst(definitions, _function);
    if ((foundSchema != null)) {
      boolean _isSchema = GeneratorUtils.isSchema(foundSchema.getSchema());
      if (_isSchema) {
        return foundSchema;
      } else {
        AbstractSchema _schema = foundSchema.getSchema();
        String newRefToFind = GeneratorUtils.removeQuotes(((Reference) _schema).getSchemaRef());
        String _referenceName = GeneratorUtils.getReferenceName(newRefToFind);
        boolean _tripleNotEquals = (_referenceName != null);
        if (_tripleNotEquals) {
          return GeneratorUtils.recursiveFindLocalRef(newRefToFind, definitions);
        } else {
          System.out.println(("Could not find new reference for " + newRefToFind));
        }
      }
    } else {
      System.out.println(("Could not find schema for " + propNameToFind));
    }
    return null;
  }
}
