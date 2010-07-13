/**
 * 
 */
package fr.obeo.training.relational.extension.core.queries;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.query.statements.FROM;

import fr.obeo.training.relational.RelationalFactory;
import fr.obeo.training.relational.RelationalPackage;
import fr.obeo.training.relational.iface.*;

/**
 * @author glefur
 *
 */
public class RelationalModelRequestor {
	
	public final static String TABLES_WITH_MORE_THAN_FOUR_FIELDS = "Tables with more than four fields";
	
	public final static String ALL_TABLES_IN_DATABASES = "All tables in Database";
	
	public final static String ALL_FK_WITH_TARGET_IN_OTHER_SCHEMA = "All foreign keys with target in other schema";
	
	public final static String HAS_NAME_BEGINNING_WITH_UPPERCASE = "Has name beginning with uppercase";
	
	/**
	 * @param request the request to perform
	 * @param input the objet where to perform the request
	 * @return the result of the result.
	 */
	public Object evaluate(String request, EObject input) {
		if (TABLES_WITH_MORE_THAN_FOUR_FIELDS.equals(request))  {
			if (input instanceof Schema)
				return tablesWithMoreThanFourFields((Schema) input); 
		} else  if (ALL_TABLES_IN_DATABASES.equals(request)) {
			if (input instanceof DataBase)
				return allTablesInDatabases((DataBase) input);
		} else  if (ALL_FK_WITH_TARGET_IN_OTHER_SCHEMA.equals(request)) {
			if (input instanceof Schema)
				return allForeignKeysWithTargetInOtherSchemas((Schema) input);
		} else  if (HAS_NAME_BEGINNING_WITH_UPPERCASE.equals(request)) {
			return hasNameBegginingWithUppercase(input);
		} 
		return null;
	}
	
	/**
	 * @param schema where to search invalid table
	 * @return a list of {@link Table} with more than 4 fields
	 */
	public List<Table> tablesWithMoreThanFourFields(Schema schema) {
		List<Table> list = new ArrayList<Table>();
		
		for (Table table : schema.getTables()) {
			if (table.eContents().size() > 4)
				list.add(table);
		}
		
		return list;
	}

	
	/**
	 * @param database where to list the tables
	 * @return a list with all the {@link Table} of the database
	 */
	public List<Table> allTablesInDatabases(DataBase database) {
		List<Table> list = new ArrayList<Table>();
		
		TreeIterator<EObject> ti = database.eAllContents();
		while (ti.hasNext()) {
			EObject eObject = (EObject) ti.next();
			if (eObject.eClass().equals(RelationalPackage.eINSTANCE.getTable()))
				list.add((Table)eObject);
		}
		
		return list;
	}
	
	
	/**
	 * @param schema where to search the foreignKey
	 * @return a list of {@link ForeignKey} which target table is in another schema
	 */
	public List<ForeignKey> allForeignKeysWithTargetInOtherSchemas(Schema schema) {
		// TODO: use eContainer() service to implement this request
		List<ForeignKey> list = new ArrayList<ForeignKey>();
		
		TreeIterator<EObject> ti = schema.eAllContents();
		while (ti.hasNext()) {
			EObject eObject = (EObject) ti.next();
			if (eObject.eClass().equals(RelationalPackage.eINSTANCE.getForeignKey()))
			{
				ForeignKey fk = (ForeignKey)eObject;
			
				if (!fk.getReference().eContainer().equals(schema))
					list.add(fk);
			}
		}
		
		return list;	
	}
	
	/**
	 * @param element the element to analyze
	 * @return <code>true</code> when the given object has a name attribute and if the value of this attribute starts with an UpperCase.
	 */
	public EObject hasNameBegginingWithUppercase(EObject element) {
		// TODO: use eGet() service to implement this request
		EStructuralFeature sf = element.eClass().getEStructuralFeature("name");
		if (sf != null)
			return Character.isUpperCase(element.eGet(sf).toString().charAt(0))? element : null;
		return null;
	}
}
