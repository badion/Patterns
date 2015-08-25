package com.visitor;

public class Application {

	public static void main(String[] args) {
		Computer comp = new Mouse();
		comp.accept(new ComputerVisitor());
	}
}
