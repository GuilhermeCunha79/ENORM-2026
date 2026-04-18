/**
 */
package pt.isep.enorm.ref.ref;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>User Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pt.isep.enorm.ref.ref.RefPackage#getUserKind()
 * @model
 * @generated
 */
public enum UserKind implements Enumerator {
	/**
	 * The '<em><b>GENERIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC(0, "GENERIC", "GENERIC"),

	/**
	 * The '<em><b>BUYER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUYER_VALUE
	 * @generated
	 * @ordered
	 */
	BUYER(1, "BUYER", "BUYER"),

	/**
	 * The '<em><b>SELLER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELLER_VALUE
	 * @generated
	 * @ordered
	 */
	SELLER(2, "SELLER", "SELLER"),

	/**
	 * The '<em><b>CREATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATOR_VALUE
	 * @generated
	 * @ordered
	 */
	CREATOR(3, "CREATOR", "CREATOR"),

	/**
	 * The '<em><b>MODERATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	MODERATOR(4, "MODERATOR", "MODERATOR");

	/**
	 * The '<em><b>GENERIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_VALUE = 0;

	/**
	 * The '<em><b>BUYER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUYER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUYER_VALUE = 1;

	/**
	 * The '<em><b>SELLER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELLER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELLER_VALUE = 2;

	/**
	 * The '<em><b>CREATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREATOR_VALUE = 3;

	/**
	 * The '<em><b>MODERATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODERATOR_VALUE = 4;

	/**
	 * An array of all the '<em><b>User Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UserKind[] VALUES_ARRAY = new UserKind[] { GENERIC, BUYER, SELLER, CREATOR, MODERATOR, };

	/**
	 * A public read-only list of all the '<em><b>User Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UserKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>User Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserKind get(int value) {
		switch (value) {
		case GENERIC_VALUE:
			return GENERIC;
		case BUYER_VALUE:
			return BUYER;
		case SELLER_VALUE:
			return SELLER;
		case CREATOR_VALUE:
			return CREATOR;
		case MODERATOR_VALUE:
			return MODERATOR;
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
	private UserKind(int value, String name, String literal) {
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

} //UserKind
