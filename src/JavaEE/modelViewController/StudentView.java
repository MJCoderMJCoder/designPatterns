/**
 * 
 */
package JavaEE.modelViewController;

/**
 * 创建视图。
 * 
 * @author MJCoder
 *
 */
public class StudentView {

	/**
	 * 
	 */
	public StudentView() {
		// TODO Auto-generated constructor stub
	}

	public void printStudentDetails(String studentName, String studentRollNo) {
		System.out.println("Student: ");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
	}
}
