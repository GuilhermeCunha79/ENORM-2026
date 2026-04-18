/**
 */
package pt.isep.enorm.ref.ref.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.enorm.ref.ref.RatingPolicy;
import pt.isep.enorm.ref.ref.RatingScaleKind;
import pt.isep.enorm.ref.ref.RefPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rating Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RatingPolicyImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RatingPolicyImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RatingPolicyImpl#getStep <em>Step</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.ref.impl.RatingPolicyImpl#getScaleKind <em>Scale Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatingPolicyImpl extends MinimalEObjectImpl.Container implements RatingPolicy {
	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected double minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected double maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected double step = STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleKind() <em>Scale Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleKind()
	 * @generated
	 * @ordered
	 */
	protected static final RatingScaleKind SCALE_KIND_EDEFAULT = RatingScaleKind.NUMERIC;

	/**
	 * The cached value of the '{@link #getScaleKind() <em>Scale Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleKind()
	 * @generated
	 * @ordered
	 */
	protected RatingScaleKind scaleKind = SCALE_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefPackage.Literals.RATING_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinValue(double newMinValue) {
		double oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.RATING_POLICY__MIN_VALUE, oldMinValue,
					minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxValue(double newMaxValue) {
		double oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.RATING_POLICY__MAX_VALUE, oldMaxValue,
					maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStep(double newStep) {
		double oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.RATING_POLICY__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RatingScaleKind getScaleKind() {
		return scaleKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleKind(RatingScaleKind newScaleKind) {
		RatingScaleKind oldScaleKind = scaleKind;
		scaleKind = newScaleKind == null ? SCALE_KIND_EDEFAULT : newScaleKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefPackage.RATING_POLICY__SCALE_KIND, oldScaleKind,
					scaleKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RefPackage.RATING_POLICY__MIN_VALUE:
			return getMinValue();
		case RefPackage.RATING_POLICY__MAX_VALUE:
			return getMaxValue();
		case RefPackage.RATING_POLICY__STEP:
			return getStep();
		case RefPackage.RATING_POLICY__SCALE_KIND:
			return getScaleKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RefPackage.RATING_POLICY__MIN_VALUE:
			setMinValue((Double) newValue);
			return;
		case RefPackage.RATING_POLICY__MAX_VALUE:
			setMaxValue((Double) newValue);
			return;
		case RefPackage.RATING_POLICY__STEP:
			setStep((Double) newValue);
			return;
		case RefPackage.RATING_POLICY__SCALE_KIND:
			setScaleKind((RatingScaleKind) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RefPackage.RATING_POLICY__MIN_VALUE:
			setMinValue(MIN_VALUE_EDEFAULT);
			return;
		case RefPackage.RATING_POLICY__MAX_VALUE:
			setMaxValue(MAX_VALUE_EDEFAULT);
			return;
		case RefPackage.RATING_POLICY__STEP:
			setStep(STEP_EDEFAULT);
			return;
		case RefPackage.RATING_POLICY__SCALE_KIND:
			setScaleKind(SCALE_KIND_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RefPackage.RATING_POLICY__MIN_VALUE:
			return minValue != MIN_VALUE_EDEFAULT;
		case RefPackage.RATING_POLICY__MAX_VALUE:
			return maxValue != MAX_VALUE_EDEFAULT;
		case RefPackage.RATING_POLICY__STEP:
			return step != STEP_EDEFAULT;
		case RefPackage.RATING_POLICY__SCALE_KIND:
			return scaleKind != SCALE_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (minValue: ");
		result.append(minValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", step: ");
		result.append(step);
		result.append(", scaleKind: ");
		result.append(scaleKind);
		result.append(')');
		return result.toString();
	}

} //RatingPolicyImpl
