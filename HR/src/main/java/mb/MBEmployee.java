package mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.HrDao;
import entity.EBEmployee;
import mb.MB_HRSystem.Mode;

@ManagedBean(name = "mbEmployee")
@ViewScoped
public class MBEmployee extends MB_HRSystem {

	private EBEmployee employee;
	private HrDao dao = new HrDao();

	public MBEmployee() {
		super();
	}
	
	public EBEmployee getEmployee() {
		if (employee == null) {
			employee = new EBEmployee();
		}
		return employee;
	}

	public void setEmployee(EBEmployee employee) {
		this.employee = employee;
	}

	public void addEmployee() {
		dao.addEmployee(employee);
		rest();
	}

	public void updateEmployee() {
		dao.updateEmployee(employee);
		rest();
	}

	public void deleteEmployee() {
		dao.delete(employee);
		rest();
	}

	public List<EBEmployee> getLstEmployees() {
		return dao.listEmployees();
	}

	public void rest() {
		setEmployee(null);
		setActiveMode(Mode.ADD);
	}

}
