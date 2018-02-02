/**
 * 
 */
package decoratorPattern.easyAnotherDemo.impl.skills.subclass;

import decoratorPattern.easyAnotherDemo.Hero;
import decoratorPattern.easyAnotherDemo.impl.skills.Skills;

/**
 * @author MJCoder
 *
 *         ConcreteDecorator 技能：Q
 * 
 *         （concrete：具体的 混凝土 具体物）
 */
public class Skill_Q extends Skills {

	private String skillName;

	/**
	 * @param hero
	 * @param skillName
	 */
	public Skill_Q(Hero hero, String skillName) {
		super(hero);
		this.skillName = skillName;
	}

	@Override
	public void learnSkills() {
		// TODO Auto-generated method stub
		System.out.println("学习了技能Q:" + skillName);
		super.learnSkills();
	}

}
