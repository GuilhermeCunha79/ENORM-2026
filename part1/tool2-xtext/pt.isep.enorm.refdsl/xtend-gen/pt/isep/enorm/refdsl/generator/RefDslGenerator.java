/**
 * P1 Activity 6: textual + PlantUML projections.
 * P2 Activity 5/6: Spring Boot backend skeleton under generated-backend/<scenario>/.
 */
package pt.isep.enorm.refdsl.generator;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import pt.isep.enorm.refdsl.refDsl.Action;
import pt.isep.enorm.refdsl.refDsl.Attribute;
import pt.isep.enorm.refdsl.refDsl.AuthorizationRule;
import pt.isep.enorm.refdsl.refDsl.AutomationRule;
import pt.isep.enorm.refdsl.refDsl.Condition;
import pt.isep.enorm.refdsl.refDsl.ConditionValue;
import pt.isep.enorm.refdsl.refDsl.ContextType;
import pt.isep.enorm.refdsl.refDsl.FeedbackDefinition;
import pt.isep.enorm.refdsl.refDsl.FeedbackPolicy;
import pt.isep.enorm.refdsl.refDsl.FeedbackStatus;
import pt.isep.enorm.refdsl.refDsl.FeedbackType;
import pt.isep.enorm.refdsl.refDsl.ModerationPolicy;
import pt.isep.enorm.refdsl.refDsl.RatingPolicy;
import pt.isep.enorm.refdsl.refDsl.RefModel;
import pt.isep.enorm.refdsl.refDsl.ResourceRelation;
import pt.isep.enorm.refdsl.refDsl.ResourceType;
import pt.isep.enorm.refdsl.refDsl.SortingPolicy;
import pt.isep.enorm.refdsl.refDsl.UserType;
import pt.isep.enorm.refdsl.refDsl.ValidationRule;
import pt.isep.enorm.refdsl.refDsl.VerificationPolicy;

/**
 * Generates projections and REF backend code from .refdsl models.
 */
