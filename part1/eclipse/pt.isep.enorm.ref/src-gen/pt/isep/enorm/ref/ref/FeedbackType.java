/**
 */
package pt.isep.enorm.ref.ref;

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
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackType#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackType#getKind <em>Kind</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackType#getSubjectScope <em>Subject Scope</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackType#isHasRating <em>Has Rating</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackType#isRecursive <em>Recursive</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackType#isAllowsText <em>Allows Text</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackType#isAllowsMedia <em>Allows Media</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.FeedbackType#getPolarity <em>Polarity</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackType()
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
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.FeedbackKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.FeedbackKind
	 * @see #setKind(FeedbackKind)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackType_Kind()
	 * @model
	 * @generated
	 */
	FeedbackKind getKind();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.FeedbackKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FeedbackKind value);

	/**
	 * Returns the value of the '<em><b>Subject Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.FeedbackSubjectScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Scope</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.FeedbackSubjectScope
	 * @see #setSubjectScope(FeedbackSubjectScope)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackType_SubjectScope()
	 * @model
	 * @generated
	 */
	FeedbackSubjectScope getSubjectScope();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackType#getSubjectScope <em>Subject Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Scope</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.FeedbackSubjectScope
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
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackType_HasRating()
	 * @model
	 * @generated
	 */
	boolean isHasRating();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackType#isHasRating <em>Has Rating</em>}' attribute.
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
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackType_Recursive()
	 * @model
	 * @generated
	 */
	boolean isRecursive();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackType#isRecursive <em>Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive</em>' attribute.
	 * @see #isRecursive()
	 * @generated
	 */
	void setRecursive(boolean value);

	/**
	 * Returns the value of the '<em><b>Allows Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allows Text</em>' attribute.
	 * @see #setAllowsText(boolean)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackType_AllowsText()
	 * @model
	 * @generated
	 */
	boolean isAllowsText();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackType#isAllowsText <em>Allows Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Text</em>' attribute.
	 * @see #isAllowsText()
	 * @generated
	 */
	void setAllowsText(boolean value);

	/**
	 * Returns the value of the '<em><b>Allows Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allows Media</em>' attribute.
	 * @see #setAllowsMedia(boolean)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackType_AllowsMedia()
	 * @model
	 * @generated
	 */
	boolean isAllowsMedia();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackType#isAllowsMedia <em>Allows Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Media</em>' attribute.
	 * @see #isAllowsMedia()
	 * @generated
	 */
	void setAllowsMedia(boolean value);

	/**
	 * Returns the value of the '<em><b>Polarity</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.FeedbackPolarity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polarity</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.FeedbackPolarity
	 * @see #setPolarity(FeedbackPolarity)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackType_Polarity()
	 * @model
	 * @generated
	 */
	FeedbackPolarity getPolarity();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.FeedbackType#getPolarity <em>Polarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polarity</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.FeedbackPolarity
	 * @see #getPolarity()
	 * @generated
	 */
	void setPolarity(FeedbackPolarity value);

} // FeedbackType
