/**
 * 
 */
package creationalPatterns.builderPattern.food.impl;

/**
 * @author MJCoder
 * 
 *         扩展了 ColdDrink 的实体类。(可口可乐)
 */
public class Coke extends ColdDrink {

	/**
	 * 
	 */
	public Coke() {
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
		return "Coke";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see builderPattern.food.Food#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 30.0f;
	}
}
