/**
 * 
 */
package fr.obeo.training.relational.extension.core;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import fr.obeo.training.relational.Column;
import fr.obeo.training.relational.DataBase;
import fr.obeo.training.relational.ForeignKey;
import fr.obeo.training.relational.PrimaryKey;
import fr.obeo.training.relational.Schema;
import fr.obeo.training.relational.Table;

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
		//TODO: Defines the method body
		return model;
	}
	
	
	/**
	 * Save the current model.
	 * @param path the path where to save path.
	 */
	public void saveModel() {
		//TODO: Defines the method body
	}
	
}
