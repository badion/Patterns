package com.command;

public class CallByPhone implements Phone {


	@Override
	public void execute() {
		System.out.println("Calling");
	}

}
