package com.abstractfactory;

import com.factory.ShapeFactory;

public class Application {

	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		shapeFactory.getShape().draw();
		colorFactory.getColor().color();
	}
}
