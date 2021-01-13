package mb;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bean.Employee;
import jdbc.EmployeeDao;

@ManagedBean(name = "mbEmp")
@ViewScoped
public class MBEmployee {

	private Employee employee;

	public String add() throws Exception {
		EmployeeDao dao = new EmployeeDao();
		dao.insertEmployee(employee);
		return null;
	}
	
	public String find() throws Exception {
		EmployeeDao dao = new EmployeeDao();
		employee = dao.findEmployee(getEmployee().getId());
		return null;
	}

	public String update() throws Exception {
		EmployeeDao dao = new EmployeeDao();
		dao.updateEmployee(employee);
		return null;
	}

	public String delete() {
		return null;
	}

	public Employee getEmployee() {
		if (employee == null) {
			employee = new Employee();
		}
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public ArrayList<Employee> getListEmployees() throws Exception{
		EmployeeDao dao = new EmployeeDao();
		return dao.lstEmployees();
	}
}
