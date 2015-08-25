package com.visitor2;

public class CarVisitor implements Visitor {

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Wheel visit");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Engine visit");
	}

	@Override
	public void visit(Window window) {
		System.out.println("Window visit");
	}

	public void visit(Car car) {
		System.out.println("Display car");
	}

}
