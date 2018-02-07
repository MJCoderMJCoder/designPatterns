/**
 * 
 */
package commandPattern.request;

/**
 * 创建一个请求类。客户端：股民直接买股票
 * 
 * 将一个请求封装成一个对象
 * 
 * @author MJCoder
 *
 */
public class Stock { // Stock（库存 原料 股票）
	private String name = "ABC";
	private int quantity = 10;

	/**
	 * 
	 */
	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public void buy() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
	}

	public void sell() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
	}

}
