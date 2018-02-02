/**
 * 
 */
package decoratorPattern;

import decoratorPattern.impl.decorator.subclass.RedShapeDecorator;
import decoratorPattern.impl.specificShape.Circle;
import decoratorPattern.impl.specificShape.Rectangle;

/**
 * @author MJCoder
 *
 *         使用 RedShapeDecorator 来装饰 Shape 对象。
 */
public class DecoratorPatternDemo {

	/**
	 * 
	 */
	public DecoratorPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}

}
