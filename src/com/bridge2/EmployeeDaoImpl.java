package com.bridge2;

public class EmployeeDaoImpl implements EmployeeDao {

	public ComplexEmployeeDao complexEmployeeDao = null;

	public EmployeeDaoImpl(ComplexEmployeeDao complexEmployeeDao) {
		this.complexEmployeeDao = complexEmployeeDao;
	}

	@Override
	public void persist(Object object) {
		complexEmployeeDao.saveObject(object);
	}

	@Override
	public Object findById(Integer id) {
		return complexEmployeeDao.getObjById(id);
	}

}
