package com.chainofresponsibiliies2;

public interface Chain {

	void nextChain(Chain nextChain);

	void calculate(Number number);

}
