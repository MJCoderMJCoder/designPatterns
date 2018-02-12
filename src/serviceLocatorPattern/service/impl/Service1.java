/**
 * 
 */
package serviceLocatorPattern.service.impl;

import serviceLocatorPattern.service.Service;

/**
 * 创建实体服务。
 * 
 * @author MJCoder
 *
 */
public class Service1 implements Service {

	/**
	 * 
	 */
	public Service1() {
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
		return "Service1";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see serviceLocatorPattern.service.Service#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Executing Service1");
	}

}
