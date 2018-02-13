/**
 * 
 */
package behavioralPatterns.visitorPattern.visitor.impl;

import behavioralPatterns.visitorPattern.acceptOperation.impl.Computer;
import behavioralPatterns.visitorPattern.acceptOperation.impl.Keyboard;
import behavioralPatterns.visitorPattern.acceptOperation.impl.Monitor;
import behavioralPatterns.visitorPattern.acceptOperation.impl.Mouse;
import behavioralPatterns.visitorPattern.visitor.ComputerPartVisitor;

/**
 * 创建实现了ComputerPartVisitor接口的实体访问者
 * 
 * @author MJCoder
 *
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	/**
	 * 
	 */
	public ComputerPartDisplayVisitor() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see visitorPattern.visitor.ComputerPartVisitor#visit(visitorPattern.
	 * acceptOperation.impl.Computer)
	 */
	@Override
	public void visit(Computer computer) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Computer.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see visitorPattern.visitor.ComputerPartVisitor#visit(visitorPattern.
	 * acceptOperation.impl.Mouse)
	 */
	@Override
	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Mouse.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see visitorPattern.visitor.ComputerPartVisitor#visit(visitorPattern.
	 * acceptOperation.impl.Keyboard)
	 */
	@Override
	public void visit(Keyboard keyboard) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Keyboard.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see visitorPattern.visitor.ComputerPartVisitor#visit(visitorPattern.
	 * acceptOperation.impl.Monitor)
	 */
	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Monitor.");
	}

}
