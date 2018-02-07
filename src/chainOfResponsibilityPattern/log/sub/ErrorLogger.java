/**
 * 
 */
package chainOfResponsibilityPattern.log.sub;

import chainOfResponsibilityPattern.log.AbstractLogger;

/**
 * 创建扩展了AbstractLogger记录器类的实体类。
 * 
 * @author MJCoder
 *
 */
public class ErrorLogger extends AbstractLogger {

	/**
	 * 
	 */
	public ErrorLogger(int level) {
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
		System.out.println("Error Console::Logger: " + message);
	}

}
