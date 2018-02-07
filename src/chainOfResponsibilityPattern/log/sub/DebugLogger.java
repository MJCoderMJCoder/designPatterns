/**
 * 
 */
package chainOfResponsibilityPattern.log.sub;

import chainOfResponsibilityPattern.log.AbstractLogger;

/**
 * @author MJCoder
 *
 */
public class DebugLogger extends AbstractLogger {

	/**
	 * 
	 */
	public DebugLogger(int level) {
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
		System.out.println("Debug::Logger: " + message);
	}

}
