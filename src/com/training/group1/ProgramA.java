package com.training.group1;
public class ProgramA {
	// access privileges - public, protected, pacakge, private
	public int a; // can be accessed from ANYWHERE 
	int b; // can be accessed from programs in same package
	protected int c; 
	// can be accessed by
	// ALL classes in same package
	// RELATED classes in outside package
	private int d;
	
	protected void method1() {
		System.out.println(d);
	}
	
	// inner class
	class test{
		
	}
	
}
