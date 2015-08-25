package com.visitor2;

public interface Visitor {

	void visit(Wheel wheel);

	void visit(Engine engine);

	void visit(Window window);
}
