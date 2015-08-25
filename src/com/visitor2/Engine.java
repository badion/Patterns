package com.visitor2;

public class Engine implements CarParts {

	@Override
	public void accept(CarVisitor carVisitor) {
		carVisitor.visit(this);
	}

}
