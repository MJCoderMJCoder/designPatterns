/**
 * 
 */
package JavaEE.serviceLocatorPattern.service.impl;

import JavaEE.serviceLocatorPattern.service.Service;

/**
 * 创建实体服务。
 * 
 * @author MJCoder
 *
 */
public class Service2 implements Service {

	/**
	 * 
	 */
	public Service2() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see serviceLocatorPattern.service.Service#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Service2";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see serviceLocatorPattern.service.Service#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Executing Service2");
	}

}
