/**
 * 
 */
package businessDelegatePattern.businessService.impl;

import businessDelegatePattern.businessService.BusinessService;

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
