package javaTutorial.chapter11;

public class CarCollisionDetector extends CarDecorator{

public CarCollisionDetector (Car c)
{
	this.c=c;
}

public void display()
{
super.display();
System.out.println("I am car collision feature");
}

}
