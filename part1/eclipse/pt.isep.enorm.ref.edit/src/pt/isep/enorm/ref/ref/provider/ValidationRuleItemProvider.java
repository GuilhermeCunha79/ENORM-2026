/**
 */
package pt.isep.enorm.ref.ref.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import pt.isep.enorm.ref.ref.RefPackage;
import pt.isep.enorm.ref.ref.ValidationRule;

/**
 * This is the item provider adapter for a {@link pt.isep.enorm.ref.ref.ValidationRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationRuleItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationRuleItemProvider(AdapterFactory adapterFactory) {
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
			addKindPropertyDescriptor(object);
			addSeverityPropertyDescriptor(object);
			addExpressionPropertyDescriptor(object);
			addImplementationIdPropertyDescriptor(object);
			addAppliesToResourcePropertyDescriptor(object);
			addAppliesToFeedbackPropertyDescriptor(object);
			addInvokedByPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_ValidationRule_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ValidationRule_name_feature",
								"_UI_ValidationRule_type"),
						RefPackage.Literals.VALIDATION_RULE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ValidationRule_kind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ValidationRule_kind_feature",
								"_UI_ValidationRule_type"),
						RefPackage.Literals.VALIDATION_RULE__KIND, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Severity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeverityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ValidationRule_severity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ValidationRule_severity_feature",
								"_UI_ValidationRule_type"),
						RefPackage.Literals.VALIDATION_RULE__SEVERITY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ValidationRule_expression_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ValidationRule_expression_feature",
								"_UI_ValidationRule_type"),
						RefPackage.Literals.VALIDATION_RULE__EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Implementation Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ValidationRule_implementationId_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ValidationRule_implementationId_feature",
								"_UI_ValidationRule_type"),
						RefPackage.Literals.VALIDATION_RULE__IMPLEMENTATION_ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Applies To Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliesToResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ValidationRule_appliesToResource_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ValidationRule_appliesToResource_feature",
								"_UI_ValidationRule_type"),
						RefPackage.Literals.VALIDATION_RULE__APPLIES_TO_RESOURCE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Applies To Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliesToFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ValidationRule_appliesToFeedback_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ValidationRule_appliesToFeedback_feature",
								"_UI_ValidationRule_type"),
						RefPackage.Literals.VALIDATION_RULE__APPLIES_TO_FEEDBACK, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Invoked By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvokedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ValidationRule_invokedBy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ValidationRule_invokedBy_feature",
								"_UI_ValidationRule_type"),
						RefPackage.Literals.VALIDATION_RULE__INVOKED_BY, true, false, true, null, null, null));
	}

	/**
	 * This returns ValidationRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ValidationRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ValidationRule) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ValidationRule_type")
				: getString("_UI_ValidationRule_type") + " " + label;
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

		switch (notification.getFeatureID(ValidationRule.class)) {
		case RefPackage.VALIDATION_RULE__NAME:
		case RefPackage.VALIDATION_RULE__KIND:
		case RefPackage.VALIDATION_RULE__SEVERITY:
		case RefPackage.VALIDATION_RULE__EXPRESSION:
		case RefPackage.VALIDATION_RULE__IMPLEMENTATION_ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RefEditPlugin.INSTANCE;
	}

}
