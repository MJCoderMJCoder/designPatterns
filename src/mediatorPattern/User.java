/**
 * 
 */
package mediatorPattern;

/**
 * 创建 user 类。
 * 
 * @author MJCoder
 *
 */
public class User {
	private String name;

	/**
	 * @param name
	 */
	public User(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 发送信息
	 * 
	 * @param message
	 */
	public void sendMessage(String message) {
		ChatRoom.showMessage(this, message);
	}

}
