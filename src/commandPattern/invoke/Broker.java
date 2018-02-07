/**
 * 
 */
package commandPattern.invoke;

import java.util.ArrayList;
import java.util.List;

import commandPattern.command.Order;

/**
 * 创建命令调用类。接受订单并能下订单。
 * 
 * Broker 对象使用命令模式，基于命令的类型确定哪个对象执行哪个命令。
 * 
 * @author MJCoder
 *
 */
public class Broker { // Broker（经纪人 中间人）

	/**
	 * 
	 */
	public Broker() {
		// TODO Auto-generated constructor stub
	}

	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) { // 点酒水、点菜；服从指挥(接受订单)
		orderList.add(order);
	}

	public void placeOrders() { // 订购；下订单(下订单)
		for (Order order : orderList) { // 基于命令的类型确定哪个对象执行哪个命令。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
			order.execute();
		}
		orderList.clear();
	}

}
