/**
 * 
 */
package mementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建CareTaker（看管者；看门人；守护者；看守员）类。
 * 
 * 管理或者是存储N中状态【管理备忘录的类】
 * 
 * @author MJCoder
 *
 */
public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();

	/**
	 * 
	 */
	public CareTaker() {
		// TODO Auto-generated constructor stub
	}

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}

}
