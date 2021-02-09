public class test {
	public static void main(String[] args) {
		System.out.println("1");
		person p=new person();// constructor- create reference object
// every jump, note in stack 		
		int x=p.trip();
		System.out.println(x);
		int y=p.fun();
		// int y=3;
		System.out.println(y);
		System.out.println( x+ y );
		// method call to fun
		// go to fun method declaration
		System.out.println("2");	
	}
}//  1,a,b,p,x,1,c,z,b,p,3,4,2
// method stack (note- jump from program)
