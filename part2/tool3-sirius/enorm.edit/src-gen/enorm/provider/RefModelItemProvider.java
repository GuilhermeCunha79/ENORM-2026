/**
 */
package enorm.provider;

import enorm.EnormFactory;
import enorm.EnormPackage;
import enorm.RefModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link enorm.RefModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RefModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RefModel_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RefModel_name_feature",
								"_UI_RefModel_type"),
						EnormPackage.Literals.REF_MODEL__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RefModel_version_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RefModel_version_feature",
								"_UI_RefModel_type"),
						EnormPackage.Literals.REF_MODEL__VERSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EnormPackage.Literals.REF_MODEL__USER_TYPES);
			childrenFeatures.add(EnormPackage.Literals.REF_MODEL__RESOURCE_TYPES);
			childrenFeatures.add(EnormPackage.Literals.REF_MODEL__CONTEXT_TYPES);
			childrenFeatures.add(EnormPackage.Literals.REF_MODEL__RESOURCE_RELATIONS);
			childrenFeatures.add(EnormPackage.Literals.REF_MODEL__FEEDBACK_TYPES);
			childrenFeatures.add(EnormPackage.Literals.REF_MODEL__FEEDBACK_DEFINITIONS);
			childrenFeatures.add(EnormPackage.Literals.REF_MODEL__AUTHORIZATION_RULES);
			childrenFeatures.add(EnormPackage.Literals.REF_MODEL__VALIDATION_RULES);
			childrenFeatures.add(EnormPackage.Literals.REF_MODEL__MODERATION_POLICIES);
			childrenFeatures.add(EnormPackage.Literals.REF_MODEL__AUTOMATION_RULES);
			childrenFeatures.add(EnormPackage.Literals.REF_MODEL__VERIFICATION_POLICIES);
			childrenFeatures.add(EnormPackage.Literals.REF_MODEL__SORTING_POLICIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns RefModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RefModel"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RefModel) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_RefModel_type")
				: getString("_UI_RefModel_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RefModel.class)) {
		case EnormPackage.REF_MODEL__NAME:
		case EnormPackage.REF_MODEL__VERSION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case EnormPackage.REF_MODEL__USER_TYPES:
		case EnormPackage.REF_MODEL__RESOURCE_TYPES:
		case EnormPackage.REF_MODEL__CONTEXT_TYPES:
		case EnormPackage.REF_MODEL__RESOURCE_RELATIONS:
		case EnormPackage.REF_MODEL__FEEDBACK_TYPES:
		case EnormPackage.REF_MODEL__FEEDBACK_DEFINITIONS:
		case EnormPackage.REF_MODEL__AUTHORIZATION_RULES:
		case EnormPackage.REF_MODEL__VALIDATION_RULES:
		case EnormPackage.REF_MODEL__MODERATION_POLICIES:
		case EnormPackage.REF_MODEL__AUTOMATION_RULES:
		case EnormPackage.REF_MODEL__VERIFICATION_POLICIES:
		case EnormPackage.REF_MODEL__SORTING_POLICIES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(EnormPackage.Literals.REF_MODEL__USER_TYPES,
				EnormFactory.eINSTANCE.createUserType()));

		newChildDescriptors.add(createChildParameter(EnormPackage.Literals.REF_MODEL__RESOURCE_TYPES,
				EnormFactory.eINSTANCE.createResourceType()));

		newChildDescriptors.add(createChildParameter(EnormPackage.Literals.REF_MODEL__CONTEXT_TYPES,
				EnormFactory.eINSTANCE.createContextType()));

		newChildDescriptors.add(createChildParameter(EnormPackage.Literals.REF_MODEL__RESOURCE_RELATIONS,
				EnormFactory.eINSTANCE.createResourceRelation()));

		newChildDescriptors.add(createChildParameter(EnormPackage.Literals.REF_MODEL__FEEDBACK_TYPES,
				EnormFactory.eINSTANCE.createFeedbackType()));

		newChildDescriptors.add(createChildParameter(EnormPackage.Literals.REF_MODEL__FEEDBACK_DEFINITIONS,
				EnormFactory.eINSTANCE.createFeedbackDefinition()));

		newChildDescriptors.add(createChildParameter(EnormPackage.Literals.REF_MODEL__AUTHORIZATION_RULES,
				EnormFactory.eINSTANCE.createAuthorizationRule()));

		newChildDescriptors.add(createChildParameter(EnormPackage.Literals.REF_MODEL__VALIDATION_RULES,
				EnormFactory.eINSTANCE.createValidationRule()));

		newChildDescriptors.add(createChildParameter(EnormPackage.Literals.REF_MODEL__MODERATION_POLICIES,
				EnormFactory.eINSTANCE.createModerationPolicy()));

		newChildDescriptors.add(createChildParameter(EnormPackage.Literals.REF_MODEL__AUTOMATION_RULES,
				EnormFactory.eINSTANCE.createAutomationRule()));

		newChildDescriptors.add(createChildParameter(EnormPackage.Literals.REF_MODEL__VERIFICATION_POLICIES,
				EnormFactory.eINSTANCE.createVerificationPolicy()));

		newChildDescriptors.add(createChildParameter(EnormPackage.Literals.REF_MODEL__SORTING_POLICIES,
				EnormFactory.eINSTANCE.createSortingPolicy()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EnormEditPlugin.INSTANCE;
	}

}
