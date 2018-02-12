/**
 * 
 */
package serviceLocatorPattern;

import serviceLocatorPattern.service.Service;

/**
 * 创建服务定位器。
 * 
 * @author MJCoder
 */
public class ServiceLocator {
	private static Cache cache;

	static {
		System.out.println("Static块仅在该类被加载时执行一次");
		cache = new Cache();
	}

	/**
	 * 
	 */
	public ServiceLocator() {
		// TODO Auto-generated constructor stub
	}

	public static Service getService(String jndiName) {

		Service service = cache.getService(jndiName);

		if (service != null) {
			return service;
		}

		InitialContext context = new InitialContext();
		Service service1 = (Service) context.lookup(jndiName);
		cache.addService(service1);
		return service1;
	}

}
