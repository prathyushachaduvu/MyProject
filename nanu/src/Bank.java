
public class Bank{
	int branchId;
	String branchName;
	InterestCalculator intCal = new InterestCalculator();
	public <intCal> void calculateInterest(String type) {
		if("rd".equalsIgnoreCase(type)) {
			intCal.calculateInterestForRD();
		}else if("fd".equalsIgnoreCase(type)) {
			intCal.calculateInterestForFD();
		}else {
			intCal.calculateInterestForLoan();
		}
		}
}
	
 class InterestCalculator{
	 int amount;
	 float value;
	 String type;
	 public float calculateInterestForFD() {
		 float interest = 6f;
		 return interest;
	 }
	 public float calculateInterestForRD() {
		 float interest = 7f;
		 return interest;
	 }
	 public float calculateInterestForLoan() {
		 float interest = 0f;
		 return interest;
	 }
	 private class Hello{
	 
 }	 
	
}
