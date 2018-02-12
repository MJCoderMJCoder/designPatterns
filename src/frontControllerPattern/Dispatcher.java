/**
 * 
 */
package frontControllerPattern;

import frontControllerPattern.view.HomeView;
import frontControllerPattern.view.StudentView;

/**
 * 创建调度器 Dispatcher。
 * 
 * @author MJCoder
 *
 */
public class Dispatcher {
	private StudentView studentView;
	private HomeView homeView;

	/**
	 * 
	 */
	public Dispatcher() {
		// TODO Auto-generated constructor stub
		studentView = new StudentView();
		homeView = new HomeView();
	}

	public void dispatch(String request) {
		if (request.equalsIgnoreCase("STUDENT")) {
			studentView.show();
		} else {
			homeView.show();
		}
	}
}
