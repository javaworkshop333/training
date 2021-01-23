package javaTutorial.chapter10.dallas;

import javaTutorial.chapter10.irving.DesiRestaurantIrving;

public class DallasCustomer {

	public void dinner()
	{
		int a=0;
		DesiRestaurantDallas.eat(); // public any class can access this method
		DesiRestaurantDallas.getOwner(); // protected - DallasCustomer and DesiRestaurantDallas are in same package 
		DesiRestaurantDallas.specialOffers(); // default - DallasCustomer and DesiRestaurantDallas are in same package
		//DesiRestaurantDallas.restaurantProfits() // private only DesiRestaurantDallas can access this method
		
		DesiRestaurantIrving.eat(); // public any class can access this method
		DesiRestaurantIrving.getOwner(); // protected - DallasCustomer and DesiRestaurantDallas are in same package 
		//DesiRestaurantIrving.specialOffers(); // default access in other package - DallasCustomer and DesiRestaurantDallas are in same package
		//DesiRestaurantIrving.restaurantProfits() // private only DesiRestaurantIrving can access this method
	}
}
