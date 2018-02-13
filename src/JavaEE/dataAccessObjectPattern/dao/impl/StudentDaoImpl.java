/**
 * 
 */
package JavaEE.dataAccessObjectPattern.dao.impl;

import java.util.ArrayList;
import java.util.List;

import JavaEE.dataAccessObjectPattern.Student;
import JavaEE.dataAccessObjectPattern.dao.StudentDao;

/**
 * 创建实现了上述接口的实体类。
 * 
 * @author MJCoder
 *
 */
public class StudentDaoImpl implements StudentDao {
	// 列表是当作一个数据库
	List<Student> students;

	/**
	 * 数据库缓存池
	 */
	public StudentDaoImpl() {
		// TODO Auto-generated constructor stub
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert", 0);
		Student student2 = new Student("John", 1);
		students.add(student1);
		students.add(student2);
	}

	/*
	 * 从数据库中检索学生名单 (non-Javadoc)
	 * 
	 * @see dataAccessObjectPattern.dao.StudentDao#getAllStudents()
	 */
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dataAccessObjectPattern.dao.StudentDao#getStudent(int)
	 */
	@Override
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		return students.get(rollNo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * dataAccessObjectPattern.dao.StudentDao#updateStudent(dataAccessObjectPattern.
	 * Student)
	 */
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * dataAccessObjectPattern.dao.StudentDao#deleteStudent(dataAccessObjectPattern.
	 * Student)
	 */
	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

}
