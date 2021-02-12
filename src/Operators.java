
public class Operators {

	public static void main(String[] args) {
		
	// LHS AND RHS SHOULD HAVE SAME DATA TYPE
		
// equality = primarily used on primitve data type = output is boolean
//relational operator = primarily used on numbered primitive data type 
		//= output is boolean
// unary operator = primarily used on numbered primitive data type
// conditional operator= used on all data types = output is boolean
		int pinOnRecord=1234;
		int enteredPin=1000;
		String x="1234";
		// == != (equality operator)
		// compare values of LHS and RHS.. and provide true/false results
		System.out.println(  pinOnRecord != enteredPin );
		// NO System.out.println(  pinOnRecord != x );
		
		// greater than less than relation operator
		// > ,< ,>= ,<=
		int balance=50;
		int withdrawAmount=30;
		
		System.out.println(   balance >= withdrawAmount );
		
		int phoneStock=100;
		int customerOrderQuantity=100;
		System.out.println(customerOrderQuantity <= phoneStock);
		
		
		// unary operator
		// + , - , ++ , --
		// - + = -, + -= -, + + = +, - -=+
		int a=10;
		System.out.println(  -a  );
		// incremement operator ++
		// - = negate signs, --= decrement value by 1
		// postincrement happens after line - print first then increment 
		// preincrement before line - increment first then print
		// pre - change value and then use/print it
		// post - use/print it first, then change value
		int b=5; // b-5
		System.out.println( --b );  // b-4, print 4
		System.out.println( b--);//  print 4, b-3
		System.out.println(++b);// b-4, print 4

		/* AND = &&
		 true AND true = true
		true AND false = false
		false AND true = false
		false AND false = false
		OR = ||
		true OR true = true
		true OR false = true
		false OR true = true
		false OR false = false
		 */
		
		int p=10;		int q=20; 		int r=20;		int s=30;
		System.out.println(      p>q ||  r>s      );
		//								   false OR false
		
		// aritmetic operators
		// 5 / 2 = 1
		// 21/10 = 1
		// + , - , *, /, %
		int c=21;
		int d=10;
		System.out.println(  c+d   );
		System.out.println(  c-d   );
		System.out.println(  c*d   );
		System.out.println(  c/d   );
		System.out.println(  c%d   );
		
		System.out.println(1 + 2 - 3 * 4 );
		
		int aa =10;
		int bb=20;
		int cc=30;

		System.out.println(aa + bb *cc / aa);
		
	}

}
