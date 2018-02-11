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
public class EJBService implements BusinessService {

	/**
	 * 
	 */
	public EJBService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doProcessing() {
		// TODO Auto-generated method stub
		System.out.println("Processing task by invoking EJB Service");
	}

}
