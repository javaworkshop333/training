// Destination program
public class LoanManager {
// 255 - inputs to a method
	public LoanStatus processLoan(	LoanApplication la ) {
		System.out.println("in destinnation program");
		System.out.println( la.getFirstName()  );
		System.out.println( la.getLastName() );
		System.out.println( la.getAddress() );
		LoanStatus ls=new LoanStatus();
		ls.setLoanApproved(true);
		ls.setInterestRate(3);
		return ls;
	}
}
