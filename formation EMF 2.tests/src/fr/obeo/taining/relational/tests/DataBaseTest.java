/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.taining.relational.tests;

import fr.obeo.taining.relational.RelationalFactory;

import fr.obeo.taining.relational.iface.DataBase;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataBaseTest extends TestCase {

	/**
	 * The fixture for this Data Base test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBase fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataBaseTest.class);
	}

	/**
	 * Constructs a new Data Base test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBaseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Data Base test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DataBase fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Data Base test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBase getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RelationalFactory.eINSTANCE.createDataBase());
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

} //DataBaseTest
