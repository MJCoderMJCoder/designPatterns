/**
 * 
 */
package creationalPatterns.singletonPattern;

/**
 * @author MJCoder
 *
 *         6.枚举 JDK 版本：JDK1.5 起
 * 
 *         是否 Lazy 初始化：否
 * 
 *         是否多线程安全：是
 * 
 *         实现难度：易
 * 
 *         描述：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 *         这种方式不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
 *         不过，在实际工作中，也很少用。不能通过 reflection attack 来调用私有构造方法。
 */
public enum EnumObject {
	INSTANCE(1);

	private int enumTest;

	private EnumObject(int enumTest) {
		this.enumTest = enumTest;
	}

	public void whateverMethod() {
		System.out.println(
				"EnumObject：" + "INSTANCE=" + INSTANCE + "；name=" + INSTANCE.name() + "；ordinal=" + INSTANCE.ordinal());
	}

	public static EnumObject getInstance() {
		return INSTANCE;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(this.enumTest);
	}
}
