/**
 */
package pt.isep.enorm.ref.sirius;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Refactoring Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pt.isep.enorm.ref.sirius.SiriusPackage#getRefactoringKind()
 * @model
 * @generated
 */
public enum RefactoringKind implements Enumerator {
	/**
	 * The '<em><b>RENAME ELEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENAME_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	RENAME_ELEMENT(0, "RENAME_ELEMENT", "RENAME_ELEMENT"),

	/**
	 * The '<em><b>MOVE ELEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MOVE_ELEMENT(1, "MOVE_ELEMENT", "MOVE_ELEMENT"),

	/**
	 * The '<em><b>SPLIT ELEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPLIT_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SPLIT_ELEMENT(2, "SPLIT_ELEMENT", "SPLIT_ELEMENT"),

	/**
	 * The '<em><b>MERGE ELEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGE_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MERGE_ELEMENT(3, "MERGE_ELEMENT", "MERGE_ELEMENT"),

	/**
	 * The '<em><b>CHANGE TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE_TYPE(4, "CHANGE_TYPE", "CHANGE_TYPE");

	/**
	 * The '<em><b>RENAME ELEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENAME_ELEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RENAME_ELEMENT_VALUE = 0;

	/**
	 * The '<em><b>MOVE ELEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_ELEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVE_ELEMENT_VALUE = 1;

	/**
	 * The '<em><b>SPLIT ELEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPLIT_ELEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPLIT_ELEMENT_VALUE = 2;

	/**
	 * The '<em><b>MERGE ELEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGE_ELEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MERGE_ELEMENT_VALUE = 3;

	/**
	 * The '<em><b>CHANGE TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_TYPE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Refactoring Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RefactoringKind[] VALUES_ARRAY = new RefactoringKind[] { RENAME_ELEMENT, MOVE_ELEMENT,
			SPLIT_ELEMENT, MERGE_ELEMENT, CHANGE_TYPE, };

	/**
	 * A public read-only list of all the '<em><b>Refactoring Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RefactoringKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Refactoring Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RefactoringKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RefactoringKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Refactoring Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RefactoringKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RefactoringKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Refactoring Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RefactoringKind get(int value) {
		switch (value) {
		case RENAME_ELEMENT_VALUE:
			return RENAME_ELEMENT;
		case MOVE_ELEMENT_VALUE:
			return MOVE_ELEMENT;
		case SPLIT_ELEMENT_VALUE:
			return SPLIT_ELEMENT;
		case MERGE_ELEMENT_VALUE:
			return MERGE_ELEMENT;
		case CHANGE_TYPE_VALUE:
			return CHANGE_TYPE;
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
	private RefactoringKind(int value, String name, String literal) {
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

} //RefactoringKind
