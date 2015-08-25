package com.servicelocator;

public class ServiceImpl2 implements Service {

	@Override
	public void execute() {
		System.out.println("executing service 2");
	}

	@Override
	public String getName() {
		return "service2";
	}
}
