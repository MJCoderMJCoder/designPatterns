/**
 * 
 */
package nullObjectPattern.customer.sub;

import nullObjectPattern.customer.AbstractCustomer;

/**
 * @author MJCoder
 *
 */
public class NullCustomer extends AbstractCustomer {

	/**
	 * 
	 */
	public NullCustomer() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nullObjectPattern.customer.AbstractCustomer#isNil()
	 */
	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nullObjectPattern.customer.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Not Available in Customer Database";
	}

}
