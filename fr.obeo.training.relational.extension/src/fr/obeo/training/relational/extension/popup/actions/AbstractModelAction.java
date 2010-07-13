/**
 * 
 */
package fr.obeo.training.relational.extension.popup.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author glefur
 *
 */
public abstract class AbstractModelAction implements IObjectActionDelegate {

	protected Shell shell;
	private EditingDomain editingDomain;
	protected EObject selection;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction, org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		if (targetPart instanceof IEditingDomainProvider) 
			this.editingDomain = ((IEditingDomainProvider)targetPart).getEditingDomain();
	}

	/*
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			StructuredSelection sSelection = (StructuredSelection) selection;
			this.selection = (EObject) sSelection.getFirstElement();
		}
	}

	/**
	 * @return the editingDomain
	 */
	protected EditingDomain getEditingDomain() {
		return editingDomain;
	}
	
}
