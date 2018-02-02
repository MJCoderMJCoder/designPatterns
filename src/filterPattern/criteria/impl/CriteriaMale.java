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
 *         创建实现了 Criteria 接口的实体类。 男性 性别 男的
 */
public class CriteriaMale implements Criteria {

	/**
	 * 
	 */
	public CriteriaMale() {
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
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
