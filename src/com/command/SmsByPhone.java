package com.command;

public class SmsByPhone implements Phone {


	@Override
	public void execute() {
		System.out.println("Smsing");
	}
}
