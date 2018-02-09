/**
 * 
 */
package bridgePattern.shape;

import bridgePattern.color.DrawAPI;

/**
 * 桥接
 * 
 * @author MJCoder
 * 
 *         使用DrawAPI接口创建抽象类 Shape。
 */
public abstract class Shape {

	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
