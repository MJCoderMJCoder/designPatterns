/**
 * 
 */
package templatePattern.game.xted;

import templatePattern.game.Game;

/**
 * 创建扩展了Game类的实体类。
 * 
 * @author MJCoder
 *
 */
public class Cricket extends Game {

	/**
	 * 
	 */
	public Cricket() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	protected void startPlay() {
		// TODO Auto-generated method stub
		System.out.println("Cricket Game Started. Enjoy the game!");
	}

	@Override
	protected void endPlay() {
		// TODO Auto-generated method stub
		System.out.println("Cricket Game Finished!");
	}

}
