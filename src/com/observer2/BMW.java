package com.observer2;

import java.util.ArrayList;

public class BMW implements Car {

	private ArrayList<Observer> observers;

	@Override
	public void move() {
		System.out.println("car can move");
	}

}
