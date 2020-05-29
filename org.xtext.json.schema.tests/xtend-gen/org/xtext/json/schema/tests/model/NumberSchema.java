package org.xtext.json.schema.tests.model;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.api.Function5;
import org.quicktheories.api.Pair;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;
import org.quicktheories.generators.SourceDSL;
import org.xtext.json.schema.tests.model.FloatInteger;

@SuppressWarnings("all")
public class NumberSchema {
  @Accessors
  private FloatInteger multipleOf;
  
  @Accessors
  private FloatInteger minimum;
  
  @Accessors
  private FloatInteger exclusiveMinimum;
  
  @Accessors
  private FloatInteger maximum;
  
  @Accessors
  private FloatInteger exclusiveMaximum;
  
  public NumberSchema() {
  }
  
  /**
   * Returns a CharSequence of defined JSON Schema number keywords.
   */
  public CharSequence toCharSequence() {
    boolean alreadyAdded = false;
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((this.multipleOf != null)) {
        _builder.append("\"multipleOf\": ");
        _builder.append(this.multipleOf);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.minimum != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"minimum\": ");
        _builder.append(this.minimum);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.exclusiveMinimum != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"exclusiveMinimum\": ");
        _builder.append(this.exclusiveMinimum);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.maximum != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"maximum\": ");
        _builder.append(this.maximum);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.exclusiveMaximum != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"exclusiveMaximum\": ");
        _builder.append(this.exclusiveMaximum);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * Does this number schema contain any keywords or is it empty
   */
  public boolean containsKeywords() {
    return (((((this.multipleOf != null) || 
      (this.minimum != null)) || 
      (this.exclusiveMinimum != null)) || 
      (this.maximum != null)) || 
      (this.exclusiveMaximum != null));
  }
  
  /**
   * Return a generator which generats a Number schema with all possible keywords
   */
  public static Gen<NumberSchema> fullNumberSchema() {
    final Function5<Optional<FloatInteger>, Optional<FloatInteger>, Optional<FloatInteger>, Optional<FloatInteger>, Optional<FloatInteger>, NumberSchema> _function = (Optional<FloatInteger> multipleOf, Optional<FloatInteger> minimum, Optional<FloatInteger> exclusiveMinimum, Optional<FloatInteger> maximum, Optional<FloatInteger> exclusiveMaximum) -> {
      NumberSchema _xblockexpression = null;
      {
        NumberSchema ns = new NumberSchema();
        boolean _isPresent = multipleOf.isPresent();
        if (_isPresent) {
          ns.multipleOf = multipleOf.get();
        }
        boolean _isPresent_1 = minimum.isPresent();
        if (_isPresent_1) {
          ns.minimum = minimum.get();
        }
        boolean _isPresent_2 = exclusiveMinimum.isPresent();
        if (_isPresent_2) {
          ns.exclusiveMinimum = exclusiveMinimum.get();
        }
        boolean _isPresent_3 = maximum.isPresent();
        if (_isPresent_3) {
          ns.maximum = maximum.get();
        }
        boolean _isPresent_4 = exclusiveMaximum.isPresent();
        if (_isPresent_4) {
          ns.exclusiveMaximum = exclusiveMaximum.get();
        }
        _xblockexpression = ns;
      }
      return _xblockexpression;
    };
    return NumberSchema.multipleOf().<Optional<FloatInteger>, Optional<FloatInteger>, Optional<FloatInteger>, Optional<FloatInteger>, NumberSchema>zip(
      NumberSchema.minimum(), 
      NumberSchema.exclusiveMinimum(), 
      NumberSchema.maximum(), 
      NumberSchema.exclusiveMaximum(), _function);
  }
  
  /**
   * Returns a generator for generating multipleOf
   */
  public static Gen<Optional<FloatInteger>> multipleOf() {
    final BiFunction<Number, Number, FloatInteger> _function = (Number i, Number d) -> {
      return new FloatInteger(i, d);
    };
    return Generate.<Number>oneOf(NumberSchema.integerNumber(), NumberSchema.floatNumber()).<FloatInteger>map(_function).toOptionals(75);
  }
  
  /**
   * Returns a generator for generating minimum
   */
  public static Gen<Optional<FloatInteger>> minimum() {
    final BiFunction<Number, Number, FloatInteger> _function = (Number i, Number d) -> {
      return new FloatInteger(i, d);
    };
    return Generate.<Number>oneOf(NumberSchema.integerNumber(), NumberSchema.floatNumber()).<FloatInteger>map(_function).toOptionals(75);
  }
  
  /**
   * Returns a generator for generating exclusiveMinimum
   */
  public static Gen<Optional<FloatInteger>> exclusiveMinimum() {
    final BiFunction<Number, Number, FloatInteger> _function = (Number i, Number d) -> {
      return new FloatInteger(i, d);
    };
    return Generate.<Number>oneOf(NumberSchema.integerNumber(), NumberSchema.floatNumber()).<FloatInteger>map(_function).toOptionals(75);
  }
  
  /**
   * Returns a generator for generating maximum
   */
  public static Gen<Optional<FloatInteger>> maximum() {
    final BiFunction<Number, Number, FloatInteger> _function = (Number i, Number d) -> {
      return new FloatInteger(i, d);
    };
    return Generate.<Number>oneOf(NumberSchema.integerNumber(), NumberSchema.floatNumber()).<FloatInteger>map(_function).toOptionals(75);
  }
  
  /**
   * Returns a generator for generating exclusiveMaximum
   */
  public static Gen<Optional<FloatInteger>> exclusiveMaximum() {
    final BiFunction<Number, Number, FloatInteger> _function = (Number i, Number d) -> {
      return new FloatInteger(i, d);
    };
    return Generate.<Number>oneOf(NumberSchema.integerNumber(), NumberSchema.floatNumber()).<FloatInteger>map(_function).toOptionals(75);
  }
  
  /**
   * Returns a generator for generating float numbers
   */
  public static Gen<Number> floatNumber() {
    Float _float = new Float(0);
    final Function<Float, Number> _function = (Float f) -> {
      return new Float((f).floatValue());
    };
    return Generate.<Float>frequency(
      Pair.<Integer, Gen<Float>>of(Integer.valueOf(2), SourceDSL.floats().between(0, Float.MAX_VALUE)), 
      Pair.<Integer, Gen<Float>>of(Integer.valueOf(1), Generate.<Float>constant(_float)), 
      Pair.<Integer, Gen<Float>>of(Integer.valueOf(1), Generate.<Float>constant(Float.valueOf(Float.MAX_VALUE)))).<Number>map(_function);
  }
  
  /**
   * Returns a generator for generating integer numbers
   */
  public static Gen<Number> integerNumber() {
    final Function<Integer, Number> _function = (Integer i) -> {
      return new Integer((i).intValue());
    };
    return Generate.<Integer>frequency(
      Pair.<Integer, Gen<Integer>>of(Integer.valueOf(2), SourceDSL.integers().between(1, (Integer.MAX_VALUE - 1))), 
      Pair.<Integer, Gen<Integer>>of(Integer.valueOf(1), Generate.<Integer>constant(Integer.valueOf(0))), 
      Pair.<Integer, Gen<Integer>>of(Integer.valueOf(1), Generate.<Integer>constant(Integer.valueOf(Integer.MAX_VALUE)))).<Number>map(_function);
  }
  
  @Pure
  public FloatInteger getMultipleOf() {
    return this.multipleOf;
  }
  
  public void setMultipleOf(final FloatInteger multipleOf) {
    this.multipleOf = multipleOf;
  }
  
  @Pure
  public FloatInteger getMinimum() {
    return this.minimum;
  }
  
  public void setMinimum(final FloatInteger minimum) {
    this.minimum = minimum;
  }
  
  @Pure
  public FloatInteger getExclusiveMinimum() {
    return this.exclusiveMinimum;
  }
  
  public void setExclusiveMinimum(final FloatInteger exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
  }
  
  @Pure
  public FloatInteger getMaximum() {
    return this.maximum;
  }
  
  public void setMaximum(final FloatInteger maximum) {
    this.maximum = maximum;
  }
  
  @Pure
  public FloatInteger getExclusiveMaximum() {
    return this.exclusiveMaximum;
  }
  
  public void setExclusiveMaximum(final FloatInteger exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
  }
}
