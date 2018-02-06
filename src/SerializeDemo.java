import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 */

/**
 * @author MJCoder
 *
 *         请注意，一个类的对象要想序列化成功，必须满足两个条件：
 * 
 *         该类必须实现 java.io.Serializable 对象。
 * 
 *         该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。
 */
public class SerializeDemo {

	/**
	 * 
	 */
	public SerializeDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:/eclipse/workspace/designPatterns/tmp");
		if (!file.exists()) {
			file.mkdirs();
		} else {
			File ser = new File("E:/eclipse/workspace/designPatterns/tmp/employee.ser");
			if (!ser.exists()) {
				try {
					ser.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		serializedObject();
		System.out.println();
		deserialization();
	}

	/**
	 * 序列化对象
	 * 
	 * ObjectOutputStream 类用来序列化一个对象。
	 * 
	 * 该程序执行后，就创建了一个名为 employee.ser 文件。该程序没有任何输出，但是你可以通过代码研读来理解程序的作用。
	 * 
	 * 注意： 当序列化一个对象到文件时， 按照 Java 的标准约定是给文件一个 .ser 扩展名。
	 */
	private static void serializedObject() {
		Employee e = new Employee(); // 实例化了一个 Employee对象
		e.name = "Reyan Ali";
		e.address = "Phokka Kuan, Ambehta Peer";
		e.SSN = 11122333;
		e.number = 101;
		try {
			// 将该对象序列化到一个文件中。
			FileOutputStream fileOut = new FileOutputStream("E:/eclipse/workspace/designPatterns/tmp/employee.ser"); // 创建一个名为employee.ser文件
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	/**
	 * 反序列化对象
	 * 
	 * 注意：
	 * 
	 * readObject() 方法中的 try/catch代码块尝试捕获 ClassNotFoundException 异常。
	 * 
	 * 对于 JVM 可以反序列化对象，它必须是能够找到字节码的类。如果JVM在反序列化对象的过程中找不到该类，则抛出一个
	 * ClassNotFoundException 异常。
	 * 
	 * 注意，readObject() 方法的返回值被转化成 Employee 引用。
	 * 
	 * 当对象被序列化时，属性 SSN 的值为 111222333，但是因为该属性是短暂的，该值没有被发送到输出流。所以反序列化后 Employee 对象的
	 * SSN 属性为 0。
	 */
	private static void deserialization() {
		Employee e = null;
		try {
			FileInputStream fileIn = new FileInputStream("E:/eclipse/workspace/designPatterns/tmp/employee.ser"); // employee.ser存储了Employee对象。
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Name: " + e.name);
		System.out.println("Address: " + e.address);
		System.out.println("SSN: " + e.SSN);
		System.out.println("Number: " + e.number);
	}

}

/**
 * 
 * @author MJCoder
 *
 *         请注意，一个类的对象要想序列化成功，必须满足两个条件：
 * 
 *         该类必须实现 java.io.Serializable 对象。
 * 
 *         该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。
 */
class Employee implements java.io.Serializable {
	public String name;
	public String address;
	public transient int SSN; // transient：短暂的 瞬态 瞬时的
	public int number;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}
}
