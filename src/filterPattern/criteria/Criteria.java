/**
 * 
 */
package filterPattern.criteria;

import java.util.List;

import filterPattern.Person;

/**
 * @author MJCoder
 *
 *         为标准（Criteria）创建一个接口。
 * 
 *         接口，在JAVA编程语言中是一个抽象类型，是抽象方法的集合。
 * 
 *         接口并不是类。类描述对象的属性和方法。接口则包含类要实现的方法。
 * 
 *         除非实现接口的类是抽象类，否则该类要定义接口中的所有方法。
 * 
 *         接口无法被实例化。一个实现接口的类，必须实现接口内所描述的所有方法，否则就必须声明为抽象类。
 * 
 *         （晦涩难懂）在 Java 中，接口可用来声明一个变量，他们可以成为一个空指针，或是被绑定在一个以此接口实现的对象。
 * 
 *         接口不能用于实例化对象。
 * 
 *         接口没有构造方法。
 * 
 *         接口中所有的方法必须是抽象方法。
 * 
 *         接口不能包含成员变量，除了 static 和 final变量。
 * 
 *         接口支持多继承。（接口的多继承中extends关键字只需要使用一次，在其后跟着继承接口。）一个接口能继承另一个接口
 * 
 *         接口中每一个方法也是隐式抽象的,接口中的方法会被隐式的指定为 public abstract（其他修饰符都会报错）。
 * 
 *         接口中可以含有变量，但是接口中的变量会被隐式的指定为 public static final 变量（private 修饰会报编译错误）。
 * 
 *         接口是隐式抽象的，当声明一个接口的时候，不必使用abstract关键字。
 * 
 *         接口中每一个方法也是隐式抽象的，声明时同样不需要abstract关键字。
 * 
 *         接口中的方法都是公有的。
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons); // 满足标准
}
