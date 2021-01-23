package javaTutorial.chapter11;

public class CarVoiceControl extends CarDecorator{
	public CarVoiceControl (Car c)
	{
		this.c=c;
	}

	public void display()
	{
	super.display();
	System.out.println("I am car voice control");
	}

}
