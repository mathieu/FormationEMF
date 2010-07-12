/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.formation.emf2.relationnel.iface;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.formation.emf2.relationnel.iface.Column#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.formation.emf2.relationnel.RelationnelPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends Field {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.formation.emf2.relationnel.iface.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Type
	 * @see #setType(Type)
	 * @see fr.obeo.formation.emf2.relationnel.RelationnelPackage#getColumn_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link fr.obeo.formation.emf2.relationnel.iface.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Column
