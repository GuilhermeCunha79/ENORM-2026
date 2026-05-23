/**
 */
package enorm;

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
 *   <li>{@link enorm.ValidationRule#getName <em>Name</em>}</li>
 *   <li>{@link enorm.ValidationRule#getKind <em>Kind</em>}</li>
 *   <li>{@link enorm.ValidationRule#getSeverity <em>Severity</em>}</li>
 *   <li>{@link enorm.ValidationRule#getExpression <em>Expression</em>}</li>
 *   <li>{@link enorm.ValidationRule#getImplementationId <em>Implementation Id</em>}</li>
 *   <li>{@link enorm.ValidationRule#getAppliesToResource <em>Applies To Resource</em>}</li>
 *   <li>{@link enorm.ValidationRule#getAppliesToFeedback <em>Applies To Feedback</em>}</li>
 *   <li>{@link enorm.ValidationRule#getInvokedBy <em>Invoked By</em>}</li>
 * </ul>
 *
 * @see enorm.EnormPackage#getValidationRule()
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
	 * @see enorm.EnormPackage#getValidationRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link enorm.ValidationRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.ValidationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see enorm.ValidationKind
	 * @see #setKind(ValidationKind)
	 * @see enorm.EnormPackage#getValidationRule_Kind()
	 * @model
	 * @generated
	 */
	ValidationKind getKind();

	/**
	 * Sets the value of the '{@link enorm.ValidationRule#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see enorm.ValidationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ValidationKind value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link enorm.RuleSeverity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see enorm.RuleSeverity
	 * @see #setSeverity(RuleSeverity)
	 * @see enorm.EnormPackage#getValidationRule_Severity()
	 * @model
	 * @generated
	 */
	RuleSeverity getSeverity();

	/**
	 * Sets the value of the '{@link enorm.ValidationRule#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see enorm.RuleSeverity
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
	 * @see enorm.EnormPackage#getValidationRule_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link enorm.ValidationRule#getExpression <em>Expression</em>}' attribute.
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
	 * @see enorm.EnormPackage#getValidationRule_ImplementationId()
	 * @model
	 * @generated
	 */
	String getImplementationId();

	/**
	 * Sets the value of the '{@link enorm.ValidationRule#getImplementationId <em>Implementation Id</em>}' attribute.
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
	 * @see enorm.EnormPackage#getValidationRule_AppliesToResource()
	 * @model
	 * @generated
	 */
	ResourceType getAppliesToResource();

	/**
	 * Sets the value of the '{@link enorm.ValidationRule#getAppliesToResource <em>Applies To Resource</em>}' reference.
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
	 * @see enorm.EnormPackage#getValidationRule_AppliesToFeedback()
	 * @model
	 * @generated
	 */
	FeedbackDefinition getAppliesToFeedback();

	/**
	 * Sets the value of the '{@link enorm.ValidationRule#getAppliesToFeedback <em>Applies To Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To Feedback</em>' reference.
	 * @see #getAppliesToFeedback()
	 * @generated
	 */
	void setAppliesToFeedback(FeedbackDefinition value);

	/**
	 * Returns the value of the '<em><b>Invoked By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoked By</em>' reference.
	 * @see #setInvokedBy(AutomationRule)
	 * @see enorm.EnormPackage#getValidationRule_InvokedBy()
	 * @model required="true"
	 * @generated
	 */
	AutomationRule getInvokedBy();

	/**
	 * Sets the value of the '{@link enorm.ValidationRule#getInvokedBy <em>Invoked By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoked By</em>' reference.
	 * @see #getInvokedBy()
	 * @generated
	 */
	void setInvokedBy(AutomationRule value);

} // ValidationRule
