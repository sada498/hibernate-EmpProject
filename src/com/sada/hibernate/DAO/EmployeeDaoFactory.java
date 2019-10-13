package com.sada.hibernate.DAO;

public class EmployeeDaoFactory {
	public 	static EmployeeDao getInstance()
	{
		return new EmployeeDaoImpl();
	}

}
