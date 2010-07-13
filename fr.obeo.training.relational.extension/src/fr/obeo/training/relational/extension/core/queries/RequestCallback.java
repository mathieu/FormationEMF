/**
 * 
 */
package fr.obeo.training.relational.extension.core.queries;

/**
 * @author glefur
 *
 */
public interface RequestCallback {

	/**
	 * A call back to perform after request evaluation
	 * @param resquestID the performed request
	 * @param result the result of the request
	 */
	public void callback(String requestID, Object result);
	
}
