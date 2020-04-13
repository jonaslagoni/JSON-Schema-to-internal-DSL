package org.xtext.json.schema.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.json.schema.draft7.Schema;
import org.xtext.json.schema.tests.Draft7InjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(Draft7InjectorProvider.class)
@SuppressWarnings("all")
public class CustomTest {
  @Inject
  private ParseHelper<Schema> parseHelper;
  
  @Test
  public void SmallExample() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("\"definitions\":{");
      _builder.newLine();
      _builder.append("       ");
      _builder.append("\"Reference\": {");
      _builder.newLine();
      _builder.append("         ");
      _builder.append("\"required\": [");
      _builder.newLine();
      _builder.append("           ");
      _builder.append("\"$ref\"");
      _builder.newLine();
      _builder.append("         ");
      _builder.append("],");
      _builder.newLine();
      _builder.append("         ");
      _builder.append("\"properties\": {");
      _builder.newLine();
      _builder.append("           ");
      _builder.append("\"$ref\": {");
      _builder.newLine();
      _builder.append("             ");
      _builder.append("\"$ref\": \"#/definitions/ReferenceObject\"");
      _builder.newLine();
      _builder.append("           ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("         ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("       ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Schema result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
