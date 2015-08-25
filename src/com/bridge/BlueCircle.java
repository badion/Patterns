package com.bridge;

public class BlueCircle implements DrawApi {

	public BlueCircle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Draw blue circle " + radius + "  " + x + " " + y);
	}

}
