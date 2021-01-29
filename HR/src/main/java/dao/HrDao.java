package dao;

import java.util.List;

import com.jk.db.dataaccess.orm.JKObjectDataAccessImpl;

import entity.EBDepartment;
import entity.EBEmployee;
import entity.EBUser;

public class HrDao extends JKObjectDataAccessImpl {

	
	public void addEmployee(EBEmployee employee) {
		insert(employee);
	}
	
	public void addDepartment(EBDepartment department) {
		insert(department);
	}

	public List<EBEmployee> listEmployees() {
		return getList(EBEmployee.class);
	}

	public void deleteEmployee(EBEmployee employee) {
		delete(employee);
	}

	public void updateEmployee(EBEmployee employee) {
		update(employee);
	}
	
	public EBEmployee findEmployee(int id) {
		return find(EBEmployee.class, id);
	}

	public List<EBDepartment> listDepartment() {
		return getList(EBDepartment.class);
	}

	public EBUser findUser(EBUser user) {
		return findOneByFieldName(EBUser.class, "userName", user.getUserName());
	}
}
