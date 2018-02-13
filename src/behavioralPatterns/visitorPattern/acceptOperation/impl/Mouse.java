/**
 * 
 */
package behavioralPatterns.visitorPattern.acceptOperation.impl;

import behavioralPatterns.visitorPattern.acceptOperation.ComputerPart;
import behavioralPatterns.visitorPattern.visitor.ComputerPartVisitor;

/**
 * 创建实现了ComputerPart接口的实体类。
 * 
 * Mouse：鼠标；老鼠；胆小羞怯的人；捕鼠；窥探
 * 
 * @author MJCoder
 *
 */
public class Mouse implements ComputerPart {

	/**
	 * 
	 */
	public Mouse() {
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
