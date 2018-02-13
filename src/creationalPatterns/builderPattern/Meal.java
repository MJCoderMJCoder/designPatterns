/**
 * 
 */
package creationalPatterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

import creationalPatterns.builderPattern.food.Food;

/**
 * @author MJCoder
 *
 *         创建一个 Meal类，带有上面定义的Food对象。
 */
public class Meal {

	/**
	 * 
	 */
	public Meal() {
		// TODO Auto-generated constructor stub
	}

	private List<Food> foods = new ArrayList<Food>();

	public void addFood(Food food) {
		foods.add(food);
	}

	public float getCost() {
		float cost = 0.0f;
		for (Food food : foods) {
			cost += food.price();
		}
		return cost;
	}

	public void showFoods() {
		for (Food food : foods) {
			System.out.print("Food : " + food.name());
			System.out.print(", Packing : " + food.packing().pack());
			System.out.println(", Price : " + food.price());
		}
	}

}
