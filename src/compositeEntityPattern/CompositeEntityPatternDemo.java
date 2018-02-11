/**
 * 
 */
package compositeEntityPattern;

/**
 * 使用 Client 来演示组合实体设计模式的用法。
 * 
 * @author MJCoder
 *
 */
public class CompositeEntityPatternDemo {

	/**
	 * 
	 */
	public CompositeEntityPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
		client.setData("DependentObject1", "DependentObject2");
		client.printData();
		System.out.println("");
		client.setData("Second Test DependentObject1", "Second Test DependentObject2");
		client.printData();
	}

}
