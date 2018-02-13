/**
 * 
 */
package JavaEE.interceptingFilterPattern;

import JavaEE.interceptingFilterPattern.filter.impl.AuthenticationFilter;
import JavaEE.interceptingFilterPattern.filter.impl.DebugFilter;

/**
 * 使用 Client 来演示拦截过滤器设计模式。
 * 
 * @author MJCoder
 *
 */
public class InterceptingFilterDemo {

	/**
	 * 
	 */
	public InterceptingFilterDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());

		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");
	}
}
