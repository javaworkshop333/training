package javaTutorial.chapter11;

public class Accountant {

	// same feature implemented in many form, this demonstrates overloading
	// we can add 2 strings or 2 number 
	public int add(int a, int b)
	{
		int result=a+b;
		return result;
	}
	public String add(String firstName,String lastName)
	{
		String fullName=firstName+lastName;
		return fullName;
	}
	
	public void doJob()
	{
		System.out.println("keep sales and profit report");
	}
	
}
