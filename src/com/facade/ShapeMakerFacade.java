package com.facade;

public class ShapeMakerFacade {

	private Shape circle;
	private Shape square;

	public ShapeMakerFacade() {
		circle = new Circule();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawSquare() {
		square.draw();
	}

}
