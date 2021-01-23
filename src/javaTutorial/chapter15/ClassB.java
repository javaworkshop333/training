package javaTutorial.chapter15;

public class ClassB extends Thread  {
	public void run() {
		while(true) {
			System.out.println("in class B method");
		}	
	}
}
