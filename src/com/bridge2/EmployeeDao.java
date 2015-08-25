package com.bridge2;

public interface EmployeeDao {

	void persist(Object object);
	
	Object findById(Integer id);
	
}
