/**
 * 
 */
package structuralPatterns.adapterPattern.mediaPlayer.impl;

import structuralPatterns.adapterPattern.mediaPlayer.MediaAdapter;
import structuralPatterns.adapterPattern.mediaPlayer.MediaPlayer;

/**
 * @author MJCoder
 *
 *         创建实现了 MediaPlayer 接口的实体类。
 */
public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;

	/**
	 * 
	 */
	public AudioPlayer() {
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
		// 播放 mp3 音乐文件的内置支持
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		// mediaAdapter 提供了播放其他文件格式的支持
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}

	}

}
