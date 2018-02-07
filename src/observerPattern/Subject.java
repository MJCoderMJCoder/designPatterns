/**
 * 
 */
package observerPattern;

import java.util.ArrayList;
import java.util.List;

import observerPattern.observer.Observer;

/**
 * 创建 Subject 类。
 *
 * 主题；科目；[语] 主语；国民 adj.
 * 
 * 服从的；易患…的；受制于…的
 * 
 * @author MJCoder
 *
 */
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;

	/**
	 * 
	 */
	public Subject() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	/**
	 * 使依附；贴上；系上；使依恋 vi. 附加；附属；伴随
	 * 
	 * @param observer
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
