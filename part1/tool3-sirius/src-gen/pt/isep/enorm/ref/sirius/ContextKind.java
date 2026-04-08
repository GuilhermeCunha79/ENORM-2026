/**
 */
package pt.isep.enorm.ref.sirius;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Context Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getContextKind()
 * @model
 * @generated
 */
public enum ContextKind implements Enumerator {
	/**
	 * The '<em><b>GLOBAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOBAL_VALUE
	 * @generated
	 * @ordered
	 */
	GLOBAL(0, "GLOBAL", "GLOBAL"),

	/**
	 * The '<em><b>COMMUNITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNITY_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNITY(1, "COMMUNITY", "COMMUNITY"),

	/**
	 * The '<em><b>CHANNEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	CHANNEL(2, "CHANNEL", "CHANNEL"),

	/**
	 * The '<em><b>CATALOG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATALOG_VALUE
	 * @generated
	 * @ordered
	 */
	CATALOG(3, "CATALOG", "CATALOG");

	/**
	 * The '<em><b>GLOBAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOBAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GLOBAL_VALUE = 0;

	/**
	 * The '<em><b>COMMUNITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNITY_VALUE = 1;

	/**
	 * The '<em><b>CHANNEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHANNEL_VALUE = 2;

	/**
	 * The '<em><b>CATALOG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATALOG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CATALOG_VALUE = 3;

	/**
	 * An array of all the '<em><b>Context Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContextKind[] VALUES_ARRAY = new ContextKind[] { GLOBAL, COMMUNITY, CHANNEL, CATALOG, };

	/**
	 * A public read-only list of all the '<em><b>Context Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContextKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Context Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContextKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContextKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Context Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContextKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContextKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Context Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContextKind get(int value) {
		switch (value) {
		case GLOBAL_VALUE:
			return GLOBAL;
		case COMMUNITY_VALUE:
			return COMMUNITY;
		case CHANNEL_VALUE:
			return CHANNEL;
		case CATALOG_VALUE:
			return CATALOG;
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
	private ContextKind(int value, String name, String literal) {
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

} //ContextKind
