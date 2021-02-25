
public class Ford extends Car{
	// overriding (runtime poly)
	public boolean drive() {
		System.out.println("driving Ford");
		return true;
	}
	// overloaded method start (Compile poly)
	public void start(String s) {
		
	}
}
