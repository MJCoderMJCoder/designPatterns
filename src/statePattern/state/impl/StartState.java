/**
 * 
 */
package statePattern.state.impl;

import statePattern.Context;
import statePattern.state.State;

/**
 * 创建实现接口的实体类。(表示各种状态)
 * 
 * @author MJCoder
 *
 */
public class StartState implements State {

	/**
	 * 
	 */
	public StartState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Player is in start state"); // 玩家在开始状态
		context.setState(this);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Start State";
	}

}
