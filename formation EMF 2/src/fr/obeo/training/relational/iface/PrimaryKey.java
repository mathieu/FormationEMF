/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.training.relational.iface;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.training.relational.iface.PrimaryKey#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.training.relational.RelationalPackage#getPrimaryKey()
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
	 * @see fr.obeo.training.relational.RelationalPackage#getPrimaryKey_Id()
	 * @model required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link fr.obeo.training.relational.iface.PrimaryKey#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

} // PrimaryKey
