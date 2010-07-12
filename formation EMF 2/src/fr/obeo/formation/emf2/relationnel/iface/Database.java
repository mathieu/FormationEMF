/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.formation.emf2.relationnel.iface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.formation.emf2.relationnel.iface.Database#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link fr.obeo.formation.emf2.relationnel.iface.Database#getUri <em>Uri</em>}</li>
 *   <li>{@link fr.obeo.formation.emf2.relationnel.iface.Database#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.formation.emf2.relationnel.RelationnelPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.formation.emf2.relationnel.iface.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' containment reference list.
	 * @see fr.obeo.formation.emf2.relationnel.RelationnelPackage#getDatabase_Schemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchemas();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see fr.obeo.formation.emf2.relationnel.RelationnelPackage#getDatabase_Uri()
	 * @model default="" required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link fr.obeo.formation.emf2.relationnel.iface.Database#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see fr.obeo.formation.emf2.relationnel.RelationnelPackage#getDatabase_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link fr.obeo.formation.emf2.relationnel.iface.Database#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

} // Database
