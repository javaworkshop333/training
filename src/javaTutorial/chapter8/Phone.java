package javaTutorial.chapter8;

// this interface sets a rule, if a company has to launch phone, they have to implement makeCall and recieveCall methods
// else it is not a phone
public interface Phone {
	int a=10;
	public void makeCall();
	public void recieveCall();
	public void sendText();
	
	static void storePhoneNum(long num)
	{
		System.out.println("Storing numbers");
	}
	default void displayMissedCall()
	{
		System.out.println("missed calls");
	}
}
