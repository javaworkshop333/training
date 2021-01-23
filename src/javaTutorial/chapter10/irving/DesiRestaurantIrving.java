package javaTutorial.chapter10.irving;

import javaTutorial.chapter10.dallas.DesiRestaurant;

public class DesiRestaurantIrving extends DesiRestaurant{

	public static void getAccess()
	{
		getOwner();// this is protected parent method. all sub classess can access these method 
	}
}
