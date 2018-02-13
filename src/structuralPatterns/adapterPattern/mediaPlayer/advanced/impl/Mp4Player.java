/**
 * 
 */
package structuralPatterns.adapterPattern.mediaPlayer.advanced.impl;

import structuralPatterns.adapterPattern.mediaPlayer.advanced.AdvancedMediaPlayer;

/**
 * @author MJCoder
 *
 *         创建实现了 AdvancedMediaPlayer 接口的实体类。
 */
public class Mp4Player implements AdvancedMediaPlayer {

	/**
	 * 
	 */
	public Mp4Player() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adapterPattern.mediaPlayer.MediaPlayer#play(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adapterPattern.mediaPlayer.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adapterPattern.mediaPlayer.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing mp4 file. Name: " + fileName);
	}

}
