/**
 * 
 */
package decoratorPattern.easyAnotherDemo;

import decoratorPattern.easyAnotherDemo.impl.skills.Skills;
import decoratorPattern.easyAnotherDemo.impl.skills.subclass.Skill_E;
import decoratorPattern.easyAnotherDemo.impl.skills.subclass.Skill_Q;
import decoratorPattern.easyAnotherDemo.impl.skills.subclass.Skill_R;
import decoratorPattern.easyAnotherDemo.impl.skills.subclass.Skill_W;
import decoratorPattern.easyAnotherDemo.impl.specificHero.BlindMonk;

/**
 * @author MJCoder
 *
 *         客户端：召唤师
 */
public class PlayerDemo {

	/**
	 * 
	 */
	public PlayerDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 选择英雄
		Hero hero = new BlindMonk("李青");
		hero.learnSkills();
		System.out.println("");

		Skills skills = new Skills(hero);
		skills.learnSkills();
		System.out.println("");
		Skills r = new Skill_R(skills, "猛龙摆尾");
		r.learnSkills();
		System.out.println("");
		Skills e = new Skill_E(r, "天雷破/摧筋断骨");
		e.learnSkills();
		System.out.println("");
		Skills w = new Skill_W(e, "金钟罩/铁布衫");
		w.learnSkills();
		System.out.println("");
		Skills q = new Skill_Q(w, "天音波/回音击");
		q.learnSkills();
	}

}
