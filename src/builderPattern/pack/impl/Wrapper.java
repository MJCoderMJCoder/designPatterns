/**
 * 
 */
package builderPattern.pack.impl;

import builderPattern.pack.Pack;

/**
 * @author MJCoder
 *
 *         实现 Pack 接口的实体类。(纸盒)
 */
public class Wrapper implements Pack {

	/**
	 * 
	 */
	public Wrapper() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see builderPattern.pack.Pack#pack()
	 */
	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "Wrapper";
	}

}
