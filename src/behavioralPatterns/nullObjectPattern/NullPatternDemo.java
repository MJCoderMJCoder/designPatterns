/**
 * 
 */
package behavioralPatterns.nullObjectPattern;

import behavioralPatterns.nullObjectPattern.customer.AbstractCustomer;

/**
 * 使用CustomerFactory，基于客户传递的名字，来获取 RealCustomer 或 NullCustomer 对象。
 * 
 * @author MJCoder
 *
 */
public class NullPatternDemo {

	/**
	 * 
	 */
	public NullPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

		System.out.println("Customers：");
		System.out.println(customer1.getName() + "；" + customer1.isNil());
		System.out.println(customer2.getName() + "；" + customer2.isNil());
		System.out.println(customer3.getName() + "；" + customer3.isNil());
		System.out.println(customer4.getName() + "；" + customer4.isNil());
	}

}
