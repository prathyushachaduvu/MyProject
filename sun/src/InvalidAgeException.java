
public class InvalidAgeException extends Exception{
	String message=" ";
	
	public InvalidAgeException() {
		
	} 
	public InvalidAgeException(String message) {
		super(message);
		this.message=message;
		
		
	}
	
	public String toString() {
		return super.toString();
		// TODO Auto-generated method stub

	}

}
