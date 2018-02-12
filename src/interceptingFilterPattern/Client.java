/**
 * 
 */
package interceptingFilterPattern;

/**
 * 创建客户端 Client。
 * 
 * @author MJCoder
 */
public class Client {
	FilterManager filterManager;

	/**
	 * 
	 */
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}

}
