package org.xtext.json.schema.generator;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.json.schema.draft7.AbstractSchema;
import org.xtext.json.schema.draft7.AdditionalProperties;
import org.xtext.json.schema.draft7.AnyString;
import org.xtext.json.schema.draft7.JsonTypes;
import org.xtext.json.schema.draft7.NamedSchema;
import org.xtext.json.schema.draft7.Reference;
import org.xtext.json.schema.draft7.Schema;
import org.xtext.json.schema.draft7.Types;
import org.xtext.json.schema.draft7.impl.CustomAnyString;
import org.xtext.json.schema.draft7.impl.CustomNamedSchema;
import org.xtext.json.schema.generator.CustomModel;
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
    boolean _equals = model.getName().equals("channels");
    if (_equals) {
      System.out.println("rip");
    }
    AbstractSchema _model = model.getModel();
    List<NamedSchema> allProperties = this.allProperties(((Schema) _model));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package model;");
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    CharSequence _generateModelImports = this.generateModelImports(model, allProperties);
    _builder.append(_generateModelImports);
    _builder.newLineIfNotEmpty();
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
    CharSequence _generateModelProperties = this.generateModelProperties(model, allProperties);
    _builder.append(_generateModelProperties, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateModelConstructor = this.generateModelConstructor(model, allProperties);
    _builder.append(_generateModelConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateModelGetSet = this.generateModelGetSet(model, allProperties);
    _builder.append(_generateModelGetSet, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private int anonymCounter = 0;
  
  public List<NamedSchema> allProperties(final Schema schema) {
    ArrayList<NamedSchema> list = new ArrayList<NamedSchema>();
    if ((schema != null)) {
      if (((schema.getProperties() != null) && (!schema.getProperties().isEmpty()))) {
        list.addAll(schema.getProperties());
      }
      AdditionalProperties _additionalProperties = schema.getAdditionalProperties();
      boolean _tripleNotEquals = (_additionalProperties != null);
      if (_tripleNotEquals) {
        AbstractSchema additionalPropertiesSchema = schema.getAdditionalProperties().getSchema();
        if ((additionalPropertiesSchema != null)) {
          boolean _isReference = GeneratorUtils.isReference(additionalPropertiesSchema);
          if (_isReference) {
            CustomNamedSchema newNamedSchema = new CustomNamedSchema();
            newNamedSchema.setSchema(additionalPropertiesSchema);
            String _referenceName = GeneratorUtils.getReferenceName(additionalPropertiesSchema);
            CustomAnyString _customAnyString = new CustomAnyString(_referenceName);
            newNamedSchema.setName(_customAnyString);
            list.add(((NamedSchema) newNamedSchema));
          } else {
            boolean _isSchema = GeneratorUtils.isSchema(additionalPropertiesSchema);
            if (_isSchema) {
              list.addAll(this.allProperties(((Schema) additionalPropertiesSchema)));
            }
          }
        }
      }
      if (((schema.getAnyOfs() != null) && (!schema.getAnyOfs().isEmpty()))) {
        list.addAll(this.allComplexityProperties(schema.getAnyOfs()));
      }
      if (((schema.getAllOfs() != null) && (!schema.getAllOfs().isEmpty()))) {
        list.addAll(this.allComplexityProperties(schema.getAllOfs()));
      }
      if (((schema.getOneOfs() != null) && (!schema.getOneOfs().isEmpty()))) {
        list.addAll(this.allComplexityProperties(schema.getOneOfs()));
      }
    }
    return list;
  }
  
  public List<NamedSchema> allComplexityProperties(final List<AbstractSchema> complex) {
    ArrayList<NamedSchema> _xblockexpression = null;
    {
      AbstractSchema[] newComplexList = ((AbstractSchema[])Conversions.unwrapArray(complex, AbstractSchema.class)).clone();
      ArrayList<NamedSchema> list = new ArrayList<NamedSchema>();
      for (final AbstractSchema anyOfAbstractSchema : newComplexList) {
        {
          CustomNamedSchema newNamedSchema = new CustomNamedSchema();
          newNamedSchema.setSchema(anyOfAbstractSchema);
          boolean _isReference = GeneratorUtils.isReference(anyOfAbstractSchema);
          if (_isReference) {
            String _referenceName = GeneratorUtils.getReferenceName(anyOfAbstractSchema);
            CustomAnyString _customAnyString = new CustomAnyString(_referenceName);
            newNamedSchema.setName(_customAnyString);
          } else {
            boolean _isSchema = GeneratorUtils.isSchema(anyOfAbstractSchema);
            if (_isSchema) {
              Schema anyOfSchema = ((Schema) anyOfAbstractSchema);
              String _title = anyOfSchema.getTitle();
              boolean _tripleNotEquals = (_title != null);
              if (_tripleNotEquals) {
                String _replace = anyOfSchema.getTitle().replace(" ", "");
                CustomAnyString _customAnyString_1 = new CustomAnyString(_replace);
                newNamedSchema.setName(_customAnyString_1);
              } else {
                AnyString _id = anyOfSchema.getId();
                boolean _tripleNotEquals_1 = (_id != null);
                if (_tripleNotEquals_1) {
                  String _replace_1 = GeneratorUtils.realizeName(anyOfSchema.getId()).replace(" ", "");
                  CustomAnyString _customAnyString_2 = new CustomAnyString(_replace_1);
                  newNamedSchema.setName(_customAnyString_2);
                } else {
                  int _plusPlus = this.anonymCounter++;
                  String _plus = ("anonym" + Integer.valueOf(_plusPlus));
                  CustomAnyString _customAnyString_3 = new CustomAnyString(_plus);
                  newNamedSchema.setName(_customAnyString_3);
                }
              }
            }
          }
          list.add(newNamedSchema);
        }
      }
      _xblockexpression = list;
    }
    return _xblockexpression;
  }
  
  public CharSequence generateModelImports(final CustomModel model, final List<NamedSchema> allProperties) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final NamedSchema property : allProperties) {
        Schema _xifexpression = null;
        boolean _isSchema = GeneratorUtils.isSchema(property.getSchema());
        if (_isSchema) {
          AbstractSchema _schema = property.getSchema();
          _xifexpression = ((Schema) _schema);
        } else {
          AbstractSchema _schema_1 = property.getSchema();
          _xifexpression = GeneratorUtils.findLocalReference(GeneratorUtils.realizeName(((Reference) _schema_1).getUri()), this.root);
        }
        Schema schema = _xifexpression;
        _builder.newLineIfNotEmpty();
        {
          boolean _isObject = GeneratorUtils.isObject(schema);
          if (_isObject) {
            _builder.append("import model.");
            String _firstUpper = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(property.getName()));
            _builder.append(_firstUpper);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("import model.");
            String _firstUpper_1 = StringExtensions.toFirstUpper(GeneratorUtils.getReferenceName(property.getSchema()));
            _builder.append(_firstUpper_1);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence generateModelGetSet(final CustomModel model, final List<NamedSchema> allProperties) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final NamedSchema property : allProperties) {
        Schema _xifexpression = null;
        boolean _isSchema = GeneratorUtils.isSchema(property.getSchema());
        if (_isSchema) {
          AbstractSchema _schema = property.getSchema();
          _xifexpression = ((Schema) _schema);
        } else {
          AbstractSchema _schema_1 = property.getSchema();
          _xifexpression = GeneratorUtils.findLocalReference(GeneratorUtils.realizeName(((Reference) _schema_1).getUri()), this.root);
        }
        Schema schema = _xifexpression;
        _builder.newLineIfNotEmpty();
        {
          if (((schema != null) && (schema.getType() != null))) {
            {
              EList<JsonTypes> _jsonTypes = schema.getType().getJsonTypes();
              for(final JsonTypes type : _jsonTypes) {
                {
                  String _javaType = GeneratorUtils.toJavaType(schema, type, property.getName());
                  boolean _tripleNotEquals = (_javaType != null);
                  if (_tripleNotEquals) {
                    _builder.append("/**");
                    _builder.newLine();
                    _builder.append("* @param ");
                    String _firstLower = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
                    _builder.append(_firstLower);
                    _builder.append(" to set");
                    _builder.newLineIfNotEmpty();
                    _builder.append("*/");
                    _builder.newLine();
                    _builder.append("public void set");
                    String _firstUpper = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(property.getName()));
                    _builder.append(_firstUpper);
                    _builder.append("(");
                    String _javaType_1 = GeneratorUtils.toJavaType(schema, type, property.getName());
                    _builder.append(_javaType_1);
                    _builder.append(" ");
                    String _firstLower_1 = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
                    _builder.append(_firstLower_1);
                    _builder.append("){");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("this.");
                    String _firstLower_2 = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
                    _builder.append(_firstLower_2, "\t");
                    _builder.append(" = ");
                    String _firstLower_3 = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
                    _builder.append(_firstLower_3, "\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    _builder.newLine();
                    _builder.newLine();
                    _builder.append("/**");
                    _builder.newLine();
                    _builder.append("* @return the ");
                    String _firstLower_4 = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
                    _builder.append(_firstLower_4);
                    _builder.newLineIfNotEmpty();
                    _builder.append("*/");
                    _builder.newLine();
                    _builder.append("public ");
                    String _javaType_2 = GeneratorUtils.toJavaType(schema, type, property.getName());
                    _builder.append(_javaType_2);
                    _builder.append(" get");
                    String _firstUpper_1 = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(property.getName()));
                    _builder.append(_firstUpper_1);
                    _builder.append("(){");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("return ");
                    String _firstLower_5 = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
                    _builder.append(_firstLower_5, "\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence generateModelProperties(final CustomModel model, final List<NamedSchema> allProperties) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final NamedSchema property : allProperties) {
        Schema _xifexpression = null;
        boolean _isSchema = GeneratorUtils.isSchema(property.getSchema());
        if (_isSchema) {
          AbstractSchema _schema = property.getSchema();
          _xifexpression = ((Schema) _schema);
        } else {
          AbstractSchema _schema_1 = property.getSchema();
          _xifexpression = GeneratorUtils.findLocalReference(GeneratorUtils.realizeName(((Reference) _schema_1).getUri()), this.root);
        }
        Schema schema = _xifexpression;
        _builder.newLineIfNotEmpty();
        {
          if ((schema != null)) {
            {
              Types _type = schema.getType();
              boolean _tripleNotEquals = (_type != null);
              if (_tripleNotEquals) {
                {
                  EList<JsonTypes> _jsonTypes = schema.getType().getJsonTypes();
                  for(final JsonTypes type : _jsonTypes) {
                    {
                      String _javaType = GeneratorUtils.toJavaType(schema, type, property.getName());
                      boolean _tripleNotEquals_1 = (_javaType != null);
                      if (_tripleNotEquals_1) {
                        _builder.append("private ");
                        String _javaType_1 = GeneratorUtils.toJavaType(schema, type, property.getName());
                        _builder.append(_javaType_1);
                        _builder.append(" ");
                        String _firstLower = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
                        _builder.append(_firstLower);
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence generateModelConstructor(final CustomModel model, final List<NamedSchema> allProperties) {
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
