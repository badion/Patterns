package com.visitor2;

import java.util.ArrayList;
import java.util.List;

public class Car implements CarParts {

	private List<CarParts> carParts;

	@Override
	public void accept(CarVisitor carVisitor) {
		carParts = new ArrayList<CarParts>();
		
		carParts.add(new Wheel());
		carParts.add(new Engine());
		carParts.add(new Window());

		for (int i = 0; i < carParts.size(); i++) {
			carParts.get(i).accept(carVisitor);
		}

		carVisitor.visit(this);
	}

}
