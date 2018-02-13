/**
 * 
 */
package creationalPatterns.abstractFactoryPattern.color.impl;

import creationalPatterns.abstractFactoryPattern.color.Color;

/**
 * @author MJCoder
 * 
 *         4.创建实现接口的实体类。
 *
 */
public class Green implements Color {

	/**
	 * 
	 */
	public Green() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("Inside Green::fill() method.");
	}
}
