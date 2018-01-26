/**
 * 
 */
package factoryPatterns;

import factoryPatterns.shape.Shape;
import factoryPatterns.shape.ShapeFactory;
import factoryPatterns.shape.impl.Circle;
import factoryPatterns.shape.impl.Rectangle;
import factoryPatterns.shape.impl.Square;

/**
 * @author MJCoder
 * 
 *         4.使用该工厂，通过传递类型信息来获取实体类的对象。
 */
public class FactoryPatternDemo {

	/**
	 * 
	 */
	public FactoryPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// 获取 Circle 的对象，并调用它的 draw 方法
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		// 调用 Circle 的 draw 方法
		shape1.draw();

		// 获取 Rectangle 的对象，并调用它的 draw 方法
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		// 调用 Rectangle 的 draw 方法
		shape2.draw();

		// 获取 Square 的对象，并调用它的 draw 方法
		Shape shape3 = shapeFactory.getShape("SQUARE");
		// 调用 Square 的 draw 方法
		shape3.draw();

		// 使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
		Rectangle rect = (Rectangle) ShapeFactory.getClass(Rectangle.class);
		rect.draw();
		Square square = (Square) ShapeFactory.getClass(Square.class);
		square.draw();
		Circle circle = (Circle) ShapeFactory.getClass(Circle.class);
		circle.draw();
	}

}
