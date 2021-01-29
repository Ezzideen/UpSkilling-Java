package mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.HrDao;
import entity.EBDepartment;

@ManagedBean(name = "mbDepartment")
@ViewScoped
public class MB_Department {

	public List<EBDepartment> getListDepartments() {
		HrDao dao = new HrDao();
		return dao.listDepartment();
	}
}
