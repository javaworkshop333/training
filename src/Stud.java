
public class Stud {
	// 3 global variable (instance variable)
	String name="john";
	int age=10;
	int grade=3;

	// default constructor
	public Stud(   String name    ) {
		System.out.println("1st constructor");
		this.name=name; // refer global variable
	}
	// name=jane, ag=10
	public Stud(   String name   , int ag ) {
		this(name); // constructor call
		System.out.println("2nd constructor");
		age=ag;
	}
	// name=jane, ag=8, gr=3
	public Stud(   String name   , int ag , int gr) {
		this(name,ag);
		System.out.println("3rd constructor");
		grade=gr;
		this.learn(); // call method in the same class
	}
	// method
	public int learn() {
		return 1;
	}
	public int add(int a, int b,String name) {
		return a+b;
	}
	// diffference in contructor compared to method
	// name is similar to class name
	// no return type
	
	// THIS operator
	// if local/parameter conflicts with global
	// local wins
	// if you want to explicitly access global
	// use this.  
// USAGE of this
	// this.name - global variable in the same clas
	// this.teach(); - method in the same class
	// this("jane"); - constructor in the same class



		public int add(int a, int b) {
			String name="jane";
			System.out.println( this.name );
			System.out.println( name );
			return a+b;
		}
}	
