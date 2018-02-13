/**
 * 
 */
package behavioralPatterns.strategyPattern.strategy.impl;

import behavioralPatterns.strategyPattern.strategy.Strategy;

/**
 * 创建实现接口的实体类。
 * 
 * Subtract：扣掉；减去；差集
 * 
 * @author MJCoder
 *
 */
public class OperationSubtract implements Strategy {

	/**
	 * 
	 */
	public OperationSubtract() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see strategyPattern.strategy.Strategy#doOperation(int, int)
	 */
	@Override
	public int doOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

}
