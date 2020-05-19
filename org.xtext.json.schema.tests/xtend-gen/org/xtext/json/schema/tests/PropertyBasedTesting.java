package org.xtext.json.schema.tests;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.quicktheories.QuickTheory;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;
import org.quicktheories.generators.SourceDSL;
import org.xtext.json.schema.draft7.Schema;
import org.xtext.json.schema.tests.Draft7InjectorProvider;
import org.xtext.json.schema.tests.model.NumberSchema;

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
    QuickTheory.qt().<org.xtext.json.schema.tests.model.Schema>forAll(this.schema()).check(_function);
  }
  
  private Gen<org.xtext.json.schema.tests.model.Schema> schema() {
    final Function<List<String>, org.xtext.json.schema.tests.model.Schema> _function = (List<String> types) -> {
      return new org.xtext.json.schema.tests.model.Schema(types);
    };
    final BiFunction<org.xtext.json.schema.tests.model.Schema, NumberSchema, org.xtext.json.schema.tests.model.Schema> _function_1 = (org.xtext.json.schema.tests.model.Schema schema, NumberSchema ns) -> {
      org.xtext.json.schema.tests.model.Schema _xblockexpression = null;
      {
        if ((schema.getTypes().contains("\"number\"") || schema.getTypes().contains("\"integer\""))) {
          schema.setNs(ns);
        }
        _xblockexpression = schema;
      }
      return _xblockexpression;
    };
    return this.types().<org.xtext.json.schema.tests.model.Schema>map(_function).<NumberSchema, org.xtext.json.schema.tests.model.Schema>zip(NumberSchema.fullNumberSchema(), _function_1);
  }
  
  private Gen<List<String>> types() {
    final Function<List<String>, List<String>> _function = (List<String> types) -> {
      HashSet<String> _hashSet = new HashSet<String>(types);
      return new ArrayList<String>(_hashSet);
    };
    return SourceDSL.lists().<String>of(
      Generate.<String>oneOf(
        Generate.<String>constant("\"array\""), 
        Generate.<String>constant("\"string\""), 
        Generate.<String>constant("\"integer\""), 
        Generate.<String>constant("\"number\""), 
        Generate.<String>constant("\"null\""), 
        Generate.<String>constant("\"object\""))).ofSizeBetween(1, 6).<List<String>>map(_function);
  }
}
