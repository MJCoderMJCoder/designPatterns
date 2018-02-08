/**
 * 
 */
package statePattern;

import statePattern.state.impl.StartState;
import statePattern.state.impl.StopState;

/**
 * 使用 Context 来查看当状态 State 改变时的行为变化。
 * 
 * @author MJCoder
 *
 */
public class StatePatternDemo {

	/**
	 * 
	 */
	public StatePatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}

}
