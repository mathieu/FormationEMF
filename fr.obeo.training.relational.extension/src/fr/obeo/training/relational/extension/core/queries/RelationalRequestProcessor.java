/**
 * 
 */
package fr.obeo.training.relational.extension.core.queries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @author glefur
 *
 */
public class RelationalRequestProcessor {
	
	private Map<String, EClass> requests;
	private RelationalModelRequestor requestor;
	private RequestCallback callback;

	/**
	 * 
	 */
	public RelationalRequestProcessor(RelationalModelRequestor requestor, RequestCallback callback) {
		requests = new HashMap<String, EClass>(10);
		this.requestor = requestor;
		this.callback = callback;
	}
	
	/**
	 * @param elementType the element type for the request
	 * @param requestID the ID of the request
	 */
	public void register(EClass elementType, String requestID) {
		requests.put(requestID, elementType);
	}
	
	
	/**
	 * @return all the registered requests
	 */
	public List<String> getRegisteredQueries() {
		List<String> result = new ArrayList<String>(requests.size());
		for (Iterator<String> iterator = requests.keySet().iterator(); iterator.hasNext();) {
			result.add(iterator.next());
		}
		return result;
	}
	
	/**
	 * Perform all the registered request on the given model element
	 * @param model the model element to perform
	 */
	public void process(EObject model) {
		processForOneElement(model);
		for (Iterator<EObject> iterator = model.eAllContents(); iterator.hasNext();) {
			EObject next = (EObject) iterator.next();
			processForOneElement(next);
		}
	}

	private void processForOneElement(EObject next) {
		List<String> allRequestsForType = allRequestsForType(next);
		for (String requestID : allRequestsForType) {
			Object result = requestor.evaluate(requestID, next);
			if (callback != null && result != null)
				callback.callback(requestID, result);
		}
	}
	
	/**
	 * Perform all the registered request on the given model element
	 * @param model the model element to perform
	 * @param requestID the ID of the request to perform
	 */
	public void process(EObject model, String requestID) {
		Object result = requestor.evaluate(requestID, model);
		if (callback != null && result != null)
			callback.callback(requestID, result);
	}
	
	/**
	 * @param elem the element onto perform requests
	 * @return all the requests id corresponding to the given element
	 */
	private List<String> allRequestsForType(EObject elem) {
		List<String> result = new ArrayList<String>(requests.size());
		// EClass type = elem.eClass();
		for (Iterator<String> iterator = requests.keySet().iterator(); iterator.hasNext();) {
			String requestID = iterator.next();
			if (requests.get(requestID).isInstance(elem))
				result.add(requestID);
		}
		return result;
	}

}
