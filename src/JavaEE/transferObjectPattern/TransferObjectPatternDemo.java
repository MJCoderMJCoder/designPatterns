/**
 * 
 */
package JavaEE.transferObjectPattern;

/**
 * 使用 StudentBO 来演示传输对象设计模式。
 * 
 * @author MJCoder
 */
public class TransferObjectPatternDemo {

	/**
	 * 
	 */
	public TransferObjectPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();

		// 输出所有的学生
		for (StudentVO student : studentBusinessObject.getAllStudents()) {
			// 服务器端的业务类通常从数据库读取数据，然后填充POJO，并把它发送到客户端或按值传递它。对于客户端，传输对象是只读的。
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}

		// 更新学生
		StudentVO student = studentBusinessObject.getAllStudents().get(0);
		student.setName("Michael");
		// 客户端可以创建自己的传输对象，并把它传递给服务器，以便一次性更新数据库中的数值。
		studentBusinessObject.updateStudent(student);

		// 获取学生
		studentBusinessObject.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}
}
