package com.adapter2;

public class VlcPlayer implements AdvancedMediaPlyaer {

	@Override
	public void playMp3(String fileName) {
	}

	@Override
	public void playVlc(String fileName) {
		System.out.println("i can play vlc ");
	}


}
