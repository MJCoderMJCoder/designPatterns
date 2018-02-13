/**
 * 
 */
package behavioralPatterns.interpreterPattern.expression;

/**
 * 提供了评估语言的语法或表达式的方式。
 *
 * 创建一个表达式接口。
 * 
 * context： 环境；上下文；来龙去脉；语境
 * 
 * @author MJCoder
 *
 */
public interface Expression {
	/**
	 * 解释 口译 翻译
	 * 
	 * 解释一个特定的上下文
	 * 
	 * @param context
	 * @return
	 */
	public boolean interpret(String context);
}
