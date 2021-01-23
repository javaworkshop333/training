package javaTutorial.chapter10.dallas;

public class DesiRestaurant {

	protected static void getOwner()
	{
		System.out.println("Raghav owns this chain of restaurant");
	}
	
	private static void restaurantProfits()
	{
		System.out.println("only the DesiRestaurant itseld can access and noone else can");
	}
	
	public static void eat()
	{
		System.out.println("Customers from all over the place are welcome");
	}
	
	static void  specialOffers()
	{
		System.out.println("Customers frmo Dallas are eligible for special offers only");
	}
	
}
