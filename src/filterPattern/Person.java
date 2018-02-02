/**
 * 
 */
package filterPattern;

/**
 * @author MJCoder
 *
 *         创建一个类，在该类上应用标准。
 */
public class Person {
	private String name;
	private String gender;
	private String maritalStatus; // 婚姻状况 星座 婚姻情形

	public Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

}
