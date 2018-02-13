/**
 * 
 */
package structuralPatterns.filterPattern;

import java.util.ArrayList;
import java.util.List;

import structuralPatterns.filterPattern.criteria.Criteria;
import structuralPatterns.filterPattern.criteria.impl.AndCriteria;
import structuralPatterns.filterPattern.criteria.impl.CriteriaFemale;
import structuralPatterns.filterPattern.criteria.impl.CriteriaMale;
import structuralPatterns.filterPattern.criteria.impl.CriteriaSingle;
import structuralPatterns.filterPattern.criteria.impl.OrCriteria;

/**
 * @author MJCoder
 *
 *         使用不同的标准（Criteria）和它们的结合来过滤 Person 对象的列表。
 */
public class CriteriaPatternDemo {

	/**
	 * 
	 */
	public CriteriaPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male); // 而且 和 逻辑与
		Criteria singleOrFemale = new OrCriteria(single, female); // 或者

		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));

		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));

		System.out.println("\nSingle Males: ");
		printPersons(singleMale.meetCriteria(persons));

		System.out.println("\nSingle Or Females: ");
		printPersons(singleOrFemale.meetCriteria(persons));

	}

	private static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}

}
