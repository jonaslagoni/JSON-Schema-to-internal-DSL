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
  public static String toJavaType(final JsonTypes type, final NamedSchema model) {
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
          return StringExtensions.toFirstUpper(GeneratorUtils.realizeName(model.getName()));
        case STRING:
          return "String";
        case ARRAY:
          String _firstUpper = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(model.getName()));
          String _plus = ("List<" + _firstUpper);
          return (_plus + ">");
        default:
          return null;
      }
    } else {
      return null;
    }
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
      return GeneratorUtils.recursiveFindLocalRef(propName, definitions);
    }
    return null;
  }
  
  private static String getReferenceName(final String fullRef) {
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
  
  private static Schema recursiveFindLocalRef(final String propNameToFind, final EList<NamedSchema> definitions) {
    final Function1<NamedSchema, Boolean> _function = (NamedSchema prop) -> {
      return Boolean.valueOf(GeneratorUtils.realizeName(prop.getName()).toLowerCase().equals(propNameToFind.toLowerCase()));
    };
    NamedSchema foundSchema = IterableExtensions.<NamedSchema>findFirst(definitions, _function);
    if ((foundSchema != null)) {
      boolean _isSchema = GeneratorUtils.isSchema(foundSchema.getSchema());
      if (_isSchema) {
        AbstractSchema _schema = foundSchema.getSchema();
        return ((Schema) _schema);
      } else {
        AbstractSchema _schema_1 = foundSchema.getSchema();
        String newRefToFind = GeneratorUtils.realizeName(((Reference) _schema_1).getUri());
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
