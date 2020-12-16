package edu.htu.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;

import edu.htu.bean.Employee;

public class TestEmployee {

	
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		try {
			ArrayList<Employee> lstEmployees = dao.lstEmployees();
			for (Employee employee : lstEmployees) {
				System.out.println(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
