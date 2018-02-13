/**
 * 
 */
package behavioralPatterns.visitorPattern.acceptOperation.impl;

import behavioralPatterns.visitorPattern.acceptOperation.ComputerPart;
import behavioralPatterns.visitorPattern.visitor.ComputerPartVisitor;

/**
 * 创建实现了ComputerPart接口的实体类。
 * 
 * Monitor：监视器；监听；监控；班长
 * 
 * @author MJCoder
 *
 */
public class Monitor implements ComputerPart {

	/**
	 * 
	 */
	public Monitor() {
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
