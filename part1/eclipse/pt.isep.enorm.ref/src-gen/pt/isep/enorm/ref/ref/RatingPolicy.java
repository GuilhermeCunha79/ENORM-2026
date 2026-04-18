/**
 */
package pt.isep.enorm.ref.ref;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rating Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.ref.RatingPolicy#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.RatingPolicy#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.RatingPolicy#getStep <em>Step</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.RatingPolicy#getScaleKind <em>Scale Kind</em>}</li>
 * </ul>
 *
 * @see pt.isep.enorm.ref.ref.RefPackage#getRatingPolicy()
 * @model
 * @generated
 */
public interface RatingPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(double)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getRatingPolicy_MinValue()
	 * @model
	 * @generated
	 */
	double getMinValue();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.RatingPolicy#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(double value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(double)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getRatingPolicy_MaxValue()
	 * @model
	 * @generated
	 */
	double getMaxValue();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.RatingPolicy#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(double value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(double)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getRatingPolicy_Step()
	 * @model
	 * @generated
	 */
	double getStep();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.RatingPolicy#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(double value);

	/**
	 * Returns the value of the '<em><b>Scale Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.enorm.ref.ref.RatingScaleKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.RatingScaleKind
	 * @see #setScaleKind(RatingScaleKind)
	 * @see pt.isep.enorm.ref.ref.RefPackage#getRatingPolicy_ScaleKind()
	 * @model
	 * @generated
	 */
	RatingScaleKind getScaleKind();

	/**
	 * Sets the value of the '{@link pt.isep.enorm.ref.ref.RatingPolicy#getScaleKind <em>Scale Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Kind</em>' attribute.
	 * @see pt.isep.enorm.ref.ref.RatingScaleKind
	 * @see #getScaleKind()
	 * @generated
	 */
	void setScaleKind(RatingScaleKind value);

} // RatingPolicy
