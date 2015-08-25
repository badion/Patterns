package com.observer;

public class StockObserver implements Observer {

	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	private Subject stockGrabber;

	private static int observerCounter = 0;

	private int observerId;

	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerId = ++observerCounter;
		System.out.println("New observer " + observerId);
		stockGrabber.register(this);
	}

	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		print();
	}

	public void print() {
		System.out.println("StockObserver [ibmPrice=" + ibmPrice
				+ ", aaplPrice=" + aaplPrice + ", googPrice=" + googPrice
				+ ", stockGrabber=" + stockGrabber + ", observerId="
				+ observerId + "]");
	}
}
