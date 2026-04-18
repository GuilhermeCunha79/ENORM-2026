/**
 */
package pt.isep.enorm.ref.ref;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.ref.ValidationRule#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.ValidationRule#getKind <em>Kind</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.ValidationRule#getSeverity <em>Severity</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.ValidationRule#getExpression <em>Expression</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.ValidationRule#getImplementationId <em>Implementation Id</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.ValidationRule#getAppliesToResource <em>Applies To Resource</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.ValidationRule#getAppliesToFeedback <em>Applies To Feedback</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.ValidationRule#getInvokedBy <em>Invoked By</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.ref.RefPackage#getValidationRule()
 * @model
 * @generated
 */
public interface ValidationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getValidationRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.ValidationRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.ValidationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.ValidationKind
	 * @see #setKind(ValidationKind)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getValidationRule_Kind()
	 * @model
	 * @generated
	 */
	ValidationKind getKind();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.ValidationRule#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.ValidationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ValidationKind value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.RuleSeverity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.RuleSeverity
	 * @see #setSeverity(RuleSeverity)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getValidationRule_Severity()
	 * @model
	 * @generated
	 */
	RuleSeverity getSeverity();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.ValidationRule#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.RuleSeverity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(RuleSeverity value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getValidationRule_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.ValidationRule#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Implementation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Id</em>' attribute.
	 * @see #setImplementationId(String)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getValidationRule_ImplementationId()
	 * @model
	 * @generated
	 */
	String getImplementationId();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.ValidationRule#getImplementationId <em>Implementation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Id</em>' attribute.
	 * @see #getImplementationId()
	 * @generated
	 */
	void setImplementationId(String value);

	/**
	 * Returns the value of the '<em><b>Applies To Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Resource</em>' reference.
	 * @see #setAppliesToResource(ResourceType)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getValidationRule_AppliesToResource()
	 * @model
	 * @generated
	 */
	ResourceType getAppliesToResource();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.ValidationRule#getAppliesToResource <em>Applies To Resource</em>}' reference.
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
	 * @see pt.isep.enorm.ref.ref.RefPackage#getValidationRule_AppliesToFeedback()
	 * @model
	 * @generated
	 */
	FeedbackDefinition getAppliesToFeedback();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.ValidationRule#getAppliesToFeedback <em>Applies To Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To Feedback</em>' reference.
	 * @see #getAppliesToFeedback()
	 * @generated
	 */
	void setAppliesToFeedback(FeedbackDefinition value);

	/**
	 * Returns the value of the '<em><b>Invoked By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pt.isep.enorm.ref.ref.AutomationRule#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoked By</em>' reference.
	 * @see #setInvokedBy(AutomationRule)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getValidationRule_InvokedBy()
	 * @see pt.isep.enorm.ref.ref.AutomationRule#getUses
	 * @model opposite="uses" required="true"
	 * @generated
	 */
	AutomationRule getInvokedBy();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.ValidationRule#getInvokedBy <em>Invoked By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoked By</em>' reference.
	 * @see #getInvokedBy()
	 * @generated
	 */
	void setInvokedBy(AutomationRule value);

} // ValidationRule
