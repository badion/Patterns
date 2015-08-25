package com.proxy;

public class ImageController implements Image {

	public ImageController() {
		System.out.println("Lazy loading");
	}

	@Override
	public void getImage() {
		System.out.println("get image");
	}

}
