/**
 * 
 */
package creationalPatterns.builderPattern.food.impl;

/**
 * @author MJCoder
 * 
 *         扩展了 ColdDrink 的实体类。(百世可乐)
 */
public class Pepsi extends ColdDrink {

	/**
	 * 
	 */
	public Pepsi() {
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
		return "Pepsi";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see builderPattern.food.Food#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 35.0f;
	}

}
