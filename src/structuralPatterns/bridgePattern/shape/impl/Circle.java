/**
 * 
 */
package structuralPatterns.bridgePattern.shape.impl;

import structuralPatterns.bridgePattern.color.DrawAPI;
import structuralPatterns.bridgePattern.shape.Shape;

/**
 * @author MJCoder
 *
 *         创建扩展了 Shape 的实体类。
 */
public class Circle extends Shape {

	private int x;
	private int y;
	private int radius;

	public Circle(DrawAPI drawAPI, int x, int y, int radius) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawAPI.drawCircle(radius, x, y);
	}
}
