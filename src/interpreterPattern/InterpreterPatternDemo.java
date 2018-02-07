/**
 * 
 */
package interpreterPattern;

import interpreterPattern.expression.Expression;
import interpreterPattern.expression.impl.AndExpression;
import interpreterPattern.expression.impl.OrExpression;
import interpreterPattern.expression.impl.TerminalExpression;

/**
 * 使用 Expression 类来创建规则，并解析它们。
 * 
 * @author MJCoder
 *
 */
public class InterpreterPatternDemo {

	/**
	 * 
	 */
	public InterpreterPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 规则：Robert 和 John 是男性
	 * 
	 * @return
	 */
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	/**
	 * 规则：Julie 是一个已婚的女性
	 * 
	 * @return
	 */
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
	}

}
