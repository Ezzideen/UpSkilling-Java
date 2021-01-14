package mb;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bean.Employee;
import jdbc.EmployeeDao;

@ManagedBean(name = "mbEmp")
@ViewScoped
public class MBEmployee {
	EmployeeDao dao = new EmployeeDao();
	private Employee employee;

	public void add() throws Exception {
		dao.insertEmployee(getEmployee());
	}
	
	public String find() throws Exception {
		employee = dao.findEmployee(getEmployee().getId());
		return null;
	}

	public String update() throws Exception {
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
		return dao.lstEmployees();
	}
}
