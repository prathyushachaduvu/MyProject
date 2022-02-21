
public class CustomExceptionDemo {

	public static void main(String[] args) {
		Voter v=new Voter();
		boolean b=v.generateVoterId("Indian",25);
		if(b) {
			System.out.println("Successfully submitted for generating VoterI d");
			
		}
	}
	

}
class Voter{
	private final String INDIAN ="Indian";
	private final int VALID_AGE=18;
	public boolean generateVoterId(String nationality,int age ) {
	boolean status=false;
	boolean isNational= validateNationality(nationality);
	if(isNational) {
		boolean isValidAge = validateAge(age);
		if(isValidAge) {
			status = true;
		}
		
	}
	return status;
	
	}
	private boolean validateNationality(String nationality) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean vallidateNationality(String nationality) {
		boolean status=false;
		if(INDIAN.equalsIgnoreCase(nationality)) {
	}else {
		}
		return status;
	}
	public boolean validateAge(int age) {
		boolean status =false;
		if(age>=VALID_AGE) {
			status = true;
		}
		else {
			//throw new InvalidAgeException("Invalid Age: Age should be greater or equal to 18");
		}
		return status;
	}
	
}


