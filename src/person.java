public class person{
	public int trip(){
		System.out.println("a");
		drive(); // pause here, go to drive method
		System.out.println("x");
		return 1;
	}
	public int drive(){
		System.out.println("b");
		fun(); // pause here, go to fun method
		System.out.println("y");
		return 2;
	}
	public int fun(){
		System.out.println("c");
		System.out.println("z");
		return 3;
	} //  1 a b c z y x 2
}