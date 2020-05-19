package org.xtext.json.schema.tests.model;

import java.util.function.BiFunction;
import java.util.function.Function;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.api.Function5;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;
import org.quicktheories.generators.SourceDSL;
import org.xtext.json.schema.tests.model.DoubleInteger;

@SuppressWarnings("all")
public class NumberSchema {
  @Accessors
  private DoubleInteger multipleOf;
  
  @Accessors
  private DoubleInteger minimum;
  
  @Accessors
  private DoubleInteger exclusiveMinimum;
  
  @Accessors
  private DoubleInteger maximum;
  
  @Accessors
  private DoubleInteger exclusiveMaximum;
  
  public NumberSchema() {
  }
  
  public CharSequence toCharSequence() {
    boolean alreadyAdded = false;
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((this.multipleOf != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
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
      if ((this.maximum != null)) {
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
  
  public static Gen<NumberSchema> fullNumberSchema() {
    final Function5<DoubleInteger, DoubleInteger, DoubleInteger, DoubleInteger, DoubleInteger, NumberSchema> _function = (DoubleInteger multipleOf, DoubleInteger minimum, DoubleInteger exclusiveMinimum, DoubleInteger maximum, DoubleInteger exclusiveMaximum) -> {
      NumberSchema _xblockexpression = null;
      {
        NumberSchema ns = new NumberSchema();
        ns.multipleOf = multipleOf;
        ns.minimum = minimum;
        ns.exclusiveMinimum = exclusiveMinimum;
        ns.maximum = maximum;
        ns.exclusiveMaximum = exclusiveMaximum;
        _xblockexpression = ns;
      }
      return _xblockexpression;
    };
    return NumberSchema.multipleOf().<DoubleInteger, DoubleInteger, DoubleInteger, DoubleInteger, NumberSchema>zip(NumberSchema.minimum(), NumberSchema.exclusiveMinimum(), NumberSchema.maximum(), 
      NumberSchema.exclusiveMaximum(), _function);
  }
  
  public static Gen<DoubleInteger> multipleOf() {
    final BiFunction<Number, Number, DoubleInteger> _function = (Number i, Number d) -> {
      return new DoubleInteger(i, d);
    };
    return Generate.<Number>oneOf(NumberSchema.integerNumber(), NumberSchema.doubleNumber()).<DoubleInteger>map(_function);
  }
  
  public static Gen<DoubleInteger> minimum() {
    final BiFunction<Number, Number, DoubleInteger> _function = (Number i, Number d) -> {
      return new DoubleInteger(i, d);
    };
    return Generate.<Number>oneOf(NumberSchema.integerNumber(), NumberSchema.doubleNumber()).<DoubleInteger>map(_function);
  }
  
  public static Gen<DoubleInteger> exclusiveMinimum() {
    final BiFunction<Number, Number, DoubleInteger> _function = (Number i, Number d) -> {
      return new DoubleInteger(i, d);
    };
    return Generate.<Number>oneOf(NumberSchema.integerNumber(), NumberSchema.doubleNumber()).<DoubleInteger>map(_function);
  }
  
  public static Gen<DoubleInteger> maximum() {
    final BiFunction<Number, Number, DoubleInteger> _function = (Number i, Number d) -> {
      return new DoubleInteger(i, d);
    };
    return Generate.<Number>oneOf(NumberSchema.integerNumber(), NumberSchema.doubleNumber()).<DoubleInteger>map(_function);
  }
  
  public static Gen<DoubleInteger> exclusiveMaximum() {
    final BiFunction<Number, Number, DoubleInteger> _function = (Number i, Number d) -> {
      return new DoubleInteger(i, d);
    };
    return Generate.<Number>oneOf(NumberSchema.integerNumber(), NumberSchema.doubleNumber()).<DoubleInteger>map(_function);
  }
  
  public static Gen<Number> doubleNumber() {
    final Function<Double, Number> _function = (Double d) -> {
      return new Double((d).doubleValue());
    };
    return SourceDSL.doubles().any().<Number>map(_function);
  }
  
  public static Gen<Number> integerNumber() {
    final Function<Integer, Number> _function = (Integer i) -> {
      return new Integer((i).intValue());
    };
    return SourceDSL.integers().allPositive().<Number>map(_function);
  }
  
  @Pure
  public DoubleInteger getMultipleOf() {
    return this.multipleOf;
  }
  
  public void setMultipleOf(final DoubleInteger multipleOf) {
    this.multipleOf = multipleOf;
  }
  
  @Pure
  public DoubleInteger getMinimum() {
    return this.minimum;
  }
  
  public void setMinimum(final DoubleInteger minimum) {
    this.minimum = minimum;
  }
  
  @Pure
  public DoubleInteger getExclusiveMinimum() {
    return this.exclusiveMinimum;
  }
  
  public void setExclusiveMinimum(final DoubleInteger exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
  }
  
  @Pure
  public DoubleInteger getMaximum() {
    return this.maximum;
  }
  
  public void setMaximum(final DoubleInteger maximum) {
    this.maximum = maximum;
  }
  
  @Pure
  public DoubleInteger getExclusiveMaximum() {
    return this.exclusiveMaximum;
  }
  
  public void setExclusiveMaximum(final DoubleInteger exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
  }
}
