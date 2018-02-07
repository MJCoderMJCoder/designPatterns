/**
 * 
 */
package observerPattern.observer;

import observerPattern.Subject;

/**
 * @author MJCoder
 *
 */
public abstract class Observer {
	protected Subject subject;

	/**
	 * 
	 */
	public Observer() {
		// TODO Auto-generated constructor stub
	}

	public abstract void update();

}
