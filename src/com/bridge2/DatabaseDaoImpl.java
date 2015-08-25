package com.bridge2;

public class DatabaseDaoImpl implements ComplexEmployeeDao {

	public DatabaseDaoImpl() {

	}

	@Override
	public void saveObject(Object obj) {
		System.out.println("save object in database " + obj);
	}

	@Override
	public Object getObjById(Integer id) {
		Object obj = new Object();
		obj = "get obj from database by id:" + id;
		return obj;
	}

}
