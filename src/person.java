public class person{
	public int trip(){
		System.out.println("a");
		drive(); // pause here 
		System.out.println("x");
		return 1; // every return check stack on top, 
					// go to that following line and
			// remove it from stack
	}
	public int drive(){
		System.out.println("b");
		System.out.println("p");
		return 2;
	}
	public int fun(){
		System.out.println("c");
		System.out.println("z");
		drive();
		// method call - go to drive method  declaration
		return 3;
	} //  1 a b c z y x 2
}