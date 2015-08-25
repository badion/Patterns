package com.adapter3;

public class SocketAdapter implements SocketBehevior {

	AdvancedSocket advancedSocket;

	public SocketAdapter(String jackType) {
		if (jackType.equals("eu")) {
			advancedSocket = new SocketForEU();
		} else if (jackType.equals("us")) {
			advancedSocket = new SocketForUS();
		}
	}

	@Override
	public void giveElectricity(String jackType) {
		if (jackType.equalsIgnoreCase("eu")) {
			advancedSocket.giveElectricityForEU(jackType);
		} else if (jackType.equalsIgnoreCase("us")) {
			advancedSocket.giveElectricityForUS(jackType);
		}
	}

}
