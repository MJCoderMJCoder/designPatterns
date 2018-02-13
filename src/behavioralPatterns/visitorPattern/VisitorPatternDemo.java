/**
 * 
 */
package behavioralPatterns.visitorPattern;

import behavioralPatterns.visitorPattern.acceptOperation.ComputerPart;
import behavioralPatterns.visitorPattern.acceptOperation.impl.Computer;
import behavioralPatterns.visitorPattern.visitor.impl.ComputerPartDisplayVisitor;

/**
 * 使用 ComputerPartDisplayVisitor 来显示 Computer 的组成部分。
 * 
 * @author MJCoder
 *
 */
public class VisitorPatternDemo {

	/**
	 * 
	 */
	public VisitorPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
