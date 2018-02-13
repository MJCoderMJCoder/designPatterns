/**
 * 
 */
package behavioralPatterns.chainOfResponsibilityPattern.log;

/**
 * 创建抽象的记录器类。带有详细的日志记录级别。
 * 
 * @author MJCoder
 *
 */
public abstract class AbstractLogger {
	public static int INFO = 1; // 信息；情报；统计
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level; // 水平；标准

	// 责任链中的下一个元素
	protected AbstractLogger nextLogger;

	/**
	 * 
	 */
	public AbstractLogger() {
		// TODO Auto-generated constructor stub
	}

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	/**
	 * 调用该方法时传入级别(level)，并与责任链中的对象级别（this.level）进行比对(每个记录器消息的级别是否属于自己的级别)，级别高的优先打印。
	 * 
	 * @param level
	 * @param message
	 */
	public void logMessage(int level, String message) {
		if (this.level >= level) {
			write(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	abstract protected void write(String message);

}
