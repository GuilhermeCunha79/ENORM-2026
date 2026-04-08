/**
 */
package pt.isep.enorm.ref.sirius.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pt.isep.enorm.ref.sirius.ActionKind;
import pt.isep.enorm.ref.sirius.Attribute;
import pt.isep.enorm.ref.sirius.AuthorizationRule;
import pt.isep.enorm.ref.sirius.AutomationRule;
import pt.isep.enorm.ref.sirius.ContextKind;
import pt.isep.enorm.ref.sirius.ContextType;
import pt.isep.enorm.ref.sirius.EvolutionRule;
import pt.isep.enorm.ref.sirius.FeedbackDefinition;
import pt.isep.enorm.ref.sirius.FeedbackKind;
import pt.isep.enorm.ref.sirius.FeedbackPolicy;
import pt.isep.enorm.ref.sirius.FeedbackStatus;
import pt.isep.enorm.ref.sirius.FeedbackSubjectScope;
import pt.isep.enorm.ref.sirius.FeedbackType;
import pt.isep.enorm.ref.sirius.ModerationDecision;
import pt.isep.enorm.ref.sirius.ModerationMode;
import pt.isep.enorm.ref.sirius.ModerationPolicy;
import pt.isep.enorm.ref.sirius.PrimitiveType;
import pt.isep.enorm.ref.sirius.RatingPolicy;
import pt.isep.enorm.ref.sirius.RatingScaleKind;
import pt.isep.enorm.ref.sirius.RefModel;
import pt.isep.enorm.ref.sirius.RefactoringKind;
import pt.isep.enorm.ref.sirius.RefactoringOperation;
import pt.isep.enorm.ref.sirius.ResourceRelation;
import pt.isep.enorm.ref.sirius.ResourceType;
import pt.isep.enorm.ref.sirius.RuleSeverity;
import pt.isep.enorm.ref.sirius.SiriusFactory;
import pt.isep.enorm.ref.sirius.SiriusPackage;
import pt.isep.enorm.ref.sirius.UserKind;
import pt.isep.enorm.ref.sirius.UserType;
import pt.isep.enorm.ref.sirius.ValidationKind;
import pt.isep.enorm.ref.sirius.ValidationRule;
import pt.isep.enorm.ref.sirius.VerificationPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SiriusPackageImpl extends EPackageImpl implements SiriusPackage {
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
	private EClass verificationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolutionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refactoringOperationEClass = null;

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
	private EEnum feedbackStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ratingScaleKindEEnum = null;

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
	private EEnum refactoringKindEEnum = null;

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
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SiriusPackageImpl() {
		super(eNS_URI, SiriusFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SiriusPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SiriusPackage init() {
		if (isInited)
			return (SiriusPackage) EPackage.Registry.INSTANCE.getEPackage(SiriusPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSiriusPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SiriusPackageImpl theSiriusPackage = registeredSiriusPackage instanceof SiriusPackageImpl
				? (SiriusPackageImpl) registeredSiriusPackage
				: new SiriusPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSiriusPackage.createPackageContents();

		// Initialize created meta-data
		theSiriusPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSiriusPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SiriusPackage.eNS_URI, theSiriusPackage);
		return theSiriusPackage;
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
	public EReference getRefModel_FeedbackPolicies() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_ContextTypes() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_ResourceRelations() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_FeedbackTypes() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_FeedbackDefinitions() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_RatingPolicies() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_ValidationRules() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_ModerationPolicies() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_AutomationRules() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_VerificationPolicies() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_EvolutionRules() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefModel_RefactoringOperations() {
		return (EReference) refModelEClass.getEStructuralFeatures().get(15);
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
	public EAttribute getFeedbackType_AllowsMedia() {
		return (EAttribute) feedbackTypeEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getFeedbackDefinition_UniquePerAuthorTarget() {
		return (EAttribute) feedbackDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackDefinition_Type() {
		return (EReference) feedbackDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackDefinition_SubjectResource() {
		return (EReference) feedbackDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackDefinition_Author() {
		return (EReference) feedbackDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackDefinition_SubjectFeedback() {
		return (EReference) feedbackDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackDefinition_Parent() {
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
	public EAttribute getRatingPolicy_ScaleKind() {
		return (EAttribute) ratingPolicyEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getAuthorizationRule_AllowedAction() {
		return (EAttribute) authorizationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationRule_Actor() {
		return (EReference) authorizationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationRule_Context() {
		return (EReference) authorizationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationRule_ResourceTarget() {
		return (EReference) authorizationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorizationRule_FeedbackTarget() {
		return (EReference) authorizationRuleEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getAutomationRule_Condition() {
		return (EAttribute) automationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutomationRule_ActionDescription() {
		return (EAttribute) automationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutomationRule_Context() {
		return (EReference) automationRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutomationRule_InContext() {
		return (EReference) automationRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutomationRule_OnFeedback() {
		return (EReference) automationRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutomationRule_Uses() {
		return (EReference) automationRuleEClass.getEStructuralFeatures().get(7);
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
	public EClass getEvolutionRule() {
		return evolutionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvolutionRule_Name() {
		return (EAttribute) evolutionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvolutionRule_FromVersion() {
		return (EAttribute) evolutionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvolutionRule_ToVersion() {
		return (EAttribute) evolutionRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvolutionRule_TransformationId() {
		return (EAttribute) evolutionRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvolutionRule_Applies() {
		return (EReference) evolutionRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefactoringOperation() {
		return refactoringOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefactoringOperation_Name() {
		return (EAttribute) refactoringOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefactoringOperation_Kind() {
		return (EAttribute) refactoringOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefactoringOperation_ScriptId() {
		return (EAttribute) refactoringOperationEClass.getEStructuralFeatures().get(2);
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
	public EEnum getFeedbackStatus() {
		return feedbackStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRatingScaleKind() {
		return ratingScaleKindEEnum;
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
	public EEnum getRefactoringKind() {
		return refactoringKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SiriusFactory getSiriusFactory() {
		return (SiriusFactory) getEFactoryInstance();
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
		createEReference(refModelEClass, REF_MODEL__FEEDBACK_POLICIES);
		createEReference(refModelEClass, REF_MODEL__CONTEXT_TYPES);
		createEReference(refModelEClass, REF_MODEL__RESOURCE_RELATIONS);
		createEReference(refModelEClass, REF_MODEL__FEEDBACK_TYPES);
		createEReference(refModelEClass, REF_MODEL__FEEDBACK_DEFINITIONS);
		createEReference(refModelEClass, REF_MODEL__RATING_POLICIES);
		createEReference(refModelEClass, REF_MODEL__VALIDATION_RULES);
		createEReference(refModelEClass, REF_MODEL__MODERATION_POLICIES);
		createEReference(refModelEClass, REF_MODEL__AUTOMATION_RULES);
		createEReference(refModelEClass, REF_MODEL__VERIFICATION_POLICIES);
		createEReference(refModelEClass, REF_MODEL__EVOLUTION_RULES);
		createEReference(refModelEClass, REF_MODEL__REFACTORING_OPERATIONS);

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
		createEAttribute(feedbackTypeEClass, FEEDBACK_TYPE__ALLOWS_MEDIA);

		feedbackDefinitionEClass = createEClass(FEEDBACK_DEFINITION);
		createEAttribute(feedbackDefinitionEClass, FEEDBACK_DEFINITION__NAME);
		createEAttribute(feedbackDefinitionEClass, FEEDBACK_DEFINITION__REQUIRES_VERIFIED_CONTEXT);
		createEAttribute(feedbackDefinitionEClass, FEEDBACK_DEFINITION__UNIQUE_PER_AUTHOR_TARGET);
		createEReference(feedbackDefinitionEClass, FEEDBACK_DEFINITION__TYPE);
		createEReference(feedbackDefinitionEClass, FEEDBACK_DEFINITION__SUBJECT_RESOURCE);
		createEReference(feedbackDefinitionEClass, FEEDBACK_DEFINITION__AUTHOR);
		createEReference(feedbackDefinitionEClass, FEEDBACK_DEFINITION__SUBJECT_FEEDBACK);
		createEReference(feedbackDefinitionEClass, FEEDBACK_DEFINITION__PARENT);
		createEReference(feedbackDefinitionEClass, FEEDBACK_DEFINITION__POLICY);
		createEReference(feedbackDefinitionEClass, FEEDBACK_DEFINITION__RATING);

		feedbackPolicyEClass = createEClass(FEEDBACK_POLICY);
		createEAttribute(feedbackPolicyEClass, FEEDBACK_POLICY__STATUS);

		ratingPolicyEClass = createEClass(RATING_POLICY);
		createEAttribute(ratingPolicyEClass, RATING_POLICY__MIN_VALUE);
		createEAttribute(ratingPolicyEClass, RATING_POLICY__MAX_VALUE);
		createEAttribute(ratingPolicyEClass, RATING_POLICY__STEP);
		createEAttribute(ratingPolicyEClass, RATING_POLICY__SCALE_KIND);

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
		createEAttribute(authorizationRuleEClass, AUTHORIZATION_RULE__ALLOWED_ACTION);
		createEReference(authorizationRuleEClass, AUTHORIZATION_RULE__ACTOR);
		createEReference(authorizationRuleEClass, AUTHORIZATION_RULE__CONTEXT);
		createEReference(authorizationRuleEClass, AUTHORIZATION_RULE__RESOURCE_TARGET);
		createEReference(authorizationRuleEClass, AUTHORIZATION_RULE__FEEDBACK_TARGET);

		automationRuleEClass = createEClass(AUTOMATION_RULE);
		createEAttribute(automationRuleEClass, AUTOMATION_RULE__NAME);
		createEAttribute(automationRuleEClass, AUTOMATION_RULE__TRIGGER);
		createEAttribute(automationRuleEClass, AUTOMATION_RULE__CONDITION);
		createEAttribute(automationRuleEClass, AUTOMATION_RULE__ACTION_DESCRIPTION);
		createEReference(automationRuleEClass, AUTOMATION_RULE__CONTEXT);
		createEReference(automationRuleEClass, AUTOMATION_RULE__IN_CONTEXT);
		createEReference(automationRuleEClass, AUTOMATION_RULE__ON_FEEDBACK);
		createEReference(automationRuleEClass, AUTOMATION_RULE__USES);

		verificationPolicyEClass = createEClass(VERIFICATION_POLICY);
		createEAttribute(verificationPolicyEClass, VERIFICATION_POLICY__NAME);
		createEAttribute(verificationPolicyEClass, VERIFICATION_POLICY__MODE);
		createEAttribute(verificationPolicyEClass, VERIFICATION_POLICY__APPLIES_WHEN);
		createEReference(verificationPolicyEClass, VERIFICATION_POLICY__VERIFIES);

		evolutionRuleEClass = createEClass(EVOLUTION_RULE);
		createEAttribute(evolutionRuleEClass, EVOLUTION_RULE__NAME);
		createEAttribute(evolutionRuleEClass, EVOLUTION_RULE__FROM_VERSION);
		createEAttribute(evolutionRuleEClass, EVOLUTION_RULE__TO_VERSION);
		createEAttribute(evolutionRuleEClass, EVOLUTION_RULE__TRANSFORMATION_ID);
		createEReference(evolutionRuleEClass, EVOLUTION_RULE__APPLIES);

		refactoringOperationEClass = createEClass(REFACTORING_OPERATION);
		createEAttribute(refactoringOperationEClass, REFACTORING_OPERATION__NAME);
		createEAttribute(refactoringOperationEClass, REFACTORING_OPERATION__KIND);
		createEAttribute(refactoringOperationEClass, REFACTORING_OPERATION__SCRIPT_ID);

		// Create enums
		userKindEEnum = createEEnum(USER_KIND);
		contextKindEEnum = createEEnum(CONTEXT_KIND);
		primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
		feedbackKindEEnum = createEEnum(FEEDBACK_KIND);
		feedbackSubjectScopeEEnum = createEEnum(FEEDBACK_SUBJECT_SCOPE);
		feedbackStatusEEnum = createEEnum(FEEDBACK_STATUS);
		ratingScaleKindEEnum = createEEnum(RATING_SCALE_KIND);
		validationKindEEnum = createEEnum(VALIDATION_KIND);
		ruleSeverityEEnum = createEEnum(RULE_SEVERITY);
		moderationModeEEnum = createEEnum(MODERATION_MODE);
		moderationDecisionEEnum = createEEnum(MODERATION_DECISION);
		actionKindEEnum = createEEnum(ACTION_KIND);
		refactoringKindEEnum = createEEnum(REFACTORING_KIND);
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
		initEReference(getRefModel_FeedbackPolicies(), this.getFeedbackPolicy(), null, "feedbackPolicies", null, 0, -1,
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
		initEReference(getRefModel_RatingPolicies(), this.getRatingPolicy(), null, "ratingPolicies", null, 0, -1,
				RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
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
		initEReference(getRefModel_EvolutionRules(), this.getEvolutionRule(), null, "evolutionRules", null, 0, -1,
				RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefModel_RefactoringOperations(), this.getRefactoringOperation(), null,
				"refactoringOperations", null, 0, -1, RefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getContextType_Contains(), this.getResourceType(), null, "contains", null, 0, -1,
				ContextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
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
		initEAttribute(getFeedbackType_AllowsMedia(), ecorePackage.getEBoolean(), "allowsMedia", null, 0, 1,
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
		initEReference(getFeedbackDefinition_Parent(), this.getFeedbackDefinition(), null, "parent", null, 0, 1,
				FeedbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackDefinition_Policy(), this.getFeedbackPolicy(), null, "policy", null, 1, 1,
				FeedbackDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackDefinition_Rating(), this.getRatingPolicy(), null, "rating", null, 1, 1,
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
		initEAttribute(getRatingPolicy_ScaleKind(), this.getRatingScaleKind(), "scaleKind", null, 0, 1,
				RatingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getModerationPolicy_Trigger(), ecorePackage.getEString(), "trigger", null, 0, 1,
				ModerationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getModerationPolicy_Decision(), this.getModerationDecision(), "decision", null, 0, 1,
				ModerationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getModerationPolicy_MonitorsResource(), this.getResourceType(), null, "monitorsResource", null,
				1, 1, ModerationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModerationPolicy_MonitorsFeedback(), this.getFeedbackDefinition(), null, "monitorsFeedback",
				null, 1, 1, ModerationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModerationPolicy_ExecutedBy(), this.getUserType(), null, "executedBy", null, 1, 1,
				ModerationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModerationPolicy_InContext(), this.getContextType(), null, "inContext", null, 0, 1,
				ModerationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationRuleEClass, AuthorizationRule.class, "AuthorizationRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
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
		initEAttribute(getAutomationRule_Trigger(), ecorePackage.getEString(), "trigger", null, 0, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomationRule_Condition(), ecorePackage.getEString(), "condition", null, 0, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomationRule_ActionDescription(), ecorePackage.getEString(), "actionDescription", null, 0,
				1, AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_Context(), this.getResourceType(), null, "context", null, 0, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_InContext(), this.getContextType(), null, "inContext", null, 0, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_OnFeedback(), this.getFeedbackDefinition(), null, "onFeedback", null, 1, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomationRule_Uses(), this.getValidationRule(), null, "uses", null, 1, 1,
				AutomationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verificationPolicyEClass, VerificationPolicy.class, "VerificationPolicy", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerificationPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				VerificationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerificationPolicy_Mode(), this.getValidationKind(), "mode", null, 0, 1,
				VerificationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerificationPolicy_AppliesWhen(), ecorePackage.getEString(), "appliesWhen", null, 0, 1,
				VerificationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getVerificationPolicy_Verifies(), this.getFeedbackDefinition(), null, "verifies", null, 1, 1,
				VerificationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evolutionRuleEClass, EvolutionRule.class, "EvolutionRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvolutionRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, EvolutionRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolutionRule_FromVersion(), ecorePackage.getEString(), "fromVersion", null, 0, 1,
				EvolutionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolutionRule_ToVersion(), ecorePackage.getEString(), "toVersion", null, 0, 1,
				EvolutionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolutionRule_TransformationId(), ecorePackage.getEString(), "transformationId", null, 0, 1,
				EvolutionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEvolutionRule_Applies(), this.getRefactoringOperation(), null, "applies", null, 1, -1,
				EvolutionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refactoringOperationEClass, RefactoringOperation.class, "RefactoringOperation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefactoringOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				RefactoringOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefactoringOperation_Kind(), this.getRefactoringKind(), "kind", null, 0, 1,
				RefactoringOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefactoringOperation_ScriptId(), ecorePackage.getEString(), "scriptId", null, 0, 1,
				RefactoringOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEEnum(feedbackStatusEEnum, FeedbackStatus.class, "FeedbackStatus");
		addEEnumLiteral(feedbackStatusEEnum, FeedbackStatus.ENABLED);
		addEEnumLiteral(feedbackStatusEEnum, FeedbackStatus.DISABLED);

		initEEnum(ratingScaleKindEEnum, RatingScaleKind.class, "RatingScaleKind");
		addEEnumLiteral(ratingScaleKindEEnum, RatingScaleKind.NUMERIC);
		addEEnumLiteral(ratingScaleKindEEnum, RatingScaleKind.ORDINAL);
		addEEnumLiteral(ratingScaleKindEEnum, RatingScaleKind.PERCENTAGE);

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

		initEEnum(refactoringKindEEnum, RefactoringKind.class, "RefactoringKind");
		addEEnumLiteral(refactoringKindEEnum, RefactoringKind.RENAME_ELEMENT);
		addEEnumLiteral(refactoringKindEEnum, RefactoringKind.MOVE_ELEMENT);
		addEEnumLiteral(refactoringKindEEnum, RefactoringKind.SPLIT_ELEMENT);
		addEEnumLiteral(refactoringKindEEnum, RefactoringKind.MERGE_ELEMENT);
		addEEnumLiteral(refactoringKindEEnum, RefactoringKind.CHANGE_TYPE);

		// Create resource
		createResource(eNS_URI);
	}

} //SiriusPackageImpl
