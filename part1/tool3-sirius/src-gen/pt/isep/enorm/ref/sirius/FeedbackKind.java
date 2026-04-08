/**
 */
package pt.isep.enorm.ref.sirius;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feedback Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getFeedbackKind()
 * @model
 * @generated
 */
public enum FeedbackKind implements Enumerator {
	/**
	 * The '<em><b>COMMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMMENT(0, "COMMENT", "COMMENT"),

	/**
	 * The '<em><b>REVIEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEW(1, "REVIEW", "REVIEW"),

	/**
	 * The '<em><b>REACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REACTION_VALUE
	 * @generated
	 * @ordered
	 */
	REACTION(2, "REACTION", "REACTION"),

	/**
	 * The '<em><b>VOTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOTE_VALUE
	 * @generated
	 * @ordered
	 */
	VOTE(3, "VOTE", "VOTE"),

	/**
	 * The '<em><b>REPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	REPORT(4, "REPORT", "REPORT"),

	/**
	 * The '<em><b>SUBSCRIPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPTION(5, "SUBSCRIPTION", "SUBSCRIPTION");

	/**
	 * The '<em><b>COMMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMENT_VALUE = 0;

	/**
	 * The '<em><b>REVIEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REVIEW_VALUE = 1;

	/**
	 * The '<em><b>REACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REACTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REACTION_VALUE = 2;

	/**
	 * The '<em><b>VOTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOTE_VALUE = 3;

	/**
	 * The '<em><b>REPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPORT_VALUE = 4;

	/**
	 * The '<em><b>SUBSCRIPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Feedback Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeedbackKind[] VALUES_ARRAY = new FeedbackKind[] { COMMENT, REVIEW, REACTION, VOTE, REPORT,
			SUBSCRIPTION, };

	/**
	 * A public read-only list of all the '<em><b>Feedback Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FeedbackKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feedback Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeedbackKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeedbackKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feedback Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeedbackKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeedbackKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feedback Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeedbackKind get(int value) {
		switch (value) {
		case COMMENT_VALUE:
			return COMMENT;
		case REVIEW_VALUE:
			return REVIEW;
		case REACTION_VALUE:
			return REACTION;
		case VOTE_VALUE:
			return VOTE;
		case REPORT_VALUE:
			return REPORT;
		case SUBSCRIPTION_VALUE:
			return SUBSCRIPTION;
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
	private FeedbackKind(int value, String name, String literal) {
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

} //FeedbackKind
