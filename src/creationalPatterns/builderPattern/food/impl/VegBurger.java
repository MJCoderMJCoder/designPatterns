/**
 * 
 */
package creationalPatterns.builderPattern.food.impl;

/**
 * @author MJCoder
 * 
 *         扩展了 Burger 的实体类。(蔬菜汉堡)
 */
public class VegBurger extends Burger {

	/**
	 * 
	 */
	public VegBurger() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Veg Burger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}

}
