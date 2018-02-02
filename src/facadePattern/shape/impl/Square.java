/**
 * 
 */
package facadePattern.shape.impl;

import facadePattern.shape.Shape;

/**
 * @author MJCoder
 *
 *         创建实现接口的实体类。
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
	 * @see facadePattern.shape.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square::draw()");
	}

}
