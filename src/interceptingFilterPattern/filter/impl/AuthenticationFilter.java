/**
 * 
 */
package interceptingFilterPattern.filter.impl;

import interceptingFilterPattern.filter.Filter;

/**
 * 创建实体过滤器。
 * 
 * @author MJCoder
 *
 */
public class AuthenticationFilter implements Filter {

	/**
	 * 
	 */
	public AuthenticationFilter() {
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
		System.out.println("AuthenticationFilter Authenticating request: " + request); // 正在验证；正在证实
	}

}
