
public class BankAccountExce {
	int balance=100;
	public void withdraw(int withdrawAmount) throws InsufficientFundException {
		
		if(balance < withdrawAmount) {
			InsufficientFundException ife=new InsufficientFundException
					("please withdraw amount less than:"+balance);
			throw ife;		
		}
			
		
		balance=balance - withdrawAmount;
		System.out.println("your latest balance is:"+balance);
	}
}
