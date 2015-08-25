package com.bridge;

public class Circle extends Shape {

	private int x, y, radius;

	public Circle(DrawApi drawApi, int x, int y, int radius) {
		super(drawApi);
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.drawApi = drawApi;
	}

	@Override
	public void draw() {
		drawApi.drawCircle(radius, x, y);
	}

}
