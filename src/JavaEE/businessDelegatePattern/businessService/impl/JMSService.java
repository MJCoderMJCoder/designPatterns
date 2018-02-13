/**
 * 
 */
package JavaEE.businessDelegatePattern.businessService.impl;

import JavaEE.businessDelegatePattern.businessService.BusinessService;

/**
 * 创建实体服务类。
 * 
 * @author MJCoder
 *
 */
public class JMSService implements BusinessService {

	/**
	 * 
	 */
	public JMSService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doProcessing() {
		// TODO Auto-generated method stub
		System.out.println("Processing task by invoking JMS Service");
	}

}
