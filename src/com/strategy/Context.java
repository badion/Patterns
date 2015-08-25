package com.strategy;

public class Context {

	Car car;

	public Context(Car car) {
		this.car = car;
	}

	public void print() {
		car.move();
	}

	public static void main(String[] args) {

		Car car = new Toyota();
		Context context = new Context(car);
		context.print();
	}

}
