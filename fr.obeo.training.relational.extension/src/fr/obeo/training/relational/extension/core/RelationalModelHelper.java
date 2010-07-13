/**
 * 
 */
package fr.obeo.training.relational.extension.core;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import fr.obeo.training.relational.RelationalFactory;
import fr.obeo.training.relational.RelationalPackage;
import fr.obeo.training.relational.iface.Column;
import fr.obeo.training.relational.iface.DataBase;
import fr.obeo.training.relational.iface.Field;
import fr.obeo.training.relational.iface.ForeignKey;
import fr.obeo.training.relational.iface.PrimaryKey;
import fr.obeo.training.relational.iface.Schema;
import fr.obeo.training.relational.iface.Table;
import fr.obeo.training.relational.iface.Type;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class RelationalModelHelper {
	
	private ResourceSet resourceSet;
	
	private DataBase model;	
	
	/**
	 * Default constructor
	 *  
	 */
	public RelationalModelHelper(ResourceSet resourceSet) {
		super();
		model = null;
		this.resourceSet = resourceSet;
	}

	/**
	 * Create a Relational model
	 * @return the root Element : {@link DataBase}.
	 */
	public DataBase createModel() {
		RelationalFactory factory = RelationalFactory.eINSTANCE;
		
		model = factory.createDataBase();
		model.setUri("http://www.obeo.fr/training/relational");
		model.setPort(3000);
		
		Schema schema2 = factory.createSchema();
		schema2.setName("Schema2");
		model.getSchemas().add(schema2);
		
		Table table3 = factory.createTable();
		table3.setName("Table3");
		schema2.getTables().add(table3);
		
		PrimaryKey pk = factory.createPrimaryKey();
		pk.setName("PK3");
		table3.getFields().add(pk);
		
		
		
		Schema schema1 = factory.createSchema();
		schema1.setName("Schema1");
		model.getSchemas().add(schema1);

		Table table2 = factory.createTable();
		table2.setName("Table2");
		schema1.getTables().add(table2);
		
		Field field = factory.createPrimaryKey();
		field.setName("PK2");
		table2.getFields().add(field);
		
		Table table1 = factory.createTable();
		table1.setName("Table1");
		schema1.getTables().add(table1);
		
		field = factory.createPrimaryKey();
		field.setName("PK1");
		table1.getFields().add(field);
		
		Column column = factory.createColumn();
		column.setName("col1");
		column.setType(Type.VARCHAR);
		table1.getFields().add(column);
		
		column = factory.createColumn();
		column.setName("col2");
		column.setType(Type.VARCHAR);
		table1.getFields().add(column);
		
		column = factory.createColumn();
		column.setName("col3");
		column.setType(Type.VARCHAR);
		table1.getFields().add(column);
		
		ForeignKey fk = factory.createForeignKey();
		fk.setName("col4");
		fk.setReference(table3);
		table1.getFields().add(fk);

		return model;
	}
	
	
	/**
	 * Save the current model.
	 * @param path the path where to save path.
	 */
	public void saveModel() {
		DirectoryDialog fd = new DirectoryDialog(new Shell());
		String path = fd.open();
		URI fileURI = URI.createFileURI(path+"/relational.xmi");
		Resource resource = resourceSet.createResource(fileURI);
		resource.getContents().add(model);
		try {
			resource.save(null);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
