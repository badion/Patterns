package com.abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor() {
		return new Copybook();
	}

	@Override
	public Shape getShape() {
		return null;
	}
}
