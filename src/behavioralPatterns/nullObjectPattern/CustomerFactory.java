/**
 * 
 */
package behavioralPatterns.nullObjectPattern;

import behavioralPatterns.nullObjectPattern.customer.AbstractCustomer;
import behavioralPatterns.nullObjectPattern.customer.extend.NullCustomer;
import behavioralPatterns.nullObjectPattern.customer.extend.RealCustomer;

/**
 * 创建 CustomerFactory 类。
 * 
 * @author MJCoder
 *
 */
public class CustomerFactory {
	public static final String[] names = { "Rob", "Joe", "Julie" };

	/**
	 * 
	 */
	public CustomerFactory() {
		// TODO Auto-generated constructor stub
	}

	public static AbstractCustomer getCustomer(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
