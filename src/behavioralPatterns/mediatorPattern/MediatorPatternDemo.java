/**
 * 
 */
package behavioralPatterns.mediatorPattern;

/**
 * 使用 User 对象来显示他们之间的通信。
 * 
 * @author MJCoder
 *
 */
public class MediatorPatternDemo {

	/**
	 * 
	 */
	public MediatorPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}

}
