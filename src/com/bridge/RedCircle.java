package com.bridge;

public class RedCircle implements DrawApi {

	public RedCircle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Draw red circle " + radius + " " + x + " " + y);
	}

}
