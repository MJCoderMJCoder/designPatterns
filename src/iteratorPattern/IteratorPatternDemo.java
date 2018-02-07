/**
 * 
 */
package iteratorPattern;

import iteratorPattern.container.Iterator;
import iteratorPattern.container.impl.NameRepository;

/**
 * 使用 NameRepository 来获取迭代器，并打印名字。
 * 
 * @author MJCoder
 *
 */
public class IteratorPatternDemo {

	/**
	 * 
	 */
	public IteratorPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRepository namesRepository = new NameRepository();

		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}

		// for (int i = 0; i < args.length; i++) { // for-iterate over array(数组遍历)
		// } // for-iterate over array with temporary variable(使用临时变量遍历数组)
		//
		// // for-iterate over collection(遍历集合)
		// for (java.util.Iterator iterator = collection.iterator();
		// iterator.hasNext();) {
		// type type = (type) iterator.next();
		// }
		// for (String string : args) { // foreach-iterate over an array or
		// Iterable(遍历一个数组或可遍历)
		// }
	}

}
