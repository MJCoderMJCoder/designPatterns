/**
 * 
 */
package behavioralPatterns.mementoPattern;

/**
 * 创建 Originator（发起人；起源； 始发站）类。
 * 
 * @author MJCoder
 *
 */
public class Originator {
	private String state;

	/**
	 * 
	 */
	public Originator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 保存状态
	 * 
	 * @return
	 */
	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	/**
	 * 获取状态
	 * 
	 * @param Memento
	 */
	public void getStateFromMemento(Memento Memento) {
		state = Memento.getState();
	}

}
