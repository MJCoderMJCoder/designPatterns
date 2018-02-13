/**
 * 
 */
package JavaEE.businessDelegatePattern;

import JavaEE.businessDelegatePattern.businessService.BusinessService;
import JavaEE.businessDelegatePattern.businessService.impl.EJBService;
import JavaEE.businessDelegatePattern.businessService.impl.JMSService;

/**
 * 创建业务查询服务。
 * 
 * @author MJCoder
 *
 */
public class BusinessLookUp {

	/**
	 * 
	 */
	public BusinessLookUp() {
		// TODO Auto-generated constructor stub
	}

	public BusinessService getBusinessService(String serviceType) {
		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}
