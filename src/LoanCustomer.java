// source program
public class LoanCustomer {

	public static void main(String args[]) {
		LoanManager lm=new LoanManager();
		// TRANSFER lot of informatino from
		// 1 program to another
		LoanApplication la=new LoanApplication();
		la.setFirstName("john");
		la.setLastName("doe");
		la.setAddress("street1");
		la.setCity("ny");
		la.setZip(1234);
		la.setLoanAmount(1000000);
		
		LoanStatus stat=lm.processLoan( la );
		System.out.println(" in loan customer program");
		System.out.println(  stat.isLoanApproved() );
		System.out.println( stat.getInterestRate());
	}
}
