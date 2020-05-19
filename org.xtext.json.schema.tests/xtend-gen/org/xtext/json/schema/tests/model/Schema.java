package org.xtext.json.schema.tests.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;
import org.quicktheories.generators.SourceDSL;
import org.xtext.json.schema.tests.model.NumberSchema;

@SuppressWarnings("all")
public class Schema {
  @Accessors
  private NumberSchema ns;
  
  @Accessors
  private List<String> types;
  
  public Schema(final List<String> types) {
    this.types = types;
  }
  
  public CharSequence toCharSequence() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    {
      int _size = this.types.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        _builder.append("\t");
        _builder.append("\"type\": [");
        _builder.newLine();
        {
          boolean _hasElements = false;
          for(final String type : this.types) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t");
            }
            _builder.append("\t");
            _builder.append(type, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("]");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("\"type\": ");
        String _get = this.types.get(0);
        _builder.append(_get, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      if ((this.ns != null)) {
        _builder.append("\t");
        CharSequence _charSequence = this.ns.toCharSequence();
        _builder.append(_charSequence, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public String toString() {
    return this.toCharSequence().toString();
  }
  
  public static Gen<List<String>> types() {
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
  
  public static Gen<Schema> fullSchema() {
    final Function<List<String>, Schema> _function = (List<String> types) -> {
      return new Schema(types);
    };
    final BiFunction<Schema, NumberSchema, Schema> _function_1 = (Schema schema, NumberSchema ns) -> {
      Schema _xblockexpression = null;
      {
        if ((schema.types.contains("\"number\"") || schema.types.contains("\"integer\""))) {
          schema.ns = ns;
        }
        _xblockexpression = schema;
      }
      return _xblockexpression;
    };
    return Schema.types().<Schema>map(_function).<NumberSchema, Schema>zip(NumberSchema.fullNumberSchema(), _function_1);
  }
  
  @Pure
  public NumberSchema getNs() {
    return this.ns;
  }
  
  public void setNs(final NumberSchema ns) {
    this.ns = ns;
  }
  
  @Pure
  public List<String> getTypes() {
    return this.types;
  }
  
  public void setTypes(final List<String> types) {
    this.types = types;
  }
}
