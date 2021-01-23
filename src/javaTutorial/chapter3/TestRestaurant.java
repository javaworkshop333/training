package javaTutorial.chapter3;

public class TestRestaurant {

	public static void main(String args[]) throws Exception
	{
	
	// use dot operator on class name if method is declared static
	Restaurant.greet(); 
	
	// use dot operator on object/variable name if method is not declared as static
	Restaurant dominos=new Restaurant();
	dominos.orderPizza(1);
	
	}

}
