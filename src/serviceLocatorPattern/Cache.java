/**
 * 
 */
package serviceLocatorPattern;

import java.util.ArrayList;
import java.util.List;

import serviceLocatorPattern.service.Service;

/**
 * 创建缓存 Cache。
 * 
 * @author MJCoder
 *
 */
public class Cache {
	private List<Service> services;

	/**
	 * 
	 */
	public Cache() {
		// TODO Auto-generated constructor stub
		services = new ArrayList<Service>();
	}

	public Service getService(String serviceName) {
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(serviceName)) {
				System.out.println("Returning cached  " + serviceName + " object");
				return service;
			}
		}
		return null;
	}

	public void addService(Service newService) {
		boolean exists = false;
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(newService.getName())) {
				exists = true;
			}
		}
		if (!exists) {
			services.add(newService);
		}
	}

}
