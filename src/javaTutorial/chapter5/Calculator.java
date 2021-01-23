package javaTutorial.chapter5;

public class Calculator {

	public void arithmetic(int a,int b)
	{
		System.out.println("\n input provided for arithmetic are "+a+" and "+b);
		int sum=a+b; // adds 2 integers
		System.out.println("addition : "+sum);
		
		int sub=a-b; // substract 2 integers
		System.out.println("substraction :"+sub);
		
		int mul=a*b; // multiply 2 integers
		System.out.println("multiplication :"+mul);
		
		int div=a/b; // divide 2 integers
		System.out.println("division :"+div);
		
		int mod=a%b; // mod of 2 integers
		System.out.println("modulos :"+mod);
	}
	

	public void unary(int x)
	{
		System.out.println("\n input provided for unary are "+x);
		int singlePlus=+x; // convert the variable value to positive
		System.out.println("single plus :"+singlePlus);
		
		int singleMinus=-x; // convert the variable value to negative
		System.out.println("single minus :"+singleMinus);
		
		// print the existing value, increment the value by one after this line 
		System.out.println("post increment :"+ (x++) );
		
		// increment the value first then print this line
		System.out.println("pre increment :"+ (++x) );
		
		// print the existing value, decrement the value by one after this line 
		System.out.println("post decrement :"+ (x--) );
		
		// decrement the value first then print this line
		System.out.println("pre decrement :"+ (--x) );
		
		// negate the boolean value, true becomes false and false becomes true.
		boolean alive=true;
		System.out.println( !alive );
		
	}
	public void relational(int p,int q)
	{
		if(p<=q){
			System.out.println("p and q are equals");
		}
		
		System.out.println("\n input provided for relational are "+p+" and "+q);
		// == operator returns true if right hand side is equal to left hand side
		System.out.println("equal check :"+ ( p==q ) );
		
		// == operator returns true if right hand side is not equal to left hand side
		System.out.println("not equal check :"+ (p!=q) );
		
		// == operator returns true if right hand side is lesser than left hand side
		System.out.println("greater than check :" + (p>q) );
		
		// == operator returns true if right hand side is greater than left hand side
		System.out.println("lesser than check :" + (p<q) );
		
		// && requires all multiple conditions to be true. in below example 
		// p not equal to q should be true  
		// and
		// p is less than q should be true
		System.out.println("multiple condition satisfy check" + (p!=q && p<q)  );
		
		// || requires atleast one conditions to be true. in below example 
		// either p not equal to q should be true  
		// OR
		// p is less than q should be true
		System.out.println("atleast 1 condition satisfy check" + (p!=q || p<q)  );
		
		
		String name="michael";
		System.out.println( name instanceof String);
		
	}
	
	public void ternary(int a,int b)
	{
		
		String greaterResult="";
		greaterResult=(a > b) ? "a is greater":"b is greater";
		System.out.println("ternary operator result check :"+greaterResult);
	}
}
