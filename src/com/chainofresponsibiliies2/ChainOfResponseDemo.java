package com.chainofresponsibiliies2;

public class ChainOfResponseDemo {

	public static void main(String[] args) {
		Chain add = new AddNumber();
		Chain multi = new MultiplyNumber();
		Chain div = new DivNumber();

		add.nextChain(multi);
		multi.nextChain(div);
		
		Number request = new Number(9, 3, "multi");

		add.calculate(request);
	}
}
