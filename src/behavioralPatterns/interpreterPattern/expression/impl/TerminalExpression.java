/**
 * 
 */
package behavioralPatterns.interpreterPattern.expression.impl;

import behavioralPatterns.interpreterPattern.expression.Expression;

/**
 * 创建实现了Expression接口的实体类。
 * 
 * Terminal：末端；终点；终端机
 * 
 * @author MJCoder
 *
 */
public class TerminalExpression implements Expression {
	private String data;

	/**
	 * @param data
	 */
	public TerminalExpression(String data) {
		this.data = data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interpreterPattern.expression.Expression#interpret(java.lang.String)
	 */
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		if (context.contains(data)) {
			return true;
		}
		return false;
	}

}
