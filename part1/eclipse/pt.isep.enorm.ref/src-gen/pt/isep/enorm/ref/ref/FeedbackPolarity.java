/**
 */
package pt.isep.enorm.ref.ref;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feedback Polarity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pt.isep.enorm.ref.ref.RefPackage#getFeedbackPolarity()
 * @model
 * @generated
 */
public enum FeedbackPolarity implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>LIKE DISLIKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKE_DISLIKE_VALUE
	 * @generated
	 * @ordered
	 */
	LIKE_DISLIKE(1, "LIKE_DISLIKE", "LIKE_DISLIKE"),

	/**
	 * The '<em><b>UP DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UP_DOWN(2, "UP_DOWN", "UP_DOWN"),
	/**
	* The '<em><b>STARS</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #STARS_VALUE
	* @generated
	* @ordered
	*/
	STARS(3, "STARS", "STARS");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>LIKE DISLIKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKE_DISLIKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIKE_DISLIKE_VALUE = 1;

	/**
	 * The '<em><b>UP DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_DOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UP_DOWN_VALUE = 2;

	/**
	 * The '<em><b>STARS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STARS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Feedback Polarity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeedbackPolarity[] VALUES_ARRAY = new FeedbackPolarity[] { NONE, LIKE_DISLIKE, UP_DOWN,
			STARS, };

	/**
	 * A public read-only list of all the '<em><b>Feedback Polarity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FeedbackPolarity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feedback Polarity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeedbackPolarity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeedbackPolarity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feedback Polarity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeedbackPolarity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeedbackPolarity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feedback Polarity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeedbackPolarity get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case LIKE_DISLIKE_VALUE:
			return LIKE_DISLIKE;
		case UP_DOWN_VALUE:
			return UP_DOWN;
		case STARS_VALUE:
			return STARS;
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
	private FeedbackPolarity(int value, String name, String literal) {
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

} //FeedbackPolarity
