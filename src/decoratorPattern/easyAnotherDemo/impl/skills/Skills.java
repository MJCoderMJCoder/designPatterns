/**
 * 
 */
package decoratorPattern.easyAnotherDemo.impl.skills;

import decoratorPattern.easyAnotherDemo.Hero;

/**
 * @author MJCoder
 *
 *         Decorator 技能栏
 */
public class Skills implements Hero {
	// 持有一个英雄对象接口
	protected Hero hero;

	/**
	 * @param hero
	 */
	public Skills(Hero hero) {
		this.hero = hero;
	}

	@Override
	public void learnSkills() {
		// TODO Auto-generated method stub
		if (hero != null) {
			hero.learnSkills();
		}
		System.out.println("Skills implements Hero");
	}
}
