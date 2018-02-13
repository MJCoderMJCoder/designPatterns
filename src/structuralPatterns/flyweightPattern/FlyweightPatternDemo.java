/**
 * 
 */
package structuralPatterns.flyweightPattern;

import structuralPatterns.flyweightPattern.shape.impl.Circle;

/**
 * 
 * 使用ShapeFactory工厂，通过传递颜色信息来获取实体类的对象。
 * 
 * @author MJCoder
 *
 */
public class FlyweightPatternDemo {
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	/**
	 * 
	 */
	public FlyweightPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	private static String getRandomColor() {
		System.out.println("Math.random()：" + Math.random() + "，colors.length：" + colors.length);
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

}
