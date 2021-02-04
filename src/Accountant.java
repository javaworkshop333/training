// caller program of calculator
public class Accountant {
	public static void main(String [] args) {
		// if you need access name variable from
		// calculator program
		// 1) create reference "c" for calculator program
		Calculator c=new Calculator();
		// 2) using reference and dot operator 
		// read variables
		System.out.println(c.name);
		// if you need access add method from Calcualtor
		// 1) create REFERENCE
		// 2) using reference and dot operator call add method
		// 3) pass exact number of and exact match of input
		// 4) handle the response
		// method call
		// PASS LITERAL VALUES input 10 and 34.05
		int a=c.sub(10,34.0f);
		// PASS VARIABLE
		int p=50;
		float q=23.0f;
		boolean r=true;
		float b=c.mul(p,q,r);
		System.out.println(a);
		System.out.println(b);
		//int x=c.add(50,10);
		//System.out.println(x);
		// method call
		
		
	//	FacebookCustomer fbc=new FacebookCustomer();
	//	System.out.println(fbc.age);
		
	}
}
