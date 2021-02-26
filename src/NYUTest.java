public class NYUTest {
	public static void main(String[] args) {
		
		Calculator.add(10, 20);
		System.out.println( Calculator.bb );
		Calculator c=new Calculator();
		System.out.println( c.aa );
		
		NYUStudent stu1=new NYUStudent();
		NYUStudent stu2=new NYUStudent();
		stu1.address="street1 ny"; stu1.name="john"; stu1.semester=2;
		stu2.address="street1 ny"; stu2.name="jane"; stu2.semester=3;
		System.out.println( stu1.name );
		System.out.println( stu2.name );
		stu1.name="mike";
		System.out.println( stu1.name );
		System.out.println( stu2.name );
		System.out.println("*******************");
		System.out.println( stu1.address);
		System.out.println( stu2.address);
		stu1.address="street2 ny";
		System.out.println( stu1.address);
		System.out.println( stu2.address);
		
	}

}
