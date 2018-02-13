package creationalPatterns.builderPattern.food;

import creationalPatterns.builderPattern.pack.Pack;

/**
 * 食物条目
 * 
 * @author MJCoder
 *
 */
public interface Food {
	public String name();

	public Pack packing();

	public float price();
}
