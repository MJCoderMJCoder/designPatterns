/**
 * 
 */
package JavaEE.interceptingFilterPattern;

import java.util.ArrayList;
import java.util.List;

import JavaEE.interceptingFilterPattern.filter.Filter;

/**
 * 创建过滤器链。
 * 
 * @author MJCoder
 */
public class FilterChain {
	private List<Filter> filters = new ArrayList<Filter>();
	private Target target;

	/**
	 * 
	 */
	public FilterChain() {
		// TODO Auto-generated constructor stub
	}

	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	public void execute(String request) {
		for (Filter filter : filters) {
			filter.execute(request);
		}
		target.execute(request);
	}

	public void setTarget(Target target) {
		this.target = target;
	}

}
