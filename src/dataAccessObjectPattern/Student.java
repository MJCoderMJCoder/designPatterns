/**
 * 
 */
package dataAccessObjectPattern;

/**
 * 创建数值对象。
 * 
 * @author MJCoder
 *
 */
public class Student {
	private String name;
	private int rollNo;

	/**
	 * @param name
	 * @param rollNo
	 */
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}

	/**
	 * @param rollNo
	 *            the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}
