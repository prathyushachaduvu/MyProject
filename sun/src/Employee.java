import java.io.Serializable;

public class Employee implements Serializable{
	private String name;
	private float  salary;
	private int  empId;
	public Employee() {
		
	}
	public Employee(String name,float salary, int empId) {
		this.name=name;
		this.salary=salary;
		this.empId=empId;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary (float salary) {
		this.salary=salary;
	}
	public float getEmpId() {
		return empId;
	}
	public void setEmpId (int empId) {
		this.empId=empId;
	}

	}



