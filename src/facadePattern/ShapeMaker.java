/**
 * 
 */
package facadePattern;

import facadePattern.shape.Shape;
import facadePattern.shape.impl.Circle;
import facadePattern.shape.impl.Rectangle;
import facadePattern.shape.impl.Square;

/**
 * @author MJCoder
 *
 *         创建一个外观类。
 */
public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	/**
	 * 
	 */
	public ShapeMaker() {
		// TODO Auto-generated constructor stub
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		if (circle != null) {
			circle.draw();
		}
	}

	public void drawRectangle() {
		if (rectangle != null) {
			rectangle.draw();
		}
	}

	public void drawSquare() {
		if (square != null) {
			square.draw();
		}
	}

}
