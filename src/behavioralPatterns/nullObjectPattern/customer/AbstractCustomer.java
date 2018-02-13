/**
 * 
 */
package behavioralPatterns.nullObjectPattern.customer;

/**
 * 创建一个抽象类。
 * 
 * @author MJCoder
 *
 */
public abstract class AbstractCustomer {
	protected String name;

	public abstract boolean isNil(); // nil：无；零

	public abstract String getName();

	/**
	 * 
	 */
	public AbstractCustomer() {
		// TODO Auto-generated constructor stub
	}

}
