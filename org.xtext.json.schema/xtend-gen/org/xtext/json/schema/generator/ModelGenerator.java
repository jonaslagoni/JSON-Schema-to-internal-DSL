package org.xtext.json.schema.generator;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.json.schema.draft7.AbstractSchema;
import org.xtext.json.schema.draft7.AnyString;
import org.xtext.json.schema.draft7.NamedSchema;
import org.xtext.json.schema.draft7.Reference;
import org.xtext.json.schema.draft7.Schema;
import org.xtext.json.schema.generator.CustomModel;
import org.xtext.json.schema.generator.CustomProperty;
import org.xtext.json.schema.generator.GeneratorUtils;

@SuppressWarnings("all")
public class ModelGenerator {
  private List<CustomModel> objectList;
  
  private Schema root;
  
  public ModelGenerator(final List<CustomModel> objectList, final Schema root) {
    this.objectList = objectList;
    this.root = root;
  }
  
  public void generateModelFile(final CustomModel model, final IFileSystemAccess2 fsa) {
    System.out.println("Test");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    String _plus = ("model/" + _firstUpper);
    String _plus_1 = (_plus + ".java");
    fsa.generateFile(_plus_1, this.generateModel(model));
  }
  
  public CharSequence generateModel(final CustomModel model) {
    AbstractSchema _model = model.getModel();
    List<CustomProperty> allProperties = GeneratorUtils.allProperties(((Schema) _model), this.root);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package model;");
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import model.*;");
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @author Generated");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateModelProperties = this.generateModelProperties(allProperties);
    _builder.append(_generateModelProperties, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateModelConstructor = this.generateModelConstructor(model);
    _builder.append(_generateModelConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateModelGetSet = this.generateModelGetSet(allProperties);
    _builder.append(_generateModelGetSet, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateModelGetSet(final List<CustomProperty> allProperties) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final CustomProperty property : allProperties) {
        _builder.append("/**");
        _builder.newLine();
        _builder.append("* @param ");
        String _propertyName = property.getPropertyName();
        _builder.append(_propertyName);
        _builder.append(" to set");
        _builder.newLineIfNotEmpty();
        _builder.append("*/");
        _builder.newLine();
        _builder.append("public void set");
        String _firstUpper = StringExtensions.toFirstUpper(property.getPropertyName());
        _builder.append(_firstUpper);
        _builder.append("(");
        String _typeName = property.getTypeName();
        _builder.append(_typeName);
        _builder.append(" ");
        String _propertyName_1 = property.getPropertyName();
        _builder.append(_propertyName_1);
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        String _propertyName_2 = property.getPropertyName();
        _builder.append(_propertyName_2, "\t");
        _builder.append(" = ");
        String _propertyName_3 = property.getPropertyName();
        _builder.append(_propertyName_3, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("/**");
        _builder.newLine();
        _builder.append("* @return the ");
        String _propertyName_4 = property.getPropertyName();
        _builder.append(_propertyName_4);
        _builder.newLineIfNotEmpty();
        _builder.append("*/");
        _builder.newLine();
        _builder.append("public ");
        String _typeName_1 = property.getTypeName();
        _builder.append(_typeName_1);
        _builder.append(" get");
        String _firstUpper_1 = StringExtensions.toFirstUpper(property.getPropertyName());
        _builder.append(_firstUpper_1);
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return ");
        String _propertyName_5 = property.getPropertyName();
        _builder.append(_propertyName_5, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generateModelProperties(final List<CustomProperty> allProperties) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final CustomProperty property : allProperties) {
        _builder.append("private ");
        String _typeName = property.getTypeName();
        _builder.append(_typeName);
        _builder.append(" ");
        String _propertyName = property.getPropertyName();
        _builder.append(_propertyName);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateModelConstructor(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper);
    _builder.append("(");
    {
      AbstractSchema _model = model.getModel();
      EList<AnyString> _requiredProperties = ((Schema) _model).getRequiredProperties();
      boolean _hasElements = false;
      for(final AnyString requiredPropString : _requiredProperties) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.newLineIfNotEmpty();
        NamedSchema requiredProperty = this.getRequiredProperty(requiredPropString, model);
        _builder.newLineIfNotEmpty();
        {
          if ((requiredProperty != null)) {
            Schema _xifexpression = null;
            boolean _isSchema = GeneratorUtils.isSchema(requiredProperty.getSchema());
            if (_isSchema) {
              AbstractSchema _schema = requiredProperty.getSchema();
              _xifexpression = ((Schema) _schema);
            } else {
              AbstractSchema _schema_1 = requiredProperty.getSchema();
              _xifexpression = GeneratorUtils.findLocalReference(GeneratorUtils.realizeName(((Reference) _schema_1).getUri()), this.root);
            }
            Schema requiredPropertySchema = _xifexpression;
            _builder.newLineIfNotEmpty();
            {
              if ((requiredPropertySchema != null)) {
                String _javaType = GeneratorUtils.toJavaType(requiredPropertySchema, requiredPropertySchema.getType().getJsonTypes().get(0), requiredProperty.getName());
                _builder.append(_javaType);
                _builder.append(" ");
                String _firstLower = StringExtensions.toFirstLower(GeneratorUtils.realizeName(requiredPropString));
                _builder.append(_firstLower);
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t\t");
          }
        }
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      AbstractSchema _model_1 = model.getModel();
      EList<AnyString> _requiredProperties_1 = ((Schema) _model_1).getRequiredProperties();
      for(final AnyString requiredProp : _requiredProperties_1) {
        {
          NamedSchema _requiredProperty = this.getRequiredProperty(requiredProp, model);
          boolean _tripleNotEquals = (_requiredProperty != null);
          if (_tripleNotEquals) {
            _builder.append("\t");
            _builder.append("this.");
            String _firstLower_1 = StringExtensions.toFirstLower(GeneratorUtils.realizeName(requiredProp));
            _builder.append(_firstLower_1, "\t");
            _builder.append(" = ");
            String _firstLower_2 = StringExtensions.toFirstLower(GeneratorUtils.realizeName(requiredProp));
            _builder.append(_firstLower_2, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public NamedSchema getRequiredProperty(final AnyString requiredProp, final CustomModel model) {
    boolean _isSchema = GeneratorUtils.isSchema(model.getModel());
    if (_isSchema) {
      AbstractSchema _model = model.getModel();
      int _size = ((Schema) _model).getProperties().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for (final Integer i : _upTo) {
        {
          AbstractSchema _model_1 = model.getModel();
          NamedSchema property = ((Schema) _model_1).getProperties().get((i).intValue());
          boolean _equals = GeneratorUtils.realizeName(requiredProp).equals(GeneratorUtils.realizeName(property.getName()));
          if (_equals) {
            return property;
          }
        }
      }
    }
    return null;
  }
}
