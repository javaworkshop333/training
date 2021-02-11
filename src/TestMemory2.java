
public class TestMemory2 {
// 1) the first line that start with "at" - click on that 
// 2) on the error line.. look for all the variable that has dot opertor 
// 3) click on ech variable with ctrl key pressed
// 4) then check if it is not initiazlied
// whichever is not initalized is the root cause.
	// fix : initilzae the variable
	public static void main(String[] args) {
		Memory2 m2=new Memory2();
		System.out.println( m2.f.ba.a.toLowerCase()   );
		// System class
		// out is global variable of system class
		// println is method of out
		
		System.out.println(  m2.e.zip  );
		
		
		
	}

}
