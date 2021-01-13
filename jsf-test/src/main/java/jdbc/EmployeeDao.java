package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.Department;
import bean.Employee;

public class EmployeeDao extends GenericDao {

	public Employee findEmployee(int id) throws Exception {
		PreparedStatement ps = getPreparedStatement("SELECT * FROM hr_employees WHERE id = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		Employee employee = new Employee();
		while (rs.next()) {
			employee = populatEmployee(rs);
		}
		return employee;
	}

	public ArrayList<Employee> lstEmployees() throws Exception {
		PreparedStatement ps = getPreparedStatement("SELECT * FROM hr_employees");
		ResultSet rs = ps.executeQuery();
		ArrayList<Employee> lstEmployees = new ArrayList<>();
		while (rs.next()) {
			lstEmployees.add(populatEmployee(rs));
		}
		return lstEmployees;
	}

	private Employee populatEmployee(ResultSet rs) throws Exception {
		Employee employee = new Employee();
		employee.setId(rs.getInt("id"));
		employee.setName(rs.getString("name"));
		employee.setSalary(rs.getDouble("salary"));
		Department department = findDepartment(rs.getInt("dpartment_id"));
		employee.setDepartment(department);
		return employee;
	}
	
	public Department findDepartment(int id) throws Exception {
		PreparedStatement ps = getPreparedStatement("SELECT * FROM hr_departments WHERE id = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		Department department = new Department();
		while (rs.next()) {
			department.setId(rs.getInt("id"));
			department.setName(rs.getString("name"));
		}
		return department;
	}

	public void insertEmployee(Employee employee) throws Exception {
		PreparedStatement ps = getPreparedStatement("INSERT INTO hr_employees (name,salary) VALUES(?,?)");
		ps.setString(1, employee.getName());
		ps.setDouble(2, employee.getSalary());
		ps.execute();
	}
	
	
	public void updateEmployee(Employee employee) throws Exception {
		PreparedStatement ps = getPreparedStatement("UPDATE hr_employees SET name=?,salary=? WHERE id = ?");
		ps.setString(1, employee.getName());
		ps.setDouble(2, employee.getSalary());
		ps.setInt(3, employee.getId());
		ps.execute();
	}

	public Employee findEmployeeByName(String name) throws Exception {
		PreparedStatement ps = getPreparedStatement("SELECT * FROM hr_employees WHERE name = ?");
		ps.setString(1, name);
		ResultSet rs = ps.executeQuery();
		Employee employee = new Employee();
		while (rs.next()) {
			employee = populatEmployee(rs);
		}
		return employee;		
	}

}
