/**
 * 
 */
package filterPattern.criteria.impl;

import java.util.ArrayList;
import java.util.List;

import filterPattern.Person;
import filterPattern.criteria.Criteria;

/**
 * @author MJCoder
 *
 *         创建实现了 Criteria 接口的实体类。未婚 单一的
 */
public class CriteriaSingle implements Criteria {

	/**
	 * 
	 */
	public CriteriaSingle() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see filterPattern.criteria.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
