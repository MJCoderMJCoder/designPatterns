/**
 * 
 */
package structuralPatterns.proxyPattern.image.impl;

import structuralPatterns.proxyPattern.image.Image;

/**
 * 创建实现接口的实体类。
 * 
 * @author MJCoder
 */
public class RealImage implements Image {
	private String fileName;

	/**
	 * @param fileName
	 */
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see proxyPattern.image.Image#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying " + fileName);
	}

}
