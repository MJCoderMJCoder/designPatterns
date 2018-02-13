/**
 * 
 */
package behavioralPatterns.templatePattern;

import behavioralPatterns.templatePattern.game.Game;
import behavioralPatterns.templatePattern.game.extend.Cricket;
import behavioralPatterns.templatePattern.game.extend.Football;

/**
 * 使用 Game 的模板方法 play() 来演示游戏的定义方式。
 * 
 * @author MJCoder
 *
 */
public class TemplatePatternDemo {

	/**
	 * 
	 */
	public TemplatePatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Cricket();
		game.play(); // 执行它的方法的方式/模板
		System.out.println();
		game = new Football();
		game.play(); // 执行它的方法的方式/模板

	}

}
