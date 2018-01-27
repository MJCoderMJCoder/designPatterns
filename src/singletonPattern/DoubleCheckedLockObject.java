/**
 * 
 */
package singletonPattern;

/**
 * @author MJCoder
 * 
 *         4.双检锁/双重校验锁（DCL，即 double-checked locking）JDK 版本：JDK1.5 起
 * 
 *         是否 Lazy初始化：是
 * 
 *         是否多线程安全：是
 * 
 *         实现难度：较复杂
 * 
 *         描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * 
 *         getInstance() 的性能对应用程序很关键。
 * 
 * 
 *         synchronized是Java中的关键字，是一种同步锁。它修饰的对象有以下几种：
 *         1.修饰一个代码块（synchronized(this){}或synchronized(objInstance){}），其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象。
 *         synchronized锁定的是对象，每个对象只有一个对应的对象锁（lock）与之相关联；
 *         各个对象执行的是本对象中的synchronized代码(run)，各个对象锁分别锁定各自对象，互不干扰的，不形成互斥，可以互相抢占资源。
 *         2.修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象；
 *         （1）synchronized关键字不能继承：虽然可以使用synchronized来定义方法，但synchronized并不属于方法定义的一部分，因此，synchronized关键字不能被继承。
 *         如果在父类中的某个方法使用了synchronized关键字，而在子类中覆盖了这个方法，在子类中的这个方法默认情况下并不是同步的，而必须显式地在子类的这个方法中加上synchronized关键字才可以。
 *         当然，还可以在子类方法中调用父类中相应的方法，这样虽然子类中的方法不是同步的，但子类调用了父类的同步方法，因此，子类的方法也就相当于同步了。
 *         （2）在定义接口方法时不能使用synchronized关键字。
 *         （3）构造方法不能使用synchronized关键字，但可以使用synchronized代码块来进行同步。
 *         3.修饰一个静态的方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象；
 *         静态方法是属于类的而不属于对象的。同样的，synchronized修饰的静态方法锁定的是这个类的所有对象。
 *         4.修饰一个类（synchronized(ClassName.class){//同步代码块}），其作用的范围是synchronized后面括号括起来的部分，作用的对象是这个类的所有对象。
 *         synchronized作用于一个类时，是给这个类加锁，该类的所有对象用的是同一把锁。
 *
 */
public class DoubleCheckedLockObject {

	private volatile static DoubleCheckedLockObject instance; // volatile：不稳定的； 易挥发的

	/**
	 * 
	 */
	private DoubleCheckedLockObject() {
		// TODO Auto-generated constructor stub
		System.out.println("I am DoubleCheckedLockObject");
	}

	/**
	 * synchronized作用于一个类时，是给这个类加锁，该类的所有对象用的是同一把锁。 ，其作用的范围是synchronized后面括号括起来的部分。
	 * 
	 * @return
	 */
	public static DoubleCheckedLockObject getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedLockObject.class) {
				if (instance == null) {
					instance = new DoubleCheckedLockObject();
				}
			}
		}
		return instance;

	}

}
