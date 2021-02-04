// Java programs by default are SEQUENTIAL
// Thread java programs are PARALLEL
public class Class2 {
		public static void main(String args[]) {
			System.out.println("1");
			Class1 c=new Class1();
			System.out.println("2");
// method call jumps control to the method's program 
			int x=c.add(   );
// PAUSE in the current program
// control  jumps to Class1 program add method
// RESUME			
			System.out.println("3");
			// pause , give control to sub method
			int y=c.sub(   ); 
			System.out.println("4");
			int z=c.mul(   );
			// pause give control to mul method
			System.out.println("5");
		}
}
