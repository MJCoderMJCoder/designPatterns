/**
 * 
 */
package commandPattern;

import commandPattern.command.implReceived.BuyStock;
import commandPattern.command.implReceived.SellStock;
import commandPattern.invoke.Broker;
import commandPattern.request.Stock;

/**
 * 使用 Broker 类来接受并执行命令。
 * 
 * @author MJCoder
 *
 */
public class CommandPatternDemo {

	/**
	 * 
	 */
	public CommandPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock abcStock = new Stock(); // Stock（库存 原料 股票）]
		// abcStock请求以命令的形式包裹在buyStockOrder、sellStockOrder对象中，并传给调用对象broker。
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker(); // Broker（经纪人 中间人）
		broker.takeOrder(buyStockOrder); // 点酒水、点菜；服从指挥(接受订单)
		broker.takeOrder(sellStockOrder);

		broker.placeOrders(); // 订购；下订单(下订单)
	}

}
