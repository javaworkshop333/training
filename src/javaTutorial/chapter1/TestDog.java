package javaTutorial.chapter1;

 
public class TestDog {
// hello rupesh
	public static void main(String args[])
	{
 		System.out.println("hi");
	Dog myDog=new Dog();
	myDog.color="white"; 
	myDog.leg=4; 
	myDog.name="milo";
	myDog.breed="chihuahua";
	
	myDog.bark(); 
	myDog.eat();
	System.out.println("welcome");
	}

}
