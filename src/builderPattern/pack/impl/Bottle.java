/**
 * 
 */
package builderPattern.pack.impl;

import builderPattern.pack.Pack;

/**
 * @author MJCoder
 * 
 *         实现 Pack 接口的实体类。(瓶子)
 *
 */
public class Bottle implements Pack {

	/**
	 * 
	 */
	public Bottle() {
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
		return "Bottle";
	}

}
