/**
 * 
 */
package JavaEE.dataAccessObjectPattern;

import JavaEE.dataAccessObjectPattern.dao.StudentDao;
import JavaEE.dataAccessObjectPattern.dao.impl.StudentDaoImpl;

/**
 * 使用 StudentDao 来演示数据访问对象模式的用法。
 * 
 * @author MJCoder
 */
public class DaoPatternDemo {

	/**
	 * 
	 */
	public DaoPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao studentDao = new StudentDaoImpl();

		// 输出所有的学生
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}
		System.out.println();
		// 更新学生
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
		System.out.println();
		// 获取学生
		studentDao.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		System.out.println();
		// 删除学生
		studentDao.deleteStudent(studentDao.getStudent(1));
		// 输出所有的学生
		for (Student student1 : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student1.getRollNo() + ", Name : " + student1.getName() + " ]");
		}
		System.out.println();
	}

}
