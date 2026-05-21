/**
 */
package pt.isep.enorm.ref.ref;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackDefinition#isRequiresVerifiedContext <em>Requires Verified Context</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getVerificationRequirement <em>Verification Requirement</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackDefinition#isUniquePerAuthorTarget <em>Unique Per Author Target</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getType <em>Type</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getSubjectResource <em>Subject Resource</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getAuthor <em>Author</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getSubjectFeedback <em>Subject Feedback</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getPolicy <em>Policy</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getRating <em>Rating</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackDefinition()
 * @model
 * @generated
 */
public interface FeedbackDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Requires Verified Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Verified Context</em>' attribute.
	 * @see #setRequiresVerifiedContext(boolean)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackDefinition_RequiresVerifiedContext()
	 * @model
	 * @generated
	 */
	boolean isRequiresVerifiedContext();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackDefinition#isRequiresVerifiedContext <em>Requires Verified Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Verified Context</em>' attribute.
	 * @see #isRequiresVerifiedContext()
	 * @generated
	 */
	void setRequiresVerifiedContext(boolean value);

	/**
	 * Returns the value of the '<em><b>Verification Requirement</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.VerificationRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Requirement</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.VerificationRequirement
	 * @see #setVerificationRequirement(VerificationRequirement)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackDefinition_VerificationRequirement()
	 * @model
	 * @generated
	 */
	VerificationRequirement getVerificationRequirement();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getVerificationRequirement <em>Verification Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Requirement</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.VerificationRequirement
	 * @see #getVerificationRequirement()
	 * @generated
	 */
	void setVerificationRequirement(VerificationRequirement value);

	/**
	 * Returns the value of the '<em><b>Unique Per Author Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Per Author Target</em>' attribute.
	 * @see #setUniquePerAuthorTarget(boolean)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackDefinition_UniquePerAuthorTarget()
	 * @model
	 * @generated
	 */
	boolean isUniquePerAuthorTarget();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackDefinition#isUniquePerAuthorTarget <em>Unique Per Author Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Per Author Target</em>' attribute.
	 * @see #isUniquePerAuthorTarget()
	 * @generated
	 */
	void setUniquePerAuthorTarget(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(FeedbackType)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	FeedbackType getType();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(FeedbackType value);

	/**
	 * Returns the value of the '<em><b>Subject Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Resource</em>' reference.
	 * @see #setSubjectResource(ResourceType)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackDefinition_SubjectResource()
	 * @model
	 * @generated
	 */
	ResourceType getSubjectResource();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getSubjectResource <em>Subject Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Resource</em>' reference.
	 * @see #getSubjectResource()
	 * @generated
	 */
	void setSubjectResource(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(UserType)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackDefinition_Author()
	 * @model required="true"
	 * @generated
	 */
	UserType getAuthor();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(UserType value);

	/**
	 * Returns the value of the '<em><b>Subject Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Feedback</em>' reference.
	 * @see #setSubjectFeedback(FeedbackDefinition)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackDefinition_SubjectFeedback()
	 * @model
	 * @generated
	 */
	FeedbackDefinition getSubjectFeedback();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getSubjectFeedback <em>Subject Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Feedback</em>' reference.
	 * @see #getSubjectFeedback()
	 * @generated
	 */
	void setSubjectFeedback(FeedbackDefinition value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference.
	 * @see #setPolicy(FeedbackPolicy)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackDefinition_Policy()
	 * @model containment="true"
	 * @generated
	 */
	FeedbackPolicy getPolicy();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getPolicy <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' containment reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(FeedbackPolicy value);

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' containment reference.
	 * @see #setRating(RatingPolicy)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackDefinition_Rating()
	 * @model containment="true"
	 * @generated
	 */
	RatingPolicy getRating();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackDefinition#getRating <em>Rating</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' containment reference.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(RatingPolicy value);

} // FeedbackDefinition
