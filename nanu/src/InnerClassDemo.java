
public class InnerClassDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.branchId =1000;
		bank.branchName="xyz branch";
		bank.intCal.type ="abc";
		
		
		
		System.out.println(bank.branchId);
		System.out.println(bank.branchName);
		
		InterestCalculator obj = new InterestCalculator();
		obj.calculateInterestForFD();
		obj.calculateInterestForRD();
		obj.calculateInterestForLoan();
		obj.amount = 100;
		
		
		
		// TODO Auto-generated method stub

	}

}
