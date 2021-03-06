/**
 * 
 */
package structuralPatterns.bridgePattern;

import structuralPatterns.bridgePattern.color.impl.GreenCircle;
import structuralPatterns.bridgePattern.color.impl.RedCircle;
import structuralPatterns.bridgePattern.shape.Shape;
import structuralPatterns.bridgePattern.shape.impl.Circle;

/**
 * @author MJCoder
 *
 *         使用Shape和DrawAPI类画出不同颜色的圆。
 */
public class BridgePatternDemo {

	/**
	 * 
	 */
	public BridgePatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape redCircle = new Circle(new RedCircle(), 100, 100, 10);
		Shape greenCircle = new Circle(new GreenCircle(), 100, 100, 10);

		redCircle.draw();
		greenCircle.draw();
	}

}
