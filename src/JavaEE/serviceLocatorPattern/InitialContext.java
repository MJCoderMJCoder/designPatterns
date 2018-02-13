/**
 * 
 */
package JavaEE.serviceLocatorPattern;

import JavaEE.serviceLocatorPattern.service.impl.Service1;
import JavaEE.serviceLocatorPattern.service.impl.Service2;

/**
 * 为 JNDI 查询创建 InitialContext。
 * 
 * @author MJCoder
 *
 */
public class InitialContext {

	/**
	 * 
	 */
	public InitialContext() {
		// TODO Auto-generated constructor stub
	}

	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("SERVICE1")) {
			System.out.println("Looking up and creating a new Service1 object");
			return new Service1();
		} else if (jndiName.equalsIgnoreCase("SERVICE2")) {
			System.out.println("Looking up and creating a new Service2 object");
			return new Service2();
		}
		return null;
	}

}
