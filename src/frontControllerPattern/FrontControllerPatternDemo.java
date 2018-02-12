/**
 * 
 */
package frontControllerPattern;

/**
 * 使用 FrontController 来演示前端控制器设计模式。
 * 
 * @author MJCoder
 *
 */
public class FrontControllerPatternDemo {

	/**
	 * 
	 */
	public FrontControllerPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		System.out.println();
		frontController.dispatchRequest("STUDENT");
	}

}
