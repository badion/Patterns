package com.factory;

import com.factory.ShapeFactory;

public class Application {

	public static void main(String[] args) {
		ShapeFactory.newCircle().draw();
	}
}
