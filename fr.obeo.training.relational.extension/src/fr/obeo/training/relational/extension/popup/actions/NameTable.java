package fr.obeo.training.relational.extension.popup.actions;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.ui.IActionDelegate;

import fr.obeo.training.relational.RelationalPackage;
import fr.obeo.training.relational.iface.Table;

public class NameTable extends AbstractModelAction {

	/**
	 * 
	 */
	public NameTable() {
		super();
	}
	
	public Table getSelectedTable() {
		return (Table)selection;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		InputDialog dialog = new InputDialog(shell, "Table naming", "Defines the new name of the table : ", getSelectedTable().getName(), null);
		dialog.open();
		String value = dialog.getValue();
		SetCommand cmd = new SetCommand(getEditingDomain(), getSelectedTable(), RelationalPackage.eINSTANCE.getTable_Name(), value);
		getEditingDomain().getCommandStack().execute(cmd);
	}

}
