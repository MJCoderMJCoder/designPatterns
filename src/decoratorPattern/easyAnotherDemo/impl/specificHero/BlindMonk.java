/**
 * 
 */
package decoratorPattern.easyAnotherDemo.impl.specificHero;

import decoratorPattern.easyAnotherDemo.Hero;

/**
 * @author MJCoder
 *
 *         ConcreteComponent 具体英雄盲僧
 */
public class BlindMonk implements Hero {

	private String name;

	/**
	 * @param name
	 */
	public BlindMonk(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see decoratorPattern.easyDemo.Hero#learnSkills()
	 */
	@Override
	public void learnSkills() {
		// TODO Auto-generated method stub
		System.out.println(name + "学习了以上技能！");
	}
}
