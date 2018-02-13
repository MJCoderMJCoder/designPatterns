/**
 * 
 */
package behavioralPatterns.strategyPattern;

import behavioralPatterns.strategyPattern.strategy.Strategy;

/**
 * 创建 Context 类。
 * 
 * @author MJCoder
 *
 */
public class Context {
	private Strategy strategy;

	/**
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}

}
