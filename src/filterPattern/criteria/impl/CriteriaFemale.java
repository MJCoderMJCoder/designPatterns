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
 *         创建实现了 Criteria 接口的实体类。女性 雌性的 女子
 */
public class CriteriaFemale implements Criteria {

	/**
	 * 
	 */
	public CriteriaFemale() {
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
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("FEMALE")) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
