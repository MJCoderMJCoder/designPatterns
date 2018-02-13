/**
 * 
 */
package behavioralPatterns.chainOfResponsibilityPattern.log.extend;

import behavioralPatterns.chainOfResponsibilityPattern.log.AbstractLogger;

/**
 * 创建扩展了AbstractLogger记录器类的实体类。
 * 
 * @author MJCoder
 *
 */
public class ConsoleLogger extends AbstractLogger {

	/**
	 * 
	 */
	public ConsoleLogger(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see chainOfResponsibilityPattern.log.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("Standard Console::Logger: " + message);
	}

}
