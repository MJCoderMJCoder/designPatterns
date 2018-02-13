/**
 * 
 */
package structuralPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MJCoder
 *
 *         创建Employee（雇员 员工 职员）类，该类带有Employee对象的列表。
 */
public class Employee {
	private String name;
	private String dept; // department：部门 部门表
	private int salary; // 薪水
	private List<Employee> subordinates; // 下属 属下 下属人数

	/**
	 * @param name
	 * @param dept
	 * @param salary
	 */
	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.subordinates = new ArrayList<Employee>();
	}

	public void add(Employee e) {
		subordinates.add(e);
	}

	public void remove(Employee e) {
		subordinates.remove(e);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
}
