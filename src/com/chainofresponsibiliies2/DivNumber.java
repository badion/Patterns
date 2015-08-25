package com.chainofresponsibiliies2;

public class DivNumber implements Chain {

	private Chain nextChain;

	@Override
	public void nextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Number number) {
		if (number.getNameOfOperation() == "div") {
			System.out.println(number.getNumber1() + "-" + number.getNumber2()
					+ "=" + (number.getNumber1() - number.getNumber2()));
		} else {
			System.out.println("only works for div, multi, add");
		}
	}
}
