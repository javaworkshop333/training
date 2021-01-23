package javaTutorial.chapter4;

public class Car {
	
	public static String company="Toyota"; // global scope for static class member
	String brand="Camry"; // global scope for non static class member or the instance variable
	int abc=0;
	
	public void order(String customerName)
	{
		int xyz=10;
		System.out.println(xyz);
		{
			int abc=10;
			{
				int pqr=10;
				System.out.println(xyz);
			}
			System.out.println(abc);
			
		}
		System.out.println(abc);
		System.out.println(brand);
		// local scope for parameter variable. this variable is visible 
		//only for this order method
		System.out.println("customer name :"+customerName);

		// local variable declared within the method has local scope  
		//and is visible for this order method only
		String greet="welcome";
				
		// global scope for static variable, static variable 
		//can be accessed from anywhere within this program
		System.out.println("Company name :"+company);

		// global scope for non static variable,  
		//can be accessed from anywhere within this program
		System.out.println("Brand name :"+brand);
		System.out.println(xyz);

	}
	
	public void testDrive()
	{
		// this method has no parameter variable and no local variables declared
		// only static and non static variabel with global scope are visible in this method
		// global scope for static variable, static variable 
		//can be accessed from anywhere within this program
		System.out.println("Test Drive for Company name :"+company);
		System.out.println("Test Drive for Brand name :"+brand);
		
	}

}
