/**
 * 
 */
package strategyPattern.strategy;

/**
 * 创建一个接口。
 * 
 * @author MJCoder
 *
 */
public interface Strategy {
	/**
	 * 一个系统有许多许多类，而区分它们的只是他们直接的行为。
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int doOperation(int num1, int num2); // operation 操作；经营；[外科] 手术；[数][计] 运算
}
