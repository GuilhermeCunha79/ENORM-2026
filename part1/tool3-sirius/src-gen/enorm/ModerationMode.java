/**
 */
package enorm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Moderation Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see enorm.EnormPackage#getModerationMode()
 * @model
 * @generated
 */
public enum ModerationMode implements Enumerator {
	/**
	 * The '<em><b>AUTOMATIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOMATIC(0, "AUTOMATIC", "AUTOMATIC"),

	/**
	 * The '<em><b>MANUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL(1, "MANUAL", "MANUAL"),

	/**
	 * The '<em><b>HYBRID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYBRID_VALUE
	 * @generated
	 * @ordered
	 */
	HYBRID(2, "HYBRID", "HYBRID");

	/**
	 * The '<em><b>AUTOMATIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTOMATIC_VALUE = 0;

	/**
	 * The '<em><b>MANUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_VALUE = 1;

	/**
	 * The '<em><b>HYBRID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYBRID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HYBRID_VALUE = 2;

	/**
	 * An array of all the '<em><b>Moderation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModerationMode[] VALUES_ARRAY = new ModerationMode[] { AUTOMATIC, MANUAL, HYBRID, };

	/**
	 * A public read-only list of all the '<em><b>Moderation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModerationMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Moderation Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModerationMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModerationMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Moderation Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModerationMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModerationMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Moderation Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModerationMode get(int value) {
		switch (value) {
		case AUTOMATIC_VALUE:
			return AUTOMATIC;
		case MANUAL_VALUE:
			return MANUAL;
		case HYBRID_VALUE:
			return HYBRID;
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
	private ModerationMode(int value, String name, String literal) {
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

} //ModerationMode
