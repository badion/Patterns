package com.adapter3;

public class SocketForEU implements AdvancedSocket {

	@Override
	public void giveElectricityForEU(String socketType) {
		System.out.println("giving electricity for: " + socketType);
	}

	@Override
	public void giveElectricityForUS(String socketType) {

	}

}
