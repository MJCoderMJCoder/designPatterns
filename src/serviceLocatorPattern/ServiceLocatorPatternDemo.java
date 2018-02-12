/**
 * 
 */
package serviceLocatorPattern;

import serviceLocatorPattern.service.Service;

/**
 * 使用 ServiceLocator 来演示服务定位器设计模式。
 * 
 * @author MJCoder
 */
public class ServiceLocatorPatternDemo {

	/**
	 * 
	 */
	public ServiceLocatorPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
		service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
	}
}
