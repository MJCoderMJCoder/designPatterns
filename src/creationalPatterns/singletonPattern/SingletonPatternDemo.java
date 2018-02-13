/**
 * 
 */
package creationalPatterns.singletonPattern;

/**
 * @author MJCoder
 *
 *         从 singleton 类获取唯一的对象。
 */
public class SingletonPatternDemo {

	/**
	 * 
	 */
	public SingletonPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 不合法的构造函数
		// 编译时错误：构造函数 SingleObject() 是不可见的
		// SingleObject object = new SingleObject();

		LazyThreadUnsafeObject.getInstance(); // 1.懒汉式，线程不安全

		LazyThreadSafeObject.getInstance(); // 2.懒汉式，线程安全

		// 获取唯一可用的对象
		SingleObject object = SingleObject.getInstance(); // 3.饿汉式
		// 显示消息
		object.showMessage();

		DoubleCheckedLockObject.getInstance(); // 4.双检锁/双重校验锁（DCL，即 double-checked locking）JDK 版本：JDK1.5 起

		StaticInnerObject.getInstance(); // 5.登记式/静态内部类

		EnumObject.getInstance().whateverMethod(); // 6.枚举 JDK 版本：JDK1.5 起

	}
}
