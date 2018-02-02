/**
 * 
 */
package decoratorPattern.easyAnotherDemo.impl.skills.subclass;

import decoratorPattern.easyAnotherDemo.Hero;
import decoratorPattern.easyAnotherDemo.impl.skills.Skills;

/**
 * @author MJCoder
 *
 *         ConreteDecorator 技能：R
 */
public class Skill_R extends Skills {
	private String skillName;

	/**
	 * @param hero
	 * @param skillName
	 */
	public Skill_R(Hero hero, String skillName) {
		super(hero);
		this.skillName = skillName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see decoratorPattern.easyAnotherDemo.Hero#learnSkills()
	 */
	@Override
	public void learnSkills() {
		// TODO Auto-generated method stub
		System.out.println("学习了技能R:" + skillName);
		super.learnSkills();
	}

}
