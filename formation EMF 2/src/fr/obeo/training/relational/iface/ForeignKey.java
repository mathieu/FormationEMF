/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.training.relational.iface;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.training.relational.iface.ForeignKey#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.training.relational.RelationalPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends Field {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Table)
	 * @see fr.obeo.training.relational.RelationalPackage#getForeignKey_Reference()
	 * @model required="true"
	 * @generated
	 */
	Table getReference();

	/**
	 * Sets the value of the '{@link fr.obeo.training.relational.iface.ForeignKey#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Table value);

} // ForeignKey
