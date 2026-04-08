/**
 */
package pt.isep.enorm.ref.sirius.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pt.isep.enorm.ref.sirius.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pt.isep.enorm.ref.sirius.SiriusPackage
 * @generated
 */
public class SiriusAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SiriusPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiriusAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SiriusPackage.eINSTANCE;
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
	protected SiriusSwitch<Adapter> modelSwitch = new SiriusSwitch<Adapter>() {
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
		public Adapter caseEvolutionRule(EvolutionRule object) {
			return createEvolutionRuleAdapter();
		}

		@Override
		public Adapter caseRefactoringOperation(RefactoringOperation object) {
			return createRefactoringOperationAdapter();
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
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.RefModel <em>Ref Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.RefModel
	 * @generated
	 */
	public Adapter createRefModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.UserType
	 * @generated
	 */
	public Adapter createUserTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.ContextType <em>Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.ContextType
	 * @generated
	 */
	public Adapter createContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.ResourceType
	 * @generated
	 */
	public Adapter createResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.ResourceRelation <em>Resource Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.ResourceRelation
	 * @generated
	 */
	public Adapter createResourceRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.FeedbackType <em>Feedback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.FeedbackType
	 * @generated
	 */
	public Adapter createFeedbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.FeedbackDefinition <em>Feedback Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.FeedbackDefinition
	 * @generated
	 */
	public Adapter createFeedbackDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.FeedbackPolicy <em>Feedback Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.FeedbackPolicy
	 * @generated
	 */
	public Adapter createFeedbackPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.RatingPolicy <em>Rating Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.RatingPolicy
	 * @generated
	 */
	public Adapter createRatingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.ValidationRule <em>Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.ValidationRule
	 * @generated
	 */
	public Adapter createValidationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.ModerationPolicy <em>Moderation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.ModerationPolicy
	 * @generated
	 */
	public Adapter createModerationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.AuthorizationRule <em>Authorization Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.AuthorizationRule
	 * @generated
	 */
	public Adapter createAuthorizationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.AutomationRule <em>Automation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.AutomationRule
	 * @generated
	 */
	public Adapter createAutomationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.VerificationPolicy <em>Verification Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.VerificationPolicy
	 * @generated
	 */
	public Adapter createVerificationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.EvolutionRule <em>Evolution Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.EvolutionRule
	 * @generated
	 */
	public Adapter createEvolutionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.enorm.ref.sirius.RefactoringOperation <em>Refactoring Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.enorm.ref.sirius.RefactoringOperation
	 * @generated
	 */
	public Adapter createRefactoringOperationAdapter() {
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

} //SiriusAdapterFactory
