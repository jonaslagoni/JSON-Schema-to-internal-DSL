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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.quicktheories.QuickTheory;
import org.xtext.json.schema.draft7.Schema;
import org.xtext.json.schema.tests.Draft7InjectorProvider;
import org.xtext.json.schema.tests.StaticConfig;

@ExtendWith(InjectionExtension.class)
@InjectWith(Draft7InjectorProvider.class)
@SuppressWarnings("all")
public class ParserTesting {
  @Inject
  private ParseHelper<Schema> parseHelper;
  
  @BeforeEach
  public void resetConfig() {
    StaticConfig.currentRecursiveAdditionalSchemas = 1;
    StaticConfig.currentRecursiveProperties = 1;
    StaticConfig.currentRecursiveItems = 1;
    StaticConfig.currentRecursiveContains = 1;
    StaticConfig.currentRecursiveAdditionalItemsSchema = 1;
  }
  
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
    QuickTheory.qt().withShrinkCycles(0).<org.xtext.json.schema.tests.model.Schema>forAll(org.xtext.json.schema.tests.model.Schema.fullSchema()).check(_function);
  }
  
  @Test
  public void anyObjectSchemasShouldBeParsed() {
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
    QuickTheory.qt().<org.xtext.json.schema.tests.model.Schema>forAll(org.xtext.json.schema.tests.model.Schema.fullObjectSchema()).check(_function);
  }
  
  @Test
  public void anyFullListSchemasShouldBeParsed() {
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
    QuickTheory.qt().<org.xtext.json.schema.tests.model.Schema>forAll(org.xtext.json.schema.tests.model.Schema.fullListSchema()).check(_function);
  }
  
  @Test
  public void anyFullStringSchemasShouldBeParsed() {
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
    QuickTheory.qt().<org.xtext.json.schema.tests.model.Schema>forAll(org.xtext.json.schema.tests.model.Schema.fullStringSchema()).check(_function);
  }
  
  @Test
  public void anyFullNumberSchemasShouldBeParsed() {
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
    QuickTheory.qt().<org.xtext.json.schema.tests.model.Schema>forAll(org.xtext.json.schema.tests.model.Schema.fullNumberSchema()).check(_function);
  }
  
  @Test
  public void test() {
    try {
      StringConcatenation _builder = new StringConcatenation();
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
