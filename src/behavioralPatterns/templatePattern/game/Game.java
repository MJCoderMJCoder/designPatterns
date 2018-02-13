/**
 * 
 */
package behavioralPatterns.templatePattern.game;

/**
 * 创建一个抽象类，它的模板方法被设置为 final。
 * 
 * @author MJCoder
 *
 */
public abstract class Game {

	/**
	 * 
	 */
	public Game() {
		// TODO Auto-generated constructor stub
	}

	protected abstract void initialize();

	protected abstract void startPlay();

	protected abstract void endPlay();

	// 模板
	public final void play() {

		// 初始化游戏
		initialize();

		// 开始游戏
		startPlay();

		// 结束游戏
		endPlay();
	}

}
