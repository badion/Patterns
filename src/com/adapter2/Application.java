package com.adapter2;

public class Application {


	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.playComposition("mp3", "lalla");
		audioPlayer.playComposition("olo", "some song");
		audioPlayer.playComposition("vlc", "sdasd");
	}
}
