/**
 * 
 */
package prototypePattern.shape;

/**
 * @author MJCoder
 *
 *         创建扩展了Shape抽象类的实体类。
 */
public class Square extends Shape {

	/**
	 * 
	 */
	public Square() {
		// TODO Auto-generated constructor stub
		type = "Square";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prototypePattern.shape.Shape#draw()
	 */
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square::draw() method.");
	}
}
