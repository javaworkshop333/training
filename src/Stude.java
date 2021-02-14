// student is child/sub class of Persn
public class Stude extends Persn {
		int grade=5;
	int a=3;
	public void learn() {
		int a=4;
		System.out.println( a);
		System.out.println( this.a );
		System.out.println(  super.a  );
		System.out.println(  age );
		// local, global, parent variable
		// local a or global a or inherited a from pers
		System.out.println("learning");
	}
	public Stude( String x ) {
		super(   );
		System.out.println("student constructor");
	}
}
