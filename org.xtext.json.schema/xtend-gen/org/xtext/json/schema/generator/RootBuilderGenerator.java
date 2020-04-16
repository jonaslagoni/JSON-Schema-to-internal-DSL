package org.xtext.json.schema.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.StringExtensions;
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method isObject(Schema) is undefined"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method isObject(Schema) is undefined"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\nThe method or field realizeName is undefined for the type AnyString"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoFirstLower cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoFirstLower cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoFirstLower cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoFirstLower cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoFirstLower cannot be resolved"
      + "\n! cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoFirstLower cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoFirstLower cannot be resolved");
  }
}
