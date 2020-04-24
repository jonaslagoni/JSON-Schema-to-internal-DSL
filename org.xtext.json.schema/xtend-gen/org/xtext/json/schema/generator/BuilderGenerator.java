package org.xtext.json.schema.generator;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.json.schema.draft7.AbstractSchema;
import org.xtext.json.schema.draft7.JsonTypes;
import org.xtext.json.schema.draft7.Schema;
import org.xtext.json.schema.generator.CustomModel;
import org.xtext.json.schema.generator.CustomProperty;
import org.xtext.json.schema.generator.GeneratorUtils;

@SuppressWarnings("all")
public class BuilderGenerator {
  private List<CustomModel> objectList;
  
  private Schema root;
  
  private CustomModel rootObject;
  
  public BuilderGenerator(final List<CustomModel> objectList, final Schema root) {
    this.objectList = objectList;
    this.root = root;
    for (final CustomModel model : objectList) {
      String _parentName = model.getParentName();
      boolean _tripleEquals = (_parentName == null);
      if (_tripleEquals) {
        this.rootObject = model;
      }
    }
  }
  
  public void generateBuilderFile(final CustomModel model, final IFileSystemAccess2 fsa) {
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    String _plus = ("builder/" + _firstUpper);
    String _plus_1 = (_plus + "Builder.java");
    CharSequence _xifexpression = null;
    String _parentName = model.getParentName();
    boolean _tripleNotEquals = (_parentName != null);
    if (_tripleNotEquals) {
      _xifexpression = this.generateBuilder(model);
    } else {
      _xifexpression = this.generateRootBuilder(model);
    }
    fsa.generateFile(_plus_1, _xifexpression);
  }
  
