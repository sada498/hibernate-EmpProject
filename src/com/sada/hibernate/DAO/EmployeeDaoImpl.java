package com.sada.hibernate.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sada.hibernate.model.Employee;
import com.sada.hibernate.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	SessionFactory factory;
	 public EmployeeDaoImpl() {
		// TODO Auto-generated constructor stub
		 factory=HibernateUtil.getSessionFactory();
	}
	

	@Override
	public void saveEmp(Employee e) {
		Session session=factory.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		session.save(e);
		tx.commit();
		System.out.println("object is inserted into db");
		session.close();
	
	}

	@Override
	public Employee readEmp(int employeeNumber) {
		Session session=factory.openSession();
		Employee e=(Employee)session.get(Employee.class,employeeNumber);
		session.close();
		return e;
	}
}
