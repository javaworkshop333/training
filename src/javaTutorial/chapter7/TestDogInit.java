package javaTutorial.chapter7;

public class TestDogInit {
public static void main(String args[])
{
	// java creates a dog object in memory and executes the constructor based on parameter signature match
	// java compares the number of parameter, type of parameter and the order of parameters
	
	// here the constructor invoked is the one with no parameter
	DogInit dog1=new DogInit();
	dog1.eat();
	dog1.bark();
	
	// here the constructor invoked is the one with single String parameter
	DogInit dog2=new DogInit("Milo");
	dog2.eat();
	dog2.bark();

	// here the constructor invoked is the one with two parameter. in the order first String param and second String param
	DogInit dog3=new DogInit("Tiger", "bull dog");
	dog3.eat();
	dog3.bark();
	
}
}
