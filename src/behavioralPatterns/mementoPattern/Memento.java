/**
 * 
 */
package behavioralPatterns.mementoPattern;

/**
 * 创建 Memento（纪念品，引起回忆的东西，备忘录）类。
 * 
 * @author MJCoder
 *
 */
public class Memento {
	private String state;

	/**
	 * @param state
	 */
	public Memento(String state) {
		this.state = state;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

}
