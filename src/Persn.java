// persn is child/sub class of human
// person is parent/super class of Stude
public class Persn extends Human{
	int a=2;
	String name="john";
	int age=10;
	public void talk() {
		System.out.println("hello");
	}
	public Persn(   ) {
		super();
		System.out.println("person constructor");
	}
}
