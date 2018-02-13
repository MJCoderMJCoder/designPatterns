/**
 * 
 */
package structuralPatterns.decoratorPattern.easyAnotherDemo.impl.skills.extend;

import structuralPatterns.decoratorPattern.easyAnotherDemo.Hero;
import structuralPatterns.decoratorPattern.easyAnotherDemo.impl.skills.Skills;

/**
 * @author MJCoder
 *
 *         ConreteDecorator 技能：E
 */
public class Skill_E extends Skills {
	private String skillName;

	/**
	 * @param hero
	 * @param skillName
	 */
	public Skill_E(Hero hero, String skillName) {
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
		System.out.println("学习了技能E:" + skillName);
		super.learnSkills();
	}

}
