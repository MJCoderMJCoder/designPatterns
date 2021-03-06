/**
 * 
 */
package behavioralPatterns.interpreterPattern.expression.impl;

import behavioralPatterns.interpreterPattern.expression.Expression;

/**
 * @author MJCoder
 *
 */
public class AndExpression implements Expression {
	private Expression expr1 = null;
	private Expression expr2 = null;

	/**
	 * @param expr1
	 * @param expr2
	 */
	public AndExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interpreterPattern.expression.Expression#interpret(java.lang.String)
	 */
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return expr1.interpret(context) && expr2.interpret(context);
	}

}
