package com.adapter;

public class Application {

	public static void main(String[] args) {
		TargetInterface adapter = new ClassAdapter();
		adapter.someMethod();
	}
}
