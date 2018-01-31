/**
 * 
 */
package builderPattern;

/**
 * @author MJCoder
 *
 *         BuiderPatternDemo 使用 MealBuider 来演示建造者模式（Builder Pattern）。
 */
public class BuilderPatternDemo {

	/**
	 * 
	 */
	public BuilderPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showFoods();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareChickenVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showFoods();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}
}
