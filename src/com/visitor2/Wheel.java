package com.visitor2;

public class Wheel implements CarParts {

	@Override
	public void accept(CarVisitor carVisitor) {
		carVisitor.visit(this);
	}

}
