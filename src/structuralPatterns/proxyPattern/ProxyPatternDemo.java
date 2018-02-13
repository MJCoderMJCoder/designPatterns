/**
 * 
 */
package structuralPatterns.proxyPattern;

import structuralPatterns.proxyPattern.image.Image;
import structuralPatterns.proxyPattern.image.impl.ProxyImage;

/**
 * 当被请求时，使用 ProxyImage 来获取 RealImage 类的对象。
 * 
 * @author MJCoder
 *
 */
public class ProxyPatternDemo {

	/**
	 * 
	 */
	public ProxyPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image = new ProxyImage("test_10mb.jpg");

		// 图像将从磁盘加载
		image.display();
		System.out.println("");

		// 图像将无法从磁盘加载
		image.display();
	}

}
