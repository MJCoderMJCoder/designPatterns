/**
 * 
 */
package mediatorPattern;

import java.util.Date;

/**
 * 创建中介类。处理不同类之间的通信,封装一系列的对象交互
 * 
 * @author MJCoder
 *
 */
public class ChatRoom {

	/**
	 * 
	 */
	public ChatRoom() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 对象 Colleague（同事 同僚 公事上的同伴）之间的通信封装到一个类中单独处理。
	 * 
	 * @param user
	 * @param message
	 */
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
}
