/**
 * 
 */
package adapterPattern;

import adapterPattern.mediaPlayer.impl.AudioPlayer;

/**
 * @author MJCoder
 *
 *         使用 AudioPlayer 来播放不同类型的音频格式。
 */
public class AdapterPatternDemo {

	/**
	 * 
	 */
	public AdapterPatternDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}

}
