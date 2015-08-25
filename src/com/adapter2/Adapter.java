package com.adapter2;

public class Adapter implements MediaPlayer {

	AdvancedMediaPlyaer advancedMediaPlyaer;

	public Adapter(String format) {
		if (format.equalsIgnoreCase("mp3")) {
			advancedMediaPlyaer = new Mp3Player();
		} else if (format.equalsIgnoreCase("vlc")) {
			advancedMediaPlyaer = new VlcPlayer();
		}
	}

	@Override
	public void playComposition(String format, String name) {
		if (format.equalsIgnoreCase("mp3")) {
			advancedMediaPlyaer.playMp3(name);
		} else if (format.equalsIgnoreCase("vlc")) {
			advancedMediaPlyaer.playVlc(name);
		}
	}

}
