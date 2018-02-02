/**
 * 
 */
package decoratorPattern.impl.specificShape;

import decoratorPattern.Shape;

/**
 * @author MJCoder
 *
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
	 * @see decoratorPattern.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Shape: Circle");
	}

}
