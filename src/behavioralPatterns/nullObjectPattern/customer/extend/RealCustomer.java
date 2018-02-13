/**
 * 
 */
package behavioralPatterns.nullObjectPattern.customer.extend;

import behavioralPatterns.nullObjectPattern.customer.AbstractCustomer;

/**
 * 创建扩展了上述类的实体类。
 * 
 * @author MJCoder
 *
 */
public class RealCustomer extends AbstractCustomer {

	/**
	 * 
	 */
	public RealCustomer(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nullObjectPattern.customer.AbstractCustomer#isNil()
	 */
	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nullObjectPattern.customer.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
