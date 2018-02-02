/**
 * 
 */
package decoratorPattern.impl.specificShape;

import decoratorPattern.Shape;

/**
 * @author MJCoder
 *
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
	 * @see decoratorPattern.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Shape: Rectangle");
	}

}
