package org.xtext.json.schema.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.json.schema.draft7.AbstractSchema;
import org.xtext.json.schema.draft7.AnyString;
import org.xtext.json.schema.draft7.JsonTypes;
import org.xtext.json.schema.draft7.NamedSchema;
import org.xtext.json.schema.draft7.Reference;
import org.xtext.json.schema.draft7.Schema;

@SuppressWarnings("all")
public class GeneratorUtils {
  public static String toJavaType(final Schema schema, final JsonTypes type, final AnyString objectName) {
    return GeneratorUtils.toJavaType(schema, type, GeneratorUtils.realizeName(objectName));
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
  
  public static String realizeName(final AnyString anyString) {
    String _xifexpression = null;
    String _name = anyString.getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      _xifexpression = anyString.getName();
    } else {
      _xifexpression = anyString.getKeyword().name().toLowerCase();
    }
    return _xifexpression;
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
      return GeneratorUtils.getReferenceName(GeneratorUtils.realizeName(ref.getUri()));
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
      return Boolean.valueOf(GeneratorUtils.realizeName(prop.getName()).toLowerCase().equals(propNameToFind.toLowerCase()));
    };
    NamedSchema foundSchema = IterableExtensions.<NamedSchema>findFirst(definitions, _function);
    if ((foundSchema != null)) {
      boolean _isSchema = GeneratorUtils.isSchema(foundSchema.getSchema());
      if (_isSchema) {
        return foundSchema;
      } else {
        AbstractSchema _schema = foundSchema.getSchema();
        String newRefToFind = GeneratorUtils.realizeName(((Reference) _schema).getUri());
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
