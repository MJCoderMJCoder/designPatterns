/**
 * 
 */
package behavioralPatterns.strategyPattern.strategy.impl;

import behavioralPatterns.strategyPattern.strategy.Strategy;

/**
 * 创建实现接口的实体类。
 * 
 * Multiply：乘；繁殖；增加；多样；复合地；多层的；正片叠底
 * 
 * @author MJCoder
 *
 */
public class OperationMultiply implements Strategy {

	/**
	 * 
	 */
	public OperationMultiply() {
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
		return num1 * num2;
	}

}
