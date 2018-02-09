/**
 * 
 */
package modelViewController;

/**
 * 使用 StudentController 方法来演示 MVC 设计模式的用法。
 * 
 * @author MJCoder
 *
 */
public class MVCPatternDemo {

	/**
	 * 
	 */
	public MVCPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	private static Student initStudent() { // retrive：检索 寻回
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student model = initStudent();

		// 创建一个视图：把学生详细信息输出到控制台
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();

		// 更新模型数据
		controller.setStudentName("John");

		controller.updateView();

	}

}
