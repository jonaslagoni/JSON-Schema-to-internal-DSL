package org.xtext.json.schema.tests.model;

import java.util.Collections;
import java.util.function.Function;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.api.Function3;
import org.quicktheories.api.Pair;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;
import org.quicktheories.generators.SourceDSL;
import org.xtext.json.schema.draft7.FormatTypes;

@SuppressWarnings("all")
public class StringSchema {
  @Accessors
  private Integer minLength;
  
  @Accessors
  private Integer maxLength;
  
  @Accessors
  private String format;
  
  @Accessors
  private String pattern;
  
  public StringSchema() {
  }
  
  public static Gen<StringSchema> fullStringSchema() {
    final Function3<String, Integer, Integer, StringSchema> _function = (String format, Integer minLength, Integer maxLength) -> {
      StringSchema _xblockexpression = null;
      {
        StringSchema ss = new StringSchema();
        ss.format = format;
        ss.minLength = minLength;
        ss.maxLength = maxLength;
        _xblockexpression = ss;
      }
      return _xblockexpression;
    };
    return StringSchema.format().<Integer, Integer, StringSchema>zip(
      StringSchema.minLength(), 
      StringSchema.maxLength(), _function);
  }
  
  public static Gen<String> format() {
    Integer _integer = new Integer(1);
    final Function<FormatTypes, String> _function = (FormatTypes f) -> {
      return f.getLiteral();
    };
    Pair<Integer, Gen<String>> doubleIntegerPair = Pair.<Integer, Gen<String>>of(_integer, SourceDSL.arbitrary().<FormatTypes>enumValues(FormatTypes.class).<String>map(_function));
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<String>> nullPair = Pair.<Integer, Gen<String>>of(_integer_1, Generate.<String>constant(null));
    return Generate.<String>frequency(doubleIntegerPair, nullPair);
  }
  
  public static Gen<Integer> minLength() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<Integer>> intPair = Pair.<Integer, Gen<Integer>>of(_integer, SourceDSL.integers().allPositive());
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<Integer>> nullPair = Pair.<Integer, Gen<Integer>>of(_integer_1, Generate.<Integer>constant(null));
    return Generate.<Integer>frequency(Collections.<Pair<Integer, Gen<Integer>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<Integer>>>newArrayList(intPair, nullPair)));
  }
  
  public static Gen<Integer> maxLength() {
    Integer _integer = new Integer(1);
    Pair<Integer, Gen<Integer>> intPair = Pair.<Integer, Gen<Integer>>of(_integer, SourceDSL.integers().allPositive());
    Integer _integer_1 = new Integer(1);
    Pair<Integer, Gen<Integer>> nullPair = Pair.<Integer, Gen<Integer>>of(_integer_1, Generate.<Integer>constant(null));
    return Generate.<Integer>frequency(Collections.<Pair<Integer, Gen<Integer>>>unmodifiableList(CollectionLiterals.<Pair<Integer, Gen<Integer>>>newArrayList(intPair, nullPair)));
  }
  
  @Pure
  public Integer getMinLength() {
    return this.minLength;
  }
  
  public void setMinLength(final Integer minLength) {
    this.minLength = minLength;
  }
  
  @Pure
  public Integer getMaxLength() {
    return this.maxLength;
  }
  
  public void setMaxLength(final Integer maxLength) {
    this.maxLength = maxLength;
  }
  
  @Pure
  public String getFormat() {
    return this.format;
  }
  
  public void setFormat(final String format) {
    this.format = format;
  }
  
  @Pure
  public String getPattern() {
    return this.pattern;
  }
  
  public void setPattern(final String pattern) {
    this.pattern = pattern;
  }
}
