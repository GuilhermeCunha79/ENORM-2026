/**
 */
package pt.isep.enorm.ref.ref;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.ref.SortingPolicy#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.SortingPolicy#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.SortingPolicy#getDirection <em>Direction</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.SortingPolicy#getAppliesToResource <em>Applies To Resource</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.SortingPolicy#getAppliesToFeedback <em>Applies To Feedback</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.SortingPolicy#getInContext <em>In Context</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.ref.RefPackage#getSortingPolicy()
 * @model
 * @generated
 */
public interface SortingPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getSortingPolicy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.SortingPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Criterion</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.SortCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterion</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.SortCriterion
	 * @see #setCriterion(SortCriterion)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getSortingPolicy_Criterion()
	 * @model
	 * @generated
	 */
	SortCriterion getCriterion();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.SortingPolicy#getCriterion <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterion</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.SortCriterion
	 * @see #getCriterion()
	 * @generated
	 */
	void setCriterion(SortCriterion value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.SortDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.SortDirection
	 * @see #setDirection(SortDirection)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getSortingPolicy_Direction()
	 * @model
	 * @generated
	 */
	SortDirection getDirection();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.SortingPolicy#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.SortDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(SortDirection value);

	/**
	 * Returns the value of the '<em><b>Applies To Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Resource</em>' reference.
	 * @see #setAppliesToResource(ResourceType)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getSortingPolicy_AppliesToResource()
	 * @model
	 * @generated
	 */
	ResourceType getAppliesToResource();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.SortingPolicy#getAppliesToResource <em>Applies To Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To Resource</em>' reference.
	 * @see #getAppliesToResource()
	 * @generated
	 */
	void setAppliesToResource(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Applies To Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Feedback</em>' reference.
	 * @see #setAppliesToFeedback(FeedbackDefinition)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getSortingPolicy_AppliesToFeedback()
	 * @model
	 * @generated
	 */
	FeedbackDefinition getAppliesToFeedback();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.SortingPolicy#getAppliesToFeedback <em>Applies To Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To Feedback</em>' reference.
	 * @see #getAppliesToFeedback()
	 * @generated
	 */
	void setAppliesToFeedback(FeedbackDefinition value);

	/**
	 * Returns the value of the '<em><b>In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Context</em>' reference.
	 * @see #setInContext(ContextType)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getSortingPolicy_InContext()
	 * @model
	 * @generated
	 */
	ContextType getInContext();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.SortingPolicy#getInContext <em>In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Context</em>' reference.
	 * @see #getInContext()
	 * @generated
	 */
	void setInContext(ContextType value);

} // SortingPolicy
