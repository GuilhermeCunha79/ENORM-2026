package pt.isep.enorm.refdsl.generator;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import pt.isep.enorm.refdsl.refDsl.Attribute;
import pt.isep.enorm.refdsl.refDsl.AuthorizationRule;
import pt.isep.enorm.refdsl.refDsl.ContextType;
import pt.isep.enorm.refdsl.refDsl.FeedbackDefinition;
import pt.isep.enorm.refdsl.refDsl.FeedbackKind;
import pt.isep.enorm.refdsl.refDsl.RatingPolicy;
import pt.isep.enorm.refdsl.refDsl.RefModel;
import pt.isep.enorm.refdsl.refDsl.ResourceRelation;
import pt.isep.enorm.refdsl.refDsl.ResourceType;
import pt.isep.enorm.refdsl.refDsl.UserType;

/**
 * Generates a Spring Boot backend skeleton from a REF model (P2 Activity 5 / 6).
 * Output: generated-backend/&lt;scenario&gt;/ (Maven project, Generation Gap packages).
 */
@SuppressWarnings("all")
public class RefBackendGenerator {
  private final RefBackendNaming naming = new RefBackendNaming();

  public void generate(final RefModel model, final IFileSystemAccess2 fsa) {
    final String slug = this.naming.scenarioSlug(model);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("generated-backend/");
    _builder.append(slug);
    final String root = _builder.toString();
    final String pkg = this.naming.basePackage(model);
    final String app = this.naming.scenarioPascal(model);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(root);
    _builder_1.append("/pom.xml");
    this.write(fsa, _builder_1.toString(), this.pom(model));
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append(root);
    _builder_2.append("/README.md");
    this.write(fsa, _builder_2.toString(), this.readme(model, root));
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append(root);
    _builder_3.append("/GENERATION_MANIFEST.txt");
    this.write(fsa, _builder_3.toString(), this.manifest(model));
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append(root);
    _builder_4.append("/src/main/resources/application.properties");
    this.write(fsa, _builder_4.toString(), this.applicationProperties(model));
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append(root);
    _builder_5.append("/src/main/java/");
    String _replace = pkg.replace(".", "/");
    _builder_5.append(_replace);
    _builder_5.append("/");
    _builder_5.append(app);
    _builder_5.append("BackendApplication.java");
    this.write(fsa, _builder_5.toString(), this.applicationClass(model));
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append(root);
    _builder_6.append("/src/main/java/");
    String _replace_1 = pkg.replace(".", "/");
    _builder_6.append(_replace_1);
    _builder_6.append("/domain/enums/Role.java");
    this.write(fsa, _builder_6.toString(), this.roleEnum(model));
    StringConcatenation _builder_7 = new StringConcatenation();
    _builder_7.append(root);
    _builder_7.append("/src/main/java/");
    String _replace_2 = pkg.replace(".", "/");
    _builder_7.append(_replace_2);
    _builder_7.append("/domain/generated/Generated");
    _builder_7.append(app);
    _builder_7.append("User.java");
    this.write(fsa, _builder_7.toString(), this.generatedUser(model));
    StringConcatenation _builder_8 = new StringConcatenation();
    _builder_8.append(root);
    _builder_8.append("/src/main/java/");
    String _replace_3 = pkg.replace(".", "/");
    _builder_8.append(_replace_3);
    _builder_8.append("/domain/");
    _builder_8.append(app);
    _builder_8.append("User.java");
    this.writeManualOnce(fsa, _builder_8.toString(), this.userSubclass(model));
    StringConcatenation _builder_9 = new StringConcatenation();
    _builder_9.append(root);
    _builder_9.append("/src/main/java/");
    String _replace_4 = pkg.replace(".", "/");
    _builder_9.append(_replace_4);
    _builder_9.append("/repository/generated/Generated");
    _builder_9.append(app);
    _builder_9.append("UserRepository.java");
    this.write(fsa, _builder_9.toString(), this.generatedUserRepository(model));
    StringConcatenation _builder_10 = new StringConcatenation();
    _builder_10.append(root);
    _builder_10.append("/src/main/java/");
    String _replace_5 = pkg.replace(".", "/");
    _builder_10.append(_replace_5);
    _builder_10.append("/repository/");
    _builder_10.append(app);
    _builder_10.append("UserRepository.java");
    this.writeManualOnce(fsa, _builder_10.toString(), this.userRepositorySubclass(model));
    EList<ResourceType> _resourceTypes = model.getResourceTypes();
    for (final ResourceType rt : _resourceTypes) {
      this.generateResource(model, fsa, root, pkg, rt);
    }
    EList<FeedbackDefinition> _feedbackDefinitions = model.getFeedbackDefinitions();
    for (final FeedbackDefinition fd : _feedbackDefinitions) {
      this.generateFeedback(model, fsa, root, pkg, fd);
    }
    final String path = pkg.replace(".", "/");
    EList<ContextType> _contextTypes = model.getContextTypes();
    for (final ContextType ct : _contextTypes) {
      {
        final String cName = this.naming.toPascalCase(ct.getName());
        StringConcatenation _builder_11 = new StringConcatenation();
        String _lowerCase = cName.toLowerCase();
        _builder_11.append(_lowerCase);
        _builder_11.append("s");
        StringConcatenation _builder_12 = new StringConcatenation();
        _builder_12.append("/api/contexts/");
        String _kebabCase = this.naming.toKebabCase(ct.getName());
        _builder_12.append(_kebabCase);
        this.writeGovernance(fsa, root, path, model, cName, _builder_11.toString(), _builder_12.toString(), Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("name", "kind")));
      }
    }
    this.generateGovernance(model, fsa, root, pkg);
    StringConcatenation _builder_11 = new StringConcatenation();
    _builder_11.append(root);
    _builder_11.append("/src/main/java/");
    String _replace_6 = pkg.replace(".", "/");
    _builder_11.append(_replace_6);
    _builder_11.append("/security/SecurityConfiguration.java");
    this.write(fsa, _builder_11.toString(), this.securityConfig(model));
    StringConcatenation _builder_12 = new StringConcatenation();
    _builder_12.append(root);
    _builder_12.append("/src/main/java/");
    String _replace_7 = pkg.replace(".", "/");
    _builder_12.append(_replace_7);
    _builder_12.append("/security/JwtService.java");
    this.write(fsa, _builder_12.toString(), this.jwtService(model));
    StringConcatenation _builder_13 = new StringConcatenation();
    _builder_13.append(root);
    _builder_13.append("/src/main/java/");
    String _replace_8 = pkg.replace(".", "/");
    _builder_13.append(_replace_8);
    _builder_13.append("/security/AppUserDetailsService.java");
    this.write(fsa, _builder_13.toString(), this.appUserDetailsService(model));
    StringConcatenation _builder_14 = new StringConcatenation();
    _builder_14.append(root);
    _builder_14.append("/src/main/java/");
    String _replace_9 = pkg.replace(".", "/");
    _builder_14.append(_replace_9);
    _builder_14.append("/security/JwtAuthenticationFilter.java");
    this.write(fsa, _builder_14.toString(), this.jwtAuthenticationFilter(model));
    StringConcatenation _builder_15 = new StringConcatenation();
    _builder_15.append(root);
    _builder_15.append("/src/main/java/");
    String _replace_10 = pkg.replace(".", "/");
    _builder_15.append(_replace_10);
    _builder_15.append("/dto/RegisterRequest.java");
    this.write(fsa, _builder_15.toString(), this.registerRequestDto(model));
    StringConcatenation _builder_16 = new StringConcatenation();
    _builder_16.append(root);
    _builder_16.append("/src/main/java/");
    String _replace_11 = pkg.replace(".", "/");
    _builder_16.append(_replace_11);
    _builder_16.append("/dto/LoginRequest.java");
    this.write(fsa, _builder_16.toString(), this.loginRequestDto(model));
    StringConcatenation _builder_17 = new StringConcatenation();
    _builder_17.append(root);
    _builder_17.append("/src/main/java/");
    String _replace_12 = pkg.replace(".", "/");
    _builder_17.append(_replace_12);
    _builder_17.append("/dto/AuthResponse.java");
    this.write(fsa, _builder_17.toString(), this.authResponseDto(model));
    StringConcatenation _builder_18 = new StringConcatenation();
    _builder_18.append(root);
    _builder_18.append("/src/main/java/");
    String _replace_13 = pkg.replace(".", "/");
    _builder_18.append(_replace_13);
    _builder_18.append("/service/generated/GeneratedAuthenticationService.java");
    this.write(fsa, _builder_18.toString(), this.generatedAuthService(model));
    StringConcatenation _builder_19 = new StringConcatenation();
    _builder_19.append(root);
    _builder_19.append("/src/main/java/");
    String _replace_14 = pkg.replace(".", "/");
    _builder_19.append(_replace_14);
    _builder_19.append("/service/AuthenticationService.java");
    this.writeManualOnce(fsa, _builder_19.toString(), this.authServiceSubclass(model));
    StringConcatenation _builder_20 = new StringConcatenation();
    _builder_20.append(root);
    _builder_20.append("/src/main/java/");
    String _replace_15 = pkg.replace(".", "/");
    _builder_20.append(_replace_15);
    _builder_20.append("/web/generated/GeneratedAuthenticationController.java");
    this.write(fsa, _builder_20.toString(), this.generatedAuthController(model));
    StringConcatenation _builder_21 = new StringConcatenation();
    _builder_21.append(root);
    _builder_21.append("/src/main/java/");
    String _replace_16 = pkg.replace(".", "/");
    _builder_21.append(_replace_16);
    _builder_21.append("/web/AuthenticationController.java");
    this.writeManualOnce(fsa, _builder_21.toString(), this.authControllerSubclass(model));
    StringConcatenation _builder_22 = new StringConcatenation();
    _builder_22.append(root);
    _builder_22.append("/src/main/java/");
    String _replace_17 = pkg.replace(".", "/");
    _builder_22.append(_replace_17);
    _builder_22.append("/web/error/ApiError.java");
    this.write(fsa, _builder_22.toString(), this.apiError(model));
    StringConcatenation _builder_23 = new StringConcatenation();
    _builder_23.append(root);
    _builder_23.append("/src/main/java/");
    String _replace_18 = pkg.replace(".", "/");
    _builder_23.append(_replace_18);
    _builder_23.append("/web/error/ApiExceptionHandler.java");
    this.write(fsa, _builder_23.toString(), this.apiExceptionHandler(model));
    StringConcatenation _builder_24 = new StringConcatenation();
    _builder_24.append(root);
    _builder_24.append("/src/test/java/");
    String _replace_19 = pkg.replace(".", "/");
    _builder_24.append(_replace_19);
    _builder_24.append("/");
    _builder_24.append(app);
    _builder_24.append("BackendApplicationTests.java");
    this.write(fsa, _builder_24.toString(), this.applicationTest(model));
  }

  public void generateResource(final RefModel model, final IFileSystemAccess2 fsa, final String root, final String pkg, final ResourceType rt) {
    final String entity = this.naming.toPascalCase(rt.getName());
    final String path = pkg.replace(".", "/");
    final Function1<ResourceRelation, Boolean> _function = (ResourceRelation r) -> {
      ResourceType _source = r.getSource();
      return Boolean.valueOf((_source == rt));
    };
    final List<ResourceRelation> outgoing = IterableExtensions.<ResourceRelation>toList(IterableExtensions.<ResourceRelation>filter(model.getResourceRelations(), _function));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(root);
    _builder.append("/src/main/java/");
    _builder.append(path);
    _builder.append("/domain/generated/Generated");
    _builder.append(entity);
    _builder.append(".java");
    this.write(fsa, _builder.toString(), this.generatedResourceEntity(model, rt, entity, outgoing));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(root);
    _builder_1.append("/src/main/java/");
    _builder_1.append(path);
    _builder_1.append("/domain/");
    _builder_1.append(entity);
    _builder_1.append(".java");
    this.writeManualOnce(fsa, _builder_1.toString(), this.entitySubclass(model, entity));
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append(root);
    _builder_2.append("/src/main/java/");
    _builder_2.append(path);
    _builder_2.append("/repository/generated/Generated");
    _builder_2.append(entity);
    _builder_2.append("Repository.java");
    this.write(fsa, _builder_2.toString(), this.generatedRepository(model, entity));
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append(root);
    _builder_3.append("/src/main/java/");
    _builder_3.append(path);
    _builder_3.append("/repository/");
    _builder_3.append(entity);
    _builder_3.append("Repository.java");
    this.writeManualOnce(fsa, _builder_3.toString(), this.repositorySubclass(model, entity));
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append(root);
    _builder_4.append("/src/main/java/");
    _builder_4.append(path);
    _builder_4.append("/service/generated/Generated");
    _builder_4.append(entity);
    _builder_4.append("Service.java");
    this.write(fsa, _builder_4.toString(), this.generatedResourceService(model, entity));
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append(root);
    _builder_5.append("/src/main/java/");
    _builder_5.append(path);
    _builder_5.append("/service/");
    _builder_5.append(entity);
    _builder_5.append("Service.java");
    this.writeManualOnce(fsa, _builder_5.toString(), this.serviceSubclass(model, entity));
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append(root);
    _builder_6.append("/src/main/java/");
    _builder_6.append(path);
    _builder_6.append("/web/generated/Generated");
    _builder_6.append(entity);
    _builder_6.append("Controller.java");
    this.write(fsa, _builder_6.toString(), this.generatedResourceController(model, entity));
    StringConcatenation _builder_7 = new StringConcatenation();
    _builder_7.append(root);
    _builder_7.append("/src/main/java/");
    _builder_7.append(path);
    _builder_7.append("/web/");
    _builder_7.append(entity);
    _builder_7.append("Controller.java");
    this.writeManualOnce(fsa, _builder_7.toString(), this.resourceControllerSubclass(model, entity));
  }

  public void generateFeedback(final RefModel model, final IFileSystemAccess2 fsa, final String root, final String pkg, final FeedbackDefinition fd) {
    final String entity = this.naming.toPascalCase(fd.getName());
    final String path = pkg.replace(".", "/");
    String _xifexpression = null;
    ResourceType _subjectResource = fd.getSubjectResource();
    boolean _tripleNotEquals = (_subjectResource != null);
    if (_tripleNotEquals) {
      _xifexpression = this.naming.toPascalCase(fd.getSubjectResource().getName());
    } else {
      _xifexpression = null;
    }
    final String subject = _xifexpression;
    String _xifexpression_1 = null;
    FeedbackDefinition _subjectFeedback = fd.getSubjectFeedback();
    boolean _tripleNotEquals_1 = (_subjectFeedback != null);
    if (_tripleNotEquals_1) {
      _xifexpression_1 = this.naming.toPascalCase(fd.getSubjectFeedback().getName());
    } else {
      _xifexpression_1 = null;
    }
    final String parent = _xifexpression_1;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(root);
    _builder.append("/src/main/java/");
    _builder.append(path);
    _builder.append("/domain/generated/Generated");
    _builder.append(entity);
    _builder.append(".java");
    this.write(fsa, _builder.toString(), this.generatedFeedbackEntity(model, fd, entity, subject, parent));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(root);
    _builder_1.append("/src/main/java/");
    _builder_1.append(path);
    _builder_1.append("/domain/");
    _builder_1.append(entity);
    _builder_1.append(".java");
    this.writeManualOnce(fsa, _builder_1.toString(), this.entitySubclass(model, entity));
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append(root);
    _builder_2.append("/src/main/java/");
    _builder_2.append(path);
    _builder_2.append("/repository/generated/Generated");
    _builder_2.append(entity);
    _builder_2.append("Repository.java");
    this.write(fsa, _builder_2.toString(), this.generatedFeedbackRepository(model, fd, entity, subject, parent));
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append(root);
    _builder_3.append("/src/main/java/");
    _builder_3.append(path);
    _builder_3.append("/repository/");
    _builder_3.append(entity);
    _builder_3.append("Repository.java");
    this.writeManualOnce(fsa, _builder_3.toString(), this.repositorySubclass(model, entity));
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append(root);
    _builder_4.append("/src/main/java/");
    _builder_4.append(path);
    _builder_4.append("/service/generated/Generated");
    _builder_4.append(entity);
    _builder_4.append("Service.java");
    this.write(fsa, _builder_4.toString(), this.generatedFeedbackService(model, fd, entity, subject, parent));
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append(root);
    _builder_5.append("/src/main/java/");
    _builder_5.append(path);
    _builder_5.append("/service/");
    _builder_5.append(entity);
    _builder_5.append("Service.java");
    this.writeManualOnce(fsa, _builder_5.toString(), this.serviceSubclass(model, entity));
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.append(root);
    _builder_6.append("/src/main/java/");
    _builder_6.append(path);
    _builder_6.append("/web/generated/Generated");
    _builder_6.append(entity);
    _builder_6.append("Controller.java");
    this.write(fsa, _builder_6.toString(), this.generatedFeedbackController(model, entity));
    StringConcatenation _builder_7 = new StringConcatenation();
    _builder_7.append(root);
    _builder_7.append("/src/main/java/");
    _builder_7.append(path);
    _builder_7.append("/web/");
    _builder_7.append(entity);
    _builder_7.append("Controller.java");
    this.writeManualOnce(fsa, _builder_7.toString(), this.feedbackControllerSubclass(model, entity));
  }

  public void write(final IFileSystemAccess2 fsa, final String path, final String content) {
    fsa.generateFile(path, content);
  }

  /**
   * Generation Gap: emit manual subclass/interface only when missing or still the empty stub.
   * Do not rely on {@link IFileSystemAccess2#isFile} alone — it may report true while the file
   * is absent on disk (stale generator state), which leaves Generated* types without their manual type.
   */
  public void writeManualOnce(final IFileSystemAccess2 fsa, final String path, final String content) {
    boolean _shouldPreserveExistingManualFile = this.shouldPreserveExistingManualFile(fsa, path);
    boolean _not = (!_shouldPreserveExistingManualFile);
    if (_not) {
      fsa.generateFile(path, content);
    }
  }

  public boolean shouldPreserveExistingManualFile(final IFileSystemAccess2 fsa, final String path) {
    try {
      boolean _isFile = fsa.isFile(path);
      boolean _not = (!_isFile);
      if (_not) {
        return false;
      }
      final CharSequence existingText = fsa.readTextFile(path);
      if ((existingText == null)) {
        return false;
      }
      final String existing = existingText.toString();
      boolean _isEmpty = existing.trim().isEmpty();
      if (_isEmpty) {
        return false;
      }
      boolean _isDefaultManualStub = this.isDefaultManualStub(existing);
      return (!_isDefaultManualStub);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  public boolean isDefaultManualStub(final String source) {
    boolean _xblockexpression = false;
    {
      boolean _contains = source.contains("Manual extension point");
      boolean _not = (!_contains);
      if (_not) {
        return false;
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/\\*[\\s\\S]*?\\*/");
      _xblockexpression = source.replaceAll(_builder.toString(), "").replaceAll("//.*", "").trim().matches(
        "(?s).*\\{\\s*\\}\\s*$");
    }
    return _xblockexpression;
  }

  public String pom(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\"");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<modelVersion>4.0.0</modelVersion>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<parent>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<artifactId>spring-boot-starter-parent</artifactId>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<version>3.4.5</version>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<relativePath/>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</parent>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<groupId>pt.isep.enorm.ref</groupId>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<artifactId>");
    String _artifactId = this.naming.artifactId(model);
    _builder.append(_artifactId, "    ");
    _builder.append("</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<version>0.0.1-SNAPSHOT</version>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<description>Generated REF backend for ");
    String _name = model.getName();
    _builder.append(_name, "    ");
    _builder.append("</description>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<properties>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<java.version>21</java.version>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</properties>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<dependencies>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<artifactId>spring-boot-starter-web</artifactId>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<artifactId>spring-boot-starter-data-jpa</artifactId>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<artifactId>spring-boot-starter-validation</artifactId>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<artifactId>spring-boot-starter-security</artifactId>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<groupId>io.jsonwebtoken</groupId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<artifactId>jjwt-api</artifactId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<version>0.12.6</version>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<groupId>io.jsonwebtoken</groupId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<artifactId>jjwt-impl</artifactId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<version>0.12.6</version>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<scope>runtime</scope>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<groupId>io.jsonwebtoken</groupId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<artifactId>jjwt-jackson</artifactId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<version>0.12.6</version>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<scope>runtime</scope>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<groupId>com.h2database</groupId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<artifactId>h2</artifactId>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<artifactId>spring-boot-starter-test</artifactId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</dependencies>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<build>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<plugins>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<artifactId>spring-boot-maven-plugin</artifactId>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</plugins>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</build>");
    _builder.newLine();
    _builder.append("</project>");
    _builder.newLine();
    return _builder.toString();
  }

  public String applicationProperties(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("spring.application.name=");
    String _artifactId = this.naming.artifactId(model);
    _builder.append(_artifactId);
    _builder.newLineIfNotEmpty();
    _builder.append("server.port=");
    int _serverPort = this.naming.serverPort(model);
    _builder.append(_serverPort);
    _builder.newLineIfNotEmpty();
    _builder.append("spring.datasource.url=jdbc:h2:file:./data/");
    String _scenarioSlug = this.naming.scenarioSlug(model);
    _builder.append(_scenarioSlug);
    _builder.append("appdb");
    _builder.newLineIfNotEmpty();
    _builder.append("spring.datasource.driver-class-name=org.h2.Driver");
    _builder.newLine();
    _builder.append("spring.datasource.username=sa");
    _builder.newLine();
    _builder.append("spring.datasource.password=");
    _builder.newLine();
    _builder.append("spring.h2.console.enabled=true");
    _builder.newLine();
    _builder.append("spring.h2.console.path=/h2-console");
    _builder.newLine();
    _builder.append("spring.jpa.hibernate.ddl-auto=update");
    _builder.newLine();
    _builder.append("spring.jpa.open-in-view=false");
    _builder.newLine();
    return _builder.toString();
  }

  public String applicationClass(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.boot.SpringApplication;");
    _builder.newLine();
    _builder.append("import org.springframework.boot.autoconfigure.SpringBootApplication;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@SpringBootApplication");
    _builder.newLine();
    _builder.append("public class ");
    String _scenarioPascal = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal);
    _builder.append("BackendApplication {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("SpringApplication.run(");
    String _scenarioPascal_1 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_1, "        ");
    _builder.append("BackendApplication.class, args);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String roleEnum(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".domain.enums;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public enum Role {");
    _builder.newLine();
    String _roleEnumLiterals = this.roleEnumLiterals(model);
    _builder.append(_roleEnumLiterals);
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String roleEnumLiterals(final RefModel model) {
    String _xblockexpression = null;
    {
      final LinkedHashSet<String> kinds = new LinkedHashSet<String>();
      EList<UserType> _userTypes = model.getUserTypes();
      for (final UserType ut : _userTypes) {
        kinds.add(ut.getKind().getLiteral());
      }
      boolean _isEmpty = kinds.isEmpty();
      if (_isEmpty) {
        kinds.add("GENERIC");
      }
      final StringBuilder sb = new StringBuilder();
      for (final String k : kinds) {
        {
          int _length = sb.length();
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            sb.append(",\n");
          }
          sb.append("    ").append(k);
        }
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }

  public boolean hasRequiredAttributes(final ResourceType rt) {
    boolean _xblockexpression = false;
    {
      EList<Attribute> _attributes = rt.getAttributes();
      for (final Attribute a : _attributes) {
        boolean _isRequired = a.isRequired();
        if (_isRequired) {
          return true;
        }
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }

  public boolean feedbackHasText(final FeedbackDefinition fd) {
    boolean _xblockexpression = false;
    {
      final FeedbackKind k = fd.getType().getKind();
      final boolean isTextKind = ((k == FeedbackKind.COMMENT) || (k == FeedbackKind.REVIEW));
      _xblockexpression = (isTextKind && fd.getType().isAllowsText());
    }
    return _xblockexpression;
  }

  public boolean feedbackHasRating(final FeedbackDefinition fd) {
    return (fd.getType().isHasRating() || (fd.getRating() != null));
  }

  public boolean feedbackIsVote(final FeedbackDefinition fd) {
    boolean _xblockexpression = false;
    {
      final FeedbackKind k = fd.getType().getKind();
      _xblockexpression = ((k == FeedbackKind.VOTE) || (k == FeedbackKind.REACTION));
    }
    return _xblockexpression;
  }

  public boolean feedbackIsReport(final FeedbackDefinition fd) {
    FeedbackKind _kind = fd.getType().getKind();
    return (_kind == FeedbackKind.REPORT);
  }

  public String columnAnnotation(final Attribute a) {
    String _xblockexpression = null;
    {
      final String extra = this.naming.columnDefinition(a);
      String _xifexpression = null;
      if (((extra == null) || extra.isEmpty())) {
        boolean _isRequired = a.isRequired();
        boolean _not = (!_isRequired);
        String _plus = ("@Column(nullable = " + Boolean.valueOf(_not));
        _xifexpression = (_plus + ")");
      } else {
        boolean _isRequired_1 = a.isRequired();
        boolean _not_1 = (!_isRequired_1);
        String _plus_1 = ("@Column(nullable = " + Boolean.valueOf(_not_1));
        String _plus_2 = (_plus_1 + ", ");
        String _plus_3 = (_plus_2 + extra);
        _xifexpression = (_plus_3 + ")");
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public int ratingMin(final FeedbackDefinition fd) {
    int _xifexpression = (int) 0;
    RatingPolicy _rating = fd.getRating();
    boolean _tripleEquals = (_rating == null);
    if (_tripleEquals) {
      _xifexpression = 1;
    } else {
      double _minValue = fd.getRating().getMinValue();
      _xifexpression = ((int) _minValue);
    }
    return _xifexpression;
  }

  public int ratingMax(final FeedbackDefinition fd) {
    int _xifexpression = (int) 0;
    RatingPolicy _rating = fd.getRating();
    boolean _tripleEquals = (_rating == null);
    if (_tripleEquals) {
      _xifexpression = 5;
    } else {
      double _maxValue = fd.getRating().getMaxValue();
      _xifexpression = ((int) _maxValue);
    }
    return _xifexpression;
  }

  public String generatedUserRepository(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".repository.generated;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.Optional;");
    _builder.newLine();
    _builder.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.");
    String _scenarioPascal = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal);
    _builder.append("User;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface Generated");
    String _scenarioPascal_1 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_1);
    _builder.append("UserRepository extends JpaRepository<");
    String _scenarioPascal_2 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_2);
    _builder.append("User, Long> {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("Optional<");
    String _scenarioPascal_3 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_3, "    ");
    _builder.append("User> findByUsername(String username);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String userRepositorySubclass(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".repository.generated.Generated");
    String _scenarioPascal = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal);
    _builder.append("UserRepository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface ");
    String _scenarioPascal_1 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_1);
    _builder.append("UserRepository extends Generated");
    String _scenarioPascal_2 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_2);
    _builder.append("UserRepository {");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String generatedUser(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".domain.generated;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import jakarta.persistence.Column;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.EnumType;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Enumerated;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GeneratedValue;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GenerationType;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Id;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.MappedSuperclass;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.enums.Role;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@MappedSuperclass");
    _builder.newLine();
    _builder.append("public abstract class Generated");
    String _scenarioPascal = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal);
    _builder.append("User {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GeneratedValue(strategy = GenerationType.IDENTITY)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Long id;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(nullable = false, unique = true, length = 80)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String username;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(nullable = false, length = 200)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String password;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Enumerated(EnumType.STRING)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(nullable = false, length = 32)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Role role;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Long getId() { return id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setId(Long id) { this.id = id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getUsername() { return username; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setUsername(String username) { this.username = username; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getPassword() { return password; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setPassword(String password) { this.password = password; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Role getRole() { return role; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setRole(Role role) { this.role = role; }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String userSubclass(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".domain;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import jakarta.persistence.Entity;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Table;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.generated.Generated");
    String _scenarioPascal = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal);
    _builder.append("User;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/** Manual extension point — edit scenario-specific user logic here. */");
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("@Table(name = \"users\")");
    _builder.newLine();
    _builder.append("public class ");
    String _scenarioPascal_1 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_1);
    _builder.append("User extends Generated");
    String _scenarioPascal_2 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_2);
    _builder.append("User {");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String generatedResourceEntity(final RefModel model, final ResourceType rt, final String entity, final List<ResourceRelation> relations) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".domain.generated;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import jakarta.persistence.Column;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GeneratedValue;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GenerationType;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Id;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.MappedSuperclass;");
    _builder.newLine();
    {
      boolean _hasRequiredAttributes = this.hasRequiredAttributes(rt);
      if (_hasRequiredAttributes) {
        _builder.append("import jakarta.validation.constraints.NotNull;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("@MappedSuperclass");
    _builder.newLine();
    _builder.append("public abstract class Generated");
    _builder.append(entity);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GeneratedValue(strategy = GenerationType.IDENTITY)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Long id;");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Attribute> _attributes = rt.getAttributes();
      for(final Attribute a : _attributes) {
        {
          boolean _isRequired = a.isRequired();
          if (_isRequired) {
            _builder.append("@NotNull");
            _builder.newLineIfNotEmpty();
          }
        }
        String _columnAnnotation = this.columnAnnotation(a);
        _builder.append(_columnAnnotation);
        _builder.newLineIfNotEmpty();
        _builder.append("private ");
        String _javaType = this.naming.javaType(a);
        _builder.append(_javaType);
        _builder.append(" ");
        String _name = a.getName();
        _builder.append(_name);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    {
      for(final ResourceRelation r : relations) {
        {
          boolean _relationIsToMany = this.relationIsToMany(r);
          if (_relationIsToMany) {
            _builder.append("@jakarta.persistence.OneToMany(");
            {
              boolean _isContainment = r.isContainment();
              if (_isContainment) {
                _builder.append("cascade = jakarta.persistence.CascadeType.ALL, orphanRemoval = true");
              }
            }
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append("@jakarta.persistence.JoinColumn(name = \"");
            String _lowerCase = entity.toLowerCase();
            _builder.append(_lowerCase);
            _builder.append("_id\")");
            _builder.newLineIfNotEmpty();
            _builder.append("private java.util.List<");
            String _basePackage_1 = this.naming.basePackage(model);
            _builder.append(_basePackage_1);
            _builder.append(".domain.");
            String _pascalCase = this.naming.toPascalCase(r.getTarget().getName());
            _builder.append(_pascalCase);
            _builder.append("> ");
            String _relationFieldName = this.relationFieldName(r);
            _builder.append(_relationFieldName);
            _builder.append(" = new java.util.ArrayList<>();");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          } else {
            _builder.append("@jakarta.persistence.ManyToOne(");
            {
              boolean _isContainment_1 = r.isContainment();
              if (_isContainment_1) {
                _builder.append("cascade = jakarta.persistence.CascadeType.ALL");
              }
            }
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append("@jakarta.persistence.JoinColumn(name = \"");
            String _relationFieldName_1 = this.relationFieldName(r);
            _builder.append(_relationFieldName_1);
            _builder.append("_id\")");
            _builder.newLineIfNotEmpty();
            _builder.append("private ");
            String _basePackage_2 = this.naming.basePackage(model);
            _builder.append(_basePackage_2);
            _builder.append(".domain.");
            String _pascalCase_1 = this.naming.toPascalCase(r.getTarget().getName());
            _builder.append(_pascalCase_1);
            _builder.append(" ");
            String _relationFieldName_2 = this.relationFieldName(r);
            _builder.append(_relationFieldName_2);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("    ");
    _builder.append("public Long getId() { return id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setId(Long id) { this.id = id; }");
    _builder.newLine();
    {
      EList<Attribute> _attributes_1 = rt.getAttributes();
      for(final Attribute a_1 : _attributes_1) {
        _builder.append("public ");
        String _javaType_1 = this.naming.javaType(a_1);
        _builder.append(_javaType_1);
        _builder.append(" get");
        String _pascalCase_2 = this.naming.toPascalCase(a_1.getName());
        _builder.append(_pascalCase_2);
        _builder.append("() { return ");
        String _name_1 = a_1.getName();
        _builder.append(_name_1);
        _builder.append("; }");
        _builder.newLineIfNotEmpty();
        _builder.append("public void set");
        String _pascalCase_3 = this.naming.toPascalCase(a_1.getName());
        _builder.append(_pascalCase_3);
        _builder.append("(");
        String _javaType_2 = this.naming.javaType(a_1);
        _builder.append(_javaType_2);
        _builder.append(" ");
        String _name_2 = a_1.getName();
        _builder.append(_name_2);
        _builder.append(") { this.");
        String _name_3 = a_1.getName();
        _builder.append(_name_3);
        _builder.append(" = ");
        String _name_4 = a_1.getName();
        _builder.append(_name_4);
        _builder.append("; }");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      for(final ResourceRelation r_1 : relations) {
        {
          boolean _relationIsToMany_1 = this.relationIsToMany(r_1);
          if (_relationIsToMany_1) {
            _builder.append("public java.util.List<");
            String _basePackage_3 = this.naming.basePackage(model);
            _builder.append(_basePackage_3);
            _builder.append(".domain.");
            String _pascalCase_4 = this.naming.toPascalCase(r_1.getTarget().getName());
            _builder.append(_pascalCase_4);
            _builder.append("> get");
            String _pascalCase_5 = this.naming.toPascalCase(this.relationFieldName(r_1));
            _builder.append(_pascalCase_5);
            _builder.append("() { return ");
            String _relationFieldName_3 = this.relationFieldName(r_1);
            _builder.append(_relationFieldName_3);
            _builder.append("; }");
            _builder.newLineIfNotEmpty();
            _builder.append("public void set");
            String _pascalCase_6 = this.naming.toPascalCase(this.relationFieldName(r_1));
            _builder.append(_pascalCase_6);
            _builder.append("(java.util.List<");
            String _basePackage_4 = this.naming.basePackage(model);
            _builder.append(_basePackage_4);
            _builder.append(".domain.");
            String _pascalCase_7 = this.naming.toPascalCase(r_1.getTarget().getName());
            _builder.append(_pascalCase_7);
            _builder.append("> ");
            String _relationFieldName_4 = this.relationFieldName(r_1);
            _builder.append(_relationFieldName_4);
            _builder.append(") { this.");
            String _relationFieldName_5 = this.relationFieldName(r_1);
            _builder.append(_relationFieldName_5);
            _builder.append(" = ");
            String _relationFieldName_6 = this.relationFieldName(r_1);
            _builder.append(_relationFieldName_6);
            _builder.append("; }");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("public ");
            String _basePackage_5 = this.naming.basePackage(model);
            _builder.append(_basePackage_5);
            _builder.append(".domain.");
            String _pascalCase_8 = this.naming.toPascalCase(r_1.getTarget().getName());
            _builder.append(_pascalCase_8);
            _builder.append(" get");
            String _pascalCase_9 = this.naming.toPascalCase(this.relationFieldName(r_1));
            _builder.append(_pascalCase_9);
            _builder.append("() { return ");
            String _relationFieldName_7 = this.relationFieldName(r_1);
            _builder.append(_relationFieldName_7);
            _builder.append("; }");
            _builder.newLineIfNotEmpty();
            _builder.append("public void set");
            String _pascalCase_10 = this.naming.toPascalCase(this.relationFieldName(r_1));
            _builder.append(_pascalCase_10);
            _builder.append("(");
            String _basePackage_6 = this.naming.basePackage(model);
            _builder.append(_basePackage_6);
            _builder.append(".domain.");
            String _pascalCase_11 = this.naming.toPascalCase(r_1.getTarget().getName());
            _builder.append(_pascalCase_11);
            _builder.append(" ");
            String _relationFieldName_8 = this.relationFieldName(r_1);
            _builder.append(_relationFieldName_8);
            _builder.append(") { this.");
            String _relationFieldName_9 = this.relationFieldName(r_1);
            _builder.append(_relationFieldName_9);
            _builder.append(" = ");
            String _relationFieldName_10 = this.relationFieldName(r_1);
            _builder.append(_relationFieldName_10);
            _builder.append("; }");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String generatedFeedbackEntity(final RefModel model, final FeedbackDefinition fd, final String entity, final String subject, final String parent) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".domain.generated;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import jakarta.persistence.Column;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.FetchType;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GeneratedValue;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GenerationType;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Id;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.JoinColumn;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.ManyToOne;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.MappedSuperclass;");
    _builder.newLine();
    {
      boolean _feedbackHasRating = this.feedbackHasRating(fd);
      if (_feedbackHasRating) {
        _builder.append("import jakarta.validation.constraints.Max;");
        _builder.newLine();
        _builder.append("import jakarta.validation.constraints.Min;");
        _builder.newLine();
      }
    }
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.");
    String _scenarioPascal = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal);
    _builder.append("User;");
    _builder.newLineIfNotEmpty();
    {
      if ((subject != null)) {
        _builder.append("import ");
        String _basePackage_2 = this.naming.basePackage(model);
        _builder.append(_basePackage_2);
        _builder.append(".domain.");
        _builder.append(subject);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if (((parent != null) && (!Objects.equals(parent, subject)))) {
        _builder.append("import ");
        String _basePackage_3 = this.naming.basePackage(model);
        _builder.append(_basePackage_3);
        _builder.append(".domain.");
        _builder.append(parent);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("@MappedSuperclass");
    _builder.newLine();
    _builder.append("public abstract class Generated");
    _builder.append(entity);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GeneratedValue(strategy = GenerationType.IDENTITY)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Long id;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@ManyToOne(fetch = FetchType.LAZY, optional = false)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@JoinColumn(name = \"author_id\", nullable = false)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private ");
    String _scenarioPascal_1 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_1, "    ");
    _builder.append("User author;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      if ((subject != null)) {
        _builder.append("@ManyToOne(fetch = FetchType.LAZY, optional = false)");
        _builder.newLine();
        _builder.append("@JoinColumn(name = \"subject_id\", nullable = false)");
        _builder.newLine();
        _builder.append("private ");
        _builder.append(subject);
        _builder.append(" subject;");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    {
      if ((parent != null)) {
        _builder.append("@ManyToOne(fetch = FetchType.LAZY)");
        _builder.newLine();
        _builder.append("@JoinColumn(name = \"parent_feedback_id\")");
        _builder.newLine();
        _builder.append("private ");
        _builder.append(parent);
        _builder.append(" parentFeedback;");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    {
      boolean _feedbackHasText = this.feedbackHasText(fd);
      if (_feedbackHasText) {
        _builder.append("@Column(nullable = false, length = 2000)");
        _builder.newLine();
        _builder.append("private String comment;");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _feedbackIsVote = this.feedbackIsVote(fd);
      if (_feedbackIsVote) {
        _builder.append("@Column(name = \"vote_value\", nullable = false)");
        _builder.newLine();
        _builder.append("private int value;");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _feedbackIsReport = this.feedbackIsReport(fd);
      if (_feedbackIsReport) {
        _builder.append("@Column(nullable = false, length = 1000)");
        _builder.newLine();
        _builder.append("private String reason;");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _feedbackHasRating_1 = this.feedbackHasRating(fd);
      if (_feedbackHasRating_1) {
        _builder.append("@Min(");
        int _ratingMin = this.ratingMin(fd);
        _builder.append(_ratingMin);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("@Max(");
        int _ratingMax = this.ratingMax(fd);
        _builder.append(_ratingMax);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("@Column(nullable = false)");
        _builder.newLine();
        _builder.append("private int grade;");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("public Long getId() { return id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setId(Long id) { this.id = id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    String _scenarioPascal_2 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_2, "    ");
    _builder.append("User getAuthor() { return author; }");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public void setAuthor(");
    String _scenarioPascal_3 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_3, "    ");
    _builder.append("User author) { this.author = author; }");
    _builder.newLineIfNotEmpty();
    {
      if ((subject != null)) {
        _builder.append("public ");
        _builder.append(subject);
        _builder.append(" getSubject() { return subject; }");
        _builder.newLineIfNotEmpty();
        _builder.append("public void setSubject(");
        _builder.append(subject);
        _builder.append(" subject) { this.subject = subject; }");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((parent != null)) {
        _builder.append("public ");
        _builder.append(parent);
        _builder.append(" getParentFeedback() { return parentFeedback; }");
        _builder.newLineIfNotEmpty();
        _builder.append("public void setParentFeedback(");
        _builder.append(parent);
        _builder.append(" parentFeedback) { this.parentFeedback = parentFeedback; }");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _feedbackHasText_1 = this.feedbackHasText(fd);
      if (_feedbackHasText_1) {
        _builder.append("public String getComment() { return comment; }");
        _builder.newLine();
        _builder.append("public void setComment(String comment) { this.comment = comment; }");
        _builder.newLine();
      }
    }
    {
      boolean _feedbackIsVote_1 = this.feedbackIsVote(fd);
      if (_feedbackIsVote_1) {
        _builder.append("public int getValue() { return value; }");
        _builder.newLine();
        _builder.append("public void setValue(int value) { this.value = value; }");
        _builder.newLine();
      }
    }
    {
      boolean _feedbackIsReport_1 = this.feedbackIsReport(fd);
      if (_feedbackIsReport_1) {
        _builder.append("public String getReason() { return reason; }");
        _builder.newLine();
        _builder.append("public void setReason(String reason) { this.reason = reason; }");
        _builder.newLine();
      }
    }
    {
      boolean _feedbackHasRating_2 = this.feedbackHasRating(fd);
      if (_feedbackHasRating_2) {
        _builder.append("public int getGrade() { return grade; }");
        _builder.newLine();
        _builder.append("public void setGrade(int grade) { this.grade = grade; }");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String entitySubclass(final RefModel model, final String entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".domain;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import jakarta.persistence.Entity;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Table;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.generated.Generated");
    _builder.append(entity);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/** Manual extension point — add domain invariants or helpers here. */");
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("@Table(name = \"");
    String _tableName = this.naming.tableName(entity);
    _builder.append(_tableName);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(entity);
    _builder.append(" extends Generated");
    _builder.append(entity);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String generatedRepository(final RefModel model, final String entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".repository.generated;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.");
    _builder.append(entity);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface Generated");
    _builder.append(entity);
    _builder.append("Repository extends JpaRepository<");
    _builder.append(entity);
    _builder.append(", Long> {");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String generatedFeedbackRepository(final RefModel model, final FeedbackDefinition fd, final String entity, final String subject, final String parent) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".repository.generated;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.");
    _builder.append(entity);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface Generated");
    _builder.append(entity);
    _builder.append("Repository extends JpaRepository<");
    _builder.append(entity);
    _builder.append(", Long> {");
    _builder.newLineIfNotEmpty();
    {
      if ((fd.isUniquePerAuthorTarget() && (subject != null))) {
        _builder.append("boolean existsByAuthor_IdAndSubject_Id(Long authorId, Long subjectId);");
        _builder.newLine();
      }
    }
    {
      if ((fd.isUniquePerAuthorTarget() && (parent != null))) {
        _builder.append("boolean existsByAuthor_IdAndParentFeedback_Id(Long authorId, Long parentFeedbackId);");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String repositorySubclass(final RefModel model, final String entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".repository.generated.Generated");
    _builder.append(entity);
    _builder.append("Repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/** Manual extension point — add custom queries here. */");
    _builder.newLine();
    _builder.append("public interface ");
    _builder.append(entity);
    _builder.append("Repository extends Generated");
    _builder.append(entity);
    _builder.append("Repository {");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String generatedResourceService(final RefModel model, final String entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".service.generated;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import org.springframework.data.domain.Sort;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Service;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.");
    _builder.append(entity);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_2 = this.naming.basePackage(model);
    _builder.append(_basePackage_2);
    _builder.append(".repository.");
    _builder.append(entity);
    _builder.append("Repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@Service");
    _builder.newLine();
    _builder.append("public class Generated");
    _builder.append(entity);
    _builder.append("Service {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private final ");
    _builder.append(entity, "    ");
    _builder.append("Repository repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Generated");
    _builder.append(entity, "    ");
    _builder.append("Service(");
    _builder.append(entity, "    ");
    _builder.append("Repository repository) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("this.repository = repository;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/** Fase G: optional sorting driven by SortingPolicy (sortBy = entity property, direction = ASC|DESC). */");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public List<");
    _builder.append(entity, "    ");
    _builder.append("> findAll(String sortBy, String direction) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("if (sortBy == null || sortBy.isBlank()) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return repository.findAll();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Sort.Direction dir = \"DESC\".equalsIgnoreCase(direction) ? Sort.Direction.DESC : Sort.Direction.ASC;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return repository.findAll(Sort.by(dir, sortBy));");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} catch (RuntimeException ex) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return repository.findAll();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(entity, "    ");
    _builder.append(" findById(Long id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return repository.findById(id).orElseThrow(() -> new IllegalArgumentException(\"");
    _builder.append(entity, "        ");
    _builder.append(" not found: \" + id));");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(entity, "    ");
    _builder.append(" create(");
    _builder.append(entity, "    ");
    _builder.append(" entity) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return repository.save(entity);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/** Override in manual ");
    _builder.append(entity, "    ");
    _builder.append("Service for scenario-specific rules. */");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected void beforeCreate(");
    _builder.append(entity, "    ");
    _builder.append(" entity) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String generatedFeedbackService(final RefModel model, final FeedbackDefinition fd, final String entity, final String subject, final String parent) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".service.generated;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Service;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.");
    _builder.append(entity);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_2 = this.naming.basePackage(model);
    _builder.append(_basePackage_2);
    _builder.append(".repository.");
    _builder.append(entity);
    _builder.append("Repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@Service");
    _builder.newLine();
    _builder.append("public class Generated");
    _builder.append(entity);
    _builder.append("Service {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private final ");
    _builder.append(entity, "    ");
    _builder.append("Repository repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Generated");
    _builder.append(entity, "    ");
    _builder.append("Service(");
    _builder.append(entity, "    ");
    _builder.append("Repository repository) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("this.repository = repository;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public List<");
    _builder.append(entity, "    ");
    _builder.append("> findAll() {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return repository.findAll();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(entity, "    ");
    _builder.append(" submit(");
    _builder.append(entity, "    ");
    _builder.append(" feedback) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("checkUniquePerAuthorTarget(feedback);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("beforeSubmit(feedback);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return repository.save(feedback);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private void checkUniquePerAuthorTarget(");
    _builder.append(entity, "    ");
    _builder.append(" feedback) {");
    _builder.newLineIfNotEmpty();
    {
      if ((fd.isUniquePerAuthorTarget() && (subject != null))) {
        _builder.append("if (feedback.getAuthor() != null && feedback.getSubject() != null");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("&& repository.existsByAuthor_IdAndSubject_Id(feedback.getAuthor().getId(), feedback.getSubject().getId())) {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("throw new IllegalArgumentException(\"Author already submitted this feedback for the target\");");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      if ((fd.isUniquePerAuthorTarget() && (parent != null))) {
        _builder.append("if (feedback.getAuthor() != null && feedback.getParentFeedback() != null");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("&& repository.existsByAuthor_IdAndParentFeedback_Id(feedback.getAuthor().getId(), feedback.getParentFeedback().getId())) {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("throw new IllegalArgumentException(\"Author already submitted this feedback for the parent\");");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/** Override in manual service for verification, moderation, etc. */");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void beforeSubmit(");
    _builder.append(entity, "    ");
    _builder.append(" feedback) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String serviceSubclass(final RefModel model, final String entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".service;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Service;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".repository.");
    _builder.append(entity);
    _builder.append("Repository;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_2 = this.naming.basePackage(model);
    _builder.append(_basePackage_2);
    _builder.append(".service.generated.Generated");
    _builder.append(entity);
    _builder.append("Service;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@Service");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(entity);
    _builder.append("Service extends Generated");
    _builder.append(entity);
    _builder.append("Service {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(entity, "    ");
    _builder.append("Service(");
    _builder.append(entity, "    ");
    _builder.append("Repository repository) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(repository);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String generatedResourceController(final RefModel model, final String entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".web.generated;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import org.springframework.http.HttpStatus;");
    _builder.newLine();
    _builder.append("import org.springframework.http.ResponseEntity;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.GetMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.PathVariable;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.PostMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestBody;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestParam;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.");
    _builder.append(entity);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_2 = this.naming.basePackage(model);
    _builder.append(_basePackage_2);
    _builder.append(".service.");
    _builder.append(entity);
    _builder.append("Service;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public abstract class Generated");
    _builder.append(entity);
    _builder.append("Controller {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private final ");
    _builder.append(entity, "    ");
    _builder.append("Service service;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected Generated");
    _builder.append(entity, "    ");
    _builder.append("Controller(");
    _builder.append(entity, "    ");
    _builder.append("Service service) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("this.service = service;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GetMapping");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public List<");
    _builder.append(entity, "    ");
    _builder.append("> list(");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("@RequestParam(required = false) String sortBy,");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("@RequestParam(required = false, defaultValue = \"ASC\") String direction) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return service.findAll(sortBy, direction);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GetMapping(\"/{id}\")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(entity, "    ");
    _builder.append(" get(@PathVariable Long id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return service.findById(id);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@PostMapping");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ResponseEntity<");
    _builder.append(entity, "    ");
    _builder.append("> create(@RequestBody ");
    _builder.append(entity, "    ");
    _builder.append(" body) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return ResponseEntity.status(HttpStatus.CREATED).body(service.create(body));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String generatedFeedbackController(final RefModel model, final String entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".web.generated;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import org.springframework.http.HttpStatus;");
    _builder.newLine();
    _builder.append("import org.springframework.http.ResponseEntity;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.GetMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.PostMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestBody;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.");
    _builder.append(entity);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_2 = this.naming.basePackage(model);
    _builder.append(_basePackage_2);
    _builder.append(".service.");
    _builder.append(entity);
    _builder.append("Service;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public abstract class Generated");
    _builder.append(entity);
    _builder.append("Controller {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private final ");
    _builder.append(entity, "    ");
    _builder.append("Service service;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected Generated");
    _builder.append(entity, "    ");
    _builder.append("Controller(");
    _builder.append(entity, "    ");
    _builder.append("Service service) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("this.service = service;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GetMapping");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public List<");
    _builder.append(entity, "    ");
    _builder.append("> list() {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return service.findAll();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@PostMapping");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ResponseEntity<");
    _builder.append(entity, "    ");
    _builder.append("> submit(@RequestBody ");
    _builder.append(entity, "    ");
    _builder.append(" body) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String resourceControllerSubclass(final RefModel model, final String entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".web;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RestController;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".service.");
    _builder.append(entity);
    _builder.append("Service;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_2 = this.naming.basePackage(model);
    _builder.append(_basePackage_2);
    _builder.append(".web.generated.Generated");
    _builder.append(entity);
    _builder.append("Controller;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@RestController");
    _builder.newLine();
    _builder.append("@RequestMapping(\"");
    String _apiCollectionPath = this.naming.apiCollectionPath(entity);
    _builder.append(_apiCollectionPath);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(entity);
    _builder.append("Controller extends Generated");
    _builder.append(entity);
    _builder.append("Controller {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(entity, "    ");
    _builder.append("Controller(");
    _builder.append(entity, "    ");
    _builder.append("Service service) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(service);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String feedbackControllerSubclass(final RefModel model, final String entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".web;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RestController;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".service.");
    _builder.append(entity);
    _builder.append("Service;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_2 = this.naming.basePackage(model);
    _builder.append(_basePackage_2);
    _builder.append(".web.generated.Generated");
    _builder.append(entity);
    _builder.append("Controller;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@RestController");
    _builder.newLine();
    _builder.append("@RequestMapping(\"");
    String _apiCollectionPath = this.naming.apiCollectionPath(entity);
    _builder.append(_apiCollectionPath);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(entity);
    _builder.append("Controller extends Generated");
    _builder.append(entity);
    _builder.append("Controller {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(entity, "    ");
    _builder.append("Controller(");
    _builder.append(entity, "    ");
    _builder.append("Service service) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(service);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String generatedAuthService(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".service.generated;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.security.crypto.password.PasswordEncoder;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Service;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.");
    String _scenarioPascal = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal);
    _builder.append("User;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_2 = this.naming.basePackage(model);
    _builder.append(_basePackage_2);
    _builder.append(".domain.enums.Role;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_3 = this.naming.basePackage(model);
    _builder.append(_basePackage_3);
    _builder.append(".dto.AuthResponse;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_4 = this.naming.basePackage(model);
    _builder.append(_basePackage_4);
    _builder.append(".repository.");
    String _scenarioPascal_1 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_1);
    _builder.append("UserRepository;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_5 = this.naming.basePackage(model);
    _builder.append(_basePackage_5);
    _builder.append(".security.JwtService;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@Service");
    _builder.newLine();
    _builder.append("public class GeneratedAuthenticationService {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private final ");
    String _scenarioPascal_2 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_2, "    ");
    _builder.append("UserRepository userRepository;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private final PasswordEncoder passwordEncoder;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private final JwtService jwtService;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public GeneratedAuthenticationService(");
    String _scenarioPascal_3 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_3, "    ");
    _builder.append("UserRepository userRepository,");
    _builder.newLineIfNotEmpty();
    _builder.append("                                          ");
    _builder.append("PasswordEncoder passwordEncoder, JwtService jwtService) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.userRepository = userRepository;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.passwordEncoder = passwordEncoder;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.jwtService = jwtService;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    String _scenarioPascal_4 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_4, "    ");
    _builder.append("User register(String username, String password, Role role) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    String _scenarioPascal_5 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_5, "        ");
    _builder.append("User user = new ");
    String _scenarioPascal_6 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_6, "        ");
    _builder.append("User();");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("user.setUsername(username);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("user.setPassword(passwordEncoder.encode(password));");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("user.setRole(role);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return userRepository.save(user);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public AuthResponse login(String username, String password) {");
    _builder.newLine();
    _builder.append("        ");
    String _scenarioPascal_7 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_7, "        ");
    _builder.append("User user = userRepository.findByUsername(username)");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append(".orElseThrow(() -> new IllegalArgumentException(\"Invalid credentials\"));");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (!passwordEncoder.matches(password, user.getPassword())) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("throw new IllegalArgumentException(\"Invalid credentials\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String token = jwtService.generateToken(user.getUsername(), user.getRole().name());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return new AuthResponse(token, user.getUsername(), user.getRole().name());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String authServiceSubclass(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".service;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.security.crypto.password.PasswordEncoder;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Service;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".repository.");
    String _scenarioPascal = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal);
    _builder.append("UserRepository;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_2 = this.naming.basePackage(model);
    _builder.append(_basePackage_2);
    _builder.append(".security.JwtService;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_3 = this.naming.basePackage(model);
    _builder.append(_basePackage_3);
    _builder.append(".service.generated.GeneratedAuthenticationService;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@Service");
    _builder.newLine();
    _builder.append("public class AuthenticationService extends GeneratedAuthenticationService {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public AuthenticationService(");
    String _scenarioPascal_1 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_1, "    ");
    _builder.append("UserRepository userRepository,");
    _builder.newLineIfNotEmpty();
    _builder.append("                                 ");
    _builder.append("PasswordEncoder passwordEncoder, JwtService jwtService) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super(userRepository, passwordEncoder, jwtService);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String generatedAuthController(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".web.generated;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.http.HttpStatus;");
    _builder.newLine();
    _builder.append("import org.springframework.http.ResponseEntity;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.PostMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestBody;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.");
    String _scenarioPascal = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal);
    _builder.append("User;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_2 = this.naming.basePackage(model);
    _builder.append(_basePackage_2);
    _builder.append(".domain.enums.Role;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_3 = this.naming.basePackage(model);
    _builder.append(_basePackage_3);
    _builder.append(".dto.AuthResponse;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_4 = this.naming.basePackage(model);
    _builder.append(_basePackage_4);
    _builder.append(".dto.LoginRequest;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_5 = this.naming.basePackage(model);
    _builder.append(_basePackage_5);
    _builder.append(".dto.RegisterRequest;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_6 = this.naming.basePackage(model);
    _builder.append(_basePackage_6);
    _builder.append(".service.AuthenticationService;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public abstract class GeneratedAuthenticationController {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private final AuthenticationService authenticationService;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected GeneratedAuthenticationController(AuthenticationService authenticationService) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.authenticationService = authenticationService;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@PostMapping(\"/register\")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ResponseEntity<");
    String _scenarioPascal_1 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_1, "    ");
    _builder.append("User> register(@RequestBody RegisterRequest request) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("Role role = Role.valueOf(request.role());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return ResponseEntity.status(HttpStatus.CREATED)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".body(authenticationService.register(request.username(), request.password(), role));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@PostMapping(\"/login\")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return ResponseEntity.ok(authenticationService.login(request.username(), request.password()));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String authControllerSubclass(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".web;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RestController;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".service.AuthenticationService;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_2 = this.naming.basePackage(model);
    _builder.append(_basePackage_2);
    _builder.append(".web.generated.GeneratedAuthenticationController;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@RestController");
    _builder.newLine();
    _builder.append("@RequestMapping(\"/api/auth\")");
    _builder.newLine();
    _builder.append("public class AuthenticationController extends GeneratedAuthenticationController {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public AuthenticationController(AuthenticationService authenticationService) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super(authenticationService);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String actionToHttpMethod(final String action) {
    String _switchResult = null;
    if (action != null) {
      switch (action) {
        case "READ":
          _switchResult = "GET";
          break;
        case "CREATE":
          _switchResult = "POST";
          break;
        case "UPDATE":
          _switchResult = "PUT";
          break;
        case "DELETE":
          _switchResult = "DELETE";
          break;
        default:
          _switchResult = "POST";
          break;
      }
    } else {
      _switchResult = "POST";
    }
    return _switchResult;
  }

  public String securityConfig(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".security;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.context.annotation.Bean;");
    _builder.newLine();
    _builder.append("import org.springframework.context.annotation.Configuration;");
    _builder.newLine();
    _builder.append("import org.springframework.http.HttpMethod;");
    _builder.newLine();
    _builder.append("import org.springframework.security.config.annotation.web.builders.HttpSecurity;");
    _builder.newLine();
    _builder.append("import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;");
    _builder.newLine();
    _builder.append("import org.springframework.security.config.http.SessionCreationPolicy;");
    _builder.newLine();
    _builder.append("import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;");
    _builder.newLine();
    _builder.append("import org.springframework.security.crypto.password.PasswordEncoder;");
    _builder.newLine();
    _builder.append("import org.springframework.security.web.SecurityFilterChain;");
    _builder.newLine();
    _builder.append("import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Configuration");
    _builder.newLine();
    _builder.append("@EnableWebSecurity");
    _builder.newLine();
    _builder.append("public class SecurityConfiguration {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private final JwtAuthenticationFilter jwtAuthenticationFilter;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public SecurityConfiguration(JwtAuthenticationFilter jwtAuthenticationFilter) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.jwtAuthenticationFilter = jwtAuthenticationFilter;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Bean");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("http");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".csrf(csrf -> csrf.disable())");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".headers(headers -> headers.frameOptions(frame -> frame.sameOrigin()))");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".authorizeHttpRequests(auth -> auth");
    _builder.newLine();
    _builder.append("                ");
    _builder.append(".requestMatchers(\"/api/auth/**\", \"/h2-console/**\").permitAll()");
    _builder.newLine();
    {
      EList<AuthorizationRule> _authorizationRules = model.getAuthorizationRules();
      for(final AuthorizationRule ar : _authorizationRules) {
        _builder.append(".requestMatchers(HttpMethod.");
        String _actionToHttpMethod = this.actionToHttpMethod(ar.getAllowedAction().getLiteral());
        _builder.append(_actionToHttpMethod);
        _builder.append(", \"");
        {
          FeedbackDefinition _feedbackTarget = ar.getFeedbackTarget();
          boolean _tripleNotEquals = (_feedbackTarget != null);
          if (_tripleNotEquals) {
            String _apiCollectionPath = this.naming.apiCollectionPath(this.naming.toPascalCase(ar.getFeedbackTarget().getName()));
            _builder.append(_apiCollectionPath);
          } else {
            String _apiCollectionPath_1 = this.naming.apiCollectionPath(this.naming.toPascalCase(ar.getResourceTarget().getName()));
            _builder.append(_apiCollectionPath_1);
          }
        }
        _builder.append("\").hasRole(\"");
        String _literal = ar.getActor().getKind().getLiteral();
        _builder.append(_literal);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("                ");
    _builder.append(".anyRequest().authenticated())");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return http.build();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Bean");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("PasswordEncoder passwordEncoder() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return new BCryptPasswordEncoder();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String jwtService(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".security;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import io.jsonwebtoken.Claims;");
    _builder.newLine();
    _builder.append("import io.jsonwebtoken.Jwts;");
    _builder.newLine();
    _builder.append("import io.jsonwebtoken.security.Keys;");
    _builder.newLine();
    _builder.append("import java.util.Date;");
    _builder.newLine();
    _builder.append("import javax.crypto.SecretKey;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Service;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Service");
    _builder.newLine();
    _builder.append("public class JwtService {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static final String SECRET = \"0123456789012345678901234567890123456789012345678901234567890123\";");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static final long EXPIRATION_MS = 1000L * 60 * 60 * 24;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private SecretKey key() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return Keys.hmacShaKeyFor(SECRET.getBytes());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String generateToken(String username, String role) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Date now = new Date();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return Jwts.builder()");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".subject(username)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".claim(\"role\", role)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".issuedAt(now)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".expiration(new Date(now.getTime() + EXPIRATION_MS))");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".signWith(key())");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".compact();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String extractUsername(String token) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return parse(token).getSubject();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean isValid(String token, String username) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Claims claims = parse(token);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return username.equals(claims.getSubject()) && claims.getExpiration().after(new Date());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} catch (Exception ex) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Claims parse(String token) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return Jwts.parser().verifyWith(key()).build().parseSignedClaims(token).getPayload();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String appUserDetailsService(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".security;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.security.core.authority.SimpleGrantedAuthority;");
    _builder.newLine();
    _builder.append("import org.springframework.security.core.userdetails.User;");
    _builder.newLine();
    _builder.append("import org.springframework.security.core.userdetails.UserDetails;");
    _builder.newLine();
    _builder.append("import org.springframework.security.core.userdetails.UserDetailsService;");
    _builder.newLine();
    _builder.append("import org.springframework.security.core.userdetails.UsernameNotFoundException;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Service;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".domain.");
    String _scenarioPascal = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal);
    _builder.append("User;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_2 = this.naming.basePackage(model);
    _builder.append(_basePackage_2);
    _builder.append(".repository.");
    String _scenarioPascal_1 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_1);
    _builder.append("UserRepository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@Service");
    _builder.newLine();
    _builder.append("public class AppUserDetailsService implements UserDetailsService {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private final ");
    String _scenarioPascal_2 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_2, "    ");
    _builder.append("UserRepository userRepository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public AppUserDetailsService(");
    String _scenarioPascal_3 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_3, "    ");
    _builder.append("UserRepository userRepository) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("this.userRepository = userRepository;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {");
    _builder.newLine();
    _builder.append("        ");
    String _scenarioPascal_4 = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal_4, "        ");
    _builder.append("User user = userRepository.findByUsername(username)");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append(".orElseThrow(() -> new UsernameNotFoundException(\"User not found: \" + username));");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return User.withUsername(user.getUsername())");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".password(user.getPassword())");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".authorities(new SimpleGrantedAuthority(\"ROLE_\" + user.getRole().name()))");
    _builder.newLine();
    _builder.append("            ");
    _builder.append(".build();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String jwtAuthenticationFilter(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".security;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import jakarta.servlet.FilterChain;");
    _builder.newLine();
    _builder.append("import jakarta.servlet.ServletException;");
    _builder.newLine();
    _builder.append("import jakarta.servlet.http.HttpServletRequest;");
    _builder.newLine();
    _builder.append("import jakarta.servlet.http.HttpServletResponse;");
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;");
    _builder.newLine();
    _builder.append("import org.springframework.security.core.context.SecurityContextHolder;");
    _builder.newLine();
    _builder.append("import org.springframework.security.core.userdetails.UserDetails;");
    _builder.newLine();
    _builder.append("import org.springframework.security.core.userdetails.UserDetailsService;");
    _builder.newLine();
    _builder.append("import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Component;");
    _builder.newLine();
    _builder.append("import org.springframework.web.filter.OncePerRequestFilter;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Component");
    _builder.newLine();
    _builder.append("public class JwtAuthenticationFilter extends OncePerRequestFilter {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private final JwtService jwtService;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private final UserDetailsService userDetailsService;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public JwtAuthenticationFilter(JwtService jwtService, UserDetailsService userDetailsService) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.jwtService = jwtService;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.userDetailsService = userDetailsService;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("throws ServletException, IOException {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String header = request.getHeader(\"Authorization\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (header == null || !header.startsWith(\"Bearer \")) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("filterChain.doFilter(request, response);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String token = header.substring(7);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String username = null;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("username = jwtService.extractUsername(token);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} catch (Exception ignored) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("UserDetails userDetails = userDetailsService.loadUserByUsername(username);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (jwtService.isValid(token, userDetails.getUsername())) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("UsernamePasswordAuthenticationToken authentication =");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("SecurityContextHolder.getContext().setAuthentication(authentication);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("filterChain.doFilter(request, response);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String registerRequestDto(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".dto;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public record RegisterRequest(String username, String password, String role) {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String loginRequestDto(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".dto;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public record LoginRequest(String username, String password) {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String authResponseDto(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".dto;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public record AuthResponse(String token, String username, String role) {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String apiError(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".web.error;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public record ApiError(String message) {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String apiExceptionHandler(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".web.error;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.http.HttpStatus;");
    _builder.newLine();
    _builder.append("import org.springframework.http.ResponseEntity;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.ExceptionHandler;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RestControllerAdvice;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@RestControllerAdvice");
    _builder.newLine();
    _builder.append("public class ApiExceptionHandler {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@ExceptionHandler(IllegalArgumentException.class)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ResponseEntity<ApiError> handleIllegalArgument(IllegalArgumentException ex) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiError(ex.getMessage()));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String applicationTest(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.junit.jupiter.api.Test;");
    _builder.newLine();
    _builder.append("import org.springframework.boot.test.context.SpringBootTest;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@SpringBootTest");
    _builder.newLine();
    _builder.append("class ");
    String _scenarioPascal = this.naming.scenarioPascal(model);
    _builder.append(_scenarioPascal);
    _builder.append("BackendApplicationTests {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("@Test");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("void contextLoads() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String readme(final RefModel model, final String root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Generated REF Backend — ");
    String _name = model.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("Generated by Xtext `RefBackendGenerator` from a `.refdsl` model (P2 Activity 5/6).");
    _builder.newLine();
    _builder.newLine();
    _builder.append("## Run");
    _builder.newLine();
    _builder.newLine();
    _builder.append("```powershell");
    _builder.newLine();
    _builder.append("mvn -f ");
    _builder.append(root);
    _builder.append("/pom.xml spring-boot:run");
    _builder.newLineIfNotEmpty();
    _builder.append("```");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Port: ");
    int _serverPort = this.naming.serverPort(model);
    _builder.append(_serverPort);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("## Structure (Generation Gap)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- `domain/generated`, `repository/generated`, `service/generated`, `web/generated` — regenerated on each DSL save");
    _builder.newLine();
    _builder.append("- Classes without `generated` in the package — manual extension points (preserved across regeneration)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("## Regenerate");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Open the `.refdsl` file in the RefDsl Editor (runtime Eclipse) and save — output appears under `");
    _builder.append(root);
    _builder.append("/`.");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String manifest(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("REF backend generation manifest");
    _builder.newLine();
    _builder.append("Model: ");
    String _name = model.getName();
    _builder.append(_name);
    _builder.append(" v");
    String _xifexpression = null;
    String _version = model.getVersion();
    boolean _tripleNotEquals = (_version != null);
    if (_tripleNotEquals) {
      _xifexpression = model.getVersion();
    } else {
      _xifexpression = "n/a";
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    _builder.append("Scenario slug: ");
    String _scenarioSlug = this.naming.scenarioSlug(model);
    _builder.append(_scenarioSlug);
    _builder.newLineIfNotEmpty();
    _builder.append("Package: ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("Resources: ");
    final Function1<ResourceType, String> _function = (ResourceType it) -> {
      return it.getName();
    };
    String _join = IterableExtensions.join(ListExtensions.<ResourceType, String>map(model.getResourceTypes(), _function), ", ");
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    _builder.append("Feedbacks: ");
    final Function1<FeedbackDefinition, String> _function_1 = (FeedbackDefinition it) -> {
      return it.getName();
    };
    String _join_1 = IterableExtensions.join(ListExtensions.<FeedbackDefinition, String>map(model.getFeedbackDefinitions(), _function_1), ", ");
    _builder.append(_join_1);
    _builder.newLineIfNotEmpty();
    _builder.append("User kinds: ");
    final Function1<UserType, String> _function_2 = (UserType it) -> {
      return it.getKind().getLiteral();
    };
    String _join_2 = IterableExtensions.join(ListExtensions.<UserType, String>map(model.getUserTypes(), _function_2), ", ");
    _builder.append(_join_2);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("Common (always): pom, application, security baseline, user entity, API error handler");
    _builder.newLine();
    _builder.append("Variable: one stack per ResourceType and FeedbackDefinition in the model");
    _builder.newLine();
    _builder.append("Manual: subclasses in domain/repository/service/web without \"generated\" in package name");
    _builder.newLine();
    return _builder.toString();
  }

  public boolean relationIsToMany(final ResourceRelation r) {
    boolean _xblockexpression = false;
    {
      final String tc = r.getTargetCardinality();
      _xblockexpression = ((tc != null) && tc.contains("*"));
    }
    return _xblockexpression;
  }

  public String relationFieldName(final ResourceRelation r) {
    String _xblockexpression = null;
    {
      final String base = this.decapitalize(this.naming.toPascalCase(r.getTarget().getName()));
      String _xifexpression = null;
      boolean _relationIsToMany = this.relationIsToMany(r);
      if (_relationIsToMany) {
        _xifexpression = (base + "s");
      } else {
        _xifexpression = base;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public String decapitalize(final String s) {
    String _xifexpression = null;
    if (((s == null) || s.isEmpty())) {
      _xifexpression = s;
    } else {
      String _string = Character.toString(Character.toLowerCase(s.charAt(0)));
      String _substring = s.substring(1);
      _xifexpression = (_string + _substring);
    }
    return _xifexpression;
  }

  public void generateGovernance(final RefModel model, final IFileSystemAccess2 fsa, final String root, final String pkg) {
    final String path = pkg.replace(".", "/");
    boolean _isEmpty = model.getValidationRules().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      this.writeGovernance(fsa, root, path, model, "ValidationRule", "validation_rules", "/api/policies/validation-rules", 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("name", "kind", "severity", "expression", "implementationId", "appliesToResource", "appliesToFeedback", "invokedBy")));
    }
    boolean _isEmpty_1 = model.getAuthorizationRules().isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      this.writeGovernance(fsa, root, path, model, "AuthorizationRule", "authorization_rules", "/api/policies/authorization-rules", 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("name", "allowedAction", "actor", "contextName", "resourceTarget", "feedbackTarget")));
    }
    boolean _isEmpty_2 = model.getModerationPolicies().isEmpty();
    boolean _not_2 = (!_isEmpty_2);
    if (_not_2) {
      this.writeGovernance(fsa, root, path, model, "ModerationPolicy", "moderation_policies", "/api/policies/moderation-policies", 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("name", "mode", "triggerEvent", "decision", "monitorsResource", "monitorsFeedback", "executedBy", "inContext")));
    }
    boolean _isEmpty_3 = model.getVerificationPolicies().isEmpty();
    boolean _not_3 = (!_isEmpty_3);
    if (_not_3) {
      this.writeGovernance(fsa, root, path, model, "VerificationPolicy", "verification_policies", "/api/policies/verification-policies", 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("name", "mode", "appliesWhen", "verifies")));
    }
    boolean _isEmpty_4 = model.getSortingPolicies().isEmpty();
    boolean _not_4 = (!_isEmpty_4);
    if (_not_4) {
      this.writeGovernance(fsa, root, path, model, "SortingPolicy", "sorting_policies", "/api/policies/sorting-policies", 
        Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("name", "criterion", "direction", "appliesToResource", "appliesToFeedback", "inContext")));
    }
    boolean _isEmpty_5 = model.getAutomationRules().isEmpty();
    boolean _not_5 = (!_isEmpty_5);
    if (_not_5) {
      this.generateAutomation(model, fsa, root, path);
    }
  }

  public void writeGovernance(final IFileSystemAccess2 fsa, final String root, final String path, final RefModel model, final String entityName, final String table, final String apiPath, final List<String> fields) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(root);
    _builder.append("/src/main/java/");
    _builder.append(path);
    _builder.append("/governance/domain/");
    _builder.append(entityName);
    _builder.append(".java");
    this.write(fsa, _builder.toString(), this.governanceEntity(model, entityName, table, fields));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(root);
    _builder_1.append("/src/main/java/");
    _builder_1.append(path);
    _builder_1.append("/governance/repository/");
    _builder_1.append(entityName);
    _builder_1.append("Repository.java");
    this.write(fsa, _builder_1.toString(), this.governanceRepo(model, entityName));
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append(root);
    _builder_2.append("/src/main/java/");
    _builder_2.append(path);
    _builder_2.append("/governance/web/");
    _builder_2.append(entityName);
    _builder_2.append("Controller.java");
    this.write(fsa, _builder_2.toString(), this.governanceController(model, entityName, apiPath));
  }

  public String governanceEntity(final RefModel model, final String entityName, final String table, final List<String> fields) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".governance.domain;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import jakarta.persistence.Column;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Entity;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GeneratedValue;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GenerationType;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Id;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Table;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("@Table(name = \"");
    _builder.append(table);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(entityName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GeneratedValue(strategy = GenerationType.IDENTITY)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Long id;");
    _builder.newLine();
    _builder.newLine();
    {
      for(final String f : fields) {
        _builder.append("@Column(length = 1000)");
        _builder.newLine();
        _builder.append("private String ");
        _builder.append(f);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("public Long getId() { return id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setId(Long id) { this.id = id; }");
    _builder.newLine();
    {
      for(final String f_1 : fields) {
        _builder.append("public String get");
        String _pascalCase = this.naming.toPascalCase(f_1);
        _builder.append(_pascalCase);
        _builder.append("() { return ");
        _builder.append(f_1);
        _builder.append("; }");
        _builder.newLineIfNotEmpty();
        _builder.append("public void set");
        String _pascalCase_1 = this.naming.toPascalCase(f_1);
        _builder.append(_pascalCase_1);
        _builder.append("(String ");
        _builder.append(f_1);
        _builder.append(") { this.");
        _builder.append(f_1);
        _builder.append(" = ");
        _builder.append(f_1);
        _builder.append("; }");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String governanceRepo(final RefModel model, final String entityName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".governance.repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".governance.domain.");
    _builder.append(entityName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface ");
    _builder.append(entityName);
    _builder.append("Repository extends JpaRepository<");
    _builder.append(entityName);
    _builder.append(", Long> {");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String governanceController(final RefModel model, final String entityName, final String apiPath) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".governance.web;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import org.springframework.http.HttpStatus;");
    _builder.newLine();
    _builder.append("import org.springframework.http.ResponseEntity;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.GetMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.PathVariable;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.PostMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestBody;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RestController;");
    _builder.newLine();
    _builder.append("import ");
    String _basePackage_1 = this.naming.basePackage(model);
    _builder.append(_basePackage_1);
    _builder.append(".governance.domain.");
    _builder.append(entityName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _basePackage_2 = this.naming.basePackage(model);
    _builder.append(_basePackage_2);
    _builder.append(".governance.repository.");
    _builder.append(entityName);
    _builder.append("Repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@RestController");
    _builder.newLine();
    _builder.append("@RequestMapping(\"");
    _builder.append(apiPath);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(entityName);
    _builder.append("Controller {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private final ");
    _builder.append(entityName, "    ");
    _builder.append("Repository repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(entityName, "    ");
    _builder.append("Controller(");
    _builder.append(entityName, "    ");
    _builder.append("Repository repository) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("this.repository = repository;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GetMapping");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public List<");
    _builder.append(entityName, "    ");
    _builder.append("> list() {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return repository.findAll();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GetMapping(\"/{id}\")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(entityName, "    ");
    _builder.append(" get(@PathVariable Long id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return repository.findById(id).orElseThrow(() -> new IllegalArgumentException(\"");
    _builder.append(entityName, "        ");
    _builder.append(" not found: \" + id));");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@PostMapping");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ResponseEntity<");
    _builder.append(entityName, "    ");
    _builder.append("> create(@RequestBody ");
    _builder.append(entityName, "    ");
    _builder.append(" body) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(body));");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public void generateAutomation(final RefModel model, final IFileSystemAccess2 fsa, final String root, final String path) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(root);
    _builder.append("/src/main/java/");
    _builder.append(path);
    _builder.append("/governance/domain/AutomationRule.java");
    this.write(fsa, _builder.toString(), this.automationRuleEntity(model));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(root);
    _builder_1.append("/src/main/java/");
    _builder_1.append(path);
    _builder_1.append("/governance/domain/AutomationCondition.java");
    this.write(fsa, _builder_1.toString(), this.automationConditionEntity(model));
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append(root);
    _builder_2.append("/src/main/java/");
    _builder_2.append(path);
    _builder_2.append("/governance/domain/ConditionValue.java");
    this.write(fsa, _builder_2.toString(), this.conditionValueEntity(model));
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append(root);
    _builder_3.append("/src/main/java/");
    _builder_3.append(path);
    _builder_3.append("/governance/domain/AutomationAction.java");
    this.write(fsa, _builder_3.toString(), this.automationActionEntity(model));
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append(root);
    _builder_4.append("/src/main/java/");
    _builder_4.append(path);
    _builder_4.append("/governance/repository/AutomationRuleRepository.java");
    this.write(fsa, _builder_4.toString(), this.governanceRepo(model, "AutomationRule"));
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append(root);
    _builder_5.append("/src/main/java/");
    _builder_5.append(path);
    _builder_5.append("/governance/web/AutomationRuleController.java");
    this.write(fsa, _builder_5.toString(), this.governanceController(model, "AutomationRule", "/api/policies/automation-rules"));
  }

  public String automationRuleEntity(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".governance.domain;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import jakarta.persistence.CascadeType;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Column;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Entity;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GeneratedValue;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GenerationType;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Id;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.JoinColumn;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.OneToMany;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Table;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("@Table(name = \"automation_rules\")");
    _builder.newLine();
    _builder.append("public class AutomationRule {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GeneratedValue(strategy = GenerationType.IDENTITY)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Long id;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(length = 1000)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String name;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(length = 1000)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String triggerEvent;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(length = 1000)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String contextResource;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(length = 1000)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String inContext;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(length = 1000)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String onFeedback;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(length = 1000)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String uses;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@JoinColumn(name = \"automation_rule_id\")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private List<AutomationCondition> conditions = new ArrayList<>();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@JoinColumn(name = \"automation_rule_action_id\")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private List<AutomationAction> actions = new ArrayList<>();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Long getId() { return id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setId(Long id) { this.id = id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getName() { return name; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setName(String name) { this.name = name; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getTriggerEvent() { return triggerEvent; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setTriggerEvent(String triggerEvent) { this.triggerEvent = triggerEvent; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getContextResource() { return contextResource; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setContextResource(String contextResource) { this.contextResource = contextResource; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getInContext() { return inContext; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setInContext(String inContext) { this.inContext = inContext; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getOnFeedback() { return onFeedback; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setOnFeedback(String onFeedback) { this.onFeedback = onFeedback; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getUses() { return uses; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setUses(String uses) { this.uses = uses; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public List<AutomationCondition> getConditions() { return conditions; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setConditions(List<AutomationCondition> conditions) { this.conditions = conditions; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public List<AutomationAction> getActions() { return actions; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setActions(List<AutomationAction> actions) { this.actions = actions; }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String automationConditionEntity(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".governance.domain;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import jakarta.persistence.CascadeType;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Column;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Entity;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GeneratedValue;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GenerationType;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Id;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.JoinColumn;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.OneToMany;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Table;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("@Table(name = \"automation_conditions\")");
    _builder.newLine();
    _builder.append("public class AutomationCondition {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GeneratedValue(strategy = GenerationType.IDENTITY)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Long id;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(length = 1000)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String name;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(length = 1000)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String operator;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(length = 1000)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String attributeName;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@JoinColumn(name = \"automation_condition_id\")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private List<ConditionValue> values = new ArrayList<>();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Long getId() { return id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setId(Long id) { this.id = id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getName() { return name; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setName(String name) { this.name = name; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getOperator() { return operator; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setOperator(String operator) { this.operator = operator; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getAttributeName() { return attributeName; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setAttributeName(String attributeName) { this.attributeName = attributeName; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public List<ConditionValue> getValues() { return values; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setValues(List<ConditionValue> values) { this.values = values; }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String conditionValueEntity(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".governance.domain;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import jakarta.persistence.Column;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Entity;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GeneratedValue;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GenerationType;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Id;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Table;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("@Table(name = \"condition_values\")");
    _builder.newLine();
    _builder.append("public class ConditionValue {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GeneratedValue(strategy = GenerationType.IDENTITY)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Long id;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(name = \"match_value\", length = 1000)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String matchValue;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Long getId() { return id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setId(Long id) { this.id = id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getMatchValue() { return matchValue; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setMatchValue(String matchValue) { this.matchValue = matchValue; }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String automationActionEntity(final RefModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _basePackage = this.naming.basePackage(model);
    _builder.append(_basePackage);
    _builder.append(".governance.domain;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import jakarta.persistence.Column;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Entity;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GeneratedValue;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.GenerationType;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Id;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Table;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("@Table(name = \"automation_actions\")");
    _builder.newLine();
    _builder.append("public class AutomationAction {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@GeneratedValue(strategy = GenerationType.IDENTITY)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Long id;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(length = 1000)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String name;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(length = 1000)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String actionKind;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(length = 1000)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String message;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Long getId() { return id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setId(Long id) { this.id = id; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getName() { return name; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setName(String name) { this.name = name; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getActionKind() { return actionKind; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setActionKind(String actionKind) { this.actionKind = actionKind; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getMessage() { return message; }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void setMessage(String message) { this.message = message; }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
