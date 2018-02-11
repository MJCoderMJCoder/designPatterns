/**
 * 
 */
package businessDelegatePattern;

import businessDelegatePattern.businessService.BusinessService;

/**
 * @author MJCoder
 *
 */
public class BusinessDelegate {

	private BusinessLookUp lookupService = new BusinessLookUp();
	private BusinessService businessService;
	private String serviceType;

	/**
	 * 
	 */
	public BusinessDelegate() {
		// TODO Auto-generated constructor stub
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = lookupService.getBusinessService(serviceType);
		businessService.doProcessing();
	}

}
