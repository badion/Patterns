package com.visitor;

public class ComputerVisitor implements Visitor {

	@Override
	public void visit(Mouse mouse) {
		System.out.println("visit mouse");
	}

}
