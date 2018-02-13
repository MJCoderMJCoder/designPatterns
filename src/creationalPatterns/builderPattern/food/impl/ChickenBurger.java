/**
 * 
 */
package creationalPatterns.builderPattern.food.impl;

/**
 * @author MJCoder
 *
 *         扩展了 Burger 的实体类。(鸡肉汉堡)
 */
public class ChickenBurger extends Burger {

	/**
	 * 
	 */
	public ChickenBurger() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see builderPattern.food.Food#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Chicken Burger";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see builderPattern.food.Food#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 50.5f;
	}

}
