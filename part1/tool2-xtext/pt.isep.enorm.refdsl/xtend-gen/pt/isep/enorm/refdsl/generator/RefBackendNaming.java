package pt.isep.enorm.refdsl.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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

  public String apiCollectionPath(final String entityName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/api/");
    String _lowerCase = entityName.toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("s");
    return _builder.toString();
  }

  public String toPascalCase(final String raw) {
    String _xblockexpression = null;
    {
      if (((raw == null) || raw.isEmpty())) {
        return "RefApp";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[^A-Za-z0-9]+");
      final String[] parts = raw.split(_builder.toString());
      final Function1<String, Boolean> _function = (String p) -> {
        boolean _isEmpty = p.isEmpty();
        return Boolean.valueOf((!_isEmpty));
      };
      final Function1<String, String> _function_1 = (String p) -> {
        String _upperCase = p.substring(0, 1).toUpperCase();
        String _lowerCase = p.substring(1).toLowerCase();
        return (_upperCase + _lowerCase);
      };
      _xblockexpression = IterableExtensions.join(IterableExtensions.<String, String>map(IterableExtensions.<String>filter(((Iterable<String>)Conversions.doWrapArray(parts)), _function), _function_1));
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
