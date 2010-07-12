/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.formation.emf2.relationnel.impl;

import fr.obeo.formation.emf2.relationnel.RelationnelPackage;

import fr.obeo.formation.emf2.relationnel.iface.ForeignKey;
import fr.obeo.formation.emf2.relationnel.iface.Table;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.formation.emf2.relationnel.impl.ForeignKeyImpl#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyImpl extends FieldImpl implements ForeignKey {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Table reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationnelPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (Table)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationnelPackage.FOREIGN_KEY__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Table newReference) {
		Table oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationnelPackage.FOREIGN_KEY__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationnelPackage.FOREIGN_KEY__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RelationnelPackage.FOREIGN_KEY__REFERENCE:
				setReference((Table)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RelationnelPackage.FOREIGN_KEY__REFERENCE:
				setReference((Table)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RelationnelPackage.FOREIGN_KEY__REFERENCE:
				return reference != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyImpl
