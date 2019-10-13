import com.sada.hibernate.DAO.EmployeeDao;
import com.sada.hibernate.DAO.EmployeeDaoFactory;
import com.sada.hibernate.model.Employee;

public class main {
	public static void main(String[] args) {
		EmployeeDao dao=EmployeeDaoFactory.getInstance();
		Employee e=new Employee();
		e.setEmployeeNumber(126);
		e.setEmployeeName("yadlaplli");
		e.setEmployeeSalary(5000);
		e.setDeptNumber(10);
		dao.saveEmp(e);
		System.out.println("===================");
		Employee e1=dao.readEmp(498);
		System.out.println(e1.getEmployeeNumber()+" /t "+e1.getEmployeeName()+"/t"+e1.getEmployeeSalary()+"/t"+e1.getDeptNumber());
       
	}

}
