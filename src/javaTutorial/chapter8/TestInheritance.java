package javaTutorial.chapter8;

public class TestInheritance {

	public static void main(String[] args) {
		Parent a=new Parent();// 1 method, object created has 2 methods
		Child b=new Child();// 1 method, object created has 2 methods
		Parent c=new Child();// 1 method, object created has 2 methods
		String d="hello";
		testInheritance( b );
	//	testInheritance( b );
	//	testInheritance( c );
	//	testInheritance( d );
	}

	public static void testInheritance(Object o)
	{
		if( o instanceof String)
			System.out.println( (String) o );
		else if (o instanceof Child)
			((Child) o).childMethod();
		else if (o instanceof Parent)
			((Parent) o).parentMethod();
		
		//Car -> Ford -> Ferrari
		//Object -> Parent -> Child
	}
}
