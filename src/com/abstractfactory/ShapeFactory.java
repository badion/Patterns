package com.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor() {
		return null;
	}

	@Override
	public Shape getShape() {
		return new Circle();
	}

}
