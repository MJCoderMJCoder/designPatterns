/**
 * 
 */
package builderPattern.food.impl;

import builderPattern.food.Food;
import builderPattern.pack.Pack;
import builderPattern.pack.impl.Bottle;

/**
 * @author MJCoder
 * 
 *         实现 Food 接口的抽象类(冷饮)
 *
 */
public abstract class ColdDrink implements Food {

	/**
	 * 
	 */
	public ColdDrink() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see builderPattern.food.Food#packing()
	 */
	@Override
	public Pack packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

}
