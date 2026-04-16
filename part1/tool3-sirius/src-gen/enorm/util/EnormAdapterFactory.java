/**
 */
package enorm.util;

import enorm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see enorm.EnormPackage
 * @generated
 */
public class EnormAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EnormPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnormAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EnormPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnormSwitch<Adapter> modelSwitch = new EnormSwitch<Adapter>() {
		@Override
		public Adapter caseRefModel(RefModel object) {
			return createRefModelAdapter();
		}

		@Override
		public Adapter caseUserType(UserType object) {
			return createUserTypeAdapter();
		}

		@Override
		public Adapter caseContextType(ContextType object) {
			return createContextTypeAdapter();
		}

		@Override
		public Adapter caseResourceType(ResourceType object) {
			return createResourceTypeAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseResourceRelation(ResourceRelation object) {
			return createResourceRelationAdapter();
		}

		@Override
		public Adapter caseFeedbackType(FeedbackType object) {
			return createFeedbackTypeAdapter();
		}

		@Override
		public Adapter caseFeedbackDefinition(FeedbackDefinition object) {
			return createFeedbackDefinitionAdapter();
		}

		@Override
		public Adapter caseFeedbackPolicy(FeedbackPolicy object) {
			return createFeedbackPolicyAdapter();
		}

		@Override
		public Adapter caseRatingPolicy(RatingPolicy object) {
			return createRatingPolicyAdapter();
		}

		@Override
		public Adapter caseValidationRule(ValidationRule object) {
			return createValidationRuleAdapter();
		}

		@Override
		public Adapter caseModerationPolicy(ModerationPolicy object) {
			return createModerationPolicyAdapter();
		}

		@Override
		public Adapter caseAuthorizationRule(AuthorizationRule object) {
			return createAuthorizationRuleAdapter();
		}

		@Override
		public Adapter caseAutomationRule(AutomationRule object) {
			return createAutomationRuleAdapter();
		}

		@Override
		public Adapter caseVerificationPolicy(VerificationPolicy object) {
			return createVerificationPolicyAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.RefModel <em>Ref Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.RefModel
	 * @generated
	 */
	public Adapter createRefModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.UserType
	 * @generated
	 */
	public Adapter createUserTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.ContextType <em>Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.ContextType
	 * @generated
	 */
	public Adapter createContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.ResourceType
	 * @generated
	 */
	public Adapter createResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.ResourceRelation <em>Resource Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.ResourceRelation
	 * @generated
	 */
	public Adapter createResourceRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.FeedbackType <em>Feedback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.FeedbackType
	 * @generated
	 */
	public Adapter createFeedbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.FeedbackDefinition <em>Feedback Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.FeedbackDefinition
	 * @generated
	 */
	public Adapter createFeedbackDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.FeedbackPolicy <em>Feedback Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.FeedbackPolicy
	 * @generated
	 */
	public Adapter createFeedbackPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.RatingPolicy <em>Rating Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.RatingPolicy
	 * @generated
	 */
	public Adapter createRatingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.ValidationRule <em>Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.ValidationRule
	 * @generated
	 */
	public Adapter createValidationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.ModerationPolicy <em>Moderation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.ModerationPolicy
	 * @generated
	 */
	public Adapter createModerationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.AuthorizationRule <em>Authorization Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.AuthorizationRule
	 * @generated
	 */
	public Adapter createAuthorizationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.AutomationRule <em>Automation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.AutomationRule
	 * @generated
	 */
	public Adapter createAutomationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link enorm.VerificationPolicy <em>Verification Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see enorm.VerificationPolicy
	 * @generated
	 */
	public Adapter createVerificationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EnormAdapterFactory
