package mb;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bean.Department;
import jdbc.EmployeeDao;

@ManagedBean(name = "mbDept")
@ViewScoped
public class MBDepartment {
	EmployeeDao dao = new EmployeeDao();
	private Department department;

	public ArrayList<Department> getListDepartments() throws Exception{
		return dao.lstDepartments();
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
