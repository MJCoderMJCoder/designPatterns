/**
 * 
 */
package creationalPatterns.prototypePattern.shape;

/**
 * @author MJCoder
 *
 *         创建扩展了Shape抽象类的实体类。
 */
public class Circle extends Shape {

	/**
	 * 
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
		type = "Circle";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prototypePattern.shape.Shape#draw()
	 */
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle::draw() method.");
	}
}
