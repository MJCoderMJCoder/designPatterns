/**
 * 
 */
package creationalPatterns.abstractFactoryPattern.color.impl;

import creationalPatterns.abstractFactoryPattern.color.Color;

/**
 * @author MJCoder
 * 
 *         4.创建实现接口的实体类。
 */
public class Red implements Color {

	/**
	 * 
	 */
	public Red() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see abstractFactoryPattern.color.Color#fill()
	 */
	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("Inside Red::fill() method.");
	}

}
