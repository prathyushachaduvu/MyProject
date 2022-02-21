//import java.util.TreeSet;

import java.util.LinkedList;

public class SetDemo1{

	public static void main(String[] args) {
		Employee1 e1= new Employee1();
		e1.empId = 100;
		e1.name = "Rakesh";
		e1.salary = 20000;
		Employee1 e2= new Employee1();
		e2.empId = 200;
		e2.name = "vakesh";
		e2.salary = 10000;
	    Employee1 e3= new Employee1();
		e3.empId = 300;
		e3.name = "nakesh";
		e3.salary = 30000;
		
		LinkedList<Employee1> linkedlist= new LinkedList<>();
		linkedlist.add(e1);
		linkedlist.add(e2);
		linkedlist.add(e3);
		for (Employee1 e : linkedlist) {
			System.out.println(e.empId);
			System.out.println(e.name);
			System.out.println(e.salary);
		}
		

		}

}
class Employee1 {
	String name;
	int empId;
	int salary;
}

