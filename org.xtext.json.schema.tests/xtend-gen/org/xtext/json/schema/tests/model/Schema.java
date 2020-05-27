package org.xtext.json.schema.tests.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;
import org.quicktheories.api.Function5;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.SourceDSL;
import org.xtext.json.schema.draft7.JsonTypes;
import org.xtext.json.schema.tests.model.ListSchema;
import org.xtext.json.schema.tests.model.NumberSchema;
import org.xtext.json.schema.tests.model.ObjectSchema;
import org.xtext.json.schema.tests.model.StringSchema;

@SuppressWarnings("all")
public class Schema {
  @Accessors
  private ObjectSchema objectSchema;
  
  @Accessors
  private StringSchema stringSchema;
  
  @Accessors
  private ListSchema listSchema;
  
  @Accessors
  private NumberSchema numberSchema;
  
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
        _builder.append("],");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("\"type\": ");
        String _get = this.types.get(0);
        _builder.append(_get, "\t");
        _builder.append(",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      if ((this.objectSchema != null)) {
        _builder.append("\t");
        CharSequence _charSequence = this.objectSchema.toCharSequence();
        _builder.append(_charSequence, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((this.stringSchema != null)) {
        _builder.append("\t");
        CharSequence _charSequence_1 = this.stringSchema.toCharSequence();
        _builder.append(_charSequence_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((this.listSchema != null)) {
        _builder.append("\t");
        CharSequence _charSequence_2 = this.listSchema.toCharSequence();
        _builder.append(_charSequence_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    {
      if ((this.numberSchema != null)) {
        _builder.append("\t");
        CharSequence _charSequence_3 = this.numberSchema.toCharSequence();
        _builder.append(_charSequence_3, "\t");
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
    final Function<JsonTypes, String> _function = (JsonTypes t) -> {
      return t.getLiteral();
    };
    final Function<List<String>, List<String>> _function_1 = (List<String> types) -> {
      HashSet<String> _hashSet = new HashSet<String>(types);
      return new ArrayList<String>(_hashSet);
    };
    return SourceDSL.lists().<String>of(
      SourceDSL.arbitrary().<JsonTypes>enumValues(JsonTypes.class).<String>map(_function)).ofSizeBetween(1, 6).<List<String>>map(_function_1);
  }
  
  public static Gen<Schema> fullSchema() {
    final Function<List<String>, Schema> _function = (List<String> types) -> {
      return new Schema(types);
    };
    final Function5<Schema, ObjectSchema, StringSchema, ListSchema, NumberSchema, Schema> _function_1 = (Schema schema, ObjectSchema os, StringSchema ss, ListSchema ls, NumberSchema ns) -> {
      Schema _xblockexpression = null;
      {
        boolean _contains = schema.types.contains(JsonTypes.STRING.getLiteral());
        if (_contains) {
          schema.stringSchema = ss;
        }
        boolean _contains_1 = schema.types.contains(JsonTypes.OBJECT.getLiteral());
        if (_contains_1) {
          schema.objectSchema = os;
        }
        boolean _contains_2 = schema.types.contains(JsonTypes.ARRAY.getLiteral());
        if (_contains_2) {
          schema.listSchema = ls;
        }
        if ((schema.types.contains(JsonTypes.NUMBER.getLiteral()) || schema.types.contains(JsonTypes.INTEGER.getLiteral()))) {
          schema.numberSchema = ns;
        }
        _xblockexpression = schema;
      }
      return _xblockexpression;
    };
    return Schema.types().<Schema>map(_function).<ObjectSchema, StringSchema, ListSchema, NumberSchema, Schema>zip(
      ObjectSchema.fullValidObjectSchema(), 
      StringSchema.fullStringSchema(), 
      ListSchema.fullListSchema(), 
      NumberSchema.fullNumberSchema(), _function_1);
  }
  
  @Pure
  public ObjectSchema getObjectSchema() {
    return this.objectSchema;
  }
  
  public void setObjectSchema(final ObjectSchema objectSchema) {
    this.objectSchema = objectSchema;
  }
  
  @Pure
  public StringSchema getStringSchema() {
    return this.stringSchema;
  }
  
  public void setStringSchema(final StringSchema stringSchema) {
    this.stringSchema = stringSchema;
  }
  
  @Pure
  public ListSchema getListSchema() {
    return this.listSchema;
  }
  
  public void setListSchema(final ListSchema listSchema) {
    this.listSchema = listSchema;
  }
  
  @Pure
  public NumberSchema getNumberSchema() {
    return this.numberSchema;
  }
  
  public void setNumberSchema(final NumberSchema numberSchema) {
    this.numberSchema = numberSchema;
  }
  
  @Pure
  public List<String> getTypes() {
    return this.types;
  }
  
  public void setTypes(final List<String> types) {
    this.types = types;
  }
}
