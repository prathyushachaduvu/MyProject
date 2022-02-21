
public abstract class Bird {
	public void eat() {
		System.out.println("i will eat cherry morethan oranges");
	}
	public void transport() {}
		
		
	

}
class Parrot extends Bird{
	public void transport() {
	System.out.println("i transport by the help of wings by flying");
	}
	
	
}
class Penguin extends Bird{
	public void transport() {
	System.out.println("i transport by the help of wings by walk");
	}
	
	
}