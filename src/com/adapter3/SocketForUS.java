package com.adapter3;

public class SocketForUS implements AdvancedSocket {

	@Override
	public void giveElectricityForEU(String socketType) {

	}

	@Override
	public void giveElectricityForUS(String socketType) {
		System.out.println("giving electricity for: " + socketType);
	}

}
