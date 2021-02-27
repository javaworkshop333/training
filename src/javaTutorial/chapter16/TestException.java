package javaTutorial.chapter16;

public class TestException {

	public static void main(String[] args) {
		 int a=10;
		 int b=0;
		 try {
			 System.out.println("begin divide");
			 int c= a/b; // 10/0 - infinity . program fails abrupty (not gracefully)
			 System.out.println("end divide");
		 }catch(Exception e) {
			 System.out.println("do not try to divide any number by zero");
		 }finally {
			 System.out.println("thank you for using divide software");
		 }
		 int x=10;
		 int y=20;
		 int z=x+y;
	}
	// javaTutorial.chapter16.TestException.main(TestException.java:8)

}
