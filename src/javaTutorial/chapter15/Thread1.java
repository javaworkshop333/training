package javaTutorial.chapter15;

public class Thread1 {
	public static void main(String args[]) {
		System.out.println("in program thread1 start");
		Thread t2=new Thread( new Thread2() );
		t2.start(); // start- this program will run parallely
		Thread3 t3=new Thread3();
		t3.start();
		System.out.println("in program thread1 end");
	}

}
