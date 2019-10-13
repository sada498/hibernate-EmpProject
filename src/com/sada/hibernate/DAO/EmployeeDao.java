package com.sada.hibernate.DAO;

import com.sada.hibernate.model.Employee;

public interface EmployeeDao {
	void saveEmp(Employee e );
	Employee readEmp(int employeeNumber);
}
