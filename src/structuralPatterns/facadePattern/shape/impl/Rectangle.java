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
public class Rectangle implements Shape {

	/**
	 * 
	 */
	public Rectangle() {
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
		System.out.println("Rectangle::draw()");
	}

}
