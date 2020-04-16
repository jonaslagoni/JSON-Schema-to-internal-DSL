package org.xtext.json.schema.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.json.schema.draft7.AbstractSchema;
import org.xtext.json.schema.draft7.AnyString;
import org.xtext.json.schema.draft7.JsonTypes;
import org.xtext.json.schema.draft7.NamedSchema;
import org.xtext.json.schema.draft7.Schema;
import org.xtext.json.schema.generator.CustomModel;

@SuppressWarnings("all")
public class RootBuilderGenerator {
  public void generateBuilderFile(final CustomModel model, final IFileSystemAccess2 fsa) {
    System.out.println("Test");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    String _plus = ("Builder/" + _firstUpper);
    String _plus_1 = (_plus + ".java");
    fsa.generateFile(_plus_1, this.generateBuilder(model));
  }
  
  public CharSequence generateBuilder(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateRootBuilderConstructor = this.generateRootBuilderConstructor(model);
    _builder.append(_generateRootBuilderConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateRootBuilderMethod = this.generateRootBuilderMethod(model);
    _builder.append(_generateRootBuilderMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateRootBuilderConstructor(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    String _plus = (_firstUpper + "Builder");
    _builder.append(_plus);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("root = new ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper_1, "\t");
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String generateRootBuilderMethod(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      AbstractSchema _model = model.getModel();
      EList<NamedSchema> _properties = ((Schema) _model).getProperties();
      for(final NamedSchema property : _properties) {
        {
          if (((property.getSchema() instanceof Schema) && (((Schema) property.getSchema()).getType() != null))) {
            {
              AbstractSchema _schema = property.getSchema();
              boolean _isObject = this.isObject(((Schema) _schema));
              if (_isObject) {
                _builder.append("public ");
                String _firstUpper = StringExtensions.toFirstUpper(this.realizeName(property.getName()));
                _builder.append(_firstUpper);
                _builder.append("Builder ");
                String _realizeName = this.realizeName(property.getName());
                _builder.append(_realizeName);
                _builder.append("(){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                String _firstUpper_1 = StringExtensions.toFirstUpper(this.realizeName(property.getName()));
                _builder.append(_firstUpper_1, "\t");
                _builder.append(" ");
                String _firstLower = StringExtensions.toFirstLower(this.realizeName(property.getName()));
                _builder.append(_firstLower, "\t");
                _builder.append("Instance;");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("if(root.get");
                String _firstUpper_2 = StringExtensions.toFirstUpper(this.realizeName(property.getName()));
                _builder.append(_firstUpper_2, "\t");
                _builder.append("() != null){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                String _firstLower_1 = StringExtensions.toFirstLower(this.realizeName(property.getName()));
                _builder.append(_firstLower_1, "\t\t");
                _builder.append("Instance = root.get");
                String _firstUpper_3 = StringExtensions.toFirstUpper(this.realizeName(property.getName()));
                _builder.append(_firstUpper_3, "\t\t");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("} else {");
                _builder.newLine();
                _builder.append("\t\t");
                String _firstLower_2 = StringExtensions.toFirstLower(this.realizeName(property.getName()));
                _builder.append(_firstLower_2, "\t\t");
                _builder.append("Instance = new ");
                String _firstUpper_4 = StringExtensions.toFirstUpper(this.realizeName(property.getName()));
                _builder.append(_firstUpper_4, "\t\t");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("root.set");
                String _firstUpper_5 = StringExtensions.toFirstUpper(this.realizeName(property.getName()));
                _builder.append(_firstUpper_5, "\t\t");
                _builder.append("(");
                String _firstLower_3 = StringExtensions.toFirstLower(this.realizeName(property.getName()));
                _builder.append(_firstLower_3, "\t\t");
                _builder.append("Instance);");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("return new ");
                String _firstUpper_6 = StringExtensions.toFirstUpper(this.realizeName(property.getName()));
                _builder.append(_firstUpper_6, "\t");
                _builder.append("Builder(this, ");
                String _firstLower_4 = StringExtensions.toFirstLower(this.realizeName(property.getName()));
                _builder.append(_firstLower_4, "\t");
                _builder.append("Instance);");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
              }
            }
            {
              AbstractSchema _schema_1 = property.getSchema();
              boolean _isObject_1 = this.isObject(((Schema) _schema_1));
              boolean _not = (!_isObject_1);
              if (_not) {
                _builder.append("public ");
                String _firstUpper_7 = StringExtensions.toFirstUpper(model.getName());
                String _plus = (_firstUpper_7 + "Builder");
                _builder.append(_plus);
                _builder.append(" set");
                String _firstUpper_8 = StringExtensions.toFirstUpper(this.realizeName(property.getName()));
                _builder.append(_firstUpper_8);
                _builder.append("(");
                String _firstUpper_9 = StringExtensions.toFirstUpper(this.realizeName(property.getName()));
                _builder.append(_firstUpper_9);
                _builder.append(" ");
                String _firstLower_5 = StringExtensions.toFirstLower(this.realizeName(property.getName()));
                _builder.append(_firstLower_5);
                _builder.append("){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("root.set");
                String _firstUpper_10 = StringExtensions.toFirstUpper(this.realizeName(property.getName()));
                _builder.append(_firstUpper_10, "\t");
                _builder.append("(");
                String _firstLower_6 = StringExtensions.toFirstLower(this.realizeName(property.getName()));
                _builder.append(_firstLower_6, "\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String toJavaType(final JsonTypes type, final CustomModel model) {
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
          return StringExtensions.toFirstUpper(model.getName());
        case STRING:
          return "String";
        case ARRAY:
          String _firstUpper = StringExtensions.toFirstUpper(model.getParentName());
          String _plus = ("List<" + _firstUpper);
          return (_plus + ">");
        default:
          return null;
      }
    } else {
      return null;
    }
  }
  
  public String realizeName(final AnyString anyString) {
    String _xifexpression = null;
    if (((anyString.getName() != null) && (!anyString.getName().isEmpty()))) {
      _xifexpression = anyString.getName();
    } else {
      _xifexpression = anyString.getKeyword().name().toLowerCase();
    }
    return _xifexpression;
  }
  
  public boolean isSchema(final AbstractSchema schema) {
    if ((schema instanceof Schema)) {
      return true;
    }
    return false;
  }
  
  public boolean isObject(final AbstractSchema schema) {
    boolean _isSchema = this.isSchema(schema);
    if (_isSchema) {
      if (((((Schema) schema).getType() != null) && (IterableExtensions.<JsonTypes>findFirst(((Schema) schema).getType().getJsonTypes(), ((Function1<JsonTypes, Boolean>) (JsonTypes t) -> {
        return Boolean.valueOf((t == JsonTypes.OBJECT));
      })) != null))) {
        return true;
      }
    }
    return false;
  }
}
