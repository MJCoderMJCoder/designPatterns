/**
 * 
 */
package strategyPattern.strategy.impl;

import strategyPattern.strategy.Strategy;

/**
 * 创建实现接口的实体类。
 * 
 * add：地址 添加 增加
 * 
 * @author MJCoder
 */
public class OperationAdd implements Strategy {

	/**
	 * 
	 */
	public OperationAdd() {
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
		return num1 + num2;
	}

}
