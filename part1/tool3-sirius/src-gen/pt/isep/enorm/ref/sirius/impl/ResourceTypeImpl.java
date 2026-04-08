/**
 */
package pt.isep.enorm.ref.sirius.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.enorm.ref.sirius.Attribute;
import pt.isep.enorm.ref.sirius.ResourceType;
import pt.isep.enorm.ref.sirius.SiriusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.ResourceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.ResourceTypeImpl#isSupportsMedia <em>Supports Media</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.ResourceTypeImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link pt.isep.enorm.ref.sirius.impl.ResourceTypeImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceTypeImpl extends MinimalEObjectImpl.Container implements ResourceType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isSupportsMedia() <em>Supports Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportsMedia()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORTS_MEDIA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSupportsMedia() <em>Supports Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportsMedia()
	 * @generated
	 * @ordered
	 */
	protected boolean supportsMedia = SUPPORTS_MEDIA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> superTypes;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiriusPackage.Literals.RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.RESOURCE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSupportsMedia() {
		return supportsMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsMedia(boolean newSupportsMedia) {
		boolean oldSupportsMedia = supportsMedia;
		supportsMedia = newSupportsMedia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiriusPackage.RESOURCE_TYPE__SUPPORTS_MEDIA,
					oldSupportsMedia, supportsMedia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceType> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectResolvingEList<ResourceType>(ResourceType.class, this,
					SiriusPackage.RESOURCE_TYPE__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					SiriusPackage.RESOURCE_TYPE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SiriusPackage.RESOURCE_TYPE__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SiriusPackage.RESOURCE_TYPE__NAME:
			return getName();
		case SiriusPackage.RESOURCE_TYPE__SUPPORTS_MEDIA:
			return isSupportsMedia();
		case SiriusPackage.RESOURCE_TYPE__SUPER_TYPES:
			return getSuperTypes();
		case SiriusPackage.RESOURCE_TYPE__ATTRIBUTES:
			return getAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SiriusPackage.RESOURCE_TYPE__NAME:
			setName((String) newValue);
			return;
		case SiriusPackage.RESOURCE_TYPE__SUPPORTS_MEDIA:
			setSupportsMedia((Boolean) newValue);
			return;
		case SiriusPackage.RESOURCE_TYPE__SUPER_TYPES:
			getSuperTypes().clear();
			getSuperTypes().addAll((Collection<? extends ResourceType>) newValue);
			return;
		case SiriusPackage.RESOURCE_TYPE__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
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
		case SiriusPackage.RESOURCE_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SiriusPackage.RESOURCE_TYPE__SUPPORTS_MEDIA:
			setSupportsMedia(SUPPORTS_MEDIA_EDEFAULT);
			return;
		case SiriusPackage.RESOURCE_TYPE__SUPER_TYPES:
			getSuperTypes().clear();
			return;
		case SiriusPackage.RESOURCE_TYPE__ATTRIBUTES:
			getAttributes().clear();
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
		case SiriusPackage.RESOURCE_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SiriusPackage.RESOURCE_TYPE__SUPPORTS_MEDIA:
			return supportsMedia != SUPPORTS_MEDIA_EDEFAULT;
		case SiriusPackage.RESOURCE_TYPE__SUPER_TYPES:
			return superTypes != null && !superTypes.isEmpty();
		case SiriusPackage.RESOURCE_TYPE__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", supportsMedia: ");
		result.append(supportsMedia);
		result.append(')');
		return result.toString();
	}

} //ResourceTypeImpl
