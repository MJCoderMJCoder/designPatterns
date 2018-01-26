/**
 * 
 */
package abstractFactoryPattern.shape;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.color.Color;
import abstractFactoryPattern.shape.impl.Circle;
import abstractFactoryPattern.shape.impl.Rectangle;
import abstractFactoryPattern.shape.impl.Square;

/**
 * @author MJCoder
 * 
 *         6.创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 *
 */
public class ShapeFactory extends AbstractFactory {

	/**
	 * 
	 */
	public ShapeFactory() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see abstractFactoryPattern.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see abstractFactoryPattern.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
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

}
