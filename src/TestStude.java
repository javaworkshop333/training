public class TestStude {
	public static void main(String[] args) {
		Persn s=new Persn();
		Persn s1=new Stude( "kj" );
		// Iphone3 i=new IphoneX();
		// RHS should be same or child of LHS
		// Stude s2=new Persn();
		System.out.println(   s1.age );
		System.out.println(  s1.name );
		System.out.println(  ((Stude)s1).grade );
		
		
	}
}
