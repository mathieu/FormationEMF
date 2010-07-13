package fr.obeo.training.relational.extension.ui.views;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import fr.obeo.training.relational.RelationalPackage;
import fr.obeo.training.relational.extension.core.RelationalModelHelper;
import fr.obeo.training.relational.extension.core.queries.RelationalModelRequestor;
import fr.obeo.training.relational.extension.core.queries.RelationalRequestProcessor;
import fr.obeo.training.relational.extension.core.queries.RequestCallback;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class RelationalQueriesView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "fr.obeo.training.relational.extension.ui.views.RelationalQueriesView";

	private ComboViewer queryCombo;
	private TreeViewer modelViewer;
	private TableViewer resultViewer;
	
	private RelationalModelHelper helper;
	private ResourceSet resourceSet;
	private RelationalRequestProcessor processor;

	/**
	 * The constructor.
	 */
	public RelationalQueriesView() {
		this.resourceSet = new ResourceSetImpl();
		helper = new RelationalModelHelper(resourceSet);
		RelationalModelRequestor requestor = new RelationalModelRequestor();
		processor = new RelationalRequestProcessor(requestor, new RequestCallback() {

			public void callback(String requestID, Object result) {
				resultViewer.setInput(result);
			}
			
		});
		processor.register(RelationalPackage.eINSTANCE.getSchema(), RelationalModelRequestor.TABLES_WITH_MORE_THAN_FOUR_FIELDS);
		processor.register(RelationalPackage.eINSTANCE.getSchema(), RelationalModelRequestor.ALL_FK_WITH_TARGET_IN_OTHER_SCHEMA);
		processor.register(RelationalPackage.eINSTANCE.getDataBase(), RelationalModelRequestor.ALL_TABLES_IN_DATABASES);
		processor.register(EcorePackage.eINSTANCE.getEObject(), RelationalModelRequestor.HAS_NAME_BEGINNING_WITH_UPPERCASE);
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, true);
		container.setLayout(layout);
		createQueryCombo(container);
		createModelViewer(container);
		createResultViewer(container);

		initQuerySynchronizer();
	}

	private IBaseLabelProvider getLabelProvider() {
		// TODO: Defines a labelProvider for view's widgets
		return null;
	}

	private IContentProvider getContentProvider() {
		// TODO: Defines a contentProvider for view's widgets
		return null;
	}

	private void initQuerySynchronizer() {
		ISelectionChangedListener querySynchronizer = new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				Object modelSelection = extractSelection(modelViewer.getSelection());
				Object querySelection = extractSelection(queryCombo.getSelection());
				if (modelSelection instanceof EObject && querySelection instanceof String) {
					processor.process((EObject)modelSelection, (String) querySelection);
				}
			}
			
		};
		modelViewer.addSelectionChangedListener(querySynchronizer);
		queryCombo.addSelectionChangedListener(querySynchronizer);
	}
	
	private void createResultViewer(Composite container) {
		resultViewer = new TableViewer(container, SWT.BORDER | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData resultViewerData = new GridData(GridData.FILL_BOTH);
		resultViewer.getTable().setLayoutData(resultViewerData);
		resultViewer.setContentProvider(getContentProvider());
		resultViewer.setLabelProvider(getLabelProvider());
	}

	private void createModelViewer(Composite container) {
		modelViewer = new TreeViewer(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData modelViewerData = new GridData(GridData.FILL_BOTH);
		modelViewer.getTree().setLayoutData(modelViewerData);
		modelViewer.setContentProvider(getContentProvider());
		modelViewer.setLabelProvider(getLabelProvider());
		Resource resource = new ResourceImpl();
		resource.getContents().add(helper.createModel());
		modelViewer.setInput(resource);
	}

	private void createQueryCombo(Composite container) {
		queryCombo = new ComboViewer(container);
		GridData data= new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 2;
		queryCombo.getCombo().setLayoutData(data);
		queryCombo.setContentProvider(new ArrayContentProvider());
		queryCombo.setInput(processor.getRegisteredQueries());
	}

	
	
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		resultViewer.getControl().setFocus();
	}
	
	/**
	 * @param selection
	 * @return
	 */
	private Object extractSelection(ISelection selection) {
		if (selection instanceof StructuredSelection) {
			StructuredSelection sSelection = (StructuredSelection)selection;
			return sSelection.getFirstElement();
		}
		return null;
	}
}