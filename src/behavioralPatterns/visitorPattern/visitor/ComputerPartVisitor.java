/**
 * 
 */
package behavioralPatterns.visitorPattern.visitor;

import behavioralPatterns.visitorPattern.acceptOperation.impl.Computer;
import behavioralPatterns.visitorPattern.acceptOperation.impl.Keyboard;
import behavioralPatterns.visitorPattern.acceptOperation.impl.Monitor;
import behavioralPatterns.visitorPattern.acceptOperation.impl.Mouse;

/**
 * 定义一个表示访问者的接口。
 * 
 * Visitor：访问者，参观者；视察者；候鸟；游客
 * 
 * visit：访问；参观；逗留；视察；暂住；闲谈；拜访
 * 
 * @author MJCoder
 */
public interface ComputerPartVisitor {
	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}
