/**
 * 
 */
package flyweightPattern;

import java.util.HashMap;

import flyweightPattern.shape.Shape;
import flyweightPattern.shape.impl.Circle;

/**
 * 
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 * 
 * @author MJCoder
 *
 */
public class ShapeFactory {
	private static HashMap<String, Shape> circleMap = new HashMap<>();

	/**
	 * 
	 */
	public ShapeFactory() {
		// TODO Auto-generated constructor stub
	}

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}

}
