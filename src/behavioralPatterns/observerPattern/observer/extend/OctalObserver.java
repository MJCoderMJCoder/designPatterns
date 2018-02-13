/**
 * 
 */
package behavioralPatterns.observerPattern.observer.extend;

import behavioralPatterns.observerPattern.Subject;
import behavioralPatterns.observerPattern.observer.Observer;

/**
 * 创建实体观察者类。
 * 
 * @author MJCoder
 *
 */
public class OctalObserver extends Observer {

	/**
	 * 
	 */
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see observerPattern.observer.Observer#update()
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}

}
