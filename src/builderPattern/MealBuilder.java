/**
 * 
 */
package builderPattern;

import builderPattern.food.impl.ChickenBurger;
import builderPattern.food.impl.Coke;
import builderPattern.food.impl.Pepsi;
import builderPattern.food.impl.VegBurger;

/**
 * @author MJCoder
 *
 *         创建一个 MealBuilder类，实际的 builder类负责创建 Meal对象。
 * 
 *         建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系。
 */
public class MealBuilder {

	/**
	 * 
	 */
	public MealBuilder() {
		// TODO Auto-generated constructor stub
	}

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addFood(new VegBurger());
		meal.addFood(new Coke());
		return meal;
	}

	public Meal prepareChickenVegMeal() {
		Meal meal = new Meal();
		meal.addFood(new ChickenBurger());
		meal.addFood(new Pepsi());
		return meal;
	}

}
