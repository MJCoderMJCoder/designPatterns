/**
 * 
 */
package observerPattern;

import observerPattern.observer.sub.BinaryObserver;
import observerPattern.observer.sub.HexaObserver;
import observerPattern.observer.sub.OctalObserver;

/**
 * 使用 Subject 和实体观察者对象。
 * 
 * @author MJCoder
 *
 */
public class ObserverPatternDemo {

	/**
	 * 
	 */
	public ObserverPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println();
		System.out.println("Second state change: 10");
		subject.setState(10);
	}

}
