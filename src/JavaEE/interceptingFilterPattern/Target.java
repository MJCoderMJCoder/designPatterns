/**
 * 
 */
package JavaEE.interceptingFilterPattern;

/**
 * 创建 Target。
 * 
 * @author MJCoder
 */
public class Target {

	/**
	 * 
	 */
	public Target() {
		// TODO Auto-generated constructor stub
	}

	public void execute(String request) { // 执行 实行 实施 处死
		System.out.println("Target Executing request: " + request);
	}
}
