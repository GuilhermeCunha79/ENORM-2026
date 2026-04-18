/**
 */
package enorm;

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
 *   <li>{@link enorm.FeedbackType#getName <em>Name</em>}</li>
 *   <li>{@link enorm.FeedbackType#getKind <em>Kind</em>}</li>
 *   <li>{@link enorm.FeedbackType#getSubjectScope <em>Subject Scope</em>}</li>
 *   <li>{@link enorm.FeedbackType#isHasRating <em>Has Rating</em>}</li>
 *   <li>{@link enorm.FeedbackType#isRecursive <em>Recursive</em>}</li>
 *   <li>{@link enorm.FeedbackType#isAllowsText <em>Allows Text</em>}</li>
 *   <li>{@link enorm.FeedbackType#isAllowsMedia <em>Allows Media</em>}</li>
 *   <li>{@link enorm.FeedbackType#getPolarity <em>Polarity</em>}</li>
 * </ul>
 *
 * @see enorm.EnormPackage#getFeedbackType()
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
	 * @see enorm.EnormPackage#getFeedbackType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enorm.FeedbackType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.FeedbackKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see enorm.FeedbackKind
	 * @see #setKind(FeedbackKind)
	 * @see enorm.EnormPackage#getFeedbackType_Kind()
	 * @model
	 * @generated
	 */
	FeedbackKind getKind();

	/**
	 * Sets the value of the '{@link enorm.FeedbackType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see enorm.FeedbackKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FeedbackKind value);

	/**
	 * Returns the value of the '<em><b>Subject Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.FeedbackSubjectScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Scope</em>' attribute.
	 * @see enorm.FeedbackSubjectScope
	 * @see #setSubjectScope(FeedbackSubjectScope)
	 * @see enorm.EnormPackage#getFeedbackType_SubjectScope()
	 * @model
	 * @generated
	 */
	FeedbackSubjectScope getSubjectScope();

	/**
	 * Sets the value of the '{@link enorm.FeedbackType#getSubjectScope <em>Subject Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Scope</em>' attribute.
	 * @see enorm.FeedbackSubjectScope
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
	 * @see enorm.EnormPackage#getFeedbackType_HasRating()
	 * @model
	 * @generated
	 */
	boolean isHasRating();

	/**
	 * Sets the value of the '{@link enorm.FeedbackType#isHasRating <em>Has Rating</em>}' attribute.
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
	 * @see enorm.EnormPackage#getFeedbackType_Recursive()
	 * @model
	 * @generated
	 */
	boolean isRecursive();

	/**
	 * Sets the value of the '{@link enorm.FeedbackType#isRecursive <em>Recursive</em>}' attribute.
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
	 * @see enorm.EnormPackage#getFeedbackType_AllowsText()
	 * @model
	 * @generated
	 */
	boolean isAllowsText();

	/**
	 * Sets the value of the '{@link enorm.FeedbackType#isAllowsText <em>Allows Text</em>}' attribute.
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
	 * @see enorm.EnormPackage#getFeedbackType_AllowsMedia()
	 * @model
	 * @generated
	 */
	boolean isAllowsMedia();

	/**
	 * Sets the value of the '{@link enorm.FeedbackType#isAllowsMedia <em>Allows Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Media</em>' attribute.
	 * @see #isAllowsMedia()
	 * @generated
	 */
	void setAllowsMedia(boolean value);

	/**
	 * Returns the value of the '<em><b>Polarity</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.FeedbackPolarity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polarity</em>' attribute.
	 * @see enorm.FeedbackPolarity
	 * @see #setPolarity(FeedbackPolarity)
	 * @see enorm.EnormPackage#getFeedbackType_Polarity()
	 * @model
	 * @generated
	 */
	FeedbackPolarity getPolarity();

	/**
	 * Sets the value of the '{@link enorm.FeedbackType#getPolarity <em>Polarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polarity</em>' attribute.
	 * @see enorm.FeedbackPolarity
	 * @see #getPolarity()
	 * @generated
	 */
	void setPolarity(FeedbackPolarity value);

} // FeedbackType
