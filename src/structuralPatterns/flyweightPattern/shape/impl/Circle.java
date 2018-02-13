/**
 * 
 */
package structuralPatterns.flyweightPattern.shape.impl;

import structuralPatterns.flyweightPattern.shape.Shape;

/**
 * 创建实现接口的实体类。
 * 
 * @author MJCoder
 */
public class Circle implements Shape {
	private String color;
	private int x;
	private int y;
	private int radius;

	/**
	 * @param color
	 */
	public Circle(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see flyweightPattern.shape.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
	}

}