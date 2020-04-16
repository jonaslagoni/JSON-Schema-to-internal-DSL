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
public class BuilderGenerator {
  private List<CustomModel> objectList;
  
  private Schema root;
  
  public BuilderGenerator(final List<CustomModel> objectList, final Schema root) {
    this.objectList = objectList;
    this.root = root;
  }
  
  public void generateBuilderFile(final CustomModel model, final IFileSystemAccess2 fsa) {
    System.out.println("Test");
    String _firstUpper = StringExtensions.toFirstUpper(model.getName());
    String _plus = ("Builder/" + _firstUpper);
    String _plus_1 = (_plus + ".java");
    fsa.generateFile(_plus_1, this.generateBuilder(model));
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
    CharSequence _generateBuilderVariables = this.generateBuilderVariables(model);
    _builder.append(_generateBuilderVariables, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateBuilderConstructor = this.generateBuilderConstructor(model);
    _builder.append(_generateBuilderConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateBuilderMethod = this.generateBuilderMethod(model);
    _builder.append(_generateBuilderMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateBuilderFinishMethod = this.generateBuilderFinishMethod(model);
    _builder.append(_generateBuilderFinishMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
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
    _builder.newLineIfNotEmpty();
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
  
  public String generateBuilderMethod(final CustomModel model) {
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
            {
              AbstractSchema _schema_2 = property.getSchema();
              boolean _isObject = GeneratorUtils.isObject(((Schema) _schema_2));
              if (_isObject) {
                _builder.append("\t");
                _builder.append("public ");
                String _firstUpper = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstUpper, "\t");
                _builder.append("Builder ");
                String _realizeName = GeneratorUtils.realizeName(property.getName());
                _builder.append(_realizeName, "\t");
                _builder.append("(){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                String _firstUpper_1 = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstUpper_1, "\t\t");
                _builder.append(" ");
                String _firstLower = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstLower, "\t\t");
                _builder.append("Instance;");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("if(root.get");
                String _firstUpper_2 = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstUpper_2, "\t\t");
                _builder.append("() != null){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                String _firstLower_1 = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstLower_1, "\t\t\t");
                _builder.append("Instance = root.get");
                String _firstUpper_3 = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstUpper_3, "\t\t\t");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("} else {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t\t");
                String _firstLower_2 = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstLower_2, "\t\t\t");
                _builder.append("Instance = new ");
                String _firstUpper_4 = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstUpper_4, "\t\t\t");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("root.set");
                String _firstUpper_5 = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstUpper_5, "\t\t\t");
                _builder.append("(");
                String _firstLower_3 = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
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
                String _firstUpper_6 = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstUpper_6, "\t\t");
                _builder.append("Builder(this, ");
                String _firstLower_4 = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstLower_4, "\t\t");
                _builder.append("Instance);");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("\t");
                _builder.newLine();
              } else {
                _builder.append("\t");
                _builder.append("public ");
                String _firstUpper_7 = StringExtensions.toFirstUpper(model.getName());
                String _plus = (_firstUpper_7 + "Builder");
                _builder.append(_plus, "\t");
                _builder.append(" set");
                String _firstUpper_8 = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstUpper_8, "\t");
                _builder.append("(");
                String _firstUpper_9 = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstUpper_9, "\t");
                _builder.append(" ");
                String _firstLower_5 = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstLower_5, "\t");
                _builder.append("){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("root.set");
                String _firstUpper_10 = StringExtensions.toFirstUpper(GeneratorUtils.realizeName(property.getName()));
                _builder.append(_firstUpper_10, "\t\t");
                _builder.append("(");
                String _firstLower_6 = StringExtensions.toFirstLower(GeneratorUtils.realizeName(property.getName()));
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
                _builder.append("\t");
                _builder.newLine();
              }
            }
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
    return _builder;
  }
  
  public CharSequence generateBuilderFinishMethod(final CustomModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _firstUpper = StringExtensions.toFirstUpper(model.getParentName());
    _builder.append(_firstUpper);
    _builder.append(" finish() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return parent.finish();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
