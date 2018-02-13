/**
 * 
 */
package creationalPatterns.factoryPatterns.shape.impl;

import creationalPatterns.factoryPatterns.shape.Shape;

/**
 * @author MJCoder
 * 
 *         2.创建实现接口的实体类。
 * 
 *         类在实现接口的方法时，不能抛出强制性异常，只能在接口中，或者继承接口的抽象类中抛出该强制性异常。
 * 
 *         类在重写方法时要保持一致的方法名，并且应该保持相同或者相兼容的返回值类型。
 * 
 *         如果实现接口的类是抽象类，那么就没必要实现该接口的方法。
 *
 */
public class Square implements Shape {

	/**
	 * 
	 */
	public Square() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see factoryPatterns.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square::draw() method.");
	}

}
