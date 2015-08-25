package com.proxy;

public class Proxy implements Image {

	private ImageController imageController;

	public Proxy() {
		
	}

	@Override
	public void getImage() {
		if (imageController == null) {
			imageController = new ImageController();
		}
		
		imageController.getImage();
	}

}
