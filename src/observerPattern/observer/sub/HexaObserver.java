/**
 * 
 */
package observerPattern.observer.sub;

import observerPattern.Subject;
import observerPattern.observer.Observer;

/**
 * 创建实体观察者类。
 * 
 * @author MJCoder
 *
 */
public class HexaObserver extends Observer {

	/**
	 * 
	 */
	public HexaObserver(Subject subject) {
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
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
	}

}
