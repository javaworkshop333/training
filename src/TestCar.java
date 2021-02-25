import java.util.Scanner;
public class TestCar {
	public static void main(String[] args) {
		Cal c=new Cal();// using class
		c.add(10, 20); // using / calling other method
		System.out.println(  c.a );
		
		Scanner s=new Scanner(System.in);
		System.out.println("press 1 for Hyundai, press 2 for ferrari");
		int option=s.nextInt();
		if(option ==1) {
			hyundai h=new hyundai();
			drive(h);
		}
		else if(option ==2) {
			Ferrari f=new Ferrari ();
			drive(f);
		}
		else {
			Ford fo=new Ford ();
			drive(fo);
		}
	}
	public static void drive(Car c) {
		c.drive();
	}
}
