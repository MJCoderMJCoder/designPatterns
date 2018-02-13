/**
 * 
 */
package behavioralPatterns.statePattern;

import behavioralPatterns.statePattern.state.State;

/**
 * 创建 Context 类。
 * 
 * @author MJCoder
 *
 */
public class Context {
	private State state;

	/**
	 * 
	 */
	public Context() {
		// TODO Auto-generated constructor stub
		state = null;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

}
