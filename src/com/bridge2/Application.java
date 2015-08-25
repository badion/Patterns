package com.bridge2;

public class Application {

	public static void main(String[] args) {

		ComplexEmployeeDao complexEmployeeDao = null;
		if (!isDatabaseDriverExist()) {
			complexEmployeeDao = new DatabaseDaoImpl();
		} else {
			complexEmployeeDao = new FileSystemDaoImpl();
		}

		EmployeeDao employeeDao = new EmployeeDaoImpl(complexEmployeeDao);
		Object obj = new Object();
		employeeDao.persist(obj);
	}

	public static boolean isDatabaseDriverExist() {
		return true;
	}
}
