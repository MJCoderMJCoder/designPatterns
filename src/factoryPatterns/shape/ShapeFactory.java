package factoryPatterns.shape;

import factoryPatterns.shape.impl.Circle;
import factoryPatterns.shape.impl.Rectangle;
import factoryPatterns.shape.impl.Square;

/**
 * @author MJCoder
 * 
 *         3.创建一个工厂，生成基于给定信息的实体类的对象。
 * 
 */
public class ShapeFactory {

	public ShapeFactory() {
		// TODO Auto-generated constructor stub
	}

	// 使用 getShape 方法获取形状类型的对象
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	// 使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
	public static Object getClass(Class<? extends Shape> clazz) {
		Object obj = null;
		try {
			obj = Class.forName(clazz.getName()).newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
