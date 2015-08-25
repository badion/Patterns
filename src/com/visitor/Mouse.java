package com.visitor;

public class Mouse implements Computer {

	@Override
	public void accept(ComputerVisitor compVisitor) {
		compVisitor.visit(this);
	}

}
