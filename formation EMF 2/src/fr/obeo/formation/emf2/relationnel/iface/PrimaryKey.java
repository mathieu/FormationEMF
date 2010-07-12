/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.formation.emf2.relationnel.iface;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.formation.emf2.relationnel.iface.PrimaryKey#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.formation.emf2.relationnel.RelationnelPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends Field {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see fr.obeo.formation.emf2.relationnel.RelationnelPackage#getPrimaryKey_Id()
	 * @model required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link fr.obeo.formation.emf2.relationnel.iface.PrimaryKey#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

} // PrimaryKey
