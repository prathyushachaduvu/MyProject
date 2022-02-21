package Arithmetic;
class Calculator{
	public int result;
	public void add(int a, int b) {
		result=a+b;
		System.out.println("The addition of given numbers: "+result);
		}
	public void subtract(int a, int b) {
		result=a-b;
		System.out.println("The subtract of given numbers: "+result);
		}
	public void multiply(int a, int b) {
		result=a*b;
		System.out.println("The multiply of given numbers: " +result);
		}
	
	
}
class MyCalculator extends Calculator{
	public int result;
	public void division(int a, int b) {
		result=a/b;
		System.out.println("The division of given numbers: "+result);
		}
	public void modulus(int a, int b) {
		result=a%b;
		System.out.println("The modulus of given numbers: " +result);
		}
	
}

public class ExtendsDemo {

	public static void main(String[] args) {
		int a=10,
		  b=20;
		MyCalculator obj = new MyCalculator();
		obj.add(a,b);
		obj.subtract(a,b);
		obj.multiply(a,b); 
		obj.division(a,b);
		obj.modulus(a,b);
		// TODO Auto-generated method stub

	}

}
