package org.xtext.json.schema.tests.model;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;
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
