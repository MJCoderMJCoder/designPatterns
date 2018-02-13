/**
 * 
 */
package behavioralPatterns.visitorPattern.acceptOperation;

import behavioralPatterns.visitorPattern.visitor.ComputerPartVisitor;

/**
 * 定义一个表示元素的接口。 电脑的各个组成部分
 * 
 * @author MJCoder
 */
public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
