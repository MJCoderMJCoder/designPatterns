/**
 * 
 */
package abstractFactoryPattern;

import abstractFactoryPattern.color.Color;
import abstractFactoryPattern.shape.Shape;

/**
 * @author MJCoder
 * 
 *         5.为 Color 和 Shape 对象创建抽象类来获取工厂。
 */
public abstract class AbstractFactory {

	/**
	 * 
	 */
	public AbstractFactory() {
		// TODO Auto-generated constructor stub
	}

	public abstract Color getColor(String colorType);

	public abstract Shape getShape(String shapeType);

}
