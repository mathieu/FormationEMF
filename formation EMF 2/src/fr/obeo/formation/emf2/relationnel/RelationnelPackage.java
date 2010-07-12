/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.obeo.formation.emf2.relationnel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.formation.emf2.relationnel.RelationnelFactory
 * @model kind="package"
 * @generated
 */
public interface RelationnelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relationnel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.marache.com/relationnel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relationnel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationnelPackage eINSTANCE = fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.obeo.formation.emf2.relationnel.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.formation.emf2.relationnel.impl.DatabaseImpl
	 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__SCHEMAS = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__URI = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PORT = 2;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.obeo.formation.emf2.relationnel.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.formation.emf2.relationnel.impl.SchemaImpl
	 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TABLES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 1;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.obeo.formation.emf2.relationnel.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.formation.emf2.relationnel.impl.TableImpl
	 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 2;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FIELDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.obeo.formation.emf2.relationnel.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.formation.emf2.relationnel.impl.FieldImpl
	 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.obeo.formation.emf2.relationnel.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.formation.emf2.relationnel.impl.PrimaryKeyImpl
	 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__ID = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.obeo.formation.emf2.relationnel.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.formation.emf2.relationnel.impl.ForeignKeyImpl
	 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFERENCE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.obeo.formation.emf2.relationnel.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.formation.emf2.relationnel.impl.ColumnImpl
	 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.obeo.formation.emf2.relationnel.iface.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.formation.emf2.relationnel.iface.Type
	 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 7;


	/**
	 * Returns the meta object for class '{@link fr.obeo.formation.emf2.relationnel.iface.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.formation.emf2.relationnel.iface.Database#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Database#getSchemas()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Schemas();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.formation.emf2.relationnel.iface.Database#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Database#getUri()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Uri();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.formation.emf2.relationnel.iface.Database#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Database#getPort()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Port();

	/**
	 * Returns the meta object for class '{@link fr.obeo.formation.emf2.relationnel.iface.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.formation.emf2.relationnel.iface.Schema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Schema#getTables()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Tables();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.formation.emf2.relationnel.iface.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for class '{@link fr.obeo.formation.emf2.relationnel.iface.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.formation.emf2.relationnel.iface.Table#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Table#getFields()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Fields();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.formation.emf2.relationnel.iface.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for class '{@link fr.obeo.formation.emf2.relationnel.iface.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.formation.emf2.relationnel.iface.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for class '{@link fr.obeo.formation.emf2.relationnel.iface.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.formation.emf2.relationnel.iface.PrimaryKey#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.PrimaryKey#getId()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_Id();

	/**
	 * Returns the meta object for class '{@link fr.obeo.formation.emf2.relationnel.iface.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.formation.emf2.relationnel.iface.ForeignKey#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.ForeignKey#getReference()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Reference();

	/**
	 * Returns the meta object for class '{@link fr.obeo.formation.emf2.relationnel.iface.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.formation.emf2.relationnel.iface.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.formation.emf2.relationnel.iface.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see fr.obeo.formation.emf2.relationnel.iface.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelationnelFactory getRelationnelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.obeo.formation.emf2.relationnel.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.formation.emf2.relationnel.impl.DatabaseImpl
		 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__SCHEMAS = eINSTANCE.getDatabase_Schemas();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__URI = eINSTANCE.getDatabase_Uri();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__PORT = eINSTANCE.getDatabase_Port();

		/**
		 * The meta object literal for the '{@link fr.obeo.formation.emf2.relationnel.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.formation.emf2.relationnel.impl.SchemaImpl
		 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__TABLES = eINSTANCE.getSchema_Tables();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '{@link fr.obeo.formation.emf2.relationnel.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.formation.emf2.relationnel.impl.TableImpl
		 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FIELDS = eINSTANCE.getTable_Fields();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '{@link fr.obeo.formation.emf2.relationnel.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.formation.emf2.relationnel.impl.FieldImpl
		 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '{@link fr.obeo.formation.emf2.relationnel.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.formation.emf2.relationnel.impl.PrimaryKeyImpl
		 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__ID = eINSTANCE.getPrimaryKey_Id();

		/**
		 * The meta object literal for the '{@link fr.obeo.formation.emf2.relationnel.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.formation.emf2.relationnel.impl.ForeignKeyImpl
		 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REFERENCE = eINSTANCE.getForeignKey_Reference();

		/**
		 * The meta object literal for the '{@link fr.obeo.formation.emf2.relationnel.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.formation.emf2.relationnel.impl.ColumnImpl
		 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '{@link fr.obeo.formation.emf2.relationnel.iface.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.formation.emf2.relationnel.iface.Type
		 * @see fr.obeo.formation.emf2.relationnel.impl.RelationnelPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //RelationnelPackage
