/**
 * 
 */
package commandPattern.command.implReceived;

import commandPattern.command.Order;
import commandPattern.request.Stock;

/**
 * 创建实现了 Order 接口的实体类。将执行实际的命令处理。
 * 
 * @author MJCoder
 *
 */
public class SellStock implements Order {
	private Stock abcStock;

	/**
	 * @param abcStock
	 */
	public SellStock(Stock abcStock) {
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
		abcStock.sell();
	}

}
