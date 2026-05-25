/**
 */
package enorm.impl;

import enorm.Action;
import enorm.ActionKind;
import enorm.ActionResultKind;
import enorm.Attribute;
import enorm.AuthorizationRule;
import enorm.AutomationRule;
import enorm.Condition;
import enorm.ConditionOperator;
import enorm.ConditionValue;
import enorm.ContextKind;
import enorm.ContextType;
import enorm.EnormFactory;
import enorm.EnormPackage;
import enorm.FeedbackDefinition;
import enorm.FeedbackKind;
import enorm.FeedbackPolarity;
import enorm.FeedbackPolicy;
import enorm.FeedbackStatus;
import enorm.FeedbackSubjectScope;
import enorm.FeedbackType;
import enorm.ModerationDecision;
import enorm.ModerationMode;
import enorm.ModerationPolicy;
import enorm.PrimitiveType;
import enorm.RatingPolicy;
import enorm.RefModel;
import enorm.ResourceRelation;
import enorm.ResourceType;
import enorm.RuleSeverity;
import enorm.SortCriterion;
import enorm.SortDirection;
import enorm.SortingPolicy;
import enorm.TriggerEvent;
import enorm.UserKind;
import enorm.UserType;
import enorm.ValidationKind;
import enorm.ValidationRule;
import enorm.VerificationPolicy;
import enorm.VerificationRequirement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnormPackageImpl extends EPackageImpl implements EnormPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moderationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum feedbackKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum feedbackSubjectScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum feedbackPolarityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum feedbackStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verificationRequirementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ruleSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moderationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerEventEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moderationDecisionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionResultKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortCriterionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortDirectionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see enorm.EnormPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnormPackageImpl() {
		super(eNS_URI, EnormFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EnormPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnormPackage init() {
		if (isInited)
			return (EnormPackage) EPackage.Registry.INSTANCE.getEPackage(EnormPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEnormPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EnormPackageImpl theEnormPackage = registeredEnormPackage instanceof EnormPackageImpl
				? (EnormPackageImpl) registeredEnormPackage
				: new EnormPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEnormPackage.createPackageContents();

		// Initialize created meta-data
		theEnormPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnormPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnormPackage.eNS_URI, theEnormPackage);
		return theEnormPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefModel() {
		return refModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefModel_Name() {
		return (EAttribute) refModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefModel_Version() {
		return (EAttribute) refModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_UserTypes() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_ResourceTypes() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_ContextTypes() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_ResourceRelations() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_FeedbackTypes() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_FeedbackDefinitions() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_AuthorizationRules() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_ValidationRules() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_ModerationPolicies() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_AutomationRules() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_VerificationPolicies() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_SortingPolicies() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserType() {
		return userTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserType_Name() {
		return (EAttribute) userTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserType_Kind() {
		return (EAttribute) userTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserType_SuperTypes() {
		return (EReference) userTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextType() {
		return contextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextType_Name() {
		return (EAttribute) contextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextType_Kind() {
		return (EAttribute) contextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextType_Contains() {
		return (EReference) contextTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceType() {
		return resourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceType_Name() {
		return (EAttribute) resourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceType_SupportsMedia() {
		return (EAttribute) resourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_SuperTypes() {
		return (EReference) resourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceType_Attributes() {
		return (EReference) resourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Name() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Type() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Required() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_MultiValued() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceRelation() {
		return resourceRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceRelation_Name() {
		return (EAttribute) resourceRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceRelation_SourceCardinality() {
		return (EAttribute) resourceRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceRelation_TargetCardinality() {
		return (EAttribute) resourceRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceRelation_Containment() {
		return (EAttribute) resourceRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceRelation_Recursive() {
		return (EAttribute) resourceRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceRelation_Source() {
		return (EReference) resourceRelationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceRelation_Target() {
		return (EReference) resourceRelationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeedbackType() {
		return feedbackTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackType_Name() {
		return (EAttribute) feedbackTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackType_Kind() {
		return (EAttribute) feedbackTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackType_SubjectScope() {
		return (EAttribute) feedbackTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackType_HasRating() {
		return (EAttribute) feedbackTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackType_Recursive() {
		return (EAttribute) feedbackTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackType_AllowsText() {
		return (EAttribute) feedbackTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackType_AllowsMedia() {
		return (EAttribute) feedbackTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackType_Polarity() {
		return (EAttribute) feedbackTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeedbackDefinition() {
		return feedbackDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackDefinition_Name() {
		return (EAttribute) feedbackDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackDefinition_RequiresVerifiedContext() {
		return (EAttribute) feedbackDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackDefinition_VerificationRequirement() {
		return (EAttribute) feedbackDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackDefinition_UniquePerAuthorTarget() {
		return (EAttribute) feedbackDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackDefinition_Type() {
		return (EReference) feedbackDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackDefinition_SubjectResource() {
		return (EReference) feedbackDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackDefinition_Author() {
		return (EReference) feedbackDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackDefinition_SubjectFeedback() {
		return (EReference) feedbackDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackDefinition_Policy() {
		return (EReference) feedbackDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackDefinition_Rating() {
		return (EReference) feedbackDefinitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeedbackPolicy() {
		return feedbackPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackPolicy_Status() {
		return (EAttribute) feedbackPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRatingPolicy() {
		return ratingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRatingPolicy_MinValue() {
		return (EAttribute) ratingPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRatingPolicy_MaxValue() {
		return (EAttribute) ratingPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRatingPolicy_Step() {
		return (EAttribute) ratingPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidationRule() {
		return validationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationRule_Name() {
		return (EAttribute) validationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationRule_Kind() {
		return (EAttribute) validationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationRule_Severity() {
		return (EAttribute) validationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationRule_Expression() {
		return (EAttribute) validationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationRule_ImplementationId() {
		return (EAttribute) validationRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidationRule_AppliesToResource() {
		return (EReference) validationRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidationRule_AppliesToFeedback() {
		return (EReference) validationRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidationRule_InvokedBy() {
		return (EReference) validationRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModerationPolicy() {
		return moderationPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModerationPolicy_Name() {
		return (EAttribute) moderationPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModerationPolicy_Mode() {
		return (EAttribute) moderationPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModerationPolicy_Trigger() {
		return (EAttribute) moderationPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModerationPolicy_Decision() {
		return (EAttribute) moderationPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModerationPolicy_MonitorsResource() {
		return (EReference) moderationPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModerationPolicy_MonitorsFeedback() {
		return (EReference) moderationPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModerationPolicy_ExecutedBy() {
		return (EReference) moderationPolicyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModerationPolicy_InContext() {
		return (EReference) moderationPolicyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorizationRule() {
		return authorizationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorizationRule_Name() {
		return (EAttribute) authorizationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorizationRule_AllowedAction() {
		return (EAttribute) authorizationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationRule_Actor() {
		return (EReference) authorizationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationRule_Context() {
		return (EReference) authorizationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationRule_ResourceTarget() {
		return (EReference) authorizationRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationRule_FeedbackTarget() {
		return (EReference) authorizationRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAutomationRule() {
		return automationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutomationRule_Name() {
		return (EAttribute) automationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutomationRule_Trigger() {
		return (EAttribute) automationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutomationRule_Context() {
		return (EReference) automationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutomationRule_InContext() {
		return (EReference) automationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutomationRule_OnFeedback() {
		return (EReference) automationRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutomationRule_Uses() {
		return (EReference) automationRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutomationRule_Conditions() {
		return (EReference) automationRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutomationRule_Actions() {
		return (EReference) automationRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCondition_Name() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCondition_Operator() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_Attribute() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_Children() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionValue() {
		return conditionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConditionValue_Value() {
		return (EAttribute) conditionValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Name() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Kind() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Message() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerificationPolicy() {
		return verificationPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerificationPolicy_Name() {
		return (EAttribute) verificationPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerificationPolicy_Mode() {
		return (EAttribute) verificationPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerificationPolicy_AppliesWhen() {
		return (EAttribute) verificationPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerificationPolicy_Verifies() {
		return (EReference) verificationPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSortingPolicy() {
		return sortingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSortingPolicy_Name() {
		return (EAttribute) sortingPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSortingPolicy_Criterion() {
		return (EAttribute) sortingPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSortingPolicy_Direction() {
		return (EAttribute) sortingPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSortingPolicy_AppliesToResource() {
		return (EReference) sortingPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSortingPolicy_AppliesToFeedback() {
		return (EReference) sortingPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSortingPolicy_InContext() {
		return (EReference) sortingPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUserKind() {
		return userKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContextKind() {
		return contextKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrimitiveType() {
		return primitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeedbackKind() {
		return feedbackKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeedbackSubjectScope() {
		return feedbackSubjectScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeedbackPolarity() {
		return feedbackPolarityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeedbackStatus() {
		return feedbackStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVerificationRequirement() {
		return verificationRequirementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getValidationKind() {
		return validationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRuleSeverity() {
		return ruleSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModerationMode() {
		return moderationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTriggerEvent() {
		return triggerEventEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModerationDecision() {
		return moderationDecisionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionKind() {
		return actionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConditionOperator() {
		return conditionOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionResultKind() {
		return actionResultKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSortCriterion() {
		return sortCriterionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSortDirection() {
		return sortDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnormFactory getEnormFactory() {
		return (EnormFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		refModelEClass = createEClass(REF_MODEL);
		createEAttribute(refModelEClass, REF_MODEL__NAME);
		createEAttribute(refModelEClass, REF_MODEL__VERSION);
		createEReference(refModelEClass, REF_MODEL__USER_TYPES);
		createEReference(refModelEClass, REF_MODEL__RESOURCE_TYPES);
		createEReference(refModelEClass, REF_MODEL__CONTEXT_TYPES);
		createEReference(refModelEClass, REF_MODEL__RESOURCE_RELATIONS);
		createEReference(refModelEClass, REF_MODEL__FEEDBACK_TYPES);
		createEReference(refModelEClass, REF_MODEL__FEEDBACK_DEFINITIONS);
		createEReference(refModelEClass, REF_MODEL__AUTHORIZATION_RULES);
		createEReference(refModelEClass, REF_MODEL__VALIDATION_RULES);
		createEReference(refModelEClass, REF_MODEL__MODERATION_POLICIES);
		createEReference(refModelEClass, REF_MODEL__AUTOMATION_RULES);
		createEReference(refModelEClass, REF_MODEL__VERIFICATION_POLICIES);
		createEReference(refModelEClass, REF_MODEL__SORTING_POLICIES);

		userTypeEClass = createEClass(USER_TYPE);
		createEAttribute(userTypeEClass, USER_TYPE__NAME);
		createEAttribute(userTypeEClass, USER_TYPE__KIND);
		createEReference(userTypeEClass, USER_TYPE__SUPER_TYPES);

		contextTypeEClass = createEClass(CONTEXT_TYPE);
		createEAttribute(contextTypeEClass, CONTEXT_TYPE__NAME);
		createEAttribute(contextTypeEClass, CONTEXT_TYPE__KIND);
		createEReference(contextTypeEClass, CONTEXT_TYPE__CONTAINS);

		resourceTypeEClass = createEClass(RESOURCE_TYPE);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__NAME);
		createEAttribute(resourceTypeEClass, RESOURCE_TYPE__SUPPORTS_MEDIA);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__SUPER_TYPES);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__ATTRIBUTES);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__REQUIRED);
		createEAttribute(attributeEClass, ATTRIBUTE__MULTI_VALUED);

		resourceRelationEClass = createEClass(RESOURCE_RELATION);
		createEAttribute(resourceRelationEClass, RESOURCE_RELATION__NAME);
		createEAttribute(resourceRelationEClass, RESOURCE_RELATION__SOURCE_CARDINALITY);
		createEAttribute(resourceRelationEClass, RESOURCE_RELATION__TARGET_CARDINALITY);
		createEAttribute(resourceRelationEClass, RESOURCE_RELATION__CONTAINMENT);
		createEAttribute(resourceRelationEClass, RESOURCE_RELATION__RECURSIVE);
		createEReference(resourceRelationEClass, RESOURCE_RELATION__SOURCE);
		createEReference(resourceRelationEClass, RESOURCE_RELATION__TARGET);

		feedbackTypeEClass = createEClass(FEEDBACK_TYPE);
		createEAttribute(feedbackTypeEClass, FEEDBACK_TYPE__NAME);
		createEAttribute(feedbackTypeEClass, FEEDBACK_TYPE__KIND);
		createEAttribute(feedbackTypeEClass, FEEDBACK_TYPE__SUBJECT_SCOPE);
		createEAttribute(feedbackTypeEClass, FEEDBACK_TYPE__HAS_RATING);
		createEAttribute(feedbackTypeEClass, FEEDBACK_TYPE__RECURSIVE);
		createEAttribute(feedbackTypeEClass, FEEDBACK_TYPE__ALLOWS_TEXT);
		createEAttribute(feedbackTypeEClass, FEEDBACK_TYPE__ALLOWS_MEDIA);
		createEAttribute(feedbackTypeEClass, FEEDBACK_TYPE__POLARITY);

		feedbackDefinitionEClass = createEClass(FEEDBACK_DEFINITION);
		createEAttribute(feedbackDefinitionEClass, FEEDBACK_DEFINITION__NAME);
		createEAttribute(feedbackDefinitionEClass, FEEDBACK_DEFINITION__REQUIRES_VERIFIED_CONTEXT);
		createEAttribute(feedbackDefinitionEClass, FEEDBACK_DEFINITION__VERIFICATION_REQUIREMENT);
		createEAttribute(feedbackDefinitionEClass, FEEDBACK_DEFINITION__UNIQUE_PER_AUTHOR_TARGET);
		createEReference(feedbackDefinitionEClass, FEEDBACK_DEFINITION__TYPE);
		createEReference(feedbackDefinitionEClass, FEEDBACK_DEFINITION__SUBJECT_RESOURCE);
		createEReference(feedbackDefinitionEClass, FEEDBACK_DEFINITION__AUTHOR);
		createEReference(feedbackDefinitionEClass, FEEDBACK_DEFINITION__SUBJECT_FEEDBACK);
		createEReference(feedbackDefinitionEClass, FEEDBACK_DEFINITION__POLICY);
		createEReference(feedbackDefinitionEClass, FEEDBACK_DEFINITION__RATING);

		feedbackPolicyEClass = createEClass(FEEDBACK_POLICY);
		createEAttribute(feedbackPolicyEClass, FEEDBACK_POLICY__STATUS);

		ratingPolicyEClass = createEClass(RATING_POLICY);
		createEAttribute(ratingPolicyEClass, RATING_POLICY__MIN_VALUE);
		createEAttribute(ratingPolicyEClass, RATING_POLICY__MAX_VALUE);
		createEAttribute(ratingPolicyEClass, RATING_POLICY__STEP);

		validationRuleEClass = createEClass(VALIDATION_RULE);
		createEAttribute(validationRuleEClass, VALIDATION_RULE__NAME);
		createEAttribute(validationRuleEClass, VALIDATION_RULE__KIND);
		createEAttribute(validationRuleEClass, VALIDATION_RULE__SEVERITY);
		createEAttribute(validationRuleEClass, VALIDATION_RULE__EXPRESSION);
		createEAttribute(validationRuleEClass, VALIDATION_RULE__IMPLEMENTATION_ID);
		createEReference(validationRuleEClass, VALIDATION_RULE__APPLIES_TO_RESOURCE);
		createEReference(validationRuleEClass, VALIDATION_RULE__APPLIES_TO_FEEDBACK);
		createEReference(validationRuleEClass, VALIDATION_RULE__INVOKED_BY);

		moderationPolicyEClass = createEClass(MODERATION_POLICY);
		createEAttribute(moderationPolicyEClass, MODERATION_POLICY__NAME);
		createEAttribute(moderationPolicyEClass, MODERATION_POLICY__MODE);
		createEAttribute(moderationPolicyEClass, MODERATION_POLICY__TRIGGER);
		createEAttribute(moderationPolicyEClass, MODERATION_POLICY__DECISION);
		createEReference(moderationPolicyEClass, MODERATION_POLICY__MONITORS_RESOURCE);
		createEReference(moderationPolicyEClass, MODERATION_POLICY__MONITORS_FEEDBACK);
		createEReference(moderationPolicyEClass, MODERATION_POLICY__EXECUTED_BY);
		createEReference(moderationPolicyEClass, MODERATION_POLICY__IN_CONTEXT);

		authorizationRuleEClass = createEClass(AUTHORIZATION_RULE);
		createEAttribute(authorizationRuleEClass, AUTHORIZATION_RULE__NAME);
		createEAttribute(authorizationRuleEClass, AUTHORIZATION_RULE__ALLOWED_ACTION);
		createEReference(authorizationRuleEClass, AUTHORIZATION_RULE__ACTOR);
		createEReference(authorizationRuleEClass, AUTHORIZATION_RULE__CONTEXT);
		createEReference(authorizationRuleEClass, AUTHORIZATION_RULE__RESOURCE_TARGET);
		createEReference(authorizationRuleEClass, AUTHORIZATION_RULE__FEEDBACK_TARGET);

		automationRuleEClass = createEClass(AUTOMATION_RULE);
		createEAttribute(automationRuleEClass, AUTOMATION_RULE__NAME);
		createEAttribute(automationRuleEClass, AUTOMATION_RULE__TRIGGER);
		createEReference(automationRuleEClass, AUTOMATION_RULE__CONTEXT);
		createEReference(automationRuleEClass, AUTOMATION_RULE__IN_CONTEXT);
		createEReference(automationRuleEClass, AUTOMATION_RULE__ON_FEEDBACK);
		createEReference(automationRuleEClass, AUTOMATION_RULE__USES);
		createEReference(automationRuleEClass, AUTOMATION_RULE__CONDITIONS);
		createEReference(automationRuleEClass, AUTOMATION_RULE__ACTIONS);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__NAME);
		createEAttribute(conditionEClass, CONDITION__OPERATOR);
		createEReference(conditionEClass, CONDITION__ATTRIBUTE);
		createEReference(conditionEClass, CONDITION__CHILDREN);

		conditionValueEClass = createEClass(CONDITION_VALUE);
		createEAttribute(conditionValueEClass, CONDITION_VALUE__VALUE);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NAME);
		createEAttribute(actionEClass, ACTION__KIND);
		createEAttribute(actionEClass, ACTION__MESSAGE);

		verificationPolicyEClass = createEClass(VERIFICATION_POLICY);
		createEAttribute(verificationPolicyEClass, VERIFICATION_POLICY__NAME);
		createEAttribute(verificationPolicyEClass, VERIFICATION_POLICY__MODE);
		createEAttribute(verificationPolicyEClass, VERIFICATION_POLICY__APPLIES_WHEN);
		createEReference(verificationPolicyEClass, VERIFICATION_POLICY__VERIFIES);

		sortingPolicyEClass = createEClass(SORTING_POLICY);
		createEAttribute(sortingPolicyEClass, SORTING_POLICY__NAME);
		createEAttribute(sortingPolicyEClass, SORTING_POLICY__CRITERION);
		createEAttribute(sortingPolicyEClass, SORTING_POLICY__DIRECTION);
		createEReference(sortingPolicyEClass, SORTING_POLICY__APPLIES_TO_RESOURCE);
		createEReference(sortingPolicyEClass, SORTING_POLICY__APPLIES_TO_FEEDBACK);
		createEReference(sortingPolicyEClass, SORTING_POLICY__IN_CONTEXT);

		// Create enums
		userKindEEnum = createEEnum(USER_KIND);
		contextKindEEnum = createEEnum(CONTEXT_KIND);
		primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
		feedbackKindEEnum = createEEnum(FEEDBACK_KIND);
		feedbackSubjectScopeEEnum = createEEnum(FEEDBACK_SUBJECT_SCOPE);
		feedbackPolarityEEnum = createEEnum(FEEDBACK_POLARITY);
		feedbackStatusEEnum = createEEnum(FEEDBACK_STATUS);
		verificationRequirementEEnum = createEEnum(VERIFICATION_REQUIREMENT);
		validationKindEEnum = createEEnum(VALIDATION_KIND);
		ruleSeverityEEnum = createEEnum(RULE_SEVERITY);
		moderationModeEEnum = createEEnum(MODERATION_MODE);
		triggerEventEEnum = createEEnum(TRIGGER_EVENT);
		moderationDecisionEEnum = createEEnum(MODERATION_DECISION);
		actionKindEEnum = createEEnum(ACTION_KIND);
		conditionOperatorEEnum = createEEnum(CONDITION_OPERATOR);
		actionResultKindEEnum = createEEnum(ACTION_RESULT_KIND);
		sortCriterionEEnum = createEEnum(SORT_CRITERION);
		sortDirectionEEnum = createEEnum(SORT_DIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(refModelEClass, RefModel.class, "RefModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, RefModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefModel_Version(), ecorePackage.getEString(), "version", null, 0, 1, RefModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefModel_UserTypes(), this.getUserType(), null, "userTypes", null, 0, -1, RefModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefModel_ResourceTypes(), this.getResourceType(), null, "resourceTypes", null, 0, -1,
				RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefModel_ContextTypes(), this.getContextType(), null, "contextTypes", null, 0, -1,
				RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefModel_ResourceRelations(), this.getResourceRelation(), null, "resourceRelations", null, 0,
				-1, RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefModel_FeedbackTypes(), this.getFeedbackType(), null, "feedbackTypes", null, 0, -1,
				RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefModel_FeedbackDefinitions(), this.getFeedbackDefinition(), null, "feedbackDefinitions",
				null, 0, -1, RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefModel_AuthorizationRules(), this.getAuthorizationRule(), null, "authorizationRules", null,
				0, -1, RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefModel_ValidationRules(), this.getValidationRule(), null, "validationRules", null, 0, -1,
				RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefModel_ModerationPolicies(), this.getModerationPolicy(), null, "moderationPolicies", null,
				0, -1, RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefModel_AutomationRules(), this.getAutomationRule(), null, "automationRules", null, 0, -1,
				RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefModel_VerificationPolicies(), this.getVerificationPolicy(), null, "verificationPolicies",
				null, 0, -1, RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefModel_SortingPolicies(), this.getSortingPolicy(), null, "sortingPolicies", null, 0, -1,
				RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userTypeEClass, UserType.class, "UserType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserType_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserType_Kind(), this.getUserKind(), "kind", null, 0, 1, UserType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserType_SuperTypes(), this.getUserType(), null, "superTypes", null, 0, -1, UserType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextTypeEClass, ContextType.class, "ContextType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContextType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextType_Kind(), this.getContextKind(), "kind", null, 0, 1, ContextType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextType_Contains(), this.getResourceType(), null, "contains", null, 1, -1,
				ContextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceType_SupportsMedia(), ecorePackage.getEBoolean(), "supportsMedia", null, 0, 1,
				ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_SuperTypes(), this.getResourceType(), null, "superTypes", null, 0, -1,
				ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceType_Attributes(), this.getAttribute(), null, "attributes", null, 1, -1,
				ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), this.getPrimitiveType(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, Attribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_MultiValued(), ecorePackage.getEBoolean(), "multiValued", null, 0, 1,
				Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(resourceRelationEClass, ResourceRelation.class, "ResourceRelation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceRelation_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ResourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceRelation_SourceCardinality(), ecorePackage.getEString(), "sourceCardinality", null, 0,
				1, ResourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceRelation_TargetCardinality(), ecorePackage.getEString(), "targetCardinality", null, 0,
				1, ResourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceRelation_Containment(), ecorePackage.getEBoolean(), "containment", null, 0, 1,
				ResourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceRelation_Recursive(), ecorePackage.getEBoolean(), "recursive", null, 0, 1,
				ResourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getResourceRelation_Source(), this.getResourceType(), null, "source", null, 1, 1,
				ResourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceRelation_Target(), this.getResourceType(), null, "target", null, 1, 1,
				ResourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackTypeEClass, FeedbackType.class, "FeedbackType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeedbackType_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeedbackType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedbackType_Kind(), this.getFeedbackKind(), "kind", null, 0, 1, FeedbackType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedbackType_SubjectScope(), this.getFeedbackSubjectScope(), "subjectScope", null, 0, 1,
				FeedbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedbackType_HasRating(), ecorePackage.getEBoolean(), "hasRating", null, 0, 1,
				FeedbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedbackType_Recursive(), ecorePackage.getEBoolean(), "recursive", null, 0, 1,
				FeedbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedbackType_AllowsText(), ecorePackage.getEBoolean(), "allowsText", null, 0, 1,
				FeedbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedbackType_AllowsMedia(), ecorePackage.getEBoolean(), "allowsMedia", null, 0, 1,
				FeedbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedbackType_Polarity(), this.getFeedbackPolarity(), "polarity", null, 0, 1,
				FeedbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(feedbackDefinitionEClass, FeedbackDefinition.class, "FeedbackDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeedbackDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				FeedbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedbackDefinition_RequiresVerifiedContext(), ecorePackage.getEBoolean(),
				"requiresVerifiedContext", null, 0, 1, FeedbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedbackDefinition_VerificationRequirement(), this.getVerificationRequirement(),
				"verificationRequirement", null, 0, 1, FeedbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedbackDefinition_UniquePerAuthorTarget(), ecorePackage.getEBoolean(),
				"uniquePerAuthorTarget", null, 0, 1, FeedbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackDefinition_Type(), this.getFeedbackType(), null, "type", null, 1, 1,
				FeedbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackDefinition_SubjectResource(), this.getResourceType(), null, "subjectResource", null,
				0, 1, FeedbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackDefinition_Author(), this.getUserType(), null, "author", null, 1, 1,
				FeedbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackDefinition_SubjectFeedback(), this.getFeedbackDefinition(), null, "subjectFeedback",
				null, 0, 1, FeedbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackDefinition_Policy(), this.getFeedbackPolicy(), null, "policy", null, 0, 1,
				FeedbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackDefinition_Rating(), this.getRatingPolicy(), null, "rating", null, 0, 1,
				FeedbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackPolicyEClass, FeedbackPolicy.class, "FeedbackPolicy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeedbackPolicy_Status(), this.getFeedbackStatus(), "status", null, 0, 1, FeedbackPolicy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ratingPolicyEClass, RatingPolicy.class, "RatingPolicy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRatingPolicy_MinValue(), ecorePackage.getEDouble(), "minValue", null, 0, 1,
				RatingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRatingPolicy_MaxValue(), ecorePackage.getEDouble(), "maxValue", null, 0, 1,
				RatingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRatingPolicy_Step(), ecorePackage.getEDouble(), "step", null, 0, 1, RatingPolicy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validationRuleEClass, ValidationRule.class, "ValidationRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidationRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValidationRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationRule_Kind(), this.getValidationKind(), "kind", null, 0, 1, ValidationRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationRule_Severity(), this.getRuleSeverity(), "severity", null, 0, 1,
				ValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationRule_Expression(), ecorePackage.getEString(), "expression", null, 0, 1,
				ValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationRule_ImplementationId(), ecorePackage.getEString(), "implementationId", null, 0, 1,
				ValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getValidationRule_AppliesToResource(), this.getResourceType(), null, "appliesToResource", null,
				0, 1, ValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidationRule_AppliesToFeedback(), this.getFeedbackDefinition(), null, "appliesToFeedback",
				null, 0, 1, ValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidationRule_InvokedBy(), this.getAutomationRule(), null, "invokedBy", null, 1, 1,
				ValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moderationPolicyEClass, ModerationPolicy.class, "ModerationPolicy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModerationPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ModerationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getModerationPolicy_Mode(), this.getModerationMode(), "mode", null, 0, 1, ModerationPolicy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModerationPolicy_Trigger(), this.getTriggerEvent(), "trigger", null, 0, 1,
				ModerationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getModerationPolicy_Decision(), this.getModerationDecision(), "decision", null, 0, 1,
				ModerationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getModerationPolicy_MonitorsResource(), this.getResourceType(), null, "monitorsResource", null,
				0, 1, ModerationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModerationPolicy_MonitorsFeedback(), this.getFeedbackDefinition(), null, "monitorsFeedback",
				null, 0, 1, ModerationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModerationPolicy_ExecutedBy(), this.getUserType(), null, "executedBy", null, 0, -1,
				ModerationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModerationPolicy_InContext(), this.getContextType(), null, "inContext", null, 0, 1,
				ModerationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationRuleEClass, AuthorizationRule.class, "AuthorizationRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizationRule_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				AuthorizationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorizationRule_AllowedAction(), this.getActionKind(), "allowedAction", null, 0, 1,
				AuthorizationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizationRule_Actor(), this.getUserType(), null, "actor", null, 1, 1,
				AuthorizationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizationRule_Context(), this.getContextType(), null, "context", null, 0, 1,
				AuthorizationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizationRule_ResourceTarget(), this.getResourceType(), null, "resourceTarget", null, 1,
				1, AuthorizationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizationRule_FeedbackTarget(), this.getFeedbackDefinition(), null, "feedbackTarget",
				null, 0, 1, AuthorizationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(automationRuleEClass, AutomationRule.class, "AutomationRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomationRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, AutomationRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomationRule_Trigger(), this.getTriggerEvent(), "trigger", null, 0, 1, AutomationRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_Context(), this.getResourceType(), null, "context", null, 0, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_InContext(), this.getContextType(), null, "inContext", null, 0, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_OnFeedback(), this.getFeedbackDefinition(), null, "onFeedback", null, 0, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_Uses(), this.getValidationRule(), null, "uses", null, 1, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_Conditions(), this.getCondition(), null, "conditions", null, 1, -1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_Actions(), this.getAction(), null, "actions", null, 1, -1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_Operator(), this.getConditionOperator(), "operator", null, 0, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Children(), this.getConditionValue(), null, "children", null, 0, -1,
				Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionValueEClass, ConditionValue.class, "ConditionValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ConditionValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Kind(), this.getActionResultKind(), "kind", null, 0, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Message(), ecorePackage.getEString(), "message", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verificationPolicyEClass, VerificationPolicy.class, "VerificationPolicy", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerificationPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				VerificationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerificationPolicy_Mode(), this.getValidationKind(), "mode", null, 0, 1,
				VerificationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerificationPolicy_AppliesWhen(), this.getTriggerEvent(), "appliesWhen", null, 0, 1,
				VerificationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getVerificationPolicy_Verifies(), this.getFeedbackDefinition(), null, "verifies", null, 1, 1,
				VerificationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortingPolicyEClass, SortingPolicy.class, "SortingPolicy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSortingPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1, SortingPolicy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPolicy_Criterion(), this.getSortCriterion(), "criterion", null, 0, 1,
				SortingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortingPolicy_Direction(), this.getSortDirection(), "direction", null, 0, 1,
				SortingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPolicy_AppliesToResource(), this.getResourceType(), null, "appliesToResource", null, 0,
				1, SortingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPolicy_AppliesToFeedback(), this.getFeedbackDefinition(), null, "appliesToFeedback",
				null, 0, 1, SortingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortingPolicy_InContext(), this.getContextType(), null, "inContext", null, 0, 1,
				SortingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(userKindEEnum, UserKind.class, "UserKind");
		addEEnumLiteral(userKindEEnum, UserKind.GENERIC);
		addEEnumLiteral(userKindEEnum, UserKind.BUYER);
		addEEnumLiteral(userKindEEnum, UserKind.SELLER);
		addEEnumLiteral(userKindEEnum, UserKind.CREATOR);
		addEEnumLiteral(userKindEEnum, UserKind.MODERATOR);

		initEEnum(contextKindEEnum, ContextKind.class, "ContextKind");
		addEEnumLiteral(contextKindEEnum, ContextKind.GLOBAL);
		addEEnumLiteral(contextKindEEnum, ContextKind.COMMUNITY);
		addEEnumLiteral(contextKindEEnum, ContextKind.CHANNEL);
		addEEnumLiteral(contextKindEEnum, ContextKind.CATALOG);

		initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.TEXT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.NUMBER);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BOOLEAN);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.DATE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.DATETIME);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.IMAGE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.VIDEO);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.URL);

		initEEnum(feedbackKindEEnum, FeedbackKind.class, "FeedbackKind");
		addEEnumLiteral(feedbackKindEEnum, FeedbackKind.COMMENT);
		addEEnumLiteral(feedbackKindEEnum, FeedbackKind.REVIEW);
		addEEnumLiteral(feedbackKindEEnum, FeedbackKind.REACTION);
		addEEnumLiteral(feedbackKindEEnum, FeedbackKind.VOTE);
		addEEnumLiteral(feedbackKindEEnum, FeedbackKind.REPORT);
		addEEnumLiteral(feedbackKindEEnum, FeedbackKind.SUBSCRIPTION);

		initEEnum(feedbackSubjectScopeEEnum, FeedbackSubjectScope.class, "FeedbackSubjectScope");
		addEEnumLiteral(feedbackSubjectScopeEEnum, FeedbackSubjectScope.RESOURCE_ONLY);
		addEEnumLiteral(feedbackSubjectScopeEEnum, FeedbackSubjectScope.FEEDBACK_ONLY);
		addEEnumLiteral(feedbackSubjectScopeEEnum, FeedbackSubjectScope.RESOURCE_OR_FEEDBACK);

		initEEnum(feedbackPolarityEEnum, FeedbackPolarity.class, "FeedbackPolarity");
		addEEnumLiteral(feedbackPolarityEEnum, FeedbackPolarity.NONE);
		addEEnumLiteral(feedbackPolarityEEnum, FeedbackPolarity.LIKE_DISLIKE);
		addEEnumLiteral(feedbackPolarityEEnum, FeedbackPolarity.UP_DOWN);

		initEEnum(feedbackStatusEEnum, FeedbackStatus.class, "FeedbackStatus");
		addEEnumLiteral(feedbackStatusEEnum, FeedbackStatus.ENABLED);
		addEEnumLiteral(feedbackStatusEEnum, FeedbackStatus.DISABLED);

		initEEnum(verificationRequirementEEnum, VerificationRequirement.class, "VerificationRequirement");
		addEEnumLiteral(verificationRequirementEEnum, VerificationRequirement.NONE);
		addEEnumLiteral(verificationRequirementEEnum, VerificationRequirement.OPTIONAL);
		addEEnumLiteral(verificationRequirementEEnum, VerificationRequirement.REQUIRED);

		initEEnum(validationKindEEnum, ValidationKind.class, "ValidationKind");
		addEEnumLiteral(validationKindEEnum, ValidationKind.AUTOMATIC);
		addEEnumLiteral(validationKindEEnum, ValidationKind.MANUAL);

		initEEnum(ruleSeverityEEnum, RuleSeverity.class, "RuleSeverity");
		addEEnumLiteral(ruleSeverityEEnum, RuleSeverity.INFO);
		addEEnumLiteral(ruleSeverityEEnum, RuleSeverity.WARNING);
		addEEnumLiteral(ruleSeverityEEnum, RuleSeverity.ERROR);

		initEEnum(moderationModeEEnum, ModerationMode.class, "ModerationMode");
		addEEnumLiteral(moderationModeEEnum, ModerationMode.AUTOMATIC);
		addEEnumLiteral(moderationModeEEnum, ModerationMode.MANUAL);
		addEEnumLiteral(moderationModeEEnum, ModerationMode.HYBRID);

		initEEnum(triggerEventEEnum, TriggerEvent.class, "TriggerEvent");
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.ON_RESOURCE_CREATE);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.ON_RESOURCE_UPDATE);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.ON_RESOURCE_DELETE);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.ON_FEEDBACK_CREATE);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.ON_FEEDBACK_UPDATE);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.ON_FEEDBACK_DELETE);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.ON_REPORT_SUBMITTED);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.ON_REPORT_THRESHOLD);
		addEEnumLiteral(triggerEventEEnum, TriggerEvent.ON_MANUAL_REQUEST);

		initEEnum(moderationDecisionEEnum, ModerationDecision.class, "ModerationDecision");
		addEEnumLiteral(moderationDecisionEEnum, ModerationDecision.APPROVED);
		addEEnumLiteral(moderationDecisionEEnum, ModerationDecision.FLAGGED);
		addEEnumLiteral(moderationDecisionEEnum, ModerationDecision.HIDDEN);
		addEEnumLiteral(moderationDecisionEEnum, ModerationDecision.REMOVED);
		addEEnumLiteral(moderationDecisionEEnum, ModerationDecision.BLOCKED);
		addEEnumLiteral(moderationDecisionEEnum, ModerationDecision.REJECTED);

		initEEnum(actionKindEEnum, ActionKind.class, "ActionKind");
		addEEnumLiteral(actionKindEEnum, ActionKind.READ);
		addEEnumLiteral(actionKindEEnum, ActionKind.CREATE);
		addEEnumLiteral(actionKindEEnum, ActionKind.UPDATE);
		addEEnumLiteral(actionKindEEnum, ActionKind.DELETE);
		addEEnumLiteral(actionKindEEnum, ActionKind.COMMENT);
		addEEnumLiteral(actionKindEEnum, ActionKind.RATE);
		addEEnumLiteral(actionKindEEnum, ActionKind.VOTE);
		addEEnumLiteral(actionKindEEnum, ActionKind.REPORT);
		addEEnumLiteral(actionKindEEnum, ActionKind.SUBSCRIBE);
		addEEnumLiteral(actionKindEEnum, ActionKind.MODERATE);
		addEEnumLiteral(actionKindEEnum, ActionKind.VALIDATE);

		initEEnum(conditionOperatorEEnum, ConditionOperator.class, "ConditionOperator");
		addEEnumLiteral(conditionOperatorEEnum, ConditionOperator.CONTAINS_KEYWORDS);
		addEEnumLiteral(conditionOperatorEEnum, ConditionOperator.NOT_CONTAINS_KEYWORDS);
		addEEnumLiteral(conditionOperatorEEnum, ConditionOperator.MATCH_REGEX);
		addEEnumLiteral(conditionOperatorEEnum, ConditionOperator.NOT_MATCH_REGEX);
		addEEnumLiteral(conditionOperatorEEnum, ConditionOperator.HAS_PROPERTY);
		addEEnumLiteral(conditionOperatorEEnum, ConditionOperator.NOT_HAS_PROPERTY);
		addEEnumLiteral(conditionOperatorEEnum, ConditionOperator.HAS_SPECIFIC_PROPERTY);
		addEEnumLiteral(conditionOperatorEEnum, ConditionOperator.NOT_HAS_SPECIFIC_PROPERTY);

		initEEnum(actionResultKindEEnum, ActionResultKind.class, "ActionResultKind");
		addEEnumLiteral(actionResultKindEEnum, ActionResultKind.DISPLAY_MESSAGE);
		addEEnumLiteral(actionResultKindEEnum, ActionResultKind.FLAG_CONTENT);
		addEEnumLiteral(actionResultKindEEnum, ActionResultKind.HIDE_CONTENT);
		addEEnumLiteral(actionResultKindEEnum, ActionResultKind.REMOVE_CONTENT);
		addEEnumLiteral(actionResultKindEEnum, ActionResultKind.BLOCK_SUBMISSION);
		addEEnumLiteral(actionResultKindEEnum, ActionResultKind.NOTIFY_MODERATOR);
		addEEnumLiteral(actionResultKindEEnum, ActionResultKind.AUTO_APPROVE);
		addEEnumLiteral(actionResultKindEEnum, ActionResultKind.AUTO_REJECT);

		initEEnum(sortCriterionEEnum, SortCriterion.class, "SortCriterion");
		addEEnumLiteral(sortCriterionEEnum, SortCriterion.DATE);
		addEEnumLiteral(sortCriterionEEnum, SortCriterion.VALUE);
		addEEnumLiteral(sortCriterionEEnum, SortCriterion.RELEVANCE);

		initEEnum(sortDirectionEEnum, SortDirection.class, "SortDirection");
		addEEnumLiteral(sortDirectionEEnum, SortDirection.ASC);
		addEEnumLiteral(sortDirectionEEnum, SortDirection.DESC);

		// Create resource
		createResource(eNS_URI);
	}

} //EnormPackageImpl
