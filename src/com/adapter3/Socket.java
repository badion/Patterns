package com.adapter3;

public class Socket implements SocketBehevior {

	SocketAdapter socketAdapter;

	@Override
	public void giveElectricity(String jackType) {
		if (jackType.equalsIgnoreCase("eu")) {
			socketAdapter = new SocketAdapter(jackType);
			socketAdapter.giveElectricity(jackType);
		} else if (jackType.equals("us")) {
			socketAdapter = new SocketAdapter(jackType);
			socketAdapter.giveElectricity(jackType);
		} else {
			System.out.println("incompartable type of socket " + jackType);
		}
	}

}
