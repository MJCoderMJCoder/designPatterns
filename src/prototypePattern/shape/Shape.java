/**
 * 
 */
package prototypePattern.shape;

/**
 * @author MJCoder
 *
 *         创建一个实现了 Clonable 接口的抽象类。
 * 
 *         原型模式（Prototype Pattern）：
 *         是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。
 */
public abstract class Shape implements Cloneable {

	/**
	 * 
	 */
	public Shape() {
		// TODO Auto-generated constructor stub
	}

	abstract void draw();

	private String id;
	protected String type;

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
