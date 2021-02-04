public class Variables {
	public static void main(String[] args) {
		int a=20; // initialization
		String b="john";
		boolean c=true;
		
		int d=30;
		String e="jane";
		boolean f=false;
		
		// = sign requires 
		// 1) LHS should always be a variable
					// 10=a; LHS cannot be literal value
					a=20;
		// 2) RHS can be literal value of same type
					a=30; // reassignment
		// 3) RHS can be any variable of same type
					a=d;
				//	a=b; // b is string variable and a is int variable no allowed
		int x=20;
		int y=30;
		
		// 3a) RHS can also be method call
		Calculator cal=new Calculator();
		int yy=cal.add(10,20);
		// RHS is ALWAYS processed first
		// RHS method call returns output 30
		// output 30 goes to ???? variable yy 
		
		// when print statement has variable, it prints value of variable
		System.out.println(x); // print value of x that is 20
		System.out.println(y); // print value of y that is 30
		// 4) if RHS is variable. then value of RHS variable is newly assigned 
		//		to LHS variable
		x=y;  //value of y variable(30) is assigned to variable x
				// value of x is now changed from 20 to 30
		y=x; // value of x variable(30) is assigned to variable y
				// value of y is now changed from 30 to 30
		System.out.println(x);
		System.out.println(y);
		System.out.println("********");
		
		int p=30;
		int q=40;
		int r=50;

		p=q; // value of q(40) is assigned to p becomes (40)
		q=r; // value of r(50) is assigned to q becomes (50)
		r=p; // value of p(40) is assigned to r becomes(40)

		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		
		
		
		// when print statement has literal value , it prints literal value
		System.out.println("y");
				
	}

}
