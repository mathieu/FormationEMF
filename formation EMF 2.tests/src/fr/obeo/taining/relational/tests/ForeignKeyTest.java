/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.taining.relational.tests;

import fr.obeo.taining.relational.RelationalFactory;

import fr.obeo.taining.relational.iface.ForeignKey;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForeignKeyTest extends FieldTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ForeignKeyTest.class);
	}

	/**
	 * Constructs a new Foreign Key test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Foreign Key test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ForeignKey getFixture() {
		return (ForeignKey)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RelationalFactory.eINSTANCE.createForeignKey());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ForeignKeyTest
