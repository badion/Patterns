package com.facade;

public class Application {

	public static void main(String[] args) {
		ShapeMakerFacade shapeMakerFacade = new ShapeMakerFacade();
		shapeMakerFacade.drawCircle();
		shapeMakerFacade.drawSquare();
	}
}
