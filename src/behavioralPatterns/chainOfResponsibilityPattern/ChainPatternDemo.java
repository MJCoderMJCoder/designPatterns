/**
 * 
 */
package behavioralPatterns.chainOfResponsibilityPattern;

import behavioralPatterns.chainOfResponsibilityPattern.log.AbstractLogger;
import behavioralPatterns.chainOfResponsibilityPattern.log.extend.ConsoleLogger;
import behavioralPatterns.chainOfResponsibilityPattern.log.extend.DebugLogger;
import behavioralPatterns.chainOfResponsibilityPattern.log.extend.ErrorLogger;

/**
 * 创建不同类型的记录器。 赋予它们不同的错误级别，并在每个记录器中设置下一个记录器。每个记录器中的下一个记录器代表的是链的一部分。
 * 
 * @author MJCoder
 *
 */
public class ChainPatternDemo {

	/**
	 * 
	 */
	public ChainPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 级别高的优先打印。(责任链模式)
	 * 
	 * @return
	 */
	private static AbstractLogger getChainOfLoggers() {

		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR); // 3
		AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG); // 2
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO); // 1

		errorLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.INFO, "This is an info level information.");
		System.out.println();

		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
		System.out.println();

		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error level information.");
		System.out.println();

	}

}
