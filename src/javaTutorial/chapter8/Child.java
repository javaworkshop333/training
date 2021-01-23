package javaTutorial.chapter8;

public class Child extends Parent {
	int a=20;
	public Child()
	{
		System.out.println("Child constructor");
	}
	public void childMethod()
	{
		
		System.out.println(a);
		System.out.println(a);
		System.out.println(super.a);
		
		super.display();
	}
	void display()
	{
		System.out.println("child display");
	}
}
