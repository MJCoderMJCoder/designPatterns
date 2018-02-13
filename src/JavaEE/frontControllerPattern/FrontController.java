/**
 * 
 */
package JavaEE.frontControllerPattern;

/**
 * 创建前端控制器 FrontController。
 * 
 * @author MJCoder
 *
 */
public class FrontController {
	private Dispatcher dispatcher;

	/**
	 * 
	 */
	public FrontController() {
		// TODO Auto-generated constructor stub
		dispatcher = new Dispatcher();
	}

	/**
	 * Authentic：正宗 真正的 可信的
	 * 
	 * @return
	 */
	private boolean isAuthenticUser() {
		System.out.println("User is authenticated successfully."); // 用户身份验证成功
		return true;
	}

	/**
	 * track：轨道；足迹，踪迹；小道 vt. 追踪；通过；循路而行；用纤拉 vi. 追踪；走；留下足迹
	 * 
	 * @param request
	 */
	private void trackRequest(String request) { // 跟踪请求
		System.out.println("Track page requested: " + request);
	}

	public void dispatchRequest(String request) {
		// 记录每一个请求
		trackRequest(request);
		// 对用户进行身份验证
		if (isAuthenticUser()) {
			dispatcher.dispatch(request);
		}
	}

}
