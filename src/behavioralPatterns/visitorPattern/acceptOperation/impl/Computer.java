/**
 * 
 */
package behavioralPatterns.visitorPattern.acceptOperation.impl;

import behavioralPatterns.visitorPattern.acceptOperation.ComputerPart;
import behavioralPatterns.visitorPattern.visitor.ComputerPartVisitor;

/**
 * 创建实现了ComputerPart接口的实体类。
 * 
 * Computer：计算机；电脑；电子计算机
 * 
 * @author MJCoder
 *
 */
public class Computer implements ComputerPart {
	ComputerPart[] parts;

	/**
	 * 
	 */
	public Computer() {
		// TODO Auto-generated constructor stub
		parts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * visitorPattern.acceptOperation.ComputerPart#accept(visitorPattern.visitor.
	 * ComputerPartVisitor)
	 */
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
		for (int i = 0; i < parts.length; i++) {
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
