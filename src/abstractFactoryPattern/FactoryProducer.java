/**
 * 
 */
package abstractFactoryPattern;

import abstractFactoryPattern.color.ColorFactory;
import abstractFactoryPattern.shape.ShapeFactory;

/**
 * @author MJCoder
 *
 *         7.创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 */
public class FactoryProducer {

	/**
	 * 
	 */
	public FactoryProducer() {
		// TODO Auto-generated constructor stub
	}

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
