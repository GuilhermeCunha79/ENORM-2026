package pt.isep.enorm.refdsl.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import pt.isep.enorm.refdsl.refDsl.Attribute;
import pt.isep.enorm.refdsl.refDsl.PrimitiveType;
import pt.isep.enorm.refdsl.refDsl.RefModel;

/**
 * Naming and type-mapping helpers for REF → Spring Boot backend generation (P2 Activity 5).
 */
@SuppressWarnings("all")
public class RefBackendNaming {
  public String scenarioSlug(final RefModel model) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      if (((model.getName() == null) || model.getName().isEmpty())) {
        _xifexpression = "refapp";
      } else {
        _xifexpression = model.getName();
      }
      final String raw = _xifexpression;
      _xblockexpression = raw.toLowerCase().replaceAll("[^a-z0-9]", "");
    }
    return _xblockexpression;
  }

  public String scenarioPascal(final RefModel model) {
    String _xifexpression = null;
    if (((model.getName() == null) || model.getName().isEmpty())) {
      _xifexpression = "RefApp";
    } else {
      _xifexpression = model.getName();
    }
    return this.toPascalCase(_xifexpression);
  }

  public String basePackage(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pt.isep.enorm.ref.");
    String _scenarioSlug = this.scenarioSlug(model);
    _builder.append(_scenarioSlug);
    return _builder.toString();
  }

  public String artifactId(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    String _scenarioSlug = this.scenarioSlug(model);
    _builder.append(_scenarioSlug);
    _builder.append("-backend");
    return _builder.toString();
  }

  public int serverPort(final RefModel model) {
    int _switchResult = (int) 0;
    String _scenarioSlug = this.scenarioSlug(model);
    if (_scenarioSlug != null) {
      switch (_scenarioSlug) {
        case "amazon":
          _switchResult = 8081;
          break;
        case "reddit":
          _switchResult = 8083;
          break;
        case "youtube":
          _switchResult = 8082;
          break;
        default:
          _switchResult = 8090;
          break;
      }
    } else {
      _switchResult = 8090;
    }
    return _switchResult;
  }

  public String javaType(final Attribute attribute) {
    String _switchResult = null;
    PrimitiveType _type = attribute.getType();
    if (_type != null) {
      switch (_type) {
        case TEXT:
          _switchResult = "String";
          break;
        case NUMBER:
          _switchResult = "java.math.BigDecimal";
          break;
        case BOOLEAN:
          _switchResult = "Boolean";
          break;
        case DATE:
          _switchResult = "java.time.LocalDate";
          break;
        case DATETIME:
          _switchResult = "java.time.Instant";
          break;
        case IMAGE:
          _switchResult = "String";
          break;
        case VIDEO:
          _switchResult = "String";
          break;
        case URL:
          _switchResult = "String";
          break;
        default:
          _switchResult = "String";
          break;
      }
    } else {
      _switchResult = "String";
    }
    return _switchResult;
  }

  public String columnDefinition(final Attribute attribute) {
    String _switchResult = null;
    PrimitiveType _type = attribute.getType();
    if (_type != null) {
      switch (_type) {
        case TEXT:
          _switchResult = "length = 2000";
          break;
        case NUMBER:
          _switchResult = "";
          break;
        case BOOLEAN:
          _switchResult = "";
          break;
        case DATE:
          _switchResult = "";
          break;
        case DATETIME:
          _switchResult = "";
          break;
        default:
          _switchResult = "length = 500";
          break;
      }
    } else {
      _switchResult = "length = 500";
    }
    return _switchResult;
  }

  public String toKebabCase(final String raw) {
    String _xblockexpression = null;
    {
      final String pascal = this.toPascalCase(raw);
      final StringBuilder sb = new StringBuilder();
      int _length = pascal.length();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          final char c = pascal.charAt((i).intValue());
          if ((Character.isUpperCase(c) && ((i).intValue() > 0))) {
            sb.append("-");
          }
          sb.append(Character.toLowerCase(c));
        }
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }

  public String apiCollectionPath(final String entityName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/api/");
    String _kebabCase = this.toKebabCase(entityName);
    _builder.append(_kebabCase);
    _builder.append("s");
    return _builder.toString();
  }

  public String toPascalCase(final String raw) {
    String _xblockexpression = null;
    {
      if (((raw == null) || raw.isEmpty())) {
        return "RefApp";
      }
      final StringBuilder result = new StringBuilder();
      String[] _split = raw.split("[^A-Za-z0-9]+");
      for (final String word : _split) {
        boolean _isEmpty = word.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          String[] _split_1 = word.split("(?<=[a-z0-9])(?=[A-Z])");
          for (final String token : _split_1) {
            boolean _isEmpty_1 = token.isEmpty();
            boolean _not_1 = (!_isEmpty_1);
            if (_not_1) {
              result.append(Character.toUpperCase(token.charAt(0)));
              result.append(token.substring(1));
            }
          }
        }
      }
      String _xifexpression = null;
      int _length = result.length();
      boolean _tripleEquals = (_length == 0);
      if (_tripleEquals) {
        _xifexpression = "RefApp";
      } else {
        _xifexpression = result.toString();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public String tableName(final String entityName) {
    StringConcatenation _builder = new StringConcatenation();
    String _lowerCase = entityName.toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("s");
    return _builder.toString();
  }
}
