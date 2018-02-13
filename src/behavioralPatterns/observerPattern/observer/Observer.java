/**
 * 
 */
package behavioralPatterns.observerPattern.observer;

import behavioralPatterns.observerPattern.Subject;

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
