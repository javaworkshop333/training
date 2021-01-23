package javaTutorial.chapter12;

public class USCitizen {

	// the final variable can never be overwritten, this value remains
	// final.
	public final String ssn="123123123";
	// the static variable can be accessed without craeting object
	// this variables are shared by all the objects
	public static String name="john smith";
	
	// Sub class inherits the methods from parents,
	// and can override the method implementation of parents.
	// the final method can never be overridden
	public final void genes()
	{
		System.out.println(" this is US citizen john genes ");
	}
	
	// this method can be accessed without creating object
	public static String getName()
	{
		return name;
	}
	
}
