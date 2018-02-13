/**
 * 
 */
package structuralPatterns.decoratorPattern.impl.decorator;

import structuralPatterns.decoratorPattern.Shape;

/**
 * @author MJCoder
 *
 *         创建实现了 Shape 接口的抽象装饰类。
 */
public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;

	/**
	 * @param decoratedShape
	 */
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
}
