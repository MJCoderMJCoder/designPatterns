/**
 * 
 */
package JavaEE.dataAccessObjectPattern.dao;

import java.util.List;

import JavaEE.dataAccessObjectPattern.Student;

/**
 * 创建数据访问对象接口。
 * 
 * @author MJCoder
 *
 */
public interface StudentDao {
	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);
}
