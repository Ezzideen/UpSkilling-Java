package test;

import java.util.List;

import dao.HrDao;
import entity.EBDepartment;
import entity.EBEmployee;

public class Test {

	public static void main(String[] args) {
		HrDao dao = new HrDao();
		
		EBEmployee employee = new EBEmployee();
		employee.setName("Mohammad");
		employee.setSalary(500);
		EBDepartment department = new EBDepartment();
		department.setId(1);
		employee.setDepartment(department);
		
		dao.addEmployee(employee);
		
		
//		List<EBDepartment> listDepartment = dao.listDepartment();
//		for (EBDepartment ebDepartment : listDepartment) {
//			System.out.println(ebDepartment);
//		}
		
		List<EBEmployee> listEmployees = dao.listEmployees();
		for (EBEmployee ebEmployee : listEmployees) {
			System.out.println(ebEmployee);
		}
		
		EBDepartment dep1 = new EBDepartment();
		dep1.setId(1);
		EBDepartment dep2 = new EBDepartment();
		dep2.setId(1);
		
//		if(dep1.equals(dep2))

	}
}
