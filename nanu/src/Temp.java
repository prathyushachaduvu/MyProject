
public abstract class Temp {
	int value = 0;
	public void greet() {
		System.out.println("hello all");
		}
	public abstract int multiply(int a ,int b); 
	}
class Test1 extends Temp{
	public int multiply(int a ,int b) {
		value = value+100;
		return value;
		
	}
}
