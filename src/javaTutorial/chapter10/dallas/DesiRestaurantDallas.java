package javaTutorial.chapter10.dallas;

public class DesiRestaurantDallas extends DesiRestaurant {

	public static void getAccess()
	{
		getOwner();// this is protected parent method. all sub classess can access these method
	}
}
