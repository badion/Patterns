package com.servicelocator;

public class ApplicationContext {

	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("service1")) {
			System.out.println("lookup for service 1");
			return new ServiceImpl1();
		} else if (jndiName.equalsIgnoreCase("service2")) {
			System.out.println("lookup for service 2");
			return new ServiceImpl2();
		}
		return null;
	}

}