  public CharSequence generateRootBuilderVariables(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper);
    _builder.append(" ");
    String _firstLower = StringExtensions.toFirstLower(model.getName());
    _builder.append(_firstLower);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateRootBuilder(final CustomModel model) {
    AbstractSchema _model = model.getModel();
    List<CustomProperty> allProperties = GeneratorUtils.allProperties(((Schema) _model), this.root);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package builder;");
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import model.*;");
    _builder.newLine();
    _builder.append("import builder.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper);
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
    String _generateBuilderMethod = this.generateBuilderMethod(model, allProperties);
    _builder.append(_generateBuilderMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateBuilderRootFinishMethod = this.generateBuilderRootFinishMethod(model);
    _builder.append(_generateBuilderRootFinishMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateBuilder(final CustomModel model) {
    AbstractSchema _model = model.getModel();
    List<CustomProperty> allProperties = GeneratorUtils.allProperties(((Schema) _model), this.root);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package builder;");
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import model.*;");
    _builder.newLine();
    _builder.append("import builder.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper);
    _builder.append("Builder {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateBuilderVariables = this.generateBuilderVariables(model);
    _builder.append(_generateBuilderVariables, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateBuilderConstructor = this.generateBuilderConstructor(model);
    _builder.append(_generateBuilderConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateBuilderMethod = this.generateBuilderMethod(model, allProperties);
    _builder.append(_generateBuilderMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateParentMethod = this.generateParentMethod(model);
    _builder.append(_generateParentMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateBuilderFinishMethod = this.generateBuilderFinishMethod(model);
    _builder.append(_generateBuilderFinishMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateBuilderVariables(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getParentName());
    _builder.append(_firstUpper);
    _builder.append("Builder parent;");
    _builder.newLineIfNotEmpty();
    _builder.append("private ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper_1);
    _builder.append(" ");
    String _firstLower = StringExtensions.toFirstLower(model.getName());
    _builder.append(_firstLower);
    _builder.append(";");
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
    String _firstLower = StringExtensions.toFirstLower(model.getName());
    _builder.append(_firstLower, "\t");
    _builder.append(" = new ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper_1, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateBuilderConstructor(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper);
    _builder.append("Builder(");
    String _firstUpper_1 = StringExtensions.toFirstUpper(model.getParentName());
    _builder.append(_firstUpper_1);
    _builder.append("Builder parent, ");
    String _firstUpper_2 = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper_2);
    _builder.append(" ");
    String _firstLower = StringExtensions.toFirstLower(model.getName());
    _builder.append(_firstLower);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("this.parent = parent;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.");
    String _firstLower_1 = StringExtensions.toFirstLower(model.getName());
    _builder.append(_firstLower_1, "\t");
    _builder.append(" = ");
    String _firstLower_2 = StringExtensions.toFirstLower(model.getName());
    _builder.append(_firstLower_2, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public String generateBuilderMethod(final CustomModel model, final List<CustomProperty> allProperties) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final CustomProperty property : allProperties) {
        {
          JsonTypes _type = property.getType();
          boolean _tripleEquals = (_type == JsonTypes.OBJECT);
          if (_tripleEquals) {
            _builder.append("public ");
            String _firstUpper = StringExtensions.toFirstUpper(property.getTypeName());
            _builder.append(_firstUpper);
            _builder.append("Builder ");
            String _propertyName = property.getPropertyName();
            _builder.append(_propertyName);
            _builder.append("(){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _firstUpper_1 = StringExtensions.toFirstUpper(property.getTypeName());
            _builder.append(_firstUpper_1, "\t");
            _builder.append(" ");
            String _firstLower = StringExtensions.toFirstLower(property.getPropertyName());
            _builder.append(_firstLower, "\t");
            _builder.append("Instance;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("if(");
            String _firstLower_1 = StringExtensions.toFirstLower(model.getName());
            _builder.append(_firstLower_1, "\t");
            _builder.append(".get");
            String _firstUpper_2 = StringExtensions.toFirstUpper(property.getPropertyName());
            _builder.append(_firstUpper_2, "\t");
            _builder.append("() != null){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            String _firstLower_2 = StringExtensions.toFirstLower(property.getPropertyName());
            _builder.append(_firstLower_2, "\t\t");
            _builder.append("Instance = ");
            String _firstLower_3 = StringExtensions.toFirstLower(model.getName());
            _builder.append(_firstLower_3, "\t\t");
            _builder.append(".get");
            String _firstUpper_3 = StringExtensions.toFirstUpper(property.getPropertyName());
            _builder.append(_firstUpper_3, "\t\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("} else {");
            _builder.newLine();
            _builder.append("\t\t");
            String _firstLower_4 = StringExtensions.toFirstLower(property.getPropertyName());
            _builder.append(_firstLower_4, "\t\t");
            _builder.append("Instance = new ");
            String _firstUpper_4 = StringExtensions.toFirstUpper(property.getTypeName());
            _builder.append(_firstUpper_4, "\t\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            String _firstLower_5 = StringExtensions.toFirstLower(model.getName());
            _builder.append(_firstLower_5, "\t\t");
            _builder.append(".set");
            String _firstUpper_5 = StringExtensions.toFirstUpper(property.getPropertyName());
            _builder.append(_firstUpper_5, "\t\t");
            _builder.append("(");
            String _firstLower_6 = StringExtensions.toFirstLower(property.getPropertyName());
            _builder.append(_firstLower_6, "\t\t");
            _builder.append("Instance);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("return new ");
            String _firstUpper_6 = StringExtensions.toFirstUpper(property.getTypeName());
            _builder.append(_firstUpper_6, "\t");
            _builder.append("Builder(this, ");
            String _firstLower_7 = StringExtensions.toFirstLower(property.getPropertyName());
            _builder.append(_firstLower_7, "\t");
            _builder.append("Instance);");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          } else {
            _builder.append("public ");
            String _firstUpper_7 = StringExtensions.toFirstUpper(model.getName());
            String _plus = (_firstUpper_7 + "Builder");
            _builder.append(_plus);
            _builder.append(" set");
            String _firstUpper_8 = StringExtensions.toFirstUpper(property.getPropertyName());
            _builder.append(_firstUpper_8);
            _builder.append("(");
            String _firstUpper_9 = StringExtensions.toFirstUpper(property.getTypeName());
            _builder.append(_firstUpper_9);
            _builder.append(" ");
            String _firstLower_8 = StringExtensions.toFirstLower(property.getPropertyName());
            _builder.append(_firstLower_8);
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _firstLower_9 = StringExtensions.toFirstLower(model.getName());
            _builder.append(_firstLower_9, "\t");
            _builder.append(".set");
            String _firstUpper_10 = StringExtensions.toFirstUpper(property.getPropertyName());
            _builder.append(_firstUpper_10, "\t");
            _builder.append("(");
            String _firstLower_10 = StringExtensions.toFirstLower(property.getPropertyName());
            _builder.append(_firstLower_10, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("return this;");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public CharSequence generateParentMethod(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getParentName());
    _builder.append(_firstUpper);
    _builder.append("Builder parent() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return parent;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateBuilderRootFinishMethod(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper);
    _builder.append(" finish() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    String _firstLower = StringExtensions.toFirstLower(model.getName());
    _builder.append(_firstLower, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateBuilderFinishMethod(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _firstUpper = StringExtensions.toFirstUpper(this.rootObject.getName());
    _builder.append(_firstUpper);
    _builder.append(" finish() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return parent.finish();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
