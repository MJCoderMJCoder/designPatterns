/**
 * 
 */
package builderPattern.food.impl;

import builderPattern.food.Food;
import builderPattern.pack.Pack;
import builderPattern.pack.impl.Wrapper;

/**
 * @author MJCoder
 * 
 *         实现 Food 接口的抽象类（汉堡）
 *
 */
public abstract class Burger implements Food {

	/**
	 * 
	 */
	public Burger() {
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
		return new Wrapper();
	}
}
