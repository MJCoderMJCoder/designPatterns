/**
 * 
 */
package behavioralPatterns.strategyPattern;

import behavioralPatterns.strategyPattern.strategy.impl.OperationAdd;
import behavioralPatterns.strategyPattern.strategy.impl.OperationMultiply;
import behavioralPatterns.strategyPattern.strategy.impl.OperationSubtract;

/**
 * 使用 Context 来查看当它改变策略 Strategy 时的行为变化。
 * 
 * @author MJCoder
 *
 */
public class StrategyPatternDemo {

	/**
	 * 
	 */
	public StrategyPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubtract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
