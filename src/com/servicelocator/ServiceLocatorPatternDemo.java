package com.servicelocator;

public class ServiceLocatorPatternDemo {

	public static void main(String[] args) {

		Service service = ServiceLocator.getService("service1");
		service.execute();
		
		service.execute();
		
		Service service2 = ServiceLocator.getService("service2");
		service2.execute();
		
		service2.execute();
	}
}
