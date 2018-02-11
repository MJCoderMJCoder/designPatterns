/**
 * 
 */
package businessDelegatePattern;

/**
 * 创建客户端。
 * 
 * @author MJCoder
 *
 */
public class Client {

	BusinessDelegate businessService;

	/**
	 * @param businessService
	 */
	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}

	public void doTask() {
		businessService.doTask();
	}

}
