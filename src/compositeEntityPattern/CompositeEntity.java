/**
 * 
 */
package compositeEntityPattern;

/**
 * 创建组合实体。
 * 
 * @author MJCoder
 */
public class CompositeEntity {
	private CoarseGrainedObject cgo = new CoarseGrainedObject();

	/**
	 * 
	 */
	public CompositeEntity() {
		// TODO Auto-generated constructor stub
	}

	public void setData(String data1, String data2) {
		cgo.setData(data1, data2);
	}

	public String[] getData() {
		return cgo.getData();
	}

}
