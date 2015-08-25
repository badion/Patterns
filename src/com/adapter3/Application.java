package com.adapter3;

public class Application {
	public static void main(String[] args) {
		Socket socket = new Socket();
		socket.giveElectricity("eu");

		socket.giveElectricity("us");

		socket.giveElectricity("ola");
	}
}
