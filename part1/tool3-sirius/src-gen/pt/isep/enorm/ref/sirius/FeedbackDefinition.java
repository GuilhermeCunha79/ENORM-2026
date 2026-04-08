/**
 */
package pt.isep.enorm.ref.sirius;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * According to FeedbackType.subjectScope, each FeedbackDefinition targets a resource, feedback, or either (at least one target must exist).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#isRequiresVerifiedContext <em>Requires Verified Context</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#isUniquePerAuthorTarget <em>Unique Per Author Target</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getType <em>Type</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getSubjectResource <em>Subject Resource</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getAuthor <em>Author</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getSubjectFeedback <em>Subject Feedback</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getParent <em>Parent</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getPolicy <em>Policy</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getRating <em>Rating</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackDefinition()
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
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getName <em>Name</em>}' attribute.
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
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackDefinition_RequiresVerifiedContext()
	 * @model
	 * @generated
	 */
	boolean isRequiresVerifiedContext();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#isRequiresVerifiedContext <em>Requires Verified Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Verified Context</em>' attribute.
	 * @see #isRequiresVerifiedContext()
	 * @generated
	 */
	void setRequiresVerifiedContext(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique Per Author Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Per Author Target</em>' attribute.
	 * @see #setUniquePerAuthorTarget(boolean)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackDefinition_UniquePerAuthorTarget()
	 * @model
	 * @generated
	 */
	boolean isUniquePerAuthorTarget();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#isUniquePerAuthorTarget <em>Unique Per Author Target</em>}' attribute.
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
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	FeedbackType getType();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getType <em>Type</em>}' reference.
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
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackDefinition_SubjectResource()
	 * @model
	 * @generated
	 */
	ResourceType getSubjectResource();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getSubjectResource <em>Subject Resource</em>}' reference.
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
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackDefinition_Author()
	 * @model required="true"
	 * @generated
	 */
	UserType getAuthor();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getAuthor <em>Author</em>}' reference.
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
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackDefinition_SubjectFeedback()
	 * @model
	 * @generated
	 */
	FeedbackDefinition getSubjectFeedback();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getSubjectFeedback <em>Subject Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Feedback</em>' reference.
	 * @see #getSubjectFeedback()
	 * @generated
	 */
	void setSubjectFeedback(FeedbackDefinition value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(FeedbackDefinition)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackDefinition_Parent()
	 * @model
	 * @generated
	 */
	FeedbackDefinition getParent();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FeedbackDefinition value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference.
	 * @see #setPolicy(FeedbackPolicy)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackDefinition_Policy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeedbackPolicy getPolicy();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getPolicy <em>Policy</em>}' containment reference.
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
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackDefinition_Rating()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RatingPolicy getRating();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition#getRating <em>Rating</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' containment reference.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(RatingPolicy value);

} // FeedbackDefinition
