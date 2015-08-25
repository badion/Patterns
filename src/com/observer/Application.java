package com.observer;

public class Application {

	public static void main(String args[]) throws Exception {
		StockGrabber grabber = new StockGrabber();
		StockObserver stockObserver = new StockObserver(grabber);

		grabber.setAaplPrice(1.99);
		grabber.setGoogPrice(23.4);
		grabber.setIbmPrice(233.12);

		stockObserver.update(grabber.getIbmPrice(), grabber.getAaplPrice(),
				grabber.getGoogPrice());

		StockObserver stockObserver2 = new StockObserver(grabber);

		stockObserver2.update(grabber.getIbmPrice(), grabber.getAaplPrice(),
				grabber.getGoogPrice());

		grabber.unregister(stockObserver2);
		
		stockObserver2.update(grabber.getIbmPrice(), grabber.getAaplPrice(),
				grabber.getGoogPrice());
	}
}
