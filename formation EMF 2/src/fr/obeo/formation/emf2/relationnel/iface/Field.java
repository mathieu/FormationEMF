/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.formation.emf2.relationnel.iface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.formation.emf2.relationnel.iface.Field#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.formation.emf2.relationnel.RelationnelPackage#getField()
 * @model abstract="true"
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.obeo.formation.emf2.relationnel.RelationnelPackage#getField_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.obeo.formation.emf2.relationnel.iface.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Field
