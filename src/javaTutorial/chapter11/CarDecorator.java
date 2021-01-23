package javaTutorial.chapter11;

public abstract class CarDecorator implements Car{
public Car c;


public void display()
{
	c.display();
}

}
