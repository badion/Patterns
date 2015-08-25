package com.command;

public class CommandPatternDemo {

	public static void main(String[] args) {
		Operator operator = new Operator();
		SmsByPhone sms = new SmsByPhone();
		
		CallByPhone call = new CallByPhone();
		
		operator.makeAction(sms);
	
		operator.makeAction(call);
		operator.actions();
	}
}
