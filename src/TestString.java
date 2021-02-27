
public class TestString {
	public static void main(String argsp[]) {
		String s1="john";		
		String s2="john";		
		String s3=new String("JOhn");		
		String s4=new String("john");		
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			// alternative == . compare the value rather than variable addresses
		if( s1.equalsIgnoreCase(s3))
			System.out.println("same");
		else
			System.out.println("Different");
	}
}
