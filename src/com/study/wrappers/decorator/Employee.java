package com.study.wrappers.decorator;

public class Employee {

	private long crmID;
	private int nameSpace;

	public Employee(long crmID, int nameSpace) {
		super();
		this.crmID = crmID;
		this.nameSpace = nameSpace;
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (crmID != other.crmID)
			return false;
		if (nameSpace != other.nameSpace)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [crmID=" + crmID + ", nameSpace=" + nameSpace + "]";
	}

}
