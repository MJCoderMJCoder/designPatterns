/**
 * 
 */
package JavaEE.transferObjectPattern;

/**
 * 创建传输对象。
 * 
 * @author MJCoder
 */
public class StudentVO {
	private String name;
	private int rollNo;

	/**
	 * @param name
	 * @param rollNo
	 */
	public StudentVO(String name, int rollNo) {
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
