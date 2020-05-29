package org.xtext.json.schema.tests.model;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;
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
  
  /**
   * Returns a CharSequence of defined JSON Schema string keywords.
   */
  public CharSequence toCharSequence() {
    boolean alreadyAdded = false;
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((this.format != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"format\": ");
        _builder.append(this.format);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.minLength != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"minLength\": ");
        _builder.append(this.minLength);
        _builder.newLineIfNotEmpty();
        {
          if (alreadyAdded = true) {
          }
        }
      }
    }
    {
      if ((this.maxLength != null)) {
        {
          if (alreadyAdded) {
            _builder.append(",");
          }
        }
        _builder.append("\"maxLength\": ");
        _builder.append(this.maxLength);
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
   * Does this string schema contain any keywords or is it empty
   */
  public boolean containsKeywords() {
    return (((this.format != null) || 
      (this.minLength != null)) || 
      (this.maxLength != null));
  }
  
  /**
   * Return a generator which generats a string schema with all possible keywords
   */
  public static Gen<StringSchema> fullStringSchema() {
    final BiFunction<Optional<String>, Optional<Integer>, StringSchema> _function = (Optional<String> format, Optional<Integer> minLength) -> {
      StringSchema _xblockexpression = null;
      {
        StringSchema ss = new StringSchema();
        boolean _isPresent = format.isPresent();
        if (_isPresent) {
          ss.format = format.get();
        }
        boolean _isPresent_1 = minLength.isPresent();
        if (_isPresent_1) {
          ss.minLength = minLength.get();
        }
        _xblockexpression = ss;
      }
      return _xblockexpression;
    };
    final BiFunction<StringSchema, Optional<Integer>, StringSchema> _function_1 = (StringSchema ss, Optional<Integer> maxLength) -> {
      StringSchema _xblockexpression = null;
      {
        boolean _isPresent = maxLength.isPresent();
        if (_isPresent) {
          ss.maxLength = maxLength.get();
        }
        _xblockexpression = ss;
      }
      return _xblockexpression;
    };
    return StringSchema.format().<Optional<Integer>, StringSchema>zip(
      StringSchema.minLength(), _function).<Optional<Integer>, StringSchema>zip(StringSchema.maxLength(), _function_1);
  }
  
  /**
   * Returns a generator for generating format
   */
  public static Gen<Optional<String>> format() {
    final Function<FormatTypes, String> _function = (FormatTypes f) -> {
      return f.getLiteral();
    };
    return SourceDSL.arbitrary().<FormatTypes>enumValues(FormatTypes.class).<String>map(_function).toOptionals(25);
  }
  
  /**
   * Returns a generator for generating minLength
   */
  public static Gen<Optional<Integer>> minLength() {
    Integer _integer = new Integer(1);
    return Generate.<Optional<Integer>>frequency(
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(2), SourceDSL.integers().between(1, (Integer.MAX_VALUE - 1)).toOptionals(50)), 
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(1), Generate.<Integer>constant(_integer).toOptionals(0)), 
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(1), Generate.<Integer>constant(Integer.valueOf(Integer.MAX_VALUE)).toOptionals(0)));
  }
  
  /**
   * Returns a generator for generating maxLength, does not care about a min length.
   */
  public static Gen<Optional<Integer>> maxLength() {
    Integer _integer = new Integer(1);
    return Generate.<Optional<Integer>>frequency(
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(2), SourceDSL.integers().between(1, (Integer.MAX_VALUE - 1)).toOptionals(50)), 
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(1), Generate.<Integer>constant(_integer).toOptionals(0)), 
      Pair.<Integer, Gen<Optional<Integer>>>of(Integer.valueOf(1), Generate.<Integer>constant(Integer.valueOf(Integer.MAX_VALUE)).toOptionals(0)));
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
