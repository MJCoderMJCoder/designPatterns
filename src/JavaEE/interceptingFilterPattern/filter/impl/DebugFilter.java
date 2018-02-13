/**
 * 
 */
package JavaEE.interceptingFilterPattern.filter.impl;

import JavaEE.interceptingFilterPattern.filter.Filter;

/**
 * @author MJCoder
 *
 */
public class DebugFilter implements Filter {

	/**
	 * 
	 */
	public DebugFilter() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interceptingFilterPattern.filter.Filter#execute(java.lang.String)
	 */
	@Override
	public void execute(String request) {
		// TODO Auto-generated method stub
		System.out.println("DebugFilter request log: " + request);
	}
}
