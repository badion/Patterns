package com.servicelocator;

public class ServiceLocator {

	private static Cache cache;

	static {
		cache = new Cache();
	}

	public static Service getService(String jndiName) {
		Service service = cache.getService(jndiName);

		if (service != null) {
			return service;
		}

		ApplicationContext appContext = new ApplicationContext();
		Service service1 = (Service) appContext.lookup(jndiName);

		cache.addService(service1);

		return service1;
	}
}
