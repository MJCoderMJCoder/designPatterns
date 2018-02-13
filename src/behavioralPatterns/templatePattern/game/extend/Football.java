/**
 * 
 */
package behavioralPatterns.templatePattern.game.extend;

import behavioralPatterns.templatePattern.game.Game;

/**
 * 创建扩展了Game类的实体类。
 * 
 * @author MJCoder
 *
 */
public class Football extends Game {

	/**
	 * 
	 */
	public Football() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see templatePattern.game.Game#initialize()
	 */
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Football Game Initialized! Start playing.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see templatePattern.game.Game#startPlay()
	 */
	@Override
	protected void startPlay() {
		// TODO Auto-generated method stub
		System.out.println("Football Game Started. Enjoy the game!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see templatePattern.game.Game#endPlay()
	 */
	@Override
	protected void endPlay() {
		// TODO Auto-generated method stub
		System.out.println("Football Game Finished!");
	}

}
