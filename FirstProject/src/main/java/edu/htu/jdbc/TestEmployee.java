package edu.htu.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;

import edu.htu.bean.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		
//		Employee employee = new Employee();
//		employee.setName("Noor");
//		employee.setSalary(370);
		EmployeeDao dao = new EmployeeDao();
		try {
//			Employee employee = dao.findEmployeeByName("Noor");
			ArrayList<Employee> lstEmployees = dao.lstEmployees();
			for (Employee employee : lstEmployees) {
				System.out.println(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			dao.insertEmployee(employee);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
