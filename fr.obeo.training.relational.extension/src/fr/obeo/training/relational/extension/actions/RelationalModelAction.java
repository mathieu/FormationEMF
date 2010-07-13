package fr.obeo.training.relational.extension.actions;

import java.util.Collection;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import fr.obeo.training.relational.RelationalPackage;
import fr.obeo.training.relational.extension.core.DisplayModelSwitch;
import fr.obeo.training.relational.extension.core.RelationalModelHelper;
import fr.obeo.training.relational.extension.core.queries.RelationalModelRequestor;
import fr.obeo.training.relational.extension.core.queries.RelationalRequestProcessor;
import fr.obeo.training.relational.extension.core.queries.RequestCallback;
import fr.obeo.training.relational.iface.DataBase;

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class RelationalModelAction implements IWorkbenchWindowActionDelegate {
	
	private IWorkbenchWindow window;
	
	private RelationalModelHelper helper;
	
	private DisplayModelSwitch displaySwitch;

	private ResourceSet resourceSet;
	
	private RelationalRequestProcessor processor;
	/**
	 * The constructor.
	 */
	public RelationalModelAction() {
		this.resourceSet = new ResourceSetImpl();
		helper = new RelationalModelHelper(resourceSet);
		displaySwitch = new DisplayModelSwitch();
		RelationalModelRequestor requestor = new RelationalModelRequestor();
		processor = new RelationalRequestProcessor(requestor, new RequestCallback() {

			public void callback(String requestID, Object result) {
				if (result == null)
					System.out.println(requestID + " - No result");
				else if (result instanceof Collection<?>) {
					Collection<Object> results = (Collection<Object>) result;
					System.out.println(requestID + " - " + results.size() + " elements :");
					for (Object object : results) {
						System.out.println(" - " + object);
					}
				}
				else 
					System.out.println(requestID + " - 1 element : " + result);
			}
			
		});
		processor.register(RelationalPackage.eINSTANCE.getSchema(), RelationalModelRequestor.TABLES_WITH_MORE_THAN_FOUR_FIELDS);
		processor.register(RelationalPackage.eINSTANCE.getSchema(), RelationalModelRequestor.ALL_FK_WITH_TARGET_IN_OTHER_SCHEMA);
		processor.register(RelationalPackage.eINSTANCE.getDataBase(), RelationalModelRequestor.ALL_TABLES_IN_DATABASES);
		processor.register(EcorePackage.eINSTANCE.getEObject(), RelationalModelRequestor.HAS_NAME_BEGINNING_WITH_UPPERCASE);
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		DataBase relationalModel = helper.createModel();
		if (relationalModel != null) {
			System.out.println(displaySwitch.doSwitch(relationalModel));
			System.out.println("============================================= ");
			System.out.println("Evaluation des requetes : ");
			processor.process(relationalModel);
			helper.saveModel();
			
		} else {
			MessageDialog.openInformation(window.getShell(),"Relational Extension Plug-in","No model created !");
		}
	}

	/**
	 * Selection in the workbench has been changed. We 
	 * can change the state of the 'real' action here
	 * if we want, but this can only happen after 
	 * the delegate has been created.
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system
	 * resources we previously allocated.
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to
	 * be able to provide parent shell for the message dialog.
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}