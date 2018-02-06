import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Java 8 新特性
 * 支持函数式编程，新的 JavaScript 引擎，新的日期 API，新的Stream API 等。
 * 
 *  Lambda 表达式： 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
 *  lambda 表达式的语法格式：(parameters) -> expression或(parameters) ->{ statements; }
 *  可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
 *  可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
 *  可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
 *  可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。
 */

/**
 * @author MJCoder
 *
 */
public class Java8Tester {

	/**
	 * 
	 */
	public Java8Tester() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names1 = new ArrayList<String>();
		names1.add("Google ");
		names1.add("Runoob ");
		names1.add("Taobao ");
		names1.add("Baidu ");
		names1.add("Sina ");

		List<String> names2 = new ArrayList<String>();
		names2.add("Google ");
		names2.add("Runoob ");
		names2.add("Taobao ");
		names2.add("Baidu ");
		names2.add("Sina ");

		Java8Tester tester = new Java8Tester();
		System.out.println("使用 Java 7 语法: ");
		tester.sortUsingJava7(names1);
		System.out.println(names1);

		System.out.println("使用 Java 8 语法: ");
		tester.sortUsingJava8(names2);
		System.out.println(names2);
	}

	/**
	 * 使用 java 7 排序
	 * 
	 * @param names
	 */
	private void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}

	/**
	 * 使用 java 8 排序
	 * 
	 * @param names
	 */
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}
}
