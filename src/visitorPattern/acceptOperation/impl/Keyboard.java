/**
 * 
 */
package visitorPattern.acceptOperation.impl;

import visitorPattern.acceptOperation.ComputerPart;
import visitorPattern.visitor.ComputerPartVisitor;

/**
 * 创建实现了ComputerPart接口的实体类。
 * 
 * Keyboard：键盘；电子琴
 * 
 * @author MJCoder
 */
public class Keyboard implements ComputerPart {

	/**
	 * 
	 */
	public Keyboard() {
		// TODO Auto-generated constructor stub
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
		computerPartVisitor.visit(this);
	}

}
