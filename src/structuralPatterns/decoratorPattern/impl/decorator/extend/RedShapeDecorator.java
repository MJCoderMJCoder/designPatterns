/**
 * 
 */
package structuralPatterns.decoratorPattern.impl.decorator.extend;

import structuralPatterns.decoratorPattern.Shape;
import structuralPatterns.decoratorPattern.impl.decorator.ShapeDecorator;

/**
 * @author MJCoder
 *
 *         创建扩展了 ShapeDecorator 类的实体装饰类。
 */
public class RedShapeDecorator extends ShapeDecorator {

	/**
	 * @param decoratedShape
	 */
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		// TODO Auto-generated method stub
		System.out.println("Border Color: Red");
	}
}
