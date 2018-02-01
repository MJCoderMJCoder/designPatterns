/**
 * 
 */
package adapterPattern.mediaPlayer;

import adapterPattern.mediaPlayer.advanced.AdvancedMediaPlayer;
import adapterPattern.mediaPlayer.advanced.impl.Mp4Player;
import adapterPattern.mediaPlayer.advanced.impl.VlcPlayer;

/**
 * @author MJCoder
 *
 *         创建实现了 MediaPlayer 接口的适配器类。
 */
public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;

	/**
	 * 
	 */
	public MediaAdapter(String audioType) {
		// TODO Auto-generated constructor stub
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
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
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}

	}

}
