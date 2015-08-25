package com.servicelocator;

public class ServiceImpl1 implements Service {

	@Override
	public String getName() {
		return "service1";
	}

	@Override
	public void execute() {
		System.out.println("executing service 1");
	}

}
