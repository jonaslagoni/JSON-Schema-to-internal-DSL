package org.xtext.json.schema.tests;

import com.google.inject.Inject;
import java.util.function.Predicate;
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
import org.quicktheories.QuickTheory;
import org.xtext.json.schema.draft7.Schema;
import org.xtext.json.schema.tests.Draft7InjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(Draft7InjectorProvider.class)
@SuppressWarnings("all")
public class PropertyBasedTesting {
  @Inject
  private ParseHelper<Schema> parseHelper;
  
  @Test
  public void anyValidArbitraryJsonSchemaShouldBeParsed() {
    final Predicate<org.xtext.json.schema.tests.model.Schema> _function = (org.xtext.json.schema.tests.model.Schema s) -> {
      try {
        if ((s != null)) {
          final CharSequence charSequence = s.toCharSequence();
          final Schema result = this.parseHelper.parse(charSequence);
          return ((result != null) && result.eResource().getErrors().isEmpty());
        }
        return false;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    QuickTheory.qt().<org.xtext.json.schema.tests.model.Schema>forAll(org.xtext.json.schema.tests.model.Schema.fullSchema()).check(_function);
  }
  
  @Test
  public void test() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"type\": [");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"string\",");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"integer\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("],");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"exclusiveMinimum\": 0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004514564");
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
