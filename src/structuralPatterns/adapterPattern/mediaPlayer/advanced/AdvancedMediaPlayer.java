/**
 * 
 */
package structuralPatterns.adapterPattern.mediaPlayer.advanced;

import structuralPatterns.adapterPattern.mediaPlayer.MediaPlayer;

/**
 * @author MJCoder
 *
 *         为更高级的媒体播放器创建接口。
 */
public interface AdvancedMediaPlayer extends MediaPlayer {
	public void playVlc(String fileName);

	public void playMp4(String fileName);
}
