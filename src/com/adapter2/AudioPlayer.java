package com.adapter2;

public class AudioPlayer implements MediaPlayer {

	Adapter adapter;
	
	@Override
	public void playComposition(String format, String name) {
		if (format.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 " + name);
		} else if(format.equalsIgnoreCase("vlc")) {
			adapter = new Adapter(format);
			adapter.playComposition(format, name);
		} else {
			System.out.println("wrong format: " + format);
		}
	}

}
