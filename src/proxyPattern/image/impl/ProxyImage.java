/**
 * 
 */
package proxyPattern.image.impl;

import proxyPattern.image.Image;

/**
 * 创建实现接口的实体类。
 * 
 * 为RealImage对象提供一种代理以控制对这个对象的访问。
 * 
 * @author MJCoder
 *
 */
public class ProxyImage implements Image {
	private String fileName;
	private RealImage realImage;

	/**
	 * @param fileName
	 */
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see proxyPattern.image.Image#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
