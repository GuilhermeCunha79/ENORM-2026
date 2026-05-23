/**
 */
package enorm;

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
 * @see enorm.EnormFactory
 * @model kind="package"
 * @generated
 */
public interface EnormPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enorm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/enorm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "enorm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnormPackage eINSTANCE = enorm.impl.EnormPackageImpl.init();

	/**
	 * The meta object id for the '{@link enorm.impl.RefModelImpl <em>Ref Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.RefModelImpl
	 * @see enorm.impl.EnormPackageImpl#getRefModel()
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
	 * The feature id for the '<em><b>Context Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__CONTEXT_TYPES = 4;

	/**
	 * The feature id for the '<em><b>Resource Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__RESOURCE_RELATIONS = 5;

	/**
	 * The feature id for the '<em><b>Feedback Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__FEEDBACK_TYPES = 6;

	/**
	 * The feature id for the '<em><b>Feedback Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__FEEDBACK_DEFINITIONS = 7;

	/**
	 * The feature id for the '<em><b>Authorization Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__AUTHORIZATION_RULES = 8;

	/**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__VALIDATION_RULES = 9;

	/**
	 * The feature id for the '<em><b>Moderation Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__MODERATION_POLICIES = 10;

	/**
	 * The feature id for the '<em><b>Automation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__AUTOMATION_RULES = 11;

	/**
	 * The feature id for the '<em><b>Verification Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__VERIFICATION_POLICIES = 12;

	/**
	 * The feature id for the '<em><b>Sorting Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL__SORTING_POLICIES = 13;

	/**
	 * The number of structural features of the '<em>Ref Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Ref Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enorm.impl.UserTypeImpl <em>User Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.UserTypeImpl
	 * @see enorm.impl.EnormPackageImpl#getUserType()
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
	 * The meta object id for the '{@link enorm.impl.ContextTypeImpl <em>Context Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.ContextTypeImpl
	 * @see enorm.impl.EnormPackageImpl#getContextType()
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
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
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
	 * The meta object id for the '{@link enorm.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.ResourceTypeImpl
	 * @see enorm.impl.EnormPackageImpl#getResourceType()
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
	 * The meta object id for the '{@link enorm.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.AttributeImpl
	 * @see enorm.impl.EnormPackageImpl#getAttribute()
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
	 * The meta object id for the '{@link enorm.impl.ResourceRelationImpl <em>Resource Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.ResourceRelationImpl
	 * @see enorm.impl.EnormPackageImpl#getResourceRelation()
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
	 * The meta object id for the '{@link enorm.impl.FeedbackTypeImpl <em>Feedback Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.FeedbackTypeImpl
	 * @see enorm.impl.EnormPackageImpl#getFeedbackType()
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
	 * The feature id for the '<em><b>Allows Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE__ALLOWS_TEXT = 5;

	/**
	 * The feature id for the '<em><b>Allows Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE__ALLOWS_MEDIA = 6;

	/**
	 * The feature id for the '<em><b>Polarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE__POLARITY = 7;

	/**
	 * The number of structural features of the '<em>Feedback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Feedback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enorm.impl.FeedbackDefinitionImpl <em>Feedback Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.FeedbackDefinitionImpl
	 * @see enorm.impl.EnormPackageImpl#getFeedbackDefinition()
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
	 * The feature id for the '<em><b>Verification Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__VERIFICATION_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Unique Per Author Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__UNIQUE_PER_AUTHOR_TARGET = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Subject Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__SUBJECT_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__AUTHOR = 6;

	/**
	 * The feature id for the '<em><b>Subject Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_DEFINITION__SUBJECT_FEEDBACK = 7;

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
	 * The meta object id for the '{@link enorm.impl.FeedbackPolicyImpl <em>Feedback Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.FeedbackPolicyImpl
	 * @see enorm.impl.EnormPackageImpl#getFeedbackPolicy()
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
	 * The meta object id for the '{@link enorm.impl.RatingPolicyImpl <em>Rating Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.RatingPolicyImpl
	 * @see enorm.impl.EnormPackageImpl#getRatingPolicy()
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
	 * The number of structural features of the '<em>Rating Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_POLICY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rating Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enorm.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.ValidationRuleImpl
	 * @see enorm.impl.EnormPackageImpl#getValidationRule()
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
	 * The meta object id for the '{@link enorm.impl.ModerationPolicyImpl <em>Moderation Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.ModerationPolicyImpl
	 * @see enorm.impl.EnormPackageImpl#getModerationPolicy()
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
	 * The feature id for the '<em><b>Executed By</b></em>' reference list.
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
	 * The meta object id for the '{@link enorm.impl.AuthorizationRuleImpl <em>Authorization Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.AuthorizationRuleImpl
	 * @see enorm.impl.EnormPackageImpl#getAuthorizationRule()
	 * @generated
	 */
	int AUTHORIZATION_RULE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Allowed Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE__ALLOWED_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE__ACTOR = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE__CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Resource Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE__RESOURCE_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Feedback Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE__FEEDBACK_TARGET = 5;

	/**
	 * The number of structural features of the '<em>Authorization Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Authorization Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enorm.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.AutomationRuleImpl
	 * @see enorm.impl.EnormPackageImpl#getAutomationRule()
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
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__IN_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>On Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__ON_FEEDBACK = 4;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__USES = 5;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__CONDITIONS = 6;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__ACTIONS = 7;

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
	 * The meta object id for the '{@link enorm.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.ConditionImpl
	 * @see enorm.impl.EnormPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CHILDREN = 3;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enorm.impl.ConditionValueImpl <em>Condition Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.ConditionValueImpl
	 * @see enorm.impl.EnormPackageImpl#getConditionValue()
	 * @generated
	 */
	int CONDITION_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Condition Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enorm.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.ActionImpl
	 * @see enorm.impl.EnormPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__KIND = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enorm.impl.VerificationPolicyImpl <em>Verification Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.VerificationPolicyImpl
	 * @see enorm.impl.EnormPackageImpl#getVerificationPolicy()
	 * @generated
	 */
	int VERIFICATION_POLICY = 17;

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
	 * The meta object id for the '{@link enorm.impl.SortingPolicyImpl <em>Sorting Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.impl.SortingPolicyImpl
	 * @see enorm.impl.EnormPackageImpl#getSortingPolicy()
	 * @generated
	 */
	int SORTING_POLICY = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_POLICY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_POLICY__CRITERION = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_POLICY__DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Applies To Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_POLICY__APPLIES_TO_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Applies To Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_POLICY__APPLIES_TO_FEEDBACK = 4;

	/**
	 * The feature id for the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_POLICY__IN_CONTEXT = 5;

	/**
	 * The number of structural features of the '<em>Sorting Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_POLICY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Sorting Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enorm.UserKind <em>User Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.UserKind
	 * @see enorm.impl.EnormPackageImpl#getUserKind()
	 * @generated
	 */
	int USER_KIND = 19;

	/**
	 * The meta object id for the '{@link enorm.ContextKind <em>Context Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.ContextKind
	 * @see enorm.impl.EnormPackageImpl#getContextKind()
	 * @generated
	 */
	int CONTEXT_KIND = 20;

	/**
	 * The meta object id for the '{@link enorm.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.PrimitiveType
	 * @see enorm.impl.EnormPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 21;

	/**
	 * The meta object id for the '{@link enorm.FeedbackKind <em>Feedback Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.FeedbackKind
	 * @see enorm.impl.EnormPackageImpl#getFeedbackKind()
	 * @generated
	 */
	int FEEDBACK_KIND = 22;

	/**
	 * The meta object id for the '{@link enorm.FeedbackSubjectScope <em>Feedback Subject Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.FeedbackSubjectScope
	 * @see enorm.impl.EnormPackageImpl#getFeedbackSubjectScope()
	 * @generated
	 */
	int FEEDBACK_SUBJECT_SCOPE = 23;

	/**
	 * The meta object id for the '{@link enorm.FeedbackPolarity <em>Feedback Polarity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.FeedbackPolarity
	 * @see enorm.impl.EnormPackageImpl#getFeedbackPolarity()
	 * @generated
	 */
	int FEEDBACK_POLARITY = 24;

	/**
	 * The meta object id for the '{@link enorm.FeedbackStatus <em>Feedback Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.FeedbackStatus
	 * @see enorm.impl.EnormPackageImpl#getFeedbackStatus()
	 * @generated
	 */
	int FEEDBACK_STATUS = 25;

	/**
	 * The meta object id for the '{@link enorm.VerificationRequirement <em>Verification Requirement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.VerificationRequirement
	 * @see enorm.impl.EnormPackageImpl#getVerificationRequirement()
	 * @generated
	 */
	int VERIFICATION_REQUIREMENT = 26;

	/**
	 * The meta object id for the '{@link enorm.ValidationKind <em>Validation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.ValidationKind
	 * @see enorm.impl.EnormPackageImpl#getValidationKind()
	 * @generated
	 */
	int VALIDATION_KIND = 27;

	/**
	 * The meta object id for the '{@link enorm.RuleSeverity <em>Rule Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.RuleSeverity
	 * @see enorm.impl.EnormPackageImpl#getRuleSeverity()
	 * @generated
	 */
	int RULE_SEVERITY = 28;

	/**
	 * The meta object id for the '{@link enorm.ModerationMode <em>Moderation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.ModerationMode
	 * @see enorm.impl.EnormPackageImpl#getModerationMode()
	 * @generated
	 */
	int MODERATION_MODE = 29;

	/**
	 * The meta object id for the '{@link enorm.TriggerEvent <em>Trigger Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.TriggerEvent
	 * @see enorm.impl.EnormPackageImpl#getTriggerEvent()
	 * @generated
	 */
	int TRIGGER_EVENT = 30;

	/**
	 * The meta object id for the '{@link enorm.ModerationDecision <em>Moderation Decision</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.ModerationDecision
	 * @see enorm.impl.EnormPackageImpl#getModerationDecision()
	 * @generated
	 */
	int MODERATION_DECISION = 31;

	/**
	 * The meta object id for the '{@link enorm.ActionKind <em>Action Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.ActionKind
	 * @see enorm.impl.EnormPackageImpl#getActionKind()
	 * @generated
	 */
	int ACTION_KIND = 32;

	/**
	 * The meta object id for the '{@link enorm.ConditionOperator <em>Condition Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.ConditionOperator
	 * @see enorm.impl.EnormPackageImpl#getConditionOperator()
	 * @generated
	 */
	int CONDITION_OPERATOR = 33;

	/**
	 * The meta object id for the '{@link enorm.ActionResultKind <em>Action Result Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.ActionResultKind
	 * @see enorm.impl.EnormPackageImpl#getActionResultKind()
	 * @generated
	 */
	int ACTION_RESULT_KIND = 34;

	/**
	 * The meta object id for the '{@link enorm.SortCriterion <em>Sort Criterion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.SortCriterion
	 * @see enorm.impl.EnormPackageImpl#getSortCriterion()
	 * @generated
	 */
	int SORT_CRITERION = 35;

	/**
	 * The meta object id for the '{@link enorm.SortDirection <em>Sort Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enorm.SortDirection
	 * @see enorm.impl.EnormPackageImpl#getSortDirection()
	 * @generated
	 */
	int SORT_DIRECTION = 36;

	/**
	 * Returns the meta object for class '{@link enorm.RefModel <em>Ref Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Model</em>'.
	 * @see enorm.RefModel
	 * @generated
	 */
	EClass getRefModel();

	/**
	 * Returns the meta object for the attribute '{@link enorm.RefModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.RefModel#getName()
	 * @see #getRefModel()
	 * @generated
	 */
	EAttribute getRefModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.RefModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see enorm.RefModel#getVersion()
	 * @see #getRefModel()
	 * @generated
	 */
	EAttribute getRefModel_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.RefModel#getUserTypes <em>User Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Types</em>'.
	 * @see enorm.RefModel#getUserTypes()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_UserTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.RefModel#getResourceTypes <em>Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Types</em>'.
	 * @see enorm.RefModel#getResourceTypes()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_ResourceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.RefModel#getContextTypes <em>Context Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Types</em>'.
	 * @see enorm.RefModel#getContextTypes()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_ContextTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.RefModel#getResourceRelations <em>Resource Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Relations</em>'.
	 * @see enorm.RefModel#getResourceRelations()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_ResourceRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.RefModel#getFeedbackTypes <em>Feedback Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feedback Types</em>'.
	 * @see enorm.RefModel#getFeedbackTypes()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_FeedbackTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.RefModel#getFeedbackDefinitions <em>Feedback Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feedback Definitions</em>'.
	 * @see enorm.RefModel#getFeedbackDefinitions()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_FeedbackDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.RefModel#getAuthorizationRules <em>Authorization Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorization Rules</em>'.
	 * @see enorm.RefModel#getAuthorizationRules()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_AuthorizationRules();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.RefModel#getValidationRules <em>Validation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validation Rules</em>'.
	 * @see enorm.RefModel#getValidationRules()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_ValidationRules();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.RefModel#getModerationPolicies <em>Moderation Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moderation Policies</em>'.
	 * @see enorm.RefModel#getModerationPolicies()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_ModerationPolicies();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.RefModel#getAutomationRules <em>Automation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Automation Rules</em>'.
	 * @see enorm.RefModel#getAutomationRules()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_AutomationRules();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.RefModel#getVerificationPolicies <em>Verification Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verification Policies</em>'.
	 * @see enorm.RefModel#getVerificationPolicies()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_VerificationPolicies();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.RefModel#getSortingPolicies <em>Sorting Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorting Policies</em>'.
	 * @see enorm.RefModel#getSortingPolicies()
	 * @see #getRefModel()
	 * @generated
	 */
	EReference getRefModel_SortingPolicies();

	/**
	 * Returns the meta object for class '{@link enorm.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Type</em>'.
	 * @see enorm.UserType
	 * @generated
	 */
	EClass getUserType();

	/**
	 * Returns the meta object for the attribute '{@link enorm.UserType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.UserType#getName()
	 * @see #getUserType()
	 * @generated
	 */
	EAttribute getUserType_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.UserType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see enorm.UserType#getKind()
	 * @see #getUserType()
	 * @generated
	 */
	EAttribute getUserType_Kind();

	/**
	 * Returns the meta object for the reference list '{@link enorm.UserType#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see enorm.UserType#getSuperTypes()
	 * @see #getUserType()
	 * @generated
	 */
	EReference getUserType_SuperTypes();

	/**
	 * Returns the meta object for class '{@link enorm.ContextType <em>Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Type</em>'.
	 * @see enorm.ContextType
	 * @generated
	 */
	EClass getContextType();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ContextType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.ContextType#getName()
	 * @see #getContextType()
	 * @generated
	 */
	EAttribute getContextType_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ContextType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see enorm.ContextType#getKind()
	 * @see #getContextType()
	 * @generated
	 */
	EAttribute getContextType_Kind();

	/**
	 * Returns the meta object for the reference list '{@link enorm.ContextType#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see enorm.ContextType#getContains()
	 * @see #getContextType()
	 * @generated
	 */
	EReference getContextType_Contains();

	/**
	 * Returns the meta object for class '{@link enorm.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see enorm.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ResourceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.ResourceType#getName()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ResourceType#isSupportsMedia <em>Supports Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supports Media</em>'.
	 * @see enorm.ResourceType#isSupportsMedia()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_SupportsMedia();

	/**
	 * Returns the meta object for the reference list '{@link enorm.ResourceType#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see enorm.ResourceType#getSuperTypes()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_SuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.ResourceType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see enorm.ResourceType#getAttributes()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Attributes();

	/**
	 * Returns the meta object for class '{@link enorm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see enorm.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link enorm.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see enorm.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link enorm.Attribute#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see enorm.Attribute#isRequired()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Required();

	/**
	 * Returns the meta object for the attribute '{@link enorm.Attribute#isMultiValued <em>Multi Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Valued</em>'.
	 * @see enorm.Attribute#isMultiValued()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_MultiValued();

	/**
	 * Returns the meta object for class '{@link enorm.ResourceRelation <em>Resource Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Relation</em>'.
	 * @see enorm.ResourceRelation
	 * @generated
	 */
	EClass getResourceRelation();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ResourceRelation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.ResourceRelation#getName()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EAttribute getResourceRelation_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ResourceRelation#getSourceCardinality <em>Source Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Cardinality</em>'.
	 * @see enorm.ResourceRelation#getSourceCardinality()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EAttribute getResourceRelation_SourceCardinality();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ResourceRelation#getTargetCardinality <em>Target Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Cardinality</em>'.
	 * @see enorm.ResourceRelation#getTargetCardinality()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EAttribute getResourceRelation_TargetCardinality();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ResourceRelation#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see enorm.ResourceRelation#isContainment()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EAttribute getResourceRelation_Containment();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ResourceRelation#isRecursive <em>Recursive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recursive</em>'.
	 * @see enorm.ResourceRelation#isRecursive()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EAttribute getResourceRelation_Recursive();

	/**
	 * Returns the meta object for the reference '{@link enorm.ResourceRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see enorm.ResourceRelation#getSource()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EReference getResourceRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link enorm.ResourceRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see enorm.ResourceRelation#getTarget()
	 * @see #getResourceRelation()
	 * @generated
	 */
	EReference getResourceRelation_Target();

	/**
	 * Returns the meta object for class '{@link enorm.FeedbackType <em>Feedback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Type</em>'.
	 * @see enorm.FeedbackType
	 * @generated
	 */
	EClass getFeedbackType();

	/**
	 * Returns the meta object for the attribute '{@link enorm.FeedbackType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.FeedbackType#getName()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.FeedbackType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see enorm.FeedbackType#getKind()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_Kind();

	/**
	 * Returns the meta object for the attribute '{@link enorm.FeedbackType#getSubjectScope <em>Subject Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Scope</em>'.
	 * @see enorm.FeedbackType#getSubjectScope()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_SubjectScope();

	/**
	 * Returns the meta object for the attribute '{@link enorm.FeedbackType#isHasRating <em>Has Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Rating</em>'.
	 * @see enorm.FeedbackType#isHasRating()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_HasRating();

	/**
	 * Returns the meta object for the attribute '{@link enorm.FeedbackType#isRecursive <em>Recursive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recursive</em>'.
	 * @see enorm.FeedbackType#isRecursive()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_Recursive();

	/**
	 * Returns the meta object for the attribute '{@link enorm.FeedbackType#isAllowsText <em>Allows Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Text</em>'.
	 * @see enorm.FeedbackType#isAllowsText()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_AllowsText();

	/**
	 * Returns the meta object for the attribute '{@link enorm.FeedbackType#isAllowsMedia <em>Allows Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Media</em>'.
	 * @see enorm.FeedbackType#isAllowsMedia()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_AllowsMedia();

	/**
	 * Returns the meta object for the attribute '{@link enorm.FeedbackType#getPolarity <em>Polarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polarity</em>'.
	 * @see enorm.FeedbackType#getPolarity()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_Polarity();

	/**
	 * Returns the meta object for class '{@link enorm.FeedbackDefinition <em>Feedback Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Definition</em>'.
	 * @see enorm.FeedbackDefinition
	 * @generated
	 */
	EClass getFeedbackDefinition();

	/**
	 * Returns the meta object for the attribute '{@link enorm.FeedbackDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.FeedbackDefinition#getName()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EAttribute getFeedbackDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.FeedbackDefinition#isRequiresVerifiedContext <em>Requires Verified Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Verified Context</em>'.
	 * @see enorm.FeedbackDefinition#isRequiresVerifiedContext()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EAttribute getFeedbackDefinition_RequiresVerifiedContext();

	/**
	 * Returns the meta object for the attribute '{@link enorm.FeedbackDefinition#getVerificationRequirement <em>Verification Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verification Requirement</em>'.
	 * @see enorm.FeedbackDefinition#getVerificationRequirement()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EAttribute getFeedbackDefinition_VerificationRequirement();

	/**
	 * Returns the meta object for the attribute '{@link enorm.FeedbackDefinition#isUniquePerAuthorTarget <em>Unique Per Author Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Per Author Target</em>'.
	 * @see enorm.FeedbackDefinition#isUniquePerAuthorTarget()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EAttribute getFeedbackDefinition_UniquePerAuthorTarget();

	/**
	 * Returns the meta object for the reference '{@link enorm.FeedbackDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see enorm.FeedbackDefinition#getType()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EReference getFeedbackDefinition_Type();

	/**
	 * Returns the meta object for the reference '{@link enorm.FeedbackDefinition#getSubjectResource <em>Subject Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject Resource</em>'.
	 * @see enorm.FeedbackDefinition#getSubjectResource()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EReference getFeedbackDefinition_SubjectResource();

	/**
	 * Returns the meta object for the reference '{@link enorm.FeedbackDefinition#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see enorm.FeedbackDefinition#getAuthor()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EReference getFeedbackDefinition_Author();

	/**
	 * Returns the meta object for the reference '{@link enorm.FeedbackDefinition#getSubjectFeedback <em>Subject Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject Feedback</em>'.
	 * @see enorm.FeedbackDefinition#getSubjectFeedback()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EReference getFeedbackDefinition_SubjectFeedback();

	/**
	 * Returns the meta object for the containment reference '{@link enorm.FeedbackDefinition#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy</em>'.
	 * @see enorm.FeedbackDefinition#getPolicy()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EReference getFeedbackDefinition_Policy();

	/**
	 * Returns the meta object for the containment reference '{@link enorm.FeedbackDefinition#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rating</em>'.
	 * @see enorm.FeedbackDefinition#getRating()
	 * @see #getFeedbackDefinition()
	 * @generated
	 */
	EReference getFeedbackDefinition_Rating();

	/**
	 * Returns the meta object for class '{@link enorm.FeedbackPolicy <em>Feedback Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Policy</em>'.
	 * @see enorm.FeedbackPolicy
	 * @generated
	 */
	EClass getFeedbackPolicy();

	/**
	 * Returns the meta object for the attribute '{@link enorm.FeedbackPolicy#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see enorm.FeedbackPolicy#getStatus()
	 * @see #getFeedbackPolicy()
	 * @generated
	 */
	EAttribute getFeedbackPolicy_Status();

	/**
	 * Returns the meta object for class '{@link enorm.RatingPolicy <em>Rating Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating Policy</em>'.
	 * @see enorm.RatingPolicy
	 * @generated
	 */
	EClass getRatingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link enorm.RatingPolicy#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see enorm.RatingPolicy#getMinValue()
	 * @see #getRatingPolicy()
	 * @generated
	 */
	EAttribute getRatingPolicy_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link enorm.RatingPolicy#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see enorm.RatingPolicy#getMaxValue()
	 * @see #getRatingPolicy()
	 * @generated
	 */
	EAttribute getRatingPolicy_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link enorm.RatingPolicy#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see enorm.RatingPolicy#getStep()
	 * @see #getRatingPolicy()
	 * @generated
	 */
	EAttribute getRatingPolicy_Step();

	/**
	 * Returns the meta object for class '{@link enorm.ValidationRule <em>Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Rule</em>'.
	 * @see enorm.ValidationRule
	 * @generated
	 */
	EClass getValidationRule();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ValidationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.ValidationRule#getName()
	 * @see #getValidationRule()
	 * @generated
	 */
	EAttribute getValidationRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ValidationRule#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see enorm.ValidationRule#getKind()
	 * @see #getValidationRule()
	 * @generated
	 */
	EAttribute getValidationRule_Kind();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ValidationRule#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see enorm.ValidationRule#getSeverity()
	 * @see #getValidationRule()
	 * @generated
	 */
	EAttribute getValidationRule_Severity();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ValidationRule#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see enorm.ValidationRule#getExpression()
	 * @see #getValidationRule()
	 * @generated
	 */
	EAttribute getValidationRule_Expression();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ValidationRule#getImplementationId <em>Implementation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Id</em>'.
	 * @see enorm.ValidationRule#getImplementationId()
	 * @see #getValidationRule()
	 * @generated
	 */
	EAttribute getValidationRule_ImplementationId();

	/**
	 * Returns the meta object for the reference '{@link enorm.ValidationRule#getAppliesToResource <em>Applies To Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies To Resource</em>'.
	 * @see enorm.ValidationRule#getAppliesToResource()
	 * @see #getValidationRule()
	 * @generated
	 */
	EReference getValidationRule_AppliesToResource();

	/**
	 * Returns the meta object for the reference '{@link enorm.ValidationRule#getAppliesToFeedback <em>Applies To Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies To Feedback</em>'.
	 * @see enorm.ValidationRule#getAppliesToFeedback()
	 * @see #getValidationRule()
	 * @generated
	 */
	EReference getValidationRule_AppliesToFeedback();

	/**
	 * Returns the meta object for the reference '{@link enorm.ValidationRule#getInvokedBy <em>Invoked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoked By</em>'.
	 * @see enorm.ValidationRule#getInvokedBy()
	 * @see #getValidationRule()
	 * @generated
	 */
	EReference getValidationRule_InvokedBy();

	/**
	 * Returns the meta object for class '{@link enorm.ModerationPolicy <em>Moderation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moderation Policy</em>'.
	 * @see enorm.ModerationPolicy
	 * @generated
	 */
	EClass getModerationPolicy();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ModerationPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.ModerationPolicy#getName()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EAttribute getModerationPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ModerationPolicy#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see enorm.ModerationPolicy#getMode()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EAttribute getModerationPolicy_Mode();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ModerationPolicy#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see enorm.ModerationPolicy#getTrigger()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EAttribute getModerationPolicy_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ModerationPolicy#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision</em>'.
	 * @see enorm.ModerationPolicy#getDecision()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EAttribute getModerationPolicy_Decision();

	/**
	 * Returns the meta object for the reference '{@link enorm.ModerationPolicy#getMonitorsResource <em>Monitors Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Monitors Resource</em>'.
	 * @see enorm.ModerationPolicy#getMonitorsResource()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EReference getModerationPolicy_MonitorsResource();

	/**
	 * Returns the meta object for the reference '{@link enorm.ModerationPolicy#getMonitorsFeedback <em>Monitors Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Monitors Feedback</em>'.
	 * @see enorm.ModerationPolicy#getMonitorsFeedback()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EReference getModerationPolicy_MonitorsFeedback();

	/**
	 * Returns the meta object for the reference list '{@link enorm.ModerationPolicy#getExecutedBy <em>Executed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed By</em>'.
	 * @see enorm.ModerationPolicy#getExecutedBy()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EReference getModerationPolicy_ExecutedBy();

	/**
	 * Returns the meta object for the reference '{@link enorm.ModerationPolicy#getInContext <em>In Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Context</em>'.
	 * @see enorm.ModerationPolicy#getInContext()
	 * @see #getModerationPolicy()
	 * @generated
	 */
	EReference getModerationPolicy_InContext();

	/**
	 * Returns the meta object for class '{@link enorm.AuthorizationRule <em>Authorization Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Rule</em>'.
	 * @see enorm.AuthorizationRule
	 * @generated
	 */
	EClass getAuthorizationRule();

	/**
	 * Returns the meta object for the attribute '{@link enorm.AuthorizationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.AuthorizationRule#getName()
	 * @see #getAuthorizationRule()
	 * @generated
	 */
	EAttribute getAuthorizationRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.AuthorizationRule#getAllowedAction <em>Allowed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Action</em>'.
	 * @see enorm.AuthorizationRule#getAllowedAction()
	 * @see #getAuthorizationRule()
	 * @generated
	 */
	EAttribute getAuthorizationRule_AllowedAction();

	/**
	 * Returns the meta object for the reference '{@link enorm.AuthorizationRule#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see enorm.AuthorizationRule#getActor()
	 * @see #getAuthorizationRule()
	 * @generated
	 */
	EReference getAuthorizationRule_Actor();

	/**
	 * Returns the meta object for the reference '{@link enorm.AuthorizationRule#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see enorm.AuthorizationRule#getContext()
	 * @see #getAuthorizationRule()
	 * @generated
	 */
	EReference getAuthorizationRule_Context();

	/**
	 * Returns the meta object for the reference '{@link enorm.AuthorizationRule#getResourceTarget <em>Resource Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Target</em>'.
	 * @see enorm.AuthorizationRule#getResourceTarget()
	 * @see #getAuthorizationRule()
	 * @generated
	 */
	EReference getAuthorizationRule_ResourceTarget();

	/**
	 * Returns the meta object for the reference '{@link enorm.AuthorizationRule#getFeedbackTarget <em>Feedback Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feedback Target</em>'.
	 * @see enorm.AuthorizationRule#getFeedbackTarget()
	 * @see #getAuthorizationRule()
	 * @generated
	 */
	EReference getAuthorizationRule_FeedbackTarget();

	/**
	 * Returns the meta object for class '{@link enorm.AutomationRule <em>Automation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automation Rule</em>'.
	 * @see enorm.AutomationRule
	 * @generated
	 */
	EClass getAutomationRule();

	/**
	 * Returns the meta object for the attribute '{@link enorm.AutomationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.AutomationRule#getName()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.AutomationRule#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see enorm.AutomationRule#getTrigger()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_Trigger();

	/**
	 * Returns the meta object for the reference '{@link enorm.AutomationRule#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see enorm.AutomationRule#getContext()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Context();

	/**
	 * Returns the meta object for the reference '{@link enorm.AutomationRule#getInContext <em>In Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Context</em>'.
	 * @see enorm.AutomationRule#getInContext()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_InContext();

	/**
	 * Returns the meta object for the reference '{@link enorm.AutomationRule#getOnFeedback <em>On Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Feedback</em>'.
	 * @see enorm.AutomationRule#getOnFeedback()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_OnFeedback();

	/**
	 * Returns the meta object for the reference '{@link enorm.AutomationRule#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see enorm.AutomationRule#getUses()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.AutomationRule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see enorm.AutomationRule#getConditions()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.AutomationRule#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see enorm.AutomationRule#getActions()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Actions();

	/**
	 * Returns the meta object for class '{@link enorm.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see enorm.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link enorm.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.Condition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see enorm.Condition#getOperator()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Operator();

	/**
	 * Returns the meta object for the reference '{@link enorm.Condition#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see enorm.Condition#getAttribute()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link enorm.Condition#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see enorm.Condition#getChildren()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Children();

	/**
	 * Returns the meta object for class '{@link enorm.ConditionValue <em>Condition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Value</em>'.
	 * @see enorm.ConditionValue
	 * @generated
	 */
	EClass getConditionValue();

	/**
	 * Returns the meta object for the attribute '{@link enorm.ConditionValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see enorm.ConditionValue#getValue()
	 * @see #getConditionValue()
	 * @generated
	 */
	EAttribute getConditionValue_Value();

	/**
	 * Returns the meta object for class '{@link enorm.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see enorm.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link enorm.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.Action#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see enorm.Action#getKind()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Kind();

	/**
	 * Returns the meta object for the attribute '{@link enorm.Action#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see enorm.Action#getMessage()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Message();

	/**
	 * Returns the meta object for class '{@link enorm.VerificationPolicy <em>Verification Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Policy</em>'.
	 * @see enorm.VerificationPolicy
	 * @generated
	 */
	EClass getVerificationPolicy();

	/**
	 * Returns the meta object for the attribute '{@link enorm.VerificationPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.VerificationPolicy#getName()
	 * @see #getVerificationPolicy()
	 * @generated
	 */
	EAttribute getVerificationPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.VerificationPolicy#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see enorm.VerificationPolicy#getMode()
	 * @see #getVerificationPolicy()
	 * @generated
	 */
	EAttribute getVerificationPolicy_Mode();

	/**
	 * Returns the meta object for the attribute '{@link enorm.VerificationPolicy#getAppliesWhen <em>Applies When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applies When</em>'.
	 * @see enorm.VerificationPolicy#getAppliesWhen()
	 * @see #getVerificationPolicy()
	 * @generated
	 */
	EAttribute getVerificationPolicy_AppliesWhen();

	/**
	 * Returns the meta object for the reference '{@link enorm.VerificationPolicy#getVerifies <em>Verifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Verifies</em>'.
	 * @see enorm.VerificationPolicy#getVerifies()
	 * @see #getVerificationPolicy()
	 * @generated
	 */
	EReference getVerificationPolicy_Verifies();

	/**
	 * Returns the meta object for class '{@link enorm.SortingPolicy <em>Sorting Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Policy</em>'.
	 * @see enorm.SortingPolicy
	 * @generated
	 */
	EClass getSortingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link enorm.SortingPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enorm.SortingPolicy#getName()
	 * @see #getSortingPolicy()
	 * @generated
	 */
	EAttribute getSortingPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link enorm.SortingPolicy#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criterion</em>'.
	 * @see enorm.SortingPolicy#getCriterion()
	 * @see #getSortingPolicy()
	 * @generated
	 */
	EAttribute getSortingPolicy_Criterion();

	/**
	 * Returns the meta object for the attribute '{@link enorm.SortingPolicy#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see enorm.SortingPolicy#getDirection()
	 * @see #getSortingPolicy()
	 * @generated
	 */
	EAttribute getSortingPolicy_Direction();

	/**
	 * Returns the meta object for the reference '{@link enorm.SortingPolicy#getAppliesToResource <em>Applies To Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies To Resource</em>'.
	 * @see enorm.SortingPolicy#getAppliesToResource()
	 * @see #getSortingPolicy()
	 * @generated
	 */
	EReference getSortingPolicy_AppliesToResource();

	/**
	 * Returns the meta object for the reference '{@link enorm.SortingPolicy#getAppliesToFeedback <em>Applies To Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies To Feedback</em>'.
	 * @see enorm.SortingPolicy#getAppliesToFeedback()
	 * @see #getSortingPolicy()
	 * @generated
	 */
	EReference getSortingPolicy_AppliesToFeedback();

	/**
	 * Returns the meta object for the reference '{@link enorm.SortingPolicy#getInContext <em>In Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Context</em>'.
	 * @see enorm.SortingPolicy#getInContext()
	 * @see #getSortingPolicy()
	 * @generated
	 */
	EReference getSortingPolicy_InContext();

	/**
	 * Returns the meta object for enum '{@link enorm.UserKind <em>User Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Kind</em>'.
	 * @see enorm.UserKind
	 * @generated
	 */
	EEnum getUserKind();

	/**
	 * Returns the meta object for enum '{@link enorm.ContextKind <em>Context Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Context Kind</em>'.
	 * @see enorm.ContextKind
	 * @generated
	 */
	EEnum getContextKind();

	/**
	 * Returns the meta object for enum '{@link enorm.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see enorm.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the meta object for enum '{@link enorm.FeedbackKind <em>Feedback Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feedback Kind</em>'.
	 * @see enorm.FeedbackKind
	 * @generated
	 */
	EEnum getFeedbackKind();

	/**
	 * Returns the meta object for enum '{@link enorm.FeedbackSubjectScope <em>Feedback Subject Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feedback Subject Scope</em>'.
	 * @see enorm.FeedbackSubjectScope
	 * @generated
	 */
	EEnum getFeedbackSubjectScope();

	/**
	 * Returns the meta object for enum '{@link enorm.FeedbackPolarity <em>Feedback Polarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feedback Polarity</em>'.
	 * @see enorm.FeedbackPolarity
	 * @generated
	 */
	EEnum getFeedbackPolarity();

	/**
	 * Returns the meta object for enum '{@link enorm.FeedbackStatus <em>Feedback Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feedback Status</em>'.
	 * @see enorm.FeedbackStatus
	 * @generated
	 */
	EEnum getFeedbackStatus();

	/**
	 * Returns the meta object for enum '{@link enorm.VerificationRequirement <em>Verification Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verification Requirement</em>'.
	 * @see enorm.VerificationRequirement
	 * @generated
	 */
	EEnum getVerificationRequirement();

	/**
	 * Returns the meta object for enum '{@link enorm.ValidationKind <em>Validation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validation Kind</em>'.
	 * @see enorm.ValidationKind
	 * @generated
	 */
	EEnum getValidationKind();

	/**
	 * Returns the meta object for enum '{@link enorm.RuleSeverity <em>Rule Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Severity</em>'.
	 * @see enorm.RuleSeverity
	 * @generated
	 */
	EEnum getRuleSeverity();

	/**
	 * Returns the meta object for enum '{@link enorm.ModerationMode <em>Moderation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Moderation Mode</em>'.
	 * @see enorm.ModerationMode
	 * @generated
	 */
	EEnum getModerationMode();

	/**
	 * Returns the meta object for enum '{@link enorm.TriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Event</em>'.
	 * @see enorm.TriggerEvent
	 * @generated
	 */
	EEnum getTriggerEvent();

	/**
	 * Returns the meta object for enum '{@link enorm.ModerationDecision <em>Moderation Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Moderation Decision</em>'.
	 * @see enorm.ModerationDecision
	 * @generated
	 */
	EEnum getModerationDecision();

	/**
	 * Returns the meta object for enum '{@link enorm.ActionKind <em>Action Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Kind</em>'.
	 * @see enorm.ActionKind
	 * @generated
	 */
	EEnum getActionKind();

	/**
	 * Returns the meta object for enum '{@link enorm.ConditionOperator <em>Condition Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Operator</em>'.
	 * @see enorm.ConditionOperator
	 * @generated
	 */
	EEnum getConditionOperator();

	/**
	 * Returns the meta object for enum '{@link enorm.ActionResultKind <em>Action Result Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Result Kind</em>'.
	 * @see enorm.ActionResultKind
	 * @generated
	 */
	EEnum getActionResultKind();

	/**
	 * Returns the meta object for enum '{@link enorm.SortCriterion <em>Sort Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Criterion</em>'.
	 * @see enorm.SortCriterion
	 * @generated
	 */
	EEnum getSortCriterion();

	/**
	 * Returns the meta object for enum '{@link enorm.SortDirection <em>Sort Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Direction</em>'.
	 * @see enorm.SortDirection
	 * @generated
	 */
	EEnum getSortDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnormFactory getEnormFactory();

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
		 * The meta object literal for the '{@link enorm.impl.RefModelImpl <em>Ref Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.RefModelImpl
		 * @see enorm.impl.EnormPackageImpl#getRefModel()
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
		 * The meta object literal for the '<em><b>Authorization Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__AUTHORIZATION_RULES = eINSTANCE.getRefModel_AuthorizationRules();

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
		 * The meta object literal for the '<em><b>Sorting Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_MODEL__SORTING_POLICIES = eINSTANCE.getRefModel_SortingPolicies();

		/**
		 * The meta object literal for the '{@link enorm.impl.UserTypeImpl <em>User Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.UserTypeImpl
		 * @see enorm.impl.EnormPackageImpl#getUserType()
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
		 * The meta object literal for the '{@link enorm.impl.ContextTypeImpl <em>Context Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.ContextTypeImpl
		 * @see enorm.impl.EnormPackageImpl#getContextType()
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
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_TYPE__CONTAINS = eINSTANCE.getContextType_Contains();

		/**
		 * The meta object literal for the '{@link enorm.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.ResourceTypeImpl
		 * @see enorm.impl.EnormPackageImpl#getResourceType()
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
		 * The meta object literal for the '{@link enorm.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.AttributeImpl
		 * @see enorm.impl.EnormPackageImpl#getAttribute()
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
		 * The meta object literal for the '{@link enorm.impl.ResourceRelationImpl <em>Resource Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.ResourceRelationImpl
		 * @see enorm.impl.EnormPackageImpl#getResourceRelation()
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
		 * The meta object literal for the '{@link enorm.impl.FeedbackTypeImpl <em>Feedback Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.FeedbackTypeImpl
		 * @see enorm.impl.EnormPackageImpl#getFeedbackType()
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
		 * The meta object literal for the '<em><b>Allows Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_TYPE__ALLOWS_TEXT = eINSTANCE.getFeedbackType_AllowsText();

		/**
		 * The meta object literal for the '<em><b>Allows Media</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_TYPE__ALLOWS_MEDIA = eINSTANCE.getFeedbackType_AllowsMedia();

		/**
		 * The meta object literal for the '<em><b>Polarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_TYPE__POLARITY = eINSTANCE.getFeedbackType_Polarity();

		/**
		 * The meta object literal for the '{@link enorm.impl.FeedbackDefinitionImpl <em>Feedback Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.FeedbackDefinitionImpl
		 * @see enorm.impl.EnormPackageImpl#getFeedbackDefinition()
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
		 * The meta object literal for the '<em><b>Verification Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_DEFINITION__VERIFICATION_REQUIREMENT = eINSTANCE
				.getFeedbackDefinition_VerificationRequirement();

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
		 * The meta object literal for the '{@link enorm.impl.FeedbackPolicyImpl <em>Feedback Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.FeedbackPolicyImpl
		 * @see enorm.impl.EnormPackageImpl#getFeedbackPolicy()
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
		 * The meta object literal for the '{@link enorm.impl.RatingPolicyImpl <em>Rating Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.RatingPolicyImpl
		 * @see enorm.impl.EnormPackageImpl#getRatingPolicy()
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
		 * The meta object literal for the '{@link enorm.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.ValidationRuleImpl
		 * @see enorm.impl.EnormPackageImpl#getValidationRule()
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
		 * The meta object literal for the '{@link enorm.impl.ModerationPolicyImpl <em>Moderation Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.ModerationPolicyImpl
		 * @see enorm.impl.EnormPackageImpl#getModerationPolicy()
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
		 * The meta object literal for the '<em><b>Executed By</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link enorm.impl.AuthorizationRuleImpl <em>Authorization Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.AuthorizationRuleImpl
		 * @see enorm.impl.EnormPackageImpl#getAuthorizationRule()
		 * @generated
		 */
		EClass AUTHORIZATION_RULE = eINSTANCE.getAuthorizationRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_RULE__NAME = eINSTANCE.getAuthorizationRule_Name();

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
		 * The meta object literal for the '{@link enorm.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.AutomationRuleImpl
		 * @see enorm.impl.EnormPackageImpl#getAutomationRule()
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
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__CONDITIONS = eINSTANCE.getAutomationRule_Conditions();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__ACTIONS = eINSTANCE.getAutomationRule_Actions();

		/**
		 * The meta object literal for the '{@link enorm.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.ConditionImpl
		 * @see enorm.impl.EnormPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ATTRIBUTE = eINSTANCE.getCondition_Attribute();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CHILDREN = eINSTANCE.getCondition_Children();

		/**
		 * The meta object literal for the '{@link enorm.impl.ConditionValueImpl <em>Condition Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.ConditionValueImpl
		 * @see enorm.impl.EnormPackageImpl#getConditionValue()
		 * @generated
		 */
		EClass CONDITION_VALUE = eINSTANCE.getConditionValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_VALUE__VALUE = eINSTANCE.getConditionValue_Value();

		/**
		 * The meta object literal for the '{@link enorm.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.ActionImpl
		 * @see enorm.impl.EnormPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__KIND = eINSTANCE.getAction_Kind();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__MESSAGE = eINSTANCE.getAction_Message();

		/**
		 * The meta object literal for the '{@link enorm.impl.VerificationPolicyImpl <em>Verification Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.VerificationPolicyImpl
		 * @see enorm.impl.EnormPackageImpl#getVerificationPolicy()
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
		 * The meta object literal for the '{@link enorm.impl.SortingPolicyImpl <em>Sorting Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.impl.SortingPolicyImpl
		 * @see enorm.impl.EnormPackageImpl#getSortingPolicy()
		 * @generated
		 */
		EClass SORTING_POLICY = eINSTANCE.getSortingPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_POLICY__NAME = eINSTANCE.getSortingPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_POLICY__CRITERION = eINSTANCE.getSortingPolicy_Criterion();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTING_POLICY__DIRECTION = eINSTANCE.getSortingPolicy_Direction();

		/**
		 * The meta object literal for the '<em><b>Applies To Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_POLICY__APPLIES_TO_RESOURCE = eINSTANCE.getSortingPolicy_AppliesToResource();

		/**
		 * The meta object literal for the '<em><b>Applies To Feedback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_POLICY__APPLIES_TO_FEEDBACK = eINSTANCE.getSortingPolicy_AppliesToFeedback();

		/**
		 * The meta object literal for the '<em><b>In Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTING_POLICY__IN_CONTEXT = eINSTANCE.getSortingPolicy_InContext();

		/**
		 * The meta object literal for the '{@link enorm.UserKind <em>User Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.UserKind
		 * @see enorm.impl.EnormPackageImpl#getUserKind()
		 * @generated
		 */
		EEnum USER_KIND = eINSTANCE.getUserKind();

		/**
		 * The meta object literal for the '{@link enorm.ContextKind <em>Context Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.ContextKind
		 * @see enorm.impl.EnormPackageImpl#getContextKind()
		 * @generated
		 */
		EEnum CONTEXT_KIND = eINSTANCE.getContextKind();

		/**
		 * The meta object literal for the '{@link enorm.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.PrimitiveType
		 * @see enorm.impl.EnormPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link enorm.FeedbackKind <em>Feedback Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.FeedbackKind
		 * @see enorm.impl.EnormPackageImpl#getFeedbackKind()
		 * @generated
		 */
		EEnum FEEDBACK_KIND = eINSTANCE.getFeedbackKind();

		/**
		 * The meta object literal for the '{@link enorm.FeedbackSubjectScope <em>Feedback Subject Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.FeedbackSubjectScope
		 * @see enorm.impl.EnormPackageImpl#getFeedbackSubjectScope()
		 * @generated
		 */
		EEnum FEEDBACK_SUBJECT_SCOPE = eINSTANCE.getFeedbackSubjectScope();

		/**
		 * The meta object literal for the '{@link enorm.FeedbackPolarity <em>Feedback Polarity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.FeedbackPolarity
		 * @see enorm.impl.EnormPackageImpl#getFeedbackPolarity()
		 * @generated
		 */
		EEnum FEEDBACK_POLARITY = eINSTANCE.getFeedbackPolarity();

		/**
		 * The meta object literal for the '{@link enorm.FeedbackStatus <em>Feedback Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.FeedbackStatus
		 * @see enorm.impl.EnormPackageImpl#getFeedbackStatus()
		 * @generated
		 */
		EEnum FEEDBACK_STATUS = eINSTANCE.getFeedbackStatus();

		/**
		 * The meta object literal for the '{@link enorm.VerificationRequirement <em>Verification Requirement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.VerificationRequirement
		 * @see enorm.impl.EnormPackageImpl#getVerificationRequirement()
		 * @generated
		 */
		EEnum VERIFICATION_REQUIREMENT = eINSTANCE.getVerificationRequirement();

		/**
		 * The meta object literal for the '{@link enorm.ValidationKind <em>Validation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.ValidationKind
		 * @see enorm.impl.EnormPackageImpl#getValidationKind()
		 * @generated
		 */
		EEnum VALIDATION_KIND = eINSTANCE.getValidationKind();

		/**
		 * The meta object literal for the '{@link enorm.RuleSeverity <em>Rule Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.RuleSeverity
		 * @see enorm.impl.EnormPackageImpl#getRuleSeverity()
		 * @generated
		 */
		EEnum RULE_SEVERITY = eINSTANCE.getRuleSeverity();

		/**
		 * The meta object literal for the '{@link enorm.ModerationMode <em>Moderation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.ModerationMode
		 * @see enorm.impl.EnormPackageImpl#getModerationMode()
		 * @generated
		 */
		EEnum MODERATION_MODE = eINSTANCE.getModerationMode();

		/**
		 * The meta object literal for the '{@link enorm.TriggerEvent <em>Trigger Event</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.TriggerEvent
		 * @see enorm.impl.EnormPackageImpl#getTriggerEvent()
		 * @generated
		 */
		EEnum TRIGGER_EVENT = eINSTANCE.getTriggerEvent();

		/**
		 * The meta object literal for the '{@link enorm.ModerationDecision <em>Moderation Decision</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.ModerationDecision
		 * @see enorm.impl.EnormPackageImpl#getModerationDecision()
		 * @generated
		 */
		EEnum MODERATION_DECISION = eINSTANCE.getModerationDecision();

		/**
		 * The meta object literal for the '{@link enorm.ActionKind <em>Action Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.ActionKind
		 * @see enorm.impl.EnormPackageImpl#getActionKind()
		 * @generated
		 */
		EEnum ACTION_KIND = eINSTANCE.getActionKind();

		/**
		 * The meta object literal for the '{@link enorm.ConditionOperator <em>Condition Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.ConditionOperator
		 * @see enorm.impl.EnormPackageImpl#getConditionOperator()
		 * @generated
		 */
		EEnum CONDITION_OPERATOR = eINSTANCE.getConditionOperator();

		/**
		 * The meta object literal for the '{@link enorm.ActionResultKind <em>Action Result Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.ActionResultKind
		 * @see enorm.impl.EnormPackageImpl#getActionResultKind()
		 * @generated
		 */
		EEnum ACTION_RESULT_KIND = eINSTANCE.getActionResultKind();

		/**
		 * The meta object literal for the '{@link enorm.SortCriterion <em>Sort Criterion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.SortCriterion
		 * @see enorm.impl.EnormPackageImpl#getSortCriterion()
		 * @generated
		 */
		EEnum SORT_CRITERION = eINSTANCE.getSortCriterion();

		/**
		 * The meta object literal for the '{@link enorm.SortDirection <em>Sort Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enorm.SortDirection
		 * @see enorm.impl.EnormPackageImpl#getSortDirection()
		 * @generated
		 */
		EEnum SORT_DIRECTION = eINSTANCE.getSortDirection();

	}

} //EnormPackage
