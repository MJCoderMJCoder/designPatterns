/**
 * 
 */
package behavioralPatterns.statePattern.state.impl;

import behavioralPatterns.statePattern.Context;
import behavioralPatterns.statePattern.state.State;

/**
 * 创建实现接口的实体类。(表示各种状态)
 * 
 * @author MJCoder
 *
 */
public class StopState implements State {

	/**
	 * 
	 */
	public StopState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Player is in stop state"); // 玩家处于停止状态
		context.setState(this);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Stop State";
	}

}
