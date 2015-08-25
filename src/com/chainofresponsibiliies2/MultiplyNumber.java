package com.chainofresponsibiliies2;

public class MultiplyNumber implements Chain {

	private Chain nextChain;

	@Override
	public void nextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Number number) {
		if (number.getNameOfOperation() == "multi") {
			System.out.println(number.getNumber1() + "*" + number.getNumber2()
					+ "=" + number.getNumber1() * number.getNumber2());
		} else {
			nextChain.calculate(number);
		}

	}

}
