package org.xtext.json.schema.tests;

import com.google.inject.Inject;
import java.util.function.Predicate;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
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
}
