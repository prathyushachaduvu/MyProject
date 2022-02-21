package he;

public class OperatorsDemo {
	String str="Hello";

	public static void main(String[] args) {
		Employee e = new Employee () ;
		e.doIt();
		System.out.println("main method ends");
		// TODO Auto-generated method stub

	}

}
class Employee {
	String name = "Rakesh";
	public void doIt() {
		int x = 10;
		System.out.println("first stmt");
		System.out.println(x);
		System.out.println("last stmt");
	}
	
		
}
