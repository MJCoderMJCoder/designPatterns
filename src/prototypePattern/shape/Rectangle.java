/**
 * 
 */
package prototypePattern.shape;

/**
 * @author MJCoder
 * 
 *         创建扩展了Shape抽象类的实体类。
 *
 */
public class Rectangle extends Shape {

	/**
	 * 
	 */
	public Rectangle() {
		// TODO Auto-generated constructor stub
		type = "Rectangle";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prototypePattern.shape.Shape#draw()
	 */
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Rectangle::draw() method.");
	}
}
