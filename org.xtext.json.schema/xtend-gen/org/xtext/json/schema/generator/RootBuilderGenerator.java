package org.xtext.json.schema.generator;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.json.schema.draft7.AbstractSchema;
import org.xtext.json.schema.draft7.NamedSchema;
import org.xtext.json.schema.draft7.Reference;
import org.xtext.json.schema.draft7.Schema;
import org.xtext.json.schema.generator.CustomModel;
import org.xtext.json.schema.generator.GeneratorUtils;

@SuppressWarnings("all")
public class RootBuilderGenerator {
  private List<CustomModel> objectList;
  
  private Schema root;
  
  public RootBuilderGenerator(final List<CustomModel> objectList, final Schema root) {
    this.objectList = objectList;
    this.root = root;
  }
  
  public void generateBuilderFile(final CustomModel model, final IFileSystemAccess2 fsa) {
    System.out.println("Test");
    String _parentName = model.getParentName();
    boolean _tripleEquals = (_parentName == null);
    if (_tripleEquals) {
      String _firstUpper = StringExtensions.toFirstUpper(model.getName());
      String _plus = ("builder/" + _firstUpper);
      String _plus_1 = (_plus + "Builder.java");
      fsa.generateFile(_plus_1, this.generateBuilder(model));
    }
  }
  
  public CharSequence generateBuilder(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import model.");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper_1);
    _builder.append("Builder {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateRootBuilderVariables = this.generateRootBuilderVariables(model);
    _builder.append(_generateRootBuilderVariables, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateRootBuilderConstructor = this.generateRootBuilderConstructor(model);
    _builder.append(_generateRootBuilderConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateRootBuilderMethod = this.generateRootBuilderMethod(model);
    _builder.append(_generateRootBuilderMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateRootBuilderFinishMethod = this.generateRootBuilderFinishMethod(model);
    _builder.append(_generateRootBuilderFinishMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateRootBuilderVariables(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper);
    _builder.append(" root;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateRootBuilderConstructor(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper);
    _builder.append("Builder() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("root = new ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper_1, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public String generateRootBuilderMethod(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      AbstractSchema _model = model.getModel();
      EList<NamedSchema> _properties = ((Schema) _model).getProperties();
      for(final NamedSchema property : _properties) {
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
            _builder.append("\t");
            String propertyName = GeneratorUtils.realizeName(property.getName());
            _builder.newLineIfNotEmpty();
            {
              boolean _isObject = GeneratorUtils.isObject(schema);
              if (_isObject) {
                _builder.append("\t");
                _builder.append("public ");
                String _firstUpper = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper, "\t");
                _builder.append("Builder ");
                _builder.append(propertyName, "\t");
                _builder.append("(){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                String _firstUpper_1 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_1, "\t\t");
                _builder.append(" ");
                String _firstLower = StringExtensions.toFirstLower(propertyName);
                _builder.append(_firstLower, "\t\t");
                _builder.append("Instance;");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("if(root.get");
                String _firstUpper_2 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_2, "\t\t");
                _builder.append("() != null){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                String _firstLower_1 = StringExtensions.toFirstLower(propertyName);
                _builder.append(_firstLower_1, "\t\t\t");
                _builder.append("Instance = root.get");
                String _firstUpper_3 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_3, "\t\t\t");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("} else {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t\t");
                String _firstLower_2 = StringExtensions.toFirstLower(propertyName);
                _builder.append(_firstLower_2, "\t\t\t");
                _builder.append("Instance = new ");
                String _firstUpper_4 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_4, "\t\t\t");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("root.set");
                String _firstUpper_5 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_5, "\t\t\t");
                _builder.append("(");
                String _firstLower_3 = StringExtensions.toFirstLower(propertyName);
                _builder.append(_firstLower_3, "\t\t\t");
                _builder.append("Instance);");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("return new ");
                String _firstUpper_6 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_6, "\t\t");
                _builder.append("Builder(this, ");
                String _firstLower_4 = StringExtensions.toFirstLower(propertyName);
                _builder.append(_firstLower_4, "\t\t");
                _builder.append("Instance);");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
              } else {
                _builder.append("\t");
                _builder.append("public ");
                String _firstUpper_7 = StringExtensions.toFirstUpper(model.getName());
                String _plus = (_firstUpper_7 + "Builder");
                _builder.append(_plus, "\t");
                _builder.append(" set");
                String _firstUpper_8 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_8, "\t");
                _builder.append("(");
                String _firstUpper_9 = StringExtensions.toFirstUpper(model.getName());
                _builder.append(_firstUpper_9, "\t");
                _builder.append(" ");
                String _firstLower_5 = StringExtensions.toFirstLower(model.getName());
                _builder.append(_firstLower_5, "\t");
                _builder.append("){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("root.set");
                String _firstUpper_10 = StringExtensions.toFirstUpper(propertyName);
                _builder.append(_firstUpper_10, "\t\t");
                _builder.append("(");
                String _firstLower_6 = StringExtensions.toFirstLower(model.getName());
                _builder.append(_firstLower_6, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("return this;");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  public CharSequence generateRootBuilderFinishMethod(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper);
    _builder.append(" finish() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return root;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
