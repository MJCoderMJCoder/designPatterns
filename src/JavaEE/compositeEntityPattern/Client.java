/**
 * 
 */
package JavaEE.compositeEntityPattern;

/**
 * 创建使用组合实体的客户端类。
 * 
 * @author MJCoder
 */
public class Client {
	private CompositeEntity compositeEntity = new CompositeEntity();

	/**
	 * 
	 */
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public void printData() {
		for (int i = 0; i < compositeEntity.getData().length; i++) {
			System.out.println("Data[]: " + compositeEntity.getData()[i]);
		}
	}

	public void setData(String data1, String data2) {
		compositeEntity.setData(data1, data2);
	}
}