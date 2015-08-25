package com.visitor2;

public class Application {


	public static void main(String[] args) {

		CarParts car = new Car();
		car.accept(new CarVisitor());
	}
}
