package com.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;

	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		int observerIndex = observers.indexOf(observer);
		System.out.println("Observer " + (observerIndex + 1) + " deleted");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		
	}

	public double getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
	}

	public double getAaplPrice() {
		return aaplPrice;
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
	}

	public double getGoogPrice() {
		return googPrice;
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
	}

}
