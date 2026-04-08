/**
 */
package pt.isep.enorm.ref.sirius;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pt.isep.enorm.ref.sirius.SiriusFactory
 * @model kind="package"
 * @generated
 */
public interface SiriusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sirius";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sirius";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sirius";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SiriusPackage eINSTANCE = pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl <em>Ref Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.RefModelImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getRefModel()
	 * @generated
	 */
	int REF_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__VERSION = 1;

	/**
	 * The feature id for the '<em><b>User Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__USER_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Resource Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__RESOURCE_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Feedback Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__FEEDBACK_POLICIES = 4;

	/**
	 * The feature id for the '<em><b>Context Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__CONTEXT_TYPES = 5;

	/**
	 * The feature id for the '<em><b>Resource Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__RESOURCE_RELATIONS = 6;

	/**
	 * The feature id for the '<em><b>Feedback Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__FEEDBACK_TYPES = 7;

	/**
	 * The feature id for the '<em><b>Feedback Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__FEEDBACK_DEFINITIONS = 8;

	/**
	 * The feature id for the '<em><b>Rating Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__RATING_POLICIES = 9;

	/**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__VALIDATION_RULES = 10;

	/**
	 * The feature id for the '<em><b>Moderation Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__MODERATION_POLICIES = 11;

	/**
	 * The feature id for the '<em><b>Automation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__AUTOMATION_RULES = 12;

	/**
	 * The feature id for the '<em><b>Verification Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__VERIFICATION_POLICIES = 13;

	/**
	 * The feature id for the '<em><b>Evolution Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__EVOLUTION_RULES = 14;

	/**
	 * The feature id for the '<em><b>Refactoring Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__REFACTORING_OPERATIONS = 15;

	/**
	 * The number of structural features of the '<em>Ref Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Ref Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.UserTypeImpl <em>User Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.UserTypeImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getUserType()
	 * @generated
	 */
	int USER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__KIND = 1;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE__SUPER_TYPES = 2;

	/**
	 * The number of structural features of the '<em>User Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.ContextTypeImpl <em>Context Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.ContextTypeImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getContextType()
	 * @generated
	 */
	int CONTEXT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_TYPE__KIND = 1;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_TYPE__CONTAINS = 2;

	/**
	 * The number of structural features of the '<em>Context Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Context Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.ResourceTypeImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Supports Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__SUPPORTS_MEDIA = 1;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__SUPER_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ATTRIBUTES = 3;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.AttributeImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MULTI_VALUED = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.ResourceRelationImpl <em>Resource Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.ResourceRelationImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getResourceRelation()
	 * @generated
	 */
	int RESOURCE_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELATION__SOURCE_CARDINALITY = 1;

	/**
	 * The feature id for the '<em><b>Target Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELATION__TARGET_CARDINALITY = 2;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELATION__CONTAINMENT = 3;

	/**
	 * The feature id for the '<em><b>Recursive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELATION__RECURSIVE = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELATION__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELATION__TARGET = 6;

	/**
	 * The number of structural features of the '<em>Resource Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Resource Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.FeedbackTypeImpl <em>Feedback Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.FeedbackTypeImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getFeedbackType()
	 * @generated
	 */
	int FEEDBACK_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE__KIND = 1;

	/**
	 * The feature id for the '<em><b>Subject Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE__SUBJECT_SCOPE = 2;

	/**
	 * The feature id for the '<em><b>Has Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE__HAS_RATING = 3;

	/**
	 * The feature id for the '<em><b>Recursive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE__RECURSIVE = 4;

	/**
	 * The feature id for the '<em><b>Allows Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE__ALLOWS_MEDIA = 5;

	/**
	 * The number of structural features of the '<em>Feedback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Feedback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.FeedbackDefinitionImpl <em>Feedback Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.FeedbackDefinitionImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getFeedbackDefinition()
	 * @generated
	 */
	int FEEDBACK_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Requires Verified Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__REQUIRES_VERIFIED_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Unique Per Author Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__UNIQUE_PER_AUTHOR_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Subject Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__SUBJECT_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Subject Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__SUBJECT_FEEDBACK = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__PARENT = 7;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__POLICY = 8;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__RATING = 9;

	/**
	 * The number of structural features of the '<em>Feedback Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Feedback Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.FeedbackPolicyImpl <em>Feedback Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.FeedbackPolicyImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getFeedbackPolicy()
	 * @generated
	 */
	int FEEDBACK_POLICY = 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_POLICY__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Feedback Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_POLICY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feedback Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.RatingPolicyImpl <em>Rating Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.RatingPolicyImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getRatingPolicy()
	 * @generated
	 */
	int RATING_POLICY = 9;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_POLICY__MIN_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_POLICY__MAX_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_POLICY__STEP = 2;

	/**
	 * The feature id for the '<em><b>Scale Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_POLICY__SCALE_KIND = 3;

	/**
	 * The number of structural features of the '<em>Rating Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_POLICY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rating Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.ValidationRuleImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getValidationRule()
	 * @generated
	 */
	int VALIDATION_RULE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__KIND = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__SEVERITY = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Implementation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__IMPLEMENTATION_ID = 4;

	/**
	 * The feature id for the '<em><b>Applies To Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__APPLIES_TO_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Applies To Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__APPLIES_TO_FEEDBACK = 6;

	/**
	 * The feature id for the '<em><b>Invoked By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__INVOKED_BY = 7;

	/**
	 * The number of structural features of the '<em>Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.ModerationPolicyImpl <em>Moderation Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.ModerationPolicyImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getModerationPolicy()
	 * @generated
	 */
	int MODERATION_POLICY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_POLICY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_POLICY__MODE = 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_POLICY__TRIGGER = 2;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_POLICY__DECISION = 3;

	/**
	 * The feature id for the '<em><b>Monitors Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_POLICY__MONITORS_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Monitors Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_POLICY__MONITORS_FEEDBACK = 5;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_POLICY__EXECUTED_BY = 6;

	/**
	 * The feature id for the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_POLICY__IN_CONTEXT = 7;

	/**
	 * The number of structural features of the '<em>Moderation Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_POLICY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Moderation Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.AuthorizationRuleImpl <em>Authorization Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.AuthorizationRuleImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getAuthorizationRule()
	 * @generated
	 */
	int AUTHORIZATION_RULE = 12;

	/**
	 * The feature id for the '<em><b>Allowed Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE__ALLOWED_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE__ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE__CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Resource Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE__RESOURCE_TARGET = 3;

	/**
	 * The feature id for the '<em><b>Feedback Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE__FEEDBACK_TARGET = 4;

	/**
	 * The number of structural features of the '<em>Authorization Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Authorization Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.AutomationRuleImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getAutomationRule()
	 * @generated
	 */
	int AUTOMATION_RULE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Action Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__ACTION_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__IN_CONTEXT = 5;

	/**
	 * The feature id for the '<em><b>On Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__ON_FEEDBACK = 6;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__USES = 7;

	/**
	 * The number of structural features of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.VerificationPolicyImpl <em>Verification Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.VerificationPolicyImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getVerificationPolicy()
	 * @generated
	 */
	int VERIFICATION_POLICY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_POLICY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_POLICY__MODE = 1;

	/**
	 * The feature id for the '<em><b>Applies When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_POLICY__APPLIES_WHEN = 2;

	/**
	 * The feature id for the '<em><b>Verifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_POLICY__VERIFIES = 3;

	/**
	 * The number of structural features of the '<em>Verification Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_POLICY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Verification Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.EvolutionRuleImpl <em>Evolution Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.EvolutionRuleImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getEvolutionRule()
	 * @generated
	 */
	int EVOLUTION_RULE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>From Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_RULE__FROM_VERSION = 1;

	/**
	 * The feature id for the '<em><b>To Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_RULE__TO_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Transformation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_RULE__TRANSFORMATION_ID = 3;

	/**
	 * The feature id for the '<em><b>Applies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_RULE__APPLIES = 4;

	/**
	 * The number of structural features of the '<em>Evolution Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_RULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Evolution Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.impl.RefactoringOperationImpl <em>Refactoring Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.impl.RefactoringOperationImpl
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getRefactoringOperation()
	 * @generated
	 */
	int REFACTORING_OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_OPERATION__KIND = 1;

	/**
	 * The feature id for the '<em><b>Script Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_OPERATION__SCRIPT_ID = 2;

	/**
	 * The number of structural features of the '<em>Refactoring Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Refactoring Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.UserKind <em>User Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.UserKind
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getUserKind()
	 * @generated
	 */
	int USER_KIND = 17;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.ContextKind <em>Context Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.ContextKind
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getContextKind()
	 * @generated
	 */
	int CONTEXT_KIND = 18;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.PrimitiveType
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 19;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.FeedbackKind <em>Feedback Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.FeedbackKind
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getFeedbackKind()
	 * @generated
	 */
	int FEEDBACK_KIND = 20;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.FeedbackSubjectScope <em>Feedback Subject Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.FeedbackSubjectScope
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getFeedbackSubjectScope()
	 * @generated
	 */
	int FEEDBACK_SUBJECT_SCOPE = 21;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.FeedbackStatus <em>Feedback Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.FeedbackStatus
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getFeedbackStatus()
	 * @generated
	 */
	int FEEDBACK_STATUS = 22;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.RatingScaleKind <em>Rating Scale Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.RatingScaleKind
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getRatingScaleKind()
	 * @generated
	 */
	int RATING_SCALE_KIND = 23;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.ValidationKind <em>Validation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.ValidationKind
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getValidationKind()
	 * @generated
	 */
	int VALIDATION_KIND = 24;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.RuleSeverity <em>Rule Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.RuleSeverity
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getRuleSeverity()
	 * @generated
	 */
	int RULE_SEVERITY = 25;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.ModerationMode <em>Moderation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.ModerationMode
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getModerationMode()
	 * @generated
	 */
	int MODERATION_MODE = 26;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.ModerationDecision <em>Moderation Decision</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.ModerationDecision
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getModerationDecision()
	 * @generated
	 */
	int MODERATION_DECISION = 27;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.ActionKind <em>Action Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.ActionKind
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getActionKind()
	 * @generated
	 */
	int ACTION_KIND = 28;

	/**
	 * The meta object id for the '{@link pt.isep.enorm.ref.sirius.RefactoringKind <em>Refactoring Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.enorm.ref.sirius.RefactoringKind
	 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getRefactoringKind()
	 * @generated
	 */
	int REFACTORING_KIND = 29;

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.RefModel <em>Ref Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Model</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel
	 * @generated
	 */
	EClass getRefModel();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.RefModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getName()
	 * @see #getRefModel()
	 * @generated
	 */
	EAttribute getRefModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.RefModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getVersion()
	 * @see #getRefModel()
	 * @generated
	 */
	EAttribute getRefModel_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getUserTypes <em>User Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Types</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getUserTypes()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_UserTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Types</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getResourceTypes()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_ResourceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getFeedbackPolicies <em>Feedback Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feedback Policies</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getFeedbackPolicies()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_FeedbackPolicies();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getContextTypes <em>Context Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Types</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getContextTypes()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_ContextTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getResourceRelations <em>Resource Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Relations</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getResourceRelations()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_ResourceRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getFeedbackTypes <em>Feedback Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feedback Types</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getFeedbackTypes()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_FeedbackTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getFeedbackDefinitions <em>Feedback Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feedback Definitions</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getFeedbackDefinitions()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_FeedbackDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getRatingPolicies <em>Rating Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rating Policies</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getRatingPolicies()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_RatingPolicies();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getValidationRules <em>Validation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validation Rules</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getValidationRules()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_ValidationRules();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getModerationPolicies <em>Moderation Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moderation Policies</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getModerationPolicies()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_ModerationPolicies();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getAutomationRules <em>Automation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Automation Rules</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getAutomationRules()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_AutomationRules();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getVerificationPolicies <em>Verification Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verification Policies</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getVerificationPolicies()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_VerificationPolicies();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getEvolutionRules <em>Evolution Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evolution Rules</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getEvolutionRules()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_EvolutionRules();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.RefModel#getRefactoringOperations <em>Refactoring Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refactoring Operations</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefModel#getRefactoringOperations()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_RefactoringOperations();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Type</em>'.
	 * @see pt.isep.enorm.ref.sirius.UserType
	 * @generated
	 */
	EClass getUserType();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.UserType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.UserType#getName()
	 * @see #getUserType()
	 * @generated
	 */
	EAttribute getUserType_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.UserType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see pt.isep.enorm.ref.sirius.UserType#getKind()
	 * @see #getUserType()
	 * @generated
	 */
	EAttribute getUserType_Kind();

	/**
	 * Returns the meta object for the reference list '{@link pt.isep.enorm.ref.sirius.UserType#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see pt.isep.enorm.ref.sirius.UserType#getSuperTypes()
	 * @see #getUserType()
	 * @generated
	 */
	EReference getUserType_SuperTypes();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.ContextType <em>Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Type</em>'.
	 * @see pt.isep.enorm.ref.sirius.ContextType
	 * @generated
	 */
	EClass getContextType();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ContextType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.ContextType#getName()
	 * @see #getContextType()
	 * @generated
	 */
	EAttribute getContextType_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ContextType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see pt.isep.enorm.ref.sirius.ContextType#getKind()
	 * @see #getContextType()
	 * @generated
	 */
	EAttribute getContextType_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.ContextType#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see pt.isep.enorm.ref.sirius.ContextType#getContains()
	 * @see #getContextType()
	 * @generated
	 */
	EReference getContextType_Contains();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see pt.isep.enorm.ref.sirius.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ResourceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.ResourceType#getName()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ResourceType#isSupportsMedia <em>Supports Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supports Media</em>'.
	 * @see pt.isep.enorm.ref.sirius.ResourceType#isSupportsMedia()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_SupportsMedia();

	/**
	 * Returns the meta object for the reference list '{@link pt.isep.enorm.ref.sirius.ResourceType#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see pt.isep.enorm.ref.sirius.ResourceType#getSuperTypes()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_SuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.ResourceType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see pt.isep.enorm.ref.sirius.ResourceType#getAttributes()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Attributes();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see pt.isep.enorm.ref.sirius.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pt.isep.enorm.ref.sirius.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.Attribute#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see pt.isep.enorm.ref.sirius.Attribute#isRequired()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Required();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.Attribute#isMultiValued <em>Multi Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Valued</em>'.
	 * @see pt.isep.enorm.ref.sirius.Attribute#isMultiValued()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_MultiValued();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.ResourceRelation <em>Resource Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Relation</em>'.
	 * @see pt.isep.enorm.ref.sirius.ResourceRelation
	 * @generated
	 */
	EClass getResourceRelation();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ResourceRelation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.ResourceRelation#getName()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EAttribute getResourceRelation_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ResourceRelation#getSourceCardinality <em>Source Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Cardinality</em>'.
	 * @see pt.isep.enorm.ref.sirius.ResourceRelation#getSourceCardinality()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EAttribute getResourceRelation_SourceCardinality();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ResourceRelation#getTargetCardinality <em>Target Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Cardinality</em>'.
	 * @see pt.isep.enorm.ref.sirius.ResourceRelation#getTargetCardinality()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EAttribute getResourceRelation_TargetCardinality();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ResourceRelation#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see pt.isep.enorm.ref.sirius.ResourceRelation#isContainment()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EAttribute getResourceRelation_Containment();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ResourceRelation#isRecursive <em>Recursive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recursive</em>'.
	 * @see pt.isep.enorm.ref.sirius.ResourceRelation#isRecursive()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EAttribute getResourceRelation_Recursive();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.ResourceRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see pt.isep.enorm.ref.sirius.ResourceRelation#getSource()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EReference getResourceRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.ResourceRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see pt.isep.enorm.ref.sirius.ResourceRelation#getTarget()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EReference getResourceRelation_Target();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.FeedbackType <em>Feedback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Type</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackType
	 * @generated
	 */
	EClass getFeedbackType();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.FeedbackType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackType#getName()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.FeedbackType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackType#getKind()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_Kind();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.FeedbackType#getSubjectScope <em>Subject Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Scope</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackType#getSubjectScope()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_SubjectScope();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.FeedbackType#isHasRating <em>Has Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Rating</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackType#isHasRating()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_HasRating();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.FeedbackType#isRecursive <em>Recursive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recursive</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackType#isRecursive()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_Recursive();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.FeedbackType#isAllowsMedia <em>Allows Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Media</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackType#isAllowsMedia()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_AllowsMedia();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition <em>Feedback Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Definition</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackDefinition
	 * @generated
	 */
	EClass getFeedbackDefinition();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackDefinition#getName()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EAttribute getFeedbackDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#isRequiresVerifiedContext <em>Requires Verified Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Verified Context</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackDefinition#isRequiresVerifiedContext()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EAttribute getFeedbackDefinition_RequiresVerifiedContext();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#isUniquePerAuthorTarget <em>Unique Per Author Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Per Author Target</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackDefinition#isUniquePerAuthorTarget()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EAttribute getFeedbackDefinition_UniquePerAuthorTarget();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackDefinition#getType()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EReference getFeedbackDefinition_Type();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getSubjectResource <em>Subject Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject Resource</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackDefinition#getSubjectResource()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EReference getFeedbackDefinition_SubjectResource();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackDefinition#getAuthor()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EReference getFeedbackDefinition_Author();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getSubjectFeedback <em>Subject Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject Feedback</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackDefinition#getSubjectFeedback()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EReference getFeedbackDefinition_SubjectFeedback();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackDefinition#getParent()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EReference getFeedbackDefinition_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackDefinition#getPolicy()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EReference getFeedbackDefinition_Policy();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rating</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackDefinition#getRating()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EReference getFeedbackDefinition_Rating();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.FeedbackPolicy <em>Feedback Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Policy</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackPolicy
	 * @generated
	 */
	EClass getFeedbackPolicy();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.FeedbackPolicy#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackPolicy#getStatus()
	 * @see #getFeedbackPolicy()
	 * @generated
	 */
	EAttribute getFeedbackPolicy_Status();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.RatingPolicy <em>Rating Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating Policy</em>'.
	 * @see pt.isep.enorm.ref.sirius.RatingPolicy
	 * @generated
	 */
	EClass getRatingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.RatingPolicy#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see pt.isep.enorm.ref.sirius.RatingPolicy#getMinValue()
	 * @see #getRatingPolicy()
	 * @generated
	 */
	EAttribute getRatingPolicy_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.RatingPolicy#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see pt.isep.enorm.ref.sirius.RatingPolicy#getMaxValue()
	 * @see #getRatingPolicy()
	 * @generated
	 */
	EAttribute getRatingPolicy_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.RatingPolicy#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see pt.isep.enorm.ref.sirius.RatingPolicy#getStep()
	 * @see #getRatingPolicy()
	 * @generated
	 */
	EAttribute getRatingPolicy_Step();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.RatingPolicy#getScaleKind <em>Scale Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Kind</em>'.
	 * @see pt.isep.enorm.ref.sirius.RatingPolicy#getScaleKind()
	 * @see #getRatingPolicy()
	 * @generated
	 */
	EAttribute getRatingPolicy_ScaleKind();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.ValidationRule <em>Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Rule</em>'.
	 * @see pt.isep.enorm.ref.sirius.ValidationRule
	 * @generated
	 */
	EClass getValidationRule();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ValidationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.ValidationRule#getName()
	 * @see #getValidationRule()
	 * @generated
	 */
	EAttribute getValidationRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ValidationRule#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see pt.isep.enorm.ref.sirius.ValidationRule#getKind()
	 * @see #getValidationRule()
	 * @generated
	 */
	EAttribute getValidationRule_Kind();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ValidationRule#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see pt.isep.enorm.ref.sirius.ValidationRule#getSeverity()
	 * @see #getValidationRule()
	 * @generated
	 */
	EAttribute getValidationRule_Severity();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ValidationRule#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see pt.isep.enorm.ref.sirius.ValidationRule#getExpression()
	 * @see #getValidationRule()
	 * @generated
	 */
	EAttribute getValidationRule_Expression();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ValidationRule#getImplementationId <em>Implementation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Id</em>'.
	 * @see pt.isep.enorm.ref.sirius.ValidationRule#getImplementationId()
	 * @see #getValidationRule()
	 * @generated
	 */
	EAttribute getValidationRule_ImplementationId();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.ValidationRule#getAppliesToResource <em>Applies To Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies To Resource</em>'.
	 * @see pt.isep.enorm.ref.sirius.ValidationRule#getAppliesToResource()
	 * @see #getValidationRule()
	 * @generated
	 */
	EReference getValidationRule_AppliesToResource();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.ValidationRule#getAppliesToFeedback <em>Applies To Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies To Feedback</em>'.
	 * @see pt.isep.enorm.ref.sirius.ValidationRule#getAppliesToFeedback()
	 * @see #getValidationRule()
	 * @generated
	 */
	EReference getValidationRule_AppliesToFeedback();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.ValidationRule#getInvokedBy <em>Invoked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoked By</em>'.
	 * @see pt.isep.enorm.ref.sirius.ValidationRule#getInvokedBy()
	 * @see #getValidationRule()
	 * @generated
	 */
	EReference getValidationRule_InvokedBy();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.ModerationPolicy <em>Moderation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moderation Policy</em>'.
	 * @see pt.isep.enorm.ref.sirius.ModerationPolicy
	 * @generated
	 */
	EClass getModerationPolicy();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.ModerationPolicy#getName()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EAttribute getModerationPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see pt.isep.enorm.ref.sirius.ModerationPolicy#getMode()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EAttribute getModerationPolicy_Mode();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see pt.isep.enorm.ref.sirius.ModerationPolicy#getTrigger()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EAttribute getModerationPolicy_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision</em>'.
	 * @see pt.isep.enorm.ref.sirius.ModerationPolicy#getDecision()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EAttribute getModerationPolicy_Decision();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getMonitorsResource <em>Monitors Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Monitors Resource</em>'.
	 * @see pt.isep.enorm.ref.sirius.ModerationPolicy#getMonitorsResource()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EReference getModerationPolicy_MonitorsResource();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getMonitorsFeedback <em>Monitors Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Monitors Feedback</em>'.
	 * @see pt.isep.enorm.ref.sirius.ModerationPolicy#getMonitorsFeedback()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EReference getModerationPolicy_MonitorsFeedback();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getExecutedBy <em>Executed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executed By</em>'.
	 * @see pt.isep.enorm.ref.sirius.ModerationPolicy#getExecutedBy()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EReference getModerationPolicy_ExecutedBy();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.ModerationPolicy#getInContext <em>In Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Context</em>'.
	 * @see pt.isep.enorm.ref.sirius.ModerationPolicy#getInContext()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EReference getModerationPolicy_InContext();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.AuthorizationRule <em>Authorization Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Rule</em>'.
	 * @see pt.isep.enorm.ref.sirius.AuthorizationRule
	 * @generated
	 */
	EClass getAuthorizationRule();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.AuthorizationRule#getAllowedAction <em>Allowed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Action</em>'.
	 * @see pt.isep.enorm.ref.sirius.AuthorizationRule#getAllowedAction()
	 * @see #getAuthorizationRule()
	 * @generated
	 */
	EAttribute getAuthorizationRule_AllowedAction();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.AuthorizationRule#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see pt.isep.enorm.ref.sirius.AuthorizationRule#getActor()
	 * @see #getAuthorizationRule()
	 * @generated
	 */
	EReference getAuthorizationRule_Actor();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.AuthorizationRule#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see pt.isep.enorm.ref.sirius.AuthorizationRule#getContext()
	 * @see #getAuthorizationRule()
	 * @generated
	 */
	EReference getAuthorizationRule_Context();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.AuthorizationRule#getResourceTarget <em>Resource Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Target</em>'.
	 * @see pt.isep.enorm.ref.sirius.AuthorizationRule#getResourceTarget()
	 * @see #getAuthorizationRule()
	 * @generated
	 */
	EReference getAuthorizationRule_ResourceTarget();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.AuthorizationRule#getFeedbackTarget <em>Feedback Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feedback Target</em>'.
	 * @see pt.isep.enorm.ref.sirius.AuthorizationRule#getFeedbackTarget()
	 * @see #getAuthorizationRule()
	 * @generated
	 */
	EReference getAuthorizationRule_FeedbackTarget();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.AutomationRule <em>Automation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automation Rule</em>'.
	 * @see pt.isep.enorm.ref.sirius.AutomationRule
	 * @generated
	 */
	EClass getAutomationRule();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.AutomationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.AutomationRule#getName()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.AutomationRule#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see pt.isep.enorm.ref.sirius.AutomationRule#getTrigger()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.AutomationRule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see pt.isep.enorm.ref.sirius.AutomationRule#getCondition()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_Condition();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.AutomationRule#getActionDescription <em>Action Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Description</em>'.
	 * @see pt.isep.enorm.ref.sirius.AutomationRule#getActionDescription()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_ActionDescription();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.AutomationRule#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see pt.isep.enorm.ref.sirius.AutomationRule#getContext()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Context();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.AutomationRule#getInContext <em>In Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Context</em>'.
	 * @see pt.isep.enorm.ref.sirius.AutomationRule#getInContext()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_InContext();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.AutomationRule#getOnFeedback <em>On Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Feedback</em>'.
	 * @see pt.isep.enorm.ref.sirius.AutomationRule#getOnFeedback()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_OnFeedback();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.AutomationRule#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see pt.isep.enorm.ref.sirius.AutomationRule#getUses()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Uses();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.VerificationPolicy <em>Verification Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Policy</em>'.
	 * @see pt.isep.enorm.ref.sirius.VerificationPolicy
	 * @generated
	 */
	EClass getVerificationPolicy();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.VerificationPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.VerificationPolicy#getName()
	 * @see #getVerificationPolicy()
	 * @generated
	 */
	EAttribute getVerificationPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.VerificationPolicy#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see pt.isep.enorm.ref.sirius.VerificationPolicy#getMode()
	 * @see #getVerificationPolicy()
	 * @generated
	 */
	EAttribute getVerificationPolicy_Mode();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.VerificationPolicy#getAppliesWhen <em>Applies When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applies When</em>'.
	 * @see pt.isep.enorm.ref.sirius.VerificationPolicy#getAppliesWhen()
	 * @see #getVerificationPolicy()
	 * @generated
	 */
	EAttribute getVerificationPolicy_AppliesWhen();

	/**
	 * Returns the meta object for the reference '{@link pt.isep.enorm.ref.sirius.VerificationPolicy#getVerifies <em>Verifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Verifies</em>'.
	 * @see pt.isep.enorm.ref.sirius.VerificationPolicy#getVerifies()
	 * @see #getVerificationPolicy()
	 * @generated
	 */
	EReference getVerificationPolicy_Verifies();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.EvolutionRule <em>Evolution Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evolution Rule</em>'.
	 * @see pt.isep.enorm.ref.sirius.EvolutionRule
	 * @generated
	 */
	EClass getEvolutionRule();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.EvolutionRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.EvolutionRule#getName()
	 * @see #getEvolutionRule()
	 * @generated
	 */
	EAttribute getEvolutionRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.EvolutionRule#getFromVersion <em>From Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Version</em>'.
	 * @see pt.isep.enorm.ref.sirius.EvolutionRule#getFromVersion()
	 * @see #getEvolutionRule()
	 * @generated
	 */
	EAttribute getEvolutionRule_FromVersion();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.EvolutionRule#getToVersion <em>To Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Version</em>'.
	 * @see pt.isep.enorm.ref.sirius.EvolutionRule#getToVersion()
	 * @see #getEvolutionRule()
	 * @generated
	 */
	EAttribute getEvolutionRule_ToVersion();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.EvolutionRule#getTransformationId <em>Transformation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Id</em>'.
	 * @see pt.isep.enorm.ref.sirius.EvolutionRule#getTransformationId()
	 * @see #getEvolutionRule()
	 * @generated
	 */
	EAttribute getEvolutionRule_TransformationId();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.enorm.ref.sirius.EvolutionRule#getApplies <em>Applies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applies</em>'.
	 * @see pt.isep.enorm.ref.sirius.EvolutionRule#getApplies()
	 * @see #getEvolutionRule()
	 * @generated
	 */
	EReference getEvolutionRule_Applies();

	/**
	 * Returns the meta object for class '{@link pt.isep.enorm.ref.sirius.RefactoringOperation <em>Refactoring Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refactoring Operation</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefactoringOperation
	 * @generated
	 */
	EClass getRefactoringOperation();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.RefactoringOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefactoringOperation#getName()
	 * @see #getRefactoringOperation()
	 * @generated
	 */
	EAttribute getRefactoringOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.RefactoringOperation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefactoringOperation#getKind()
	 * @see #getRefactoringOperation()
	 * @generated
	 */
	EAttribute getRefactoringOperation_Kind();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.enorm.ref.sirius.RefactoringOperation#getScriptId <em>Script Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Id</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefactoringOperation#getScriptId()
	 * @see #getRefactoringOperation()
	 * @generated
	 */
	EAttribute getRefactoringOperation_ScriptId();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.ref.sirius.UserKind <em>User Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Kind</em>'.
	 * @see pt.isep.enorm.ref.sirius.UserKind
	 * @generated
	 */
	EEnum getUserKind();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.ref.sirius.ContextKind <em>Context Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Context Kind</em>'.
	 * @see pt.isep.enorm.ref.sirius.ContextKind
	 * @generated
	 */
	EEnum getContextKind();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.ref.sirius.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see pt.isep.enorm.ref.sirius.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.ref.sirius.FeedbackKind <em>Feedback Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feedback Kind</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackKind
	 * @generated
	 */
	EEnum getFeedbackKind();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.ref.sirius.FeedbackSubjectScope <em>Feedback Subject Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feedback Subject Scope</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackSubjectScope
	 * @generated
	 */
	EEnum getFeedbackSubjectScope();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.ref.sirius.FeedbackStatus <em>Feedback Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feedback Status</em>'.
	 * @see pt.isep.enorm.ref.sirius.FeedbackStatus
	 * @generated
	 */
	EEnum getFeedbackStatus();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.ref.sirius.RatingScaleKind <em>Rating Scale Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rating Scale Kind</em>'.
	 * @see pt.isep.enorm.ref.sirius.RatingScaleKind
	 * @generated
	 */
	EEnum getRatingScaleKind();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.ref.sirius.ValidationKind <em>Validation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validation Kind</em>'.
	 * @see pt.isep.enorm.ref.sirius.ValidationKind
	 * @generated
	 */
	EEnum getValidationKind();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.ref.sirius.RuleSeverity <em>Rule Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Severity</em>'.
	 * @see pt.isep.enorm.ref.sirius.RuleSeverity
	 * @generated
	 */
	EEnum getRuleSeverity();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.ref.sirius.ModerationMode <em>Moderation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Moderation Mode</em>'.
	 * @see pt.isep.enorm.ref.sirius.ModerationMode
	 * @generated
	 */
	EEnum getModerationMode();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.ref.sirius.ModerationDecision <em>Moderation Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Moderation Decision</em>'.
	 * @see pt.isep.enorm.ref.sirius.ModerationDecision
	 * @generated
	 */
	EEnum getModerationDecision();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.ref.sirius.ActionKind <em>Action Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Kind</em>'.
	 * @see pt.isep.enorm.ref.sirius.ActionKind
	 * @generated
	 */
	EEnum getActionKind();

	/**
	 * Returns the meta object for enum '{@link pt.isep.enorm.ref.sirius.RefactoringKind <em>Refactoring Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Refactoring Kind</em>'.
	 * @see pt.isep.enorm.ref.sirius.RefactoringKind
	 * @generated
	 */
	EEnum getRefactoringKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SiriusFactory getSiriusFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.RefModelImpl <em>Ref Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.RefModelImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getRefModel()
		 * @generated
		 */
		EClass REF_MODEL = eINSTANCE.getRefModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_MODEL__NAME = eINSTANCE.getRefModel_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_MODEL__VERSION = eINSTANCE.getRefModel_Version();

		/**
		 * The meta object literal for the '<em><b>User Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__USER_TYPES = eINSTANCE.getRefModel_UserTypes();

		/**
		 * The meta object literal for the '<em><b>Resource Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__RESOURCE_TYPES = eINSTANCE.getRefModel_ResourceTypes();

		/**
		 * The meta object literal for the '<em><b>Feedback Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__FEEDBACK_POLICIES = eINSTANCE.getRefModel_FeedbackPolicies();

		/**
		 * The meta object literal for the '<em><b>Context Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__CONTEXT_TYPES = eINSTANCE.getRefModel_ContextTypes();

		/**
		 * The meta object literal for the '<em><b>Resource Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__RESOURCE_RELATIONS = eINSTANCE.getRefModel_ResourceRelations();

		/**
		 * The meta object literal for the '<em><b>Feedback Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__FEEDBACK_TYPES = eINSTANCE.getRefModel_FeedbackTypes();

		/**
		 * The meta object literal for the '<em><b>Feedback Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__FEEDBACK_DEFINITIONS = eINSTANCE.getRefModel_FeedbackDefinitions();

		/**
		 * The meta object literal for the '<em><b>Rating Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__RATING_POLICIES = eINSTANCE.getRefModel_RatingPolicies();

		/**
		 * The meta object literal for the '<em><b>Validation Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__VALIDATION_RULES = eINSTANCE.getRefModel_ValidationRules();

		/**
		 * The meta object literal for the '<em><b>Moderation Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__MODERATION_POLICIES = eINSTANCE.getRefModel_ModerationPolicies();

		/**
		 * The meta object literal for the '<em><b>Automation Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__AUTOMATION_RULES = eINSTANCE.getRefModel_AutomationRules();

		/**
		 * The meta object literal for the '<em><b>Verification Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__VERIFICATION_POLICIES = eINSTANCE.getRefModel_VerificationPolicies();

		/**
		 * The meta object literal for the '<em><b>Evolution Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__EVOLUTION_RULES = eINSTANCE.getRefModel_EvolutionRules();

		/**
		 * The meta object literal for the '<em><b>Refactoring Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__REFACTORING_OPERATIONS = eINSTANCE.getRefModel_RefactoringOperations();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.UserTypeImpl <em>User Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.UserTypeImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getUserType()
		 * @generated
		 */
		EClass USER_TYPE = eINSTANCE.getUserType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_TYPE__NAME = eINSTANCE.getUserType_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_TYPE__KIND = eINSTANCE.getUserType_Kind();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TYPE__SUPER_TYPES = eINSTANCE.getUserType_SuperTypes();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.ContextTypeImpl <em>Context Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.ContextTypeImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getContextType()
		 * @generated
		 */
		EClass CONTEXT_TYPE = eINSTANCE.getContextType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_TYPE__NAME = eINSTANCE.getContextType_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_TYPE__KIND = eINSTANCE.getContextType_Kind();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_TYPE__CONTAINS = eINSTANCE.getContextType_Contains();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.ResourceTypeImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__NAME = eINSTANCE.getResourceType_Name();

		/**
		 * The meta object literal for the '<em><b>Supports Media</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__SUPPORTS_MEDIA = eINSTANCE.getResourceType_SupportsMedia();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__SUPER_TYPES = eINSTANCE.getResourceType_SuperTypes();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__ATTRIBUTES = eINSTANCE.getResourceType_Attributes();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.AttributeImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__REQUIRED = eINSTANCE.getAttribute_Required();

		/**
		 * The meta object literal for the '<em><b>Multi Valued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MULTI_VALUED = eINSTANCE.getAttribute_MultiValued();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.ResourceRelationImpl <em>Resource Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.ResourceRelationImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getResourceRelation()
		 * @generated
		 */
		EClass RESOURCE_RELATION = eINSTANCE.getResourceRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_RELATION__NAME = eINSTANCE.getResourceRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Source Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_RELATION__SOURCE_CARDINALITY = eINSTANCE.getResourceRelation_SourceCardinality();

		/**
		 * The meta object literal for the '<em><b>Target Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_RELATION__TARGET_CARDINALITY = eINSTANCE.getResourceRelation_TargetCardinality();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_RELATION__CONTAINMENT = eINSTANCE.getResourceRelation_Containment();

		/**
		 * The meta object literal for the '<em><b>Recursive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_RELATION__RECURSIVE = eINSTANCE.getResourceRelation_Recursive();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_RELATION__SOURCE = eINSTANCE.getResourceRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_RELATION__TARGET = eINSTANCE.getResourceRelation_Target();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.FeedbackTypeImpl <em>Feedback Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.FeedbackTypeImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getFeedbackType()
		 * @generated
		 */
		EClass FEEDBACK_TYPE = eINSTANCE.getFeedbackType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_TYPE__NAME = eINSTANCE.getFeedbackType_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_TYPE__KIND = eINSTANCE.getFeedbackType_Kind();

		/**
		 * The meta object literal for the '<em><b>Subject Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_TYPE__SUBJECT_SCOPE = eINSTANCE.getFeedbackType_SubjectScope();

		/**
		 * The meta object literal for the '<em><b>Has Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_TYPE__HAS_RATING = eINSTANCE.getFeedbackType_HasRating();

		/**
		 * The meta object literal for the '<em><b>Recursive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_TYPE__RECURSIVE = eINSTANCE.getFeedbackType_Recursive();

		/**
		 * The meta object literal for the '<em><b>Allows Media</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_TYPE__ALLOWS_MEDIA = eINSTANCE.getFeedbackType_AllowsMedia();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.FeedbackDefinitionImpl <em>Feedback Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.FeedbackDefinitionImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getFeedbackDefinition()
		 * @generated
		 */
		EClass FEEDBACK_DEFINITION = eINSTANCE.getFeedbackDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_DEFINITION__NAME = eINSTANCE.getFeedbackDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Requires Verified Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_DEFINITION__REQUIRES_VERIFIED_CONTEXT = eINSTANCE
				.getFeedbackDefinition_RequiresVerifiedContext();

		/**
		 * The meta object literal for the '<em><b>Unique Per Author Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_DEFINITION__UNIQUE_PER_AUTHOR_TARGET = eINSTANCE
				.getFeedbackDefinition_UniquePerAuthorTarget();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_DEFINITION__TYPE = eINSTANCE.getFeedbackDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Subject Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_DEFINITION__SUBJECT_RESOURCE = eINSTANCE.getFeedbackDefinition_SubjectResource();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_DEFINITION__AUTHOR = eINSTANCE.getFeedbackDefinition_Author();

		/**
		 * The meta object literal for the '<em><b>Subject Feedback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_DEFINITION__SUBJECT_FEEDBACK = eINSTANCE.getFeedbackDefinition_SubjectFeedback();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_DEFINITION__PARENT = eINSTANCE.getFeedbackDefinition_Parent();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_DEFINITION__POLICY = eINSTANCE.getFeedbackDefinition_Policy();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_DEFINITION__RATING = eINSTANCE.getFeedbackDefinition_Rating();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.FeedbackPolicyImpl <em>Feedback Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.FeedbackPolicyImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getFeedbackPolicy()
		 * @generated
		 */
		EClass FEEDBACK_POLICY = eINSTANCE.getFeedbackPolicy();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_POLICY__STATUS = eINSTANCE.getFeedbackPolicy_Status();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.RatingPolicyImpl <em>Rating Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.RatingPolicyImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getRatingPolicy()
		 * @generated
		 */
		EClass RATING_POLICY = eINSTANCE.getRatingPolicy();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING_POLICY__MIN_VALUE = eINSTANCE.getRatingPolicy_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING_POLICY__MAX_VALUE = eINSTANCE.getRatingPolicy_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING_POLICY__STEP = eINSTANCE.getRatingPolicy_Step();

		/**
		 * The meta object literal for the '<em><b>Scale Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING_POLICY__SCALE_KIND = eINSTANCE.getRatingPolicy_ScaleKind();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.ValidationRuleImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getValidationRule()
		 * @generated
		 */
		EClass VALIDATION_RULE = eINSTANCE.getValidationRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_RULE__NAME = eINSTANCE.getValidationRule_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_RULE__KIND = eINSTANCE.getValidationRule_Kind();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_RULE__SEVERITY = eINSTANCE.getValidationRule_Severity();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_RULE__EXPRESSION = eINSTANCE.getValidationRule_Expression();

		/**
		 * The meta object literal for the '<em><b>Implementation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_RULE__IMPLEMENTATION_ID = eINSTANCE.getValidationRule_ImplementationId();

		/**
		 * The meta object literal for the '<em><b>Applies To Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_RULE__APPLIES_TO_RESOURCE = eINSTANCE.getValidationRule_AppliesToResource();

		/**
		 * The meta object literal for the '<em><b>Applies To Feedback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_RULE__APPLIES_TO_FEEDBACK = eINSTANCE.getValidationRule_AppliesToFeedback();

		/**
		 * The meta object literal for the '<em><b>Invoked By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_RULE__INVOKED_BY = eINSTANCE.getValidationRule_InvokedBy();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.ModerationPolicyImpl <em>Moderation Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.ModerationPolicyImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getModerationPolicy()
		 * @generated
		 */
		EClass MODERATION_POLICY = eINSTANCE.getModerationPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODERATION_POLICY__NAME = eINSTANCE.getModerationPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODERATION_POLICY__MODE = eINSTANCE.getModerationPolicy_Mode();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODERATION_POLICY__TRIGGER = eINSTANCE.getModerationPolicy_Trigger();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODERATION_POLICY__DECISION = eINSTANCE.getModerationPolicy_Decision();

		/**
		 * The meta object literal for the '<em><b>Monitors Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODERATION_POLICY__MONITORS_RESOURCE = eINSTANCE.getModerationPolicy_MonitorsResource();

		/**
		 * The meta object literal for the '<em><b>Monitors Feedback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODERATION_POLICY__MONITORS_FEEDBACK = eINSTANCE.getModerationPolicy_MonitorsFeedback();

		/**
		 * The meta object literal for the '<em><b>Executed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODERATION_POLICY__EXECUTED_BY = eINSTANCE.getModerationPolicy_ExecutedBy();

		/**
		 * The meta object literal for the '<em><b>In Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODERATION_POLICY__IN_CONTEXT = eINSTANCE.getModerationPolicy_InContext();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.AuthorizationRuleImpl <em>Authorization Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.AuthorizationRuleImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getAuthorizationRule()
		 * @generated
		 */
		EClass AUTHORIZATION_RULE = eINSTANCE.getAuthorizationRule();

		/**
		 * The meta object literal for the '<em><b>Allowed Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_RULE__ALLOWED_ACTION = eINSTANCE.getAuthorizationRule_AllowedAction();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_RULE__ACTOR = eINSTANCE.getAuthorizationRule_Actor();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_RULE__CONTEXT = eINSTANCE.getAuthorizationRule_Context();

		/**
		 * The meta object literal for the '<em><b>Resource Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_RULE__RESOURCE_TARGET = eINSTANCE.getAuthorizationRule_ResourceTarget();

		/**
		 * The meta object literal for the '<em><b>Feedback Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_RULE__FEEDBACK_TARGET = eINSTANCE.getAuthorizationRule_FeedbackTarget();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.AutomationRuleImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getAutomationRule()
		 * @generated
		 */
		EClass AUTOMATION_RULE = eINSTANCE.getAutomationRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__NAME = eINSTANCE.getAutomationRule_Name();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__TRIGGER = eINSTANCE.getAutomationRule_Trigger();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__CONDITION = eINSTANCE.getAutomationRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Action Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__ACTION_DESCRIPTION = eINSTANCE.getAutomationRule_ActionDescription();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__CONTEXT = eINSTANCE.getAutomationRule_Context();

		/**
		 * The meta object literal for the '<em><b>In Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__IN_CONTEXT = eINSTANCE.getAutomationRule_InContext();

		/**
		 * The meta object literal for the '<em><b>On Feedback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__ON_FEEDBACK = eINSTANCE.getAutomationRule_OnFeedback();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__USES = eINSTANCE.getAutomationRule_Uses();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.VerificationPolicyImpl <em>Verification Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.VerificationPolicyImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getVerificationPolicy()
		 * @generated
		 */
		EClass VERIFICATION_POLICY = eINSTANCE.getVerificationPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION_POLICY__NAME = eINSTANCE.getVerificationPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION_POLICY__MODE = eINSTANCE.getVerificationPolicy_Mode();

		/**
		 * The meta object literal for the '<em><b>Applies When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION_POLICY__APPLIES_WHEN = eINSTANCE.getVerificationPolicy_AppliesWhen();

		/**
		 * The meta object literal for the '<em><b>Verifies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_POLICY__VERIFIES = eINSTANCE.getVerificationPolicy_Verifies();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.EvolutionRuleImpl <em>Evolution Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.EvolutionRuleImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getEvolutionRule()
		 * @generated
		 */
		EClass EVOLUTION_RULE = eINSTANCE.getEvolutionRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLUTION_RULE__NAME = eINSTANCE.getEvolutionRule_Name();

		/**
		 * The meta object literal for the '<em><b>From Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLUTION_RULE__FROM_VERSION = eINSTANCE.getEvolutionRule_FromVersion();

		/**
		 * The meta object literal for the '<em><b>To Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLUTION_RULE__TO_VERSION = eINSTANCE.getEvolutionRule_ToVersion();

		/**
		 * The meta object literal for the '<em><b>Transformation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLUTION_RULE__TRANSFORMATION_ID = eINSTANCE.getEvolutionRule_TransformationId();

		/**
		 * The meta object literal for the '<em><b>Applies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVOLUTION_RULE__APPLIES = eINSTANCE.getEvolutionRule_Applies();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.impl.RefactoringOperationImpl <em>Refactoring Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.impl.RefactoringOperationImpl
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getRefactoringOperation()
		 * @generated
		 */
		EClass REFACTORING_OPERATION = eINSTANCE.getRefactoringOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFACTORING_OPERATION__NAME = eINSTANCE.getRefactoringOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFACTORING_OPERATION__KIND = eINSTANCE.getRefactoringOperation_Kind();

		/**
		 * The meta object literal for the '<em><b>Script Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFACTORING_OPERATION__SCRIPT_ID = eINSTANCE.getRefactoringOperation_ScriptId();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.UserKind <em>User Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.UserKind
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getUserKind()
		 * @generated
		 */
		EEnum USER_KIND = eINSTANCE.getUserKind();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.ContextKind <em>Context Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.ContextKind
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getContextKind()
		 * @generated
		 */
		EEnum CONTEXT_KIND = eINSTANCE.getContextKind();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.PrimitiveType
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.FeedbackKind <em>Feedback Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.FeedbackKind
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getFeedbackKind()
		 * @generated
		 */
		EEnum FEEDBACK_KIND = eINSTANCE.getFeedbackKind();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.FeedbackSubjectScope <em>Feedback Subject Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.FeedbackSubjectScope
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getFeedbackSubjectScope()
		 * @generated
		 */
		EEnum FEEDBACK_SUBJECT_SCOPE = eINSTANCE.getFeedbackSubjectScope();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.FeedbackStatus <em>Feedback Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.FeedbackStatus
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getFeedbackStatus()
		 * @generated
		 */
		EEnum FEEDBACK_STATUS = eINSTANCE.getFeedbackStatus();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.RatingScaleKind <em>Rating Scale Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.RatingScaleKind
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getRatingScaleKind()
		 * @generated
		 */
		EEnum RATING_SCALE_KIND = eINSTANCE.getRatingScaleKind();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.ValidationKind <em>Validation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.ValidationKind
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getValidationKind()
		 * @generated
		 */
		EEnum VALIDATION_KIND = eINSTANCE.getValidationKind();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.RuleSeverity <em>Rule Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.RuleSeverity
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getRuleSeverity()
		 * @generated
		 */
		EEnum RULE_SEVERITY = eINSTANCE.getRuleSeverity();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.ModerationMode <em>Moderation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.ModerationMode
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getModerationMode()
		 * @generated
		 */
		EEnum MODERATION_MODE = eINSTANCE.getModerationMode();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.ModerationDecision <em>Moderation Decision</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.ModerationDecision
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getModerationDecision()
		 * @generated
		 */
		EEnum MODERATION_DECISION = eINSTANCE.getModerationDecision();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.ActionKind <em>Action Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.ActionKind
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getActionKind()
		 * @generated
		 */
		EEnum ACTION_KIND = eINSTANCE.getActionKind();

		/**
		 * The meta object literal for the '{@link pt.isep.enorm.ref.sirius.RefactoringKind <em>Refactoring Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.enorm.ref.sirius.RefactoringKind
		 * @see pt.isep.enorm.ref.sirius.impl.SiriusPackageImpl#getRefactoringKind()
		 * @generated
		 */
		EEnum REFACTORING_KIND = eINSTANCE.getRefactoringKind();

	}

} //SiriusPackage
