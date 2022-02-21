import java.io.Serializable;
public class Employee2 implements Serializable {
	private String name;
	private int id;
	private transient float salary;

	public Employee2(String name,int id,float salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		//ODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
