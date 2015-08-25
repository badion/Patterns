package com.chainofresponsibiliies2;

public class Number {

	private int number1;
	private int number2;
	private String operation;

	public Number(int num1, int num2, String operation) {
		this.number1 = num1;
		this.number2 = num2;
		this.operation = operation;
	}

	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	public String getOperation() {
		return operation;
	}

	public String getNameOfOperation() {
		return getOperation();
	}

}
