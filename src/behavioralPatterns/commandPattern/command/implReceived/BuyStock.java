/**
 * 
 */
package behavioralPatterns.commandPattern.command.implReceived;

import behavioralPatterns.commandPattern.command.Order;
import behavioralPatterns.commandPattern.request.Stock;

/**
 * 创建实现了 Order 接口的实体类。将执行实际的命令处理。
 * 
 * @author MJCoder
 *
 */
public class BuyStock implements Order {
	private Stock abcStock;

	/**
	 * @param abcStock
	 */
	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see commandPattern.command.Order#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		abcStock.buy();
	}
}
