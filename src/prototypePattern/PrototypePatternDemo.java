/**
 * 
 */
package prototypePattern;

import prototypePattern.shape.Shape;

/**
 * @author MJCoder
 *
 *         使用 ShapeCache 类来获取存储在 Hashtable 中的形状的克隆。
 */
public class PrototypePatternDemo {

	/**
	 * 
	 */
	public PrototypePatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCache.loadCache();
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType() + "," + clonedShape.getId());
		System.out.println(clonedShape);

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType() + "," + clonedShape2.getId());
		System.out.println(clonedShape2 + "\n");

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType() + "," + clonedShape3.getId());
		System.out.println(clonedShape3 + "\n");

		System.out.println("Shape : " + ((Shape) ShapeCache.getShape("1")).getType() + ","
				+ ((Shape) ShapeCache.getShape("1")).getId());
		System.out.println(((Shape) ShapeCache.getShape("1")) + "\n");

		System.out.println("Shape : " + ((Shape) ShapeCache.getShape("2")).getType() + ","
				+ ((Shape) ShapeCache.getShape("2")).getId());
		System.out.println(((Shape) ShapeCache.getShape("2")) + "\n");

		System.out.println("Shape : " + ((Shape) ShapeCache.getShape("3")).getType() + ","
				+ ((Shape) ShapeCache.getShape("3")).getId());
		System.out.println(((Shape) ShapeCache.getShape("3")) + "\n");
	}
}
