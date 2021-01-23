package javaTutorial.chapter14;

public class TestCustomer {
	public static void main(String args[]) {
		int money = 450;
		String product="IPHONE";
		try {
			// try block of code can throw exception
			//System.out.println("Entered shop (try block)");
			int change=Shop.buy(product, money);
			//System.out.println("bought Iphone and got change returned :"+change);
		} 
		catch(InsufficientFundException ise)
		{
			ise.printStackTrace();
			System.out.println(ise.errorCode);
			System.out.println(ise.getMessage());
		}
		catch (Exception e) {
			// catch block of code is executed if an exception is thrown
			System.out.println("transaction denied (Exception)");
			String shopOwnerErrorMessage = e.getMessage();
			System.out.println(shopOwnerErrorMessage );
			e.printStackTrace();
		} finally {
			// finally block of code is executed even if exception is thrown or
			// not
			System.out.println("Exit Shop (finally)");
		}
	}

}
