/**
 * 
 */

/**
 * @author MJCoder
 *
 *         所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前。
 * 
 *         有界的类型参数:限制那些被允许传递到一个类型参数的类型种类范围。要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界。
 * 
 *         类型通配符：
 * 
 *         1、类型通配符一般是使用?代替具体的类型参数。
 * 
 *         2、类型通配符上限通过形如List<? extends
 *         Number>来定义，如此定义就是通配符泛型只接受Number及其下层子类类型。<? extends
 *         T>表示该通配符所代表的类型是T类型的子类。
 * 
 *         3、类型通配符下限通过形如 List<? super
 *         Number>来定义，表示类型只能接受Number及其三层父类类型，如Objec类型的实例。<? super
 *         T>表示该通配符所代表的类型是T类型的父类。
 */
public class Generic {

	/**
	 * 
	 */
	public Generic() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 比较三个值并返回最大值
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; // 假设x是初始最大值
		if (y.compareTo(max) > 0) {
			max = y; // y 更大
		}
		if (z.compareTo(max) > 0) {
			max = z; // 现在 z 更大
		}
		return max; // 返回最大对象
	}

	/**
	 * @param args
	 *            %c,用来输出一个字符
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d, %d 和 %d 中最大的数为 %d\n\n", 3, 4, 5, maximum(3, 4, 5)); // %d,用来输出十进制整数

		System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7)); // %f,用来输出实数（包括单，双精度），以小数形式输出(十进制)

		System.out.printf("%s, %s 和 %s 中最大的数为 %s\n", "pear", "apple", "orange", maximum("pear", "apple", "orange")); // %s,用来输出一个字符串
	}

}
