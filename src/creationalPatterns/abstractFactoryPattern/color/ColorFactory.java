/**
 * 
 */
package creationalPatterns.abstractFactoryPattern.color;

import creationalPatterns.abstractFactoryPattern.AbstractFactory;
import creationalPatterns.abstractFactoryPattern.color.impl.Blue;
import creationalPatterns.abstractFactoryPattern.color.impl.Green;
import creationalPatterns.abstractFactoryPattern.color.impl.Red;
import creationalPatterns.abstractFactoryPattern.shape.Shape;

/**
 * @author MJCoder
 * 
 *         6.创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 *
 */
public class ColorFactory extends AbstractFactory {

	/**
	 * 
	 */
	public ColorFactory() {
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
		if (colorType == null) {
			return null;
		}
		if (colorType.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (colorType.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (colorType.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
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
		return null;
	}

}
