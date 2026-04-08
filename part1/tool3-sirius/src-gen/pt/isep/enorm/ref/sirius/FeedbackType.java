/**
 */
package pt.isep.enorm.ref.sirius;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackType#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackType#getKind <em>Kind</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackType#getSubjectScope <em>Subject Scope</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackType#isHasRating <em>Has Rating</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackType#isRecursive <em>Recursive</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.FeedbackType#isAllowsMedia <em>Allows Media</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackType()
 * @model
 * @generated
 */
public interface FeedbackType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.sirius.FeedbackKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.FeedbackKind
	 * @see #setKind(FeedbackKind)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackType_Kind()
	 * @model
	 * @generated
	 */
	FeedbackKind getKind();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.FeedbackKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FeedbackKind value);

	/**
	 * Returns the value of the '<em><b>Subject Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.sirius.FeedbackSubjectScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Scope</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.FeedbackSubjectScope
	 * @see #setSubjectScope(FeedbackSubjectScope)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackType_SubjectScope()
	 * @model
	 * @generated
	 */
	FeedbackSubjectScope getSubjectScope();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackType#getSubjectScope <em>Subject Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Scope</em>' attribute.
	 * @see pt.isep.enorm.ref.sirius.FeedbackSubjectScope
	 * @see #getSubjectScope()
	 * @generated
	 */
	void setSubjectScope(FeedbackSubjectScope value);

	/**
	 * Returns the value of the '<em><b>Has Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Rating</em>' attribute.
	 * @see #setHasRating(boolean)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackType_HasRating()
	 * @model
	 * @generated
	 */
	boolean isHasRating();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackType#isHasRating <em>Has Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Rating</em>' attribute.
	 * @see #isHasRating()
	 * @generated
	 */
	void setHasRating(boolean value);

	/**
	 * Returns the value of the '<em><b>Recursive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive</em>' attribute.
	 * @see #setRecursive(boolean)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackType_Recursive()
	 * @model
	 * @generated
	 */
	boolean isRecursive();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackType#isRecursive <em>Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive</em>' attribute.
	 * @see #isRecursive()
	 * @generated
	 */
	void setRecursive(boolean value);

	/**
	 * Returns the value of the '<em><b>Allows Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allows Media</em>' attribute.
	 * @see #setAllowsMedia(boolean)
	 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackType_AllowsMedia()
	 * @model
	 * @generated
	 */
	boolean isAllowsMedia();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.sirius.FeedbackType#isAllowsMedia <em>Allows Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Media</em>' attribute.
	 * @see #isAllowsMedia()
	 * @generated
	 */
	void setAllowsMedia(boolean value);

} // FeedbackType
