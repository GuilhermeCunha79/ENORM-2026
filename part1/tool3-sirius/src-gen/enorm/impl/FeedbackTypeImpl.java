/**
 */
package enorm.impl;

import enorm.EnormPackage;
import enorm.FeedbackKind;
import enorm.FeedbackSubjectScope;
import enorm.FeedbackType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link enorm.impl.FeedbackTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link enorm.impl.FeedbackTypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link enorm.impl.FeedbackTypeImpl#getSubjectScope <em>Subject Scope</em>}</li>
 *   <li>{@link enorm.impl.FeedbackTypeImpl#isHasRating <em>Has Rating</em>}</li>
 *   <li>{@link enorm.impl.FeedbackTypeImpl#isRecursive <em>Recursive</em>}</li>
 *   <li>{@link enorm.impl.FeedbackTypeImpl#isAllowsMedia <em>Allows Media</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackTypeImpl extends MinimalEObjectImpl.Container implements FeedbackType {
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final FeedbackKind KIND_EDEFAULT = FeedbackKind.COMMENT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected FeedbackKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubjectScope() <em>Subject Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectScope()
	 * @generated
	 * @ordered
	 */
	protected static final FeedbackSubjectScope SUBJECT_SCOPE_EDEFAULT = FeedbackSubjectScope.RESOURCE_ONLY;

	/**
	 * The cached value of the '{@link #getSubjectScope() <em>Subject Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectScope()
	 * @generated
	 * @ordered
	 */
	protected FeedbackSubjectScope subjectScope = SUBJECT_SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasRating() <em>Has Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasRating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_RATING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasRating() <em>Has Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasRating()
	 * @generated
	 * @ordered
	 */
	protected boolean hasRating = HAS_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #isRecursive() <em>Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecursive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECURSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRecursive() <em>Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecursive()
	 * @generated
	 * @ordered
	 */
	protected boolean recursive = RECURSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowsMedia() <em>Allows Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowsMedia()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOWS_MEDIA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowsMedia() <em>Allows Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowsMedia()
	 * @generated
	 * @ordered
	 */
	protected boolean allowsMedia = ALLOWS_MEDIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnormPackage.Literals.FEEDBACK_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.FEEDBACK_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(FeedbackKind newKind) {
		FeedbackKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.FEEDBACK_TYPE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackSubjectScope getSubjectScope() {
		return subjectScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectScope(FeedbackSubjectScope newSubjectScope) {
		FeedbackSubjectScope oldSubjectScope = subjectScope;
		subjectScope = newSubjectScope == null ? SUBJECT_SCOPE_EDEFAULT : newSubjectScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.FEEDBACK_TYPE__SUBJECT_SCOPE,
					oldSubjectScope, subjectScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasRating() {
		return hasRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasRating(boolean newHasRating) {
		boolean oldHasRating = hasRating;
		hasRating = newHasRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.FEEDBACK_TYPE__HAS_RATING, oldHasRating,
					hasRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRecursive() {
		return recursive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecursive(boolean newRecursive) {
		boolean oldRecursive = recursive;
		recursive = newRecursive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.FEEDBACK_TYPE__RECURSIVE, oldRecursive,
					recursive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowsMedia() {
		return allowsMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowsMedia(boolean newAllowsMedia) {
		boolean oldAllowsMedia = allowsMedia;
		allowsMedia = newAllowsMedia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnormPackage.FEEDBACK_TYPE__ALLOWS_MEDIA,
					oldAllowsMedia, allowsMedia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EnormPackage.FEEDBACK_TYPE__NAME:
			return getName();
		case EnormPackage.FEEDBACK_TYPE__KIND:
			return getKind();
		case EnormPackage.FEEDBACK_TYPE__SUBJECT_SCOPE:
			return getSubjectScope();
		case EnormPackage.FEEDBACK_TYPE__HAS_RATING:
			return isHasRating();
		case EnormPackage.FEEDBACK_TYPE__RECURSIVE:
			return isRecursive();
		case EnormPackage.FEEDBACK_TYPE__ALLOWS_MEDIA:
			return isAllowsMedia();
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
		case EnormPackage.FEEDBACK_TYPE__NAME:
			setName((String) newValue);
			return;
		case EnormPackage.FEEDBACK_TYPE__KIND:
			setKind((FeedbackKind) newValue);
			return;
		case EnormPackage.FEEDBACK_TYPE__SUBJECT_SCOPE:
			setSubjectScope((FeedbackSubjectScope) newValue);
			return;
		case EnormPackage.FEEDBACK_TYPE__HAS_RATING:
			setHasRating((Boolean) newValue);
			return;
		case EnormPackage.FEEDBACK_TYPE__RECURSIVE:
			setRecursive((Boolean) newValue);
			return;
		case EnormPackage.FEEDBACK_TYPE__ALLOWS_MEDIA:
			setAllowsMedia((Boolean) newValue);
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
		case EnormPackage.FEEDBACK_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EnormPackage.FEEDBACK_TYPE__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case EnormPackage.FEEDBACK_TYPE__SUBJECT_SCOPE:
			setSubjectScope(SUBJECT_SCOPE_EDEFAULT);
			return;
		case EnormPackage.FEEDBACK_TYPE__HAS_RATING:
			setHasRating(HAS_RATING_EDEFAULT);
			return;
		case EnormPackage.FEEDBACK_TYPE__RECURSIVE:
			setRecursive(RECURSIVE_EDEFAULT);
			return;
		case EnormPackage.FEEDBACK_TYPE__ALLOWS_MEDIA:
			setAllowsMedia(ALLOWS_MEDIA_EDEFAULT);
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
		case EnormPackage.FEEDBACK_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EnormPackage.FEEDBACK_TYPE__KIND:
			return kind != KIND_EDEFAULT;
		case EnormPackage.FEEDBACK_TYPE__SUBJECT_SCOPE:
			return subjectScope != SUBJECT_SCOPE_EDEFAULT;
		case EnormPackage.FEEDBACK_TYPE__HAS_RATING:
			return hasRating != HAS_RATING_EDEFAULT;
		case EnormPackage.FEEDBACK_TYPE__RECURSIVE:
			return recursive != RECURSIVE_EDEFAULT;
		case EnormPackage.FEEDBACK_TYPE__ALLOWS_MEDIA:
			return allowsMedia != ALLOWS_MEDIA_EDEFAULT;
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
		result.append(", kind: ");
		result.append(kind);
		result.append(", subjectScope: ");
		result.append(subjectScope);
		result.append(", hasRating: ");
		result.append(hasRating);
		result.append(", recursive: ");
		result.append(recursive);
		result.append(", allowsMedia: ");
		result.append(allowsMedia);
		result.append(')');
		return result.toString();
	}

} //FeedbackTypeImpl
