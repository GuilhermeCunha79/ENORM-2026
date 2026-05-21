/**
 */
package pt.isep.enorm.ref.ref.provider;

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

import pt.isep.enorm.ref.ref.FeedbackDefinition;
import pt.isep.enorm.ref.ref.RefFactory;
import pt.isep.enorm.ref.ref.RefPackage;

/**
 * This is the item provider adapter for a {@link pt.isep.enorm.ref.ref.FeedbackDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeedbackDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackDefinitionItemProvider(AdapterFactory adapterFactory) {
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
			addRequiresVerifiedContextPropertyDescriptor(object);
			addVerificationRequirementPropertyDescriptor(object);
			addUniquePerAuthorTargetPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addSubjectResourcePropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addSubjectFeedbackPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_FeedbackDefinition_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FeedbackDefinition_name_feature",
								"_UI_FeedbackDefinition_type"),
						RefPackage.Literals.FEEDBACK_DEFINITION__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Requires Verified Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiresVerifiedContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FeedbackDefinition_requiresVerifiedContext_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FeedbackDefinition_requiresVerifiedContext_feature", "_UI_FeedbackDefinition_type"),
				RefPackage.Literals.FEEDBACK_DEFINITION__REQUIRES_VERIFIED_CONTEXT, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Verification Requirement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerificationRequirementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FeedbackDefinition_verificationRequirement_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_FeedbackDefinition_verificationRequirement_feature", "_UI_FeedbackDefinition_type"),
				RefPackage.Literals.FEEDBACK_DEFINITION__VERIFICATION_REQUIREMENT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Unique Per Author Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniquePerAuthorTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FeedbackDefinition_uniquePerAuthorTarget_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_FeedbackDefinition_uniquePerAuthorTarget_feature", "_UI_FeedbackDefinition_type"),
						RefPackage.Literals.FEEDBACK_DEFINITION__UNIQUE_PER_AUTHOR_TARGET, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FeedbackDefinition_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FeedbackDefinition_type_feature",
								"_UI_FeedbackDefinition_type"),
						RefPackage.Literals.FEEDBACK_DEFINITION__TYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Subject Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubjectResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FeedbackDefinition_subjectResource_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_FeedbackDefinition_subjectResource_feature",
						"_UI_FeedbackDefinition_type"),
				RefPackage.Literals.FEEDBACK_DEFINITION__SUBJECT_RESOURCE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FeedbackDefinition_author_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FeedbackDefinition_author_feature",
								"_UI_FeedbackDefinition_type"),
						RefPackage.Literals.FEEDBACK_DEFINITION__AUTHOR, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Subject Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubjectFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FeedbackDefinition_subjectFeedback_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_FeedbackDefinition_subjectFeedback_feature",
						"_UI_FeedbackDefinition_type"),
				RefPackage.Literals.FEEDBACK_DEFINITION__SUBJECT_FEEDBACK, true, false, true, null, null, null));
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
			childrenFeatures.add(RefPackage.Literals.FEEDBACK_DEFINITION__POLICY);
			childrenFeatures.add(RefPackage.Literals.FEEDBACK_DEFINITION__RATING);
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
	 * This returns FeedbackDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeedbackDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FeedbackDefinition) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_FeedbackDefinition_type")
				: getString("_UI_FeedbackDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(FeedbackDefinition.class)) {
		case RefPackage.FEEDBACK_DEFINITION__NAME:
		case RefPackage.FEEDBACK_DEFINITION__REQUIRES_VERIFIED_CONTEXT:
		case RefPackage.FEEDBACK_DEFINITION__VERIFICATION_REQUIREMENT:
		case RefPackage.FEEDBACK_DEFINITION__UNIQUE_PER_AUTHOR_TARGET:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case RefPackage.FEEDBACK_DEFINITION__POLICY:
		case RefPackage.FEEDBACK_DEFINITION__RATING:
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

		newChildDescriptors.add(createChildParameter(RefPackage.Literals.FEEDBACK_DEFINITION__POLICY,
				RefFactory.eINSTANCE.createFeedbackPolicy()));

		newChildDescriptors.add(createChildParameter(RefPackage.Literals.FEEDBACK_DEFINITION__RATING,
				RefFactory.eINSTANCE.createRatingPolicy()));
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
