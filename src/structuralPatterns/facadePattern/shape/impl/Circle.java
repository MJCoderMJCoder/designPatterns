/**
 * 
 */
package structuralPatterns.facadePattern.shape.impl;

import structuralPatterns.facadePattern.shape.Shape;

/**
 * @author MJCoder
 *
 *         创建实现接口的实体类。
 */
public class Circle implements Shape {

	/**
	 * 
	 */
	public Circle() {
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
		System.out.println("Circle::draw()");
	}

}
