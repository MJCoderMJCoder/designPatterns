/**
 * 
 */
package JavaEE.businessDelegatePattern;

/**
 * 使用 BusinessDelegate 和 Client 类来演示业务代表模式。
 * 
 * @author MJCoder
 *
 */
public class BusinessDelegatePatternDemo {

	/**
	 * 
	 */
	public BusinessDelegatePatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType("JMS");
		client.doTask();

	}

}
