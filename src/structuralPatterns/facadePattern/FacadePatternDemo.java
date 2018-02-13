/**
 * 
 */
package structuralPatterns.facadePattern;

/**
 * @author MJCoder
 *
 *         使用外观类ShapeMaker画出各种类型的形状。
 */
public class FacadePatternDemo {

	/**
	 * 
	 */
	public FacadePatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
