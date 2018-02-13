/**
 * 
 */
package behavioralPatterns.iteratorPattern.container.impl;

import behavioralPatterns.iteratorPattern.container.Container;
import behavioralPatterns.iteratorPattern.container.Iterator;

/**
 * 创建实现了 Container 接口的实体类。该类有实现了 Iterator 接口的内部类 NameIterator。
 * 
 * @author MJCoder
 *
 */
public class NameRepository implements Container {
	public String names[] = { "Robert", "John", "Julie", "Lora" };

	/**
	 * 
	 */
	public NameRepository() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see iteratorPattern.container.Container#getIterator()
	 */
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}

	/**
	 * 实现了 Iterator 接口的内部类 NameIterator。
	 * 
	 * @author MJCoder
	 *
	 */
	private class NameIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}

}
