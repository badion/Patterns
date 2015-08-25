package com.visitor2;

public class Window implements CarParts {

	@Override
	public void accept(CarVisitor carVisitor) {
		carVisitor.visit(this);
	}

}