@SuppressWarnings("all")
public class RefDslGenerator extends AbstractGenerator {
  private final RefBackendGenerator backendGenerator = new RefBackendGenerator();

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final List<RefModel> roots = IterableExtensions.<RefModel>toList(Iterables.<RefModel>filter(resource.getContents(), RefModel.class));
    boolean _isEmpty = roots.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      for (final RefModel model : roots) {
        {
          final String baseName = this.safeFileName(model.getName());
          final String texto = this.buildTextProjection(model);
          final String plantuml = this.buildPlantUmlProjection(model);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("projections/");
          _builder.append(baseName);
          _builder.append(".txt");
          fsa.generateFile(_builder.toString(), texto);
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("projections/");
          _builder_1.append(baseName);
          _builder_1.append(".puml");
          fsa.generateFile(_builder_1.toString(), plantuml);
          this.backendGenerator.generate(model, fsa);
        }
      }
    }
  }

  public String safeFileName(final String name) {
    String _xblockexpression = null;
    {
      if (((name == null) || name.isEmpty())) {
        return "UnnamedRefModel";
      }
      _xblockexpression = name.replaceAll("[^A-Za-z0-9_-]", "_");
    }
    return _xblockexpression;
  }

  /**
   * Percorre o modelo e devolve texto legível (Activity 6).
   */
  public String buildTextProjection(final RefModel m) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      sb.append("REF MODEL: ").append(this.nullToEmpty(m.getName()));
      sb.append(" (version=").append(this.nullToEmpty(m.getVersion())).append(")\n\n");
      sb.append("USER TYPES:\n");
      EList<UserType> _userTypes = m.getUserTypes();
      for (final UserType u : _userTypes) {
        {
          sb.append("- ").append(this.nullToEmpty(u.getName())).append(" kind=").append(u.getKind());
          final Function1<UserType, String> _function = (UserType it) -> {
            return it.getName();
          };
          sb.append(" superTypes=").append(IterableExtensions.join(ListExtensions.<UserType, String>map(u.getSuperTypes(), _function), ", ")).append("\n");
        }
      }
      sb.append("\nRESOURCE TYPES:\n");
      EList<ResourceType> _resourceTypes = m.getResourceTypes();
      for (final ResourceType r : _resourceTypes) {
        {
          sb.append("- ").append(this.nullToEmpty(r.getName())).append(" supportsMedia=").append(r.isSupportsMedia());
          final Function1<ResourceType, String> _function = (ResourceType it) -> {
            return it.getName();
          };
          sb.append(" superTypes=").append(IterableExtensions.join(ListExtensions.<ResourceType, String>map(r.getSuperTypes(), _function), ", ")).append("\n");
          sb.append("  ATTRIBUTES:\n");
          EList<Attribute> _attributes = r.getAttributes();
          for (final Attribute a : _attributes) {
            {
              sb.append("  * ").append(this.nullToEmpty(a.getName())).append(" : ").append(a.getType());
              sb.append(" required=").append(a.isRequired()).append(" multi=").append(a.isMultiValued()).append("\n");
            }
          }
        }
      }
      sb.append("\nCONTEXT TYPES:\n");
      EList<ContextType> _contextTypes = m.getContextTypes();
      for (final ContextType c : _contextTypes) {
        {
          sb.append("- ").append(this.nullToEmpty(c.getName())).append(" kind=").append(c.getKind());
          final Function1<ResourceType, String> _function = (ResourceType it) -> {
            return it.getName();
          };
          sb.append(" contains=[").append(IterableExtensions.join(ListExtensions.<ResourceType, String>map(c.getContains(), _function), ", ")).append("]\n");
        }
      }
      sb.append("\nRESOURCE RELATIONS:\n");
      EList<ResourceRelation> _resourceRelations = m.getResourceRelations();
      for (final ResourceRelation rr : _resourceRelations) {
        {
          sb.append("- ").append(this.nullToEmpty(rr.getName()));
          StringBuilder _append = sb.append(" source=");
          ResourceType _source = rr.getSource();
          String _name = null;
          if (_source!=null) {
            _name=_source.getName();
          }
          StringBuilder _append_1 = _append.append(_name).append(" target=");
          ResourceType _target = rr.getTarget();
          String _name_1 = null;
          if (_target!=null) {
            _name_1=_target.getName();
          }
          _append_1.append(_name_1);
          sb.append(" srcCard=").append(this.nullToEmpty(rr.getSourceCardinality())).append(" tgtCard=").append(this.nullToEmpty(rr.getTargetCardinality()));
          sb.append(" containment=").append(rr.isContainment()).append(" recursive=").append(rr.isRecursive()).append("\n");
        }
      }
      sb.append("\nFEEDBACK TYPES:\n");
      EList<FeedbackType> _feedbackTypes = m.getFeedbackTypes();
      for (final FeedbackType f : _feedbackTypes) {
        {
          sb.append("- ").append(this.nullToEmpty(f.getName())).append(" kind=").append(f.getKind());
          sb.append(" scope=").append(f.getSubjectScope()).append(" hasRating=").append(f.isHasRating());
          sb.append(" recursive=").append(f.isRecursive()).append(" allowsText=").append(f.isAllowsText());
          sb.append(" allowsMedia=").append(f.isAllowsMedia()).append(" polarity=").append(f.getPolarity()).append("\n");
        }
      }
      sb.append("\nFEEDBACK DEFINITIONS:\n");
      EList<FeedbackDefinition> _feedbackDefinitions = m.getFeedbackDefinitions();
      for (final FeedbackDefinition fd : _feedbackDefinitions) {
        {
          StringBuilder _append = sb.append("- ").append(this.nullToEmpty(fd.getName())).append(" type=");
          FeedbackType _type = fd.getType();
          String _name = null;
          if (_type!=null) {
            _name=_type.getName();
          }
          _append.append(_name);
          StringBuilder _append_1 = sb.append(" author=");
          UserType _author = fd.getAuthor();
          String _name_1 = null;
          if (_author!=null) {
            _name_1=_author.getName();
          }
          StringBuilder _append_2 = _append_1.append(_name_1).append(" subjectResource=");
          ResourceType _subjectResource = fd.getSubjectResource();
          String _name_2 = null;
          if (_subjectResource!=null) {
            _name_2=_subjectResource.getName();
          }
          _append_2.append(_name_2);
          StringBuilder _append_3 = sb.append(" subjectFeedback=");
          FeedbackDefinition _subjectFeedback = fd.getSubjectFeedback();
          String _name_3 = null;
          if (_subjectFeedback!=null) {
            _name_3=_subjectFeedback.getName();
          }
          _append_3.append(_name_3).append("\n");
          sb.append("  requiresVerifiedContext=").append(fd.isRequiresVerifiedContext()).append(" verificationRequirement=").append(fd.getVerificationRequirement());
          sb.append(" uniquePerAuthorTarget=").append(fd.isUniquePerAuthorTarget()).append("\n");
          StringBuilder _append_4 = sb.append("  policy.status=");
          FeedbackPolicy _policy = fd.getPolicy();
          FeedbackStatus _status = null;
          if (_policy!=null) {
            _status=_policy.getStatus();
          }
          _append_4.append(_status).append("\n");
          RatingPolicy _rating = fd.getRating();
          boolean _tripleNotEquals = (_rating != null);
          if (_tripleNotEquals) {
            sb.append("  rating=[min=").append(fd.getRating().getMinValue()).append(" max=").append(fd.getRating().getMaxValue()).append(" step=").append(fd.getRating().getStep()).append("]\n");
          }
        }
      }
      sb.append("\nAUTHORIZATION RULES:\n");
      EList<AuthorizationRule> _authorizationRules = m.getAuthorizationRules();
      for (final AuthorizationRule ar : _authorizationRules) {
        {
          StringBuilder _append = sb.append("- name=").append(ar.getName()).append(" action=").append(ar.getAllowedAction()).append(" actor=");
          UserType _actor = ar.getActor();
          String _name = null;
          if (_actor!=null) {
            _name=_actor.getName();
          }
          _append.append(_name);
          StringBuilder _append_1 = sb.append(" context=");
          ContextType _context = ar.getContext();
          String _name_1 = null;
          if (_context!=null) {
            _name_1=_context.getName();
          }
          StringBuilder _append_2 = _append_1.append(_name_1).append(" resourceTarget=");
          ResourceType _resourceTarget = ar.getResourceTarget();
          String _name_2 = null;
          if (_resourceTarget!=null) {
            _name_2=_resourceTarget.getName();
          }
          _append_2.append(_name_2);
          StringBuilder _append_3 = sb.append(" feedbackTarget=");
          FeedbackDefinition _feedbackTarget = ar.getFeedbackTarget();
          String _name_3 = null;
          if (_feedbackTarget!=null) {
            _name_3=_feedbackTarget.getName();
          }
          _append_3.append(_name_3).append("\n");
        }
      }
      sb.append("\nVALIDATION RULES:\n");
      EList<ValidationRule> _validationRules = m.getValidationRules();
      for (final ValidationRule v : _validationRules) {
        {
          sb.append("- ").append(this.nullToEmpty(v.getName())).append(" kind=").append(v.getKind()).append(" severity=").append(v.getSeverity());
          sb.append(" expr=").append(this.nullToEmpty(v.getExpression())).append(" impl=").append(this.nullToEmpty(v.getImplementationId()));
          StringBuilder _append = sb.append(" appliesToResource=");
          ResourceType _appliesToResource = v.getAppliesToResource();
          String _name = null;
          if (_appliesToResource!=null) {
            _name=_appliesToResource.getName();
          }
          StringBuilder _append_1 = _append.append(_name).append(" appliesToFeedback=");
          FeedbackDefinition _appliesToFeedback = v.getAppliesToFeedback();
          String _name_1 = null;
          if (_appliesToFeedback!=null) {
            _name_1=_appliesToFeedback.getName();
          }
          _append_1.append(_name_1);
          StringBuilder _append_2 = sb.append(" invokedBy=");
          AutomationRule _invokedBy = v.getInvokedBy();
          String _name_2 = null;
          if (_invokedBy!=null) {
            _name_2=_invokedBy.getName();
          }
          _append_2.append(_name_2).append("\n");
        }
      }
      sb.append("\nMODERATION POLICIES:\n");
      EList<ModerationPolicy> _moderationPolicies = m.getModerationPolicies();
      for (final ModerationPolicy mp : _moderationPolicies) {
        {
          sb.append("- ").append(this.nullToEmpty(mp.getName())).append(" mode=").append(mp.getMode()).append(" trigger=").append(mp.getTrigger());
          StringBuilder _append = sb.append(" decision=").append(mp.getDecision()).append(" executedBy=");
          UserType _executedBy = mp.getExecutedBy();
          String _name = null;
          if (_executedBy!=null) {
            _name=_executedBy.getName();
          }
          StringBuilder _append_1 = _append.append(_name).append(" inContext=");
          ContextType _inContext = mp.getInContext();
          String _name_1 = null;
          if (_inContext!=null) {
            _name_1=_inContext.getName();
          }
          _append_1.append(_name_1).append("\n");
          StringBuilder _append_2 = sb.append("  monitorsResource=");
          ResourceType _monitorsResource = mp.getMonitorsResource();
          String _name_2 = null;
          if (_monitorsResource!=null) {
            _name_2=_monitorsResource.getName();
          }
          StringBuilder _append_3 = _append_2.append(_name_2).append(" monitorsFeedback=");
          FeedbackDefinition _monitorsFeedback = mp.getMonitorsFeedback();
          String _name_3 = null;
          if (_monitorsFeedback!=null) {
            _name_3=_monitorsFeedback.getName();
          }
          _append_3.append(_name_3).append("\n");
        }
      }
      sb.append("\nAUTOMATION RULES:\n");
      EList<AutomationRule> _automationRules = m.getAutomationRules();
      for (final AutomationRule a : _automationRules) {
        {
          sb.append("- ").append(this.nullToEmpty(a.getName())).append(" trigger=").append(a.getTrigger());
          StringBuilder _append = sb.append(" context=");
          ResourceType _context = a.getContext();
          String _name = null;
          if (_context!=null) {
            _name=_context.getName();
          }
          StringBuilder _append_1 = _append.append(_name).append(" inContext=");
          ContextType _inContext = a.getInContext();
          String _name_1 = null;
          if (_inContext!=null) {
            _name_1=_inContext.getName();
          }
          _append_1.append(_name_1);
          StringBuilder _append_2 = sb.append(" onFeedback=");
          FeedbackDefinition _onFeedback = a.getOnFeedback();
          String _name_2 = null;
          if (_onFeedback!=null) {
            _name_2=_onFeedback.getName();
          }
          StringBuilder _append_3 = _append_2.append(_name_2).append(" uses=");
          ValidationRule _uses = a.getUses();
          String _name_3 = null;
          if (_uses!=null) {
            _name_3=_uses.getName();
          }
          _append_3.append(_name_3);
          final Function1<ValidationRule, String> _function = (ValidationRule it) -> {
            return it.getName();
          };
          sb.append(" invokedValidationRules=[").append(IterableExtensions.join(ListExtensions.<ValidationRule, String>map(a.getInvokedValidationRules(), _function), ", ")).append("]\n");
          sb.append("  CONDITIONS:\n");
          EList<Condition> _conditions = a.getConditions();
          for (final Condition cond : _conditions) {
            {
              sb.append("    * ").append(this.nullToEmpty(cond.getName())).append(" operator=").append(cond.getOperator());
              StringBuilder _append_4 = sb.append(" attribute=");
              Attribute _attribute = cond.getAttribute();
              String _name_4 = null;
              if (_attribute!=null) {
                _name_4=_attribute.getName();
              }
              _append_4.append(_name_4).append(" values=[");
              final Function1<ConditionValue, String> _function_1 = (ConditionValue it) -> {
                return it.getValue();
              };
              sb.append(IterableExtensions.join(ListExtensions.<ConditionValue, String>map(cond.getChildren(), _function_1), ", ")).append("]\n");
            }
          }
          sb.append("  ACTIONS:\n");
          EList<Action> _actions = a.getActions();
          for (final Action act : _actions) {
            sb.append("    * ").append(this.nullToEmpty(act.getName())).append(" kind=").append(act.getKind()).append(" message=").append(act.getMessage()).append("\n");
          }
        }
      }
      sb.append("\nVERIFICATION POLICIES:\n");
      EList<VerificationPolicy> _verificationPolicies = m.getVerificationPolicies();
      for (final VerificationPolicy vp : _verificationPolicies) {
        {
          sb.append("- ").append(this.nullToEmpty(vp.getName())).append(" mode=").append(vp.getMode()).append(" appliesWhen=").append(vp.getAppliesWhen());
          StringBuilder _append = sb.append(" verifies=");
          FeedbackDefinition _verifies = vp.getVerifies();
          String _name = null;
          if (_verifies!=null) {
            _name=_verifies.getName();
          }
          _append.append(_name).append("\n");
        }
      }
      sb.append("\nSORTING POLICIES:\n");
      EList<SortingPolicy> _sortingPolicies = m.getSortingPolicies();
      for (final SortingPolicy sp : _sortingPolicies) {
        {
          sb.append("- ").append(this.nullToEmpty(sp.getName())).append(" criterion=").append(sp.getCriterion()).append(" direction=").append(sp.getDirection());
          StringBuilder _append = sb.append(" appliesToResource=");
          ResourceType _appliesToResource = sp.getAppliesToResource();
          String _name = null;
          if (_appliesToResource!=null) {
            _name=_appliesToResource.getName();
          }
          StringBuilder _append_1 = _append.append(_name).append(" appliesToFeedback=");
          FeedbackDefinition _appliesToFeedback = sp.getAppliesToFeedback();
          String _name_1 = null;
          if (_appliesToFeedback!=null) {
            _name_1=_appliesToFeedback.getName();
          }
          _append_1.append(_name_1);
          StringBuilder _append_2 = sb.append(" inContext=");
          ContextType _inContext = sp.getInContext();
          String _name_2 = null;
          if (_inContext!=null) {
            _name_2=_inContext.getName();
          }
          _append_2.append(_name_2).append("\n");
        }
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }

  /**
   * Diagrama objeto-relacional compacto para PlantUML.
   */
  public String buildPlantUmlProjection(final RefModel m) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      sb.append("@startuml\n");
      sb.append("title REF Model - ").append(this.nullToEmpty(m.getName())).append("\n");
      sb.append("skinparam classAttributeIconSize 0\n\n");
      sb.append("class RefModel {\n  name = ").append(this.nullToEmpty(m.getName()));
      sb.append("\n  version = ").append(this.nullToEmpty(m.getVersion())).append("\n}\n");
      EList<UserType> _userTypes = m.getUserTypes();
      for (final UserType u : _userTypes) {
        {
          sb.append("\nclass UserType_").append(this.safeId(u.getName())).append(" {\n  name = ").append(u.getName());
          sb.append("\n  kind = ").append(u.getKind()).append("\n}\n");
          sb.append("RefModel --> UserType_").append(this.safeId(u.getName())).append("\n");
          EList<UserType> _superTypes = u.getSuperTypes();
          for (final UserType st : _superTypes) {
            sb.append("UserType_").append(this.safeId(u.getName())).append(" --|> UserType_").append(this.safeId(st.getName())).append("\n");
          }
        }
      }
      EList<ResourceType> _resourceTypes = m.getResourceTypes();
      for (final ResourceType r : _resourceTypes) {
        {
          sb.append("\nclass ResourceType_").append(this.safeId(r.getName())).append(" {\n  name = ").append(r.getName());
          sb.append("\n  supportsMedia = ").append(r.isSupportsMedia()).append("\n}\n");
          sb.append("RefModel --> ResourceType_").append(this.safeId(r.getName())).append("\n");
          EList<ResourceType> _superTypes = r.getSuperTypes();
          for (final ResourceType st : _superTypes) {
            sb.append("ResourceType_").append(this.safeId(r.getName())).append(" --|> ResourceType_").append(this.safeId(st.getName())).append("\n");
          }
          EList<Attribute> _attributes = r.getAttributes();
          for (final Attribute a : _attributes) {
            {
              sb.append("class Attribute_").append(this.safeId(r.getName())).append("_").append(this.safeId(a.getName())).append(" {\n");
              sb.append("  name = ").append(a.getName()).append("\n  type = ").append(a.getType());
              sb.append("\n  required = ").append(a.isRequired()).append("\n  multiValued = ").append(a.isMultiValued()).append("\n}\n");
              sb.append("ResourceType_").append(this.safeId(r.getName())).append(" *-- Attribute_").append(this.safeId(r.getName()));
              sb.append("_").append(this.safeId(a.getName())).append("\n");
            }
          }
        }
      }
      EList<ContextType> _contextTypes = m.getContextTypes();
      for (final ContextType c : _contextTypes) {
        {
          sb.append("\nclass ContextType_").append(this.safeId(c.getName())).append(" {\n  name = ").append(c.getName());
          sb.append("\n  kind = ").append(c.getKind()).append("\n}\n");
          sb.append("RefModel --> ContextType_").append(this.safeId(c.getName())).append("\n");
          EList<ResourceType> _contains = c.getContains();
          for (final ResourceType ct : _contains) {
            sb.append("ContextType_").append(this.safeId(c.getName())).append(" --> ResourceType_").append(this.safeId(ct.getName())).append(" : contains\n");
          }
        }
      }
      EList<ResourceRelation> _resourceRelations = m.getResourceRelations();
      for (final ResourceRelation rr : _resourceRelations) {
        {
          ResourceType _source = rr.getSource();
          String _name = null;
          if (_source!=null) {
            _name=_source.getName();
          }
          sb.append("ResourceType_").append(this.safeId(_name)).append(" --> ResourceType_");
          ResourceType _target = rr.getTarget();
          String _name_1 = null;
          if (_target!=null) {
            _name_1=_target.getName();
          }
          sb.append(this.safeId(_name_1)).append(" : ").append(rr.getName()).append(" [");
          sb.append(rr.getSourceCardinality()).append("..").append(rr.getTargetCardinality()).append("] recursive=").append(rr.isRecursive()).append("\n");
        }
      }
      EList<FeedbackType> _feedbackTypes = m.getFeedbackTypes();
      for (final FeedbackType f : _feedbackTypes) {
        {
          sb.append("\nclass FeedbackType_").append(this.safeId(f.getName())).append(" {\n  name = ").append(f.getName());
          sb.append("\n  kind = ").append(f.getKind()).append("\n  subjectScope = ").append(f.getSubjectScope()).append("\n  hasRating = ").append(f.isHasRating());
          sb.append("\n  recursive = ").append(f.isRecursive()).append("\n  allowsText = ").append(f.isAllowsText());
          sb.append("\n  allowsMedia = ").append(f.isAllowsMedia()).append("\n  polarity = ").append(f.getPolarity()).append("\n}\n");
          sb.append("RefModel --> FeedbackType_").append(this.safeId(f.getName())).append("\n");
        }
      }
      EList<FeedbackDefinition> _feedbackDefinitions = m.getFeedbackDefinitions();
      for (final FeedbackDefinition fd : _feedbackDefinitions) {
        {
          sb.append("\nclass FeedbackDefinition_").append(this.safeId(fd.getName())).append(" {\n  name = ").append(fd.getName());
          sb.append("\n  requiresVerifiedContext = ").append(fd.isRequiresVerifiedContext()).append("\n  verificationRequirement = ").append(fd.getVerificationRequirement());
          sb.append("\n  uniquePerAuthorTarget = ").append(fd.isUniquePerAuthorTarget()).append("\n}\n");
          sb.append("RefModel --> FeedbackDefinition_").append(this.safeId(fd.getName())).append("\n");
          FeedbackType _type = fd.getType();
          String _name = null;
          if (_type!=null) {
            _name=_type.getName();
          }
          sb.append("FeedbackDefinition_").append(this.safeId(fd.getName())).append(" --> FeedbackType_").append(this.safeId(_name)).append(" : type\n");
          UserType _author = fd.getAuthor();
          String _name_1 = null;
          if (_author!=null) {
            _name_1=_author.getName();
          }
          sb.append("FeedbackDefinition_").append(this.safeId(fd.getName())).append(" --> UserType_").append(this.safeId(_name_1)).append(" : author\n");
          ResourceType _subjectResource = fd.getSubjectResource();
          boolean _tripleNotEquals = (_subjectResource != null);
          if (_tripleNotEquals) {
            sb.append("FeedbackDefinition_").append(this.safeId(fd.getName())).append(" --> ResourceType_").append(this.safeId(fd.getSubjectResource().getName())).append(" : subjectResource\n");
          }
          FeedbackDefinition _subjectFeedback = fd.getSubjectFeedback();
          boolean _tripleNotEquals_1 = (_subjectFeedback != null);
          if (_tripleNotEquals_1) {
            sb.append("FeedbackDefinition_").append(this.safeId(fd.getName())).append(" --> FeedbackDefinition_").append(this.safeId(fd.getSubjectFeedback().getName())).append(" : subjectFeedback\n");
          }
          FeedbackPolicy _policy = fd.getPolicy();
          boolean _tripleNotEquals_2 = (_policy != null);
          if (_tripleNotEquals_2) {
            sb.append("class FeedbackPolicy_").append(this.safeId(fd.getName())).append(" {\n  status = ").append(fd.getPolicy().getStatus()).append("\n}\n");
            sb.append("FeedbackDefinition_").append(this.safeId(fd.getName())).append(" *-- FeedbackPolicy_").append(this.safeId(fd.getName())).append("\n");
          }
          RatingPolicy _rating = fd.getRating();
          boolean _tripleNotEquals_3 = (_rating != null);
          if (_tripleNotEquals_3) {
            sb.append("class RatingPolicy_").append(this.safeId(fd.getName())).append(" {\n  min = ").append(fd.getRating().getMinValue()).append("\n  max = ").append(fd.getRating().getMaxValue()).append("\n  step = ").append(fd.getRating().getStep()).append("\n}\n");
            sb.append("FeedbackDefinition_").append(this.safeId(fd.getName())).append(" *-- RatingPolicy_").append(this.safeId(fd.getName())).append("\n");
          }
        }
      }
      EList<ValidationRule> _validationRules = m.getValidationRules();
      for (final ValidationRule v : _validationRules) {
        {
          sb.append("\nclass ValidationRule_").append(this.safeId(v.getName())).append(" {\n  name = ").append(v.getName());
          sb.append("\n  kind = ").append(v.getKind()).append("\n  severity = ").append(v.getSeverity());
          sb.append("\n  expression = ").append(v.getExpression()).append("\n  implementationId = ").append(v.getImplementationId()).append("\n}\n");
          sb.append("RefModel --> ValidationRule_").append(this.safeId(v.getName())).append("\n");
          ResourceType _appliesToResource = v.getAppliesToResource();
          boolean _tripleNotEquals = (_appliesToResource != null);
          if (_tripleNotEquals) {
            sb.append("ValidationRule_").append(this.safeId(v.getName())).append(" --> ResourceType_").append(this.safeId(v.getAppliesToResource().getName())).append(" : appliesToResource\n");
          }
          FeedbackDefinition _appliesToFeedback = v.getAppliesToFeedback();
          boolean _tripleNotEquals_1 = (_appliesToFeedback != null);
          if (_tripleNotEquals_1) {
            sb.append("ValidationRule_").append(this.safeId(v.getName())).append(" --> FeedbackDefinition_").append(this.safeId(v.getAppliesToFeedback().getName())).append(" : appliesToFeedback\n");
          }
        }
      }
      EList<AuthorizationRule> _authorizationRules = m.getAuthorizationRules();
      for (final AuthorizationRule ar : _authorizationRules) {
        {
          final String id = this.authRuleId(ar);
          sb.append("\nclass AuthorizationRule_").append(id).append(" {\n  name = ").append(ar.getName()).append("\n  allowedAction = ").append(ar.getAllowedAction()).append("\n}\n");
          sb.append("RefModel --> AuthorizationRule_").append(id).append("\n");
          UserType _actor = ar.getActor();
          String _name = null;
          if (_actor!=null) {
            _name=_actor.getName();
          }
          sb.append("AuthorizationRule_").append(id).append(" --> UserType_").append(this.safeId(_name)).append(" : actor\n");
          ResourceType _resourceTarget = ar.getResourceTarget();
          String _name_1 = null;
          if (_resourceTarget!=null) {
            _name_1=_resourceTarget.getName();
          }
          sb.append("AuthorizationRule_").append(id).append(" --> ResourceType_").append(this.safeId(_name_1)).append(" : resourceTarget\n");
          FeedbackDefinition _feedbackTarget = ar.getFeedbackTarget();
          boolean _tripleNotEquals = (_feedbackTarget != null);
          if (_tripleNotEquals) {
            sb.append("AuthorizationRule_").append(id).append(" --> FeedbackDefinition_").append(this.safeId(ar.getFeedbackTarget().getName())).append(" : feedbackTarget\n");
          }
          ContextType _context = ar.getContext();
          boolean _tripleNotEquals_1 = (_context != null);
          if (_tripleNotEquals_1) {
            sb.append("AuthorizationRule_").append(id).append(" --> ContextType_").append(this.safeId(ar.getContext().getName())).append(" : context\n");
          }
        }
      }
      EList<ModerationPolicy> _moderationPolicies = m.getModerationPolicies();
      for (final ModerationPolicy mp : _moderationPolicies) {
        {
          sb.append("\nclass ModerationPolicy_").append(this.safeId(mp.getName())).append(" {\n  name = ").append(mp.getName());
          sb.append("\n  mode = ").append(mp.getMode()).append("\n  trigger = ").append(mp.getTrigger()).append("\n  decision = ").append(mp.getDecision()).append("\n}\n");
          sb.append("RefModel --> ModerationPolicy_").append(this.safeId(mp.getName())).append("\n");
          ResourceType _monitorsResource = mp.getMonitorsResource();
          String _name = null;
          if (_monitorsResource!=null) {
            _name=_monitorsResource.getName();
          }
          sb.append("ModerationPolicy_").append(this.safeId(mp.getName())).append(" --> ResourceType_").append(this.safeId(_name)).append(" : monitorsResource\n");
          FeedbackDefinition _monitorsFeedback = mp.getMonitorsFeedback();
          String _name_1 = null;
          if (_monitorsFeedback!=null) {
            _name_1=_monitorsFeedback.getName();
          }
          sb.append("ModerationPolicy_").append(this.safeId(mp.getName())).append(" --> FeedbackDefinition_").append(this.safeId(_name_1)).append(" : monitorsFeedback\n");
          UserType _executedBy = mp.getExecutedBy();
          String _name_2 = null;
          if (_executedBy!=null) {
            _name_2=_executedBy.getName();
          }
          sb.append("ModerationPolicy_").append(this.safeId(mp.getName())).append(" --> UserType_").append(this.safeId(_name_2)).append(" : executedBy\n");
          ContextType _inContext = mp.getInContext();
          boolean _tripleNotEquals = (_inContext != null);
          if (_tripleNotEquals) {
            sb.append("ModerationPolicy_").append(this.safeId(mp.getName())).append(" --> ContextType_").append(this.safeId(mp.getInContext().getName())).append(" : inContext\n");
          }
        }
      }
      EList<AutomationRule> _automationRules = m.getAutomationRules();
      for (final AutomationRule a : _automationRules) {
        {
          sb.append("\nclass AutomationRule_").append(this.safeId(a.getName())).append(" {\n  name = ").append(a.getName()).append("\n  trigger = ").append(a.getTrigger()).append("\n}\n");
          sb.append("RefModel --> AutomationRule_").append(this.safeId(a.getName())).append("\n");
          ResourceType _context = a.getContext();
          boolean _tripleNotEquals = (_context != null);
          if (_tripleNotEquals) {
            sb.append("AutomationRule_").append(this.safeId(a.getName())).append(" --> ResourceType_").append(this.safeId(a.getContext().getName())).append(" : context\n");
          }
          ContextType _inContext = a.getInContext();
          boolean _tripleNotEquals_1 = (_inContext != null);
          if (_tripleNotEquals_1) {
            sb.append("AutomationRule_").append(this.safeId(a.getName())).append(" --> ContextType_").append(this.safeId(a.getInContext().getName())).append(" : inContext\n");
          }
          FeedbackDefinition _onFeedback = a.getOnFeedback();
          String _name = null;
          if (_onFeedback!=null) {
            _name=_onFeedback.getName();
          }
          sb.append("AutomationRule_").append(this.safeId(a.getName())).append(" --> FeedbackDefinition_").append(this.safeId(_name)).append(" : onFeedback\n");
          ValidationRule _uses = a.getUses();
          String _name_1 = null;
          if (_uses!=null) {
            _name_1=_uses.getName();
          }
          sb.append("AutomationRule_").append(this.safeId(a.getName())).append(" --> ValidationRule_").append(this.safeId(_name_1)).append(" : uses\n");
          EList<Condition> _conditions = a.getConditions();
          for (final Condition cond : _conditions) {
            sb.append("AutomationRule_").append(this.safeId(a.getName())).append(" --> Condition_").append(this.safeId(a.getName())).append("_").append(this.safeId(cond.getName())).append(" : condition\n");
          }
          EList<Action> _actions = a.getActions();
          for (final Action act : _actions) {
            sb.append("AutomationRule_").append(this.safeId(a.getName())).append(" --> Action_").append(this.safeId(a.getName())).append("_").append(this.safeId(act.getName())).append(" : action\n");
          }
        }
      }
      EList<AutomationRule> _automationRules_1 = m.getAutomationRules();
      for (final AutomationRule a_1 : _automationRules_1) {
        {
          EList<Condition> _conditions = a_1.getConditions();
          for (final Condition cond : _conditions) {
            {
              sb.append("class Condition_").append(this.safeId(a_1.getName())).append("_").append(this.safeId(cond.getName())).append(" {\n");
              sb.append("  name = ").append(cond.getName()).append("\n  operator = ").append(cond.getOperator());
              StringBuilder _append = sb.append("\n  attribute = ");
              Attribute _attribute = cond.getAttribute();
              String _name = null;
              if (_attribute!=null) {
                _name=_attribute.getName();
              }
              _append.append(_name).append("\n}\n");
            }
          }
          EList<Action> _actions = a_1.getActions();
          for (final Action act : _actions) {
            {
              sb.append("class Action_").append(this.safeId(a_1.getName())).append("_").append(this.safeId(act.getName())).append(" {\n");
              sb.append("  name = ").append(act.getName()).append("\n  kind = ").append(act.getKind()).append("\n  message = ").append(act.getMessage()).append("\n}\n");
            }
          }
        }
      }
      EList<VerificationPolicy> _verificationPolicies = m.getVerificationPolicies();
      for (final VerificationPolicy vp : _verificationPolicies) {
        {
          sb.append("\nclass VerificationPolicy_").append(this.safeId(vp.getName())).append(" {\n  name = ").append(vp.getName());
          sb.append("\n  mode = ").append(vp.getMode()).append("\n  appliesWhen = ").append(vp.getAppliesWhen()).append("\n}\n");
          sb.append("RefModel --> VerificationPolicy_").append(this.safeId(vp.getName())).append("\n");
          FeedbackDefinition _verifies = vp.getVerifies();
          String _name = null;
          if (_verifies!=null) {
            _name=_verifies.getName();
          }
          sb.append("VerificationPolicy_").append(this.safeId(vp.getName())).append(" --> FeedbackDefinition_").append(this.safeId(_name)).append(" : verifies\n");
        }
      }
      EList<SortingPolicy> _sortingPolicies = m.getSortingPolicies();
      for (final SortingPolicy sp : _sortingPolicies) {
        {
          sb.append("\nclass SortingPolicy_").append(this.safeId(sp.getName())).append(" {\n  name = ").append(sp.getName());
          sb.append("\n  criterion = ").append(sp.getCriterion()).append("\n  direction = ").append(sp.getDirection()).append("\n}\n");
          sb.append("RefModel --> SortingPolicy_").append(this.safeId(sp.getName())).append("\n");
          ResourceType _appliesToResource = sp.getAppliesToResource();
          String _name = null;
          if (_appliesToResource!=null) {
            _name=_appliesToResource.getName();
          }
          sb.append("SortingPolicy_").append(this.safeId(sp.getName())).append(" --> ResourceType_").append(this.safeId(_name));
          sb.append(" : appliesToResource\n");
          FeedbackDefinition _appliesToFeedback = sp.getAppliesToFeedback();
          String _name_1 = null;
          if (_appliesToFeedback!=null) {
            _name_1=_appliesToFeedback.getName();
          }
          sb.append("SortingPolicy_").append(this.safeId(sp.getName())).append(" --> FeedbackDefinition_").append(this.safeId(_name_1));
          sb.append(" : appliesToFeedback\n");
          ContextType _inContext = sp.getInContext();
          String _name_2 = null;
          if (_inContext!=null) {
            _name_2=_inContext.getName();
          }
          sb.append("SortingPolicy_").append(this.safeId(sp.getName())).append(" --> ContextType_").append(this.safeId(_name_2)).append(" : inContext\n");
        }
      }
      sb.append("\n@enduml\n");
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }

  public String nullToEmpty(final String s) {
    String _xifexpression = null;
    if ((s == null)) {
      _xifexpression = "";
    } else {
      _xifexpression = s;
    }
    return _xifexpression;
  }

  public String authRuleId(final AuthorizationRule ar) {
    String _xblockexpression = null;
    {
      boolean _and = false;
      String _name = null;
      if (ar!=null) {
        _name=ar.getName();
      }
      boolean _tripleNotEquals = (_name != null);
      if (!_tripleNotEquals) {
        _and = false;
      } else {
        boolean _isEmpty = ar.getName().isEmpty();
        boolean _not = (!_isEmpty);
        _and = _not;
      }
      if (_and) {
        return this.safeId(ar.getName());
      }
      String _literal = ar.getAllowedAction().getLiteral();
      String _plus = (_literal + "_");
      UserType _actor = ar.getActor();
      String _name_1 = null;
      if (_actor!=null) {
        _name_1=_actor.getName();
      }
      String _plus_1 = (_plus + _name_1);
      _xblockexpression = this.safeId(_plus_1);
    }
    return _xblockexpression;
  }

  public String safeId(final String raw) {
    String _xblockexpression = null;
    {
      if (((raw == null) || raw.isEmpty())) {
        return "UNNAMED";
      }
      _xblockexpression = raw.replaceAll("[^A-Za-z0-9_]", "_");
    }
    return _xblockexpression;
  }
}
