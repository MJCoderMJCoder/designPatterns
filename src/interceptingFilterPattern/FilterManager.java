/**
 * 
 */
package interceptingFilterPattern;

import interceptingFilterPattern.filter.Filter;

/**
 * 创建过滤管理器。
 * 
 * @author MJCoder
 */
public class FilterManager {
	FilterChain filterChain;

	/**
	 * 
	 */
	public FilterManager(Target target) {
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}

	public void setFilter(Filter filter) {
		filterChain.addFilter(filter);
	}

	public void filterRequest(String request) {
		filterChain.execute(request);
	}

}
