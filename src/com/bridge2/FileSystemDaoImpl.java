package com.bridge2;

public class FileSystemDaoImpl implements ComplexEmployeeDao {

	@Override
	public void saveObject(Object obj) {
		System.out.println("save object in file system " + obj);
	}

	@Override
	public Object getObjById(Integer id) {
		Object object = new Object();
		object = "get object by id from file system " + id;
		return object;
	}

}
