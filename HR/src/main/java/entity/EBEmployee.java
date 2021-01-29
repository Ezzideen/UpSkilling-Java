package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hr_employees")
public class EBEmployee extends AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "salary")
	private double salary;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private EBDepartment department;

	public EBEmployee(int id) {
		setId(id);
	}

	public EBEmployee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return getId() + "||" + getName() + "||" + getSalary() + "||" + getDepartment().getName();
	}

	public EBDepartment getDepartment() {
		if(department == null) {
			department = new EBDepartment();
		}
		return department;
	}

	public void setDepartment(EBDepartment department) {
		this.department = department;
	}

}
