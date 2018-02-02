/**
 * 
 */
package compositePattern;

/**
 * @author MJCoder
 *
 *         使用 Employee 类来创建和打印员工的层次结构。
 */
public class CompositePatternDemo {

	/**
	 * 
	 */
	public CompositePatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee CEO = new Employee("John", "CEO", 30000); // 约翰：执行总裁（chief executive officer）

		Employee headSales = new Employee("Robert", "Head Sales", 20000); // 罗伯特：销售主管

		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000); // 米歇尔：市场营销负责人

		Employee clerk1 = new Employee("Laura", "Marketing", 10000); // 劳拉：市场营销 市场 行销
		Employee clerk2 = new Employee("Bob", "Marketing", 10000); // 波波头：市场营销 市场 行销

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000); // 理查德：销售 产品销售 推销员
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000); // 罗伯：销售 产品销售 推销员

		CEO.add(headSales);
		CEO.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		// 打印该组织的所有员工
		System.out.println(CEO);
		for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println("\t" + headEmployee);
			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println("\t\t" + employee);
			}
		}
	}
}
