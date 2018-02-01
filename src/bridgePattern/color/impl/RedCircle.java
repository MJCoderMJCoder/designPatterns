/**
 * 
 */
package bridgePattern.color.impl;

import bridgePattern.color.DrawAPI;

/**
 * @author MJCoder
 *
 *         创建实现了 DrawAPI 接口的实体桥接实现类。
 */
public class RedCircle implements DrawAPI {

	/**
	 * 
	 */
	public RedCircle() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see bridgePattern.DrawAPI#drawCircle(int, int, int)
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
	}
}
