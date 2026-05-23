/**
 */
package enorm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feedback Subject Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see enorm.EnormPackage#getFeedbackSubjectScope()
 * @model
 * @generated
 */
public enum FeedbackSubjectScope implements Enumerator {
	/**
	 * The '<em><b>RESOURCE ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_ONLY(0, "RESOURCE_ONLY", "RESOURCE_ONLY"),

	/**
	 * The '<em><b>FEEDBACK ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEEDBACK_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	FEEDBACK_ONLY(1, "FEEDBACK_ONLY", "FEEDBACK_ONLY"),

	/**
	 * The '<em><b>RESOURCE OR FEEDBACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_OR_FEEDBACK_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_OR_FEEDBACK(2, "RESOURCE_OR_FEEDBACK", "RESOURCE_OR_FEEDBACK");

	/**
	 * The '<em><b>RESOURCE ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_ONLY_VALUE = 0;

	/**
	 * The '<em><b>FEEDBACK ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEEDBACK_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FEEDBACK_ONLY_VALUE = 1;

	/**
	 * The '<em><b>RESOURCE OR FEEDBACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_OR_FEEDBACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_OR_FEEDBACK_VALUE = 2;

	/**
	 * An array of all the '<em><b>Feedback Subject Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeedbackSubjectScope[] VALUES_ARRAY = new FeedbackSubjectScope[] { RESOURCE_ONLY,
			FEEDBACK_ONLY, RESOURCE_OR_FEEDBACK, };

	/**
	 * A public read-only list of all the '<em><b>Feedback Subject Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FeedbackSubjectScope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feedback Subject Scope</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeedbackSubjectScope get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeedbackSubjectScope result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feedback Subject Scope</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeedbackSubjectScope getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeedbackSubjectScope result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feedback Subject Scope</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeedbackSubjectScope get(int value) {
		switch (value) {
		case RESOURCE_ONLY_VALUE:
			return RESOURCE_ONLY;
		case FEEDBACK_ONLY_VALUE:
			return FEEDBACK_ONLY;
		case RESOURCE_OR_FEEDBACK_VALUE:
			return RESOURCE_OR_FEEDBACK;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FeedbackSubjectScope(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //FeedbackSubjectScope
