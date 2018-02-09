/**
 * 
 */
package modelViewController;

/**
 * 创建控制器。
 * 
 * @author MJCoder
 */
public class StudentController {
	private Student model;
	private StudentView view;

	/**
	 * @param model
	 * @param view
	 */
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}

}
