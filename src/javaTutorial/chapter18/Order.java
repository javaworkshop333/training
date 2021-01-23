package javaTutorial.chapter18;

import java.io.Serializable;

public class Order implements Serializable {
	String name;
	int money;
	
	public static void main(String args[])
	{
		Order a=new Order();
		a.name="john";
		a.money=1000;
		System.out.println(a.name);
	}
}
