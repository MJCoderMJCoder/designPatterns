/**
 * 
 */
package compositeEntityPattern;

import compositeEntityPattern.dependentObj.DependentObject1;
import compositeEntityPattern.dependentObj.DependentObject2;

/**
 * 创建粗粒度对象。
 * 
 * @author MJCoder
 *
 */
public class CoarseGrainedObject {
	DependentObject1 do1 = new DependentObject1();
	DependentObject2 do2 = new DependentObject2();

	/**
	 * 
	 */
	public CoarseGrainedObject() {
		// TODO Auto-generated constructor stub
	}

	public void setData(String data1, String data2) {
		do1.setData(data1);
		do2.setData(data2);
	}

	public String[] getData() {
		return new String[] { do1.getData(), do2.getData() };
	}

}
