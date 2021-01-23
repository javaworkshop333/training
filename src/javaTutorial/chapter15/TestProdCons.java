package javaTutorial.chapter15;

public class TestProdCons {
	public static void main(String args[]) {
	 	Stock Iphone=new Stock(); // #111
		// extends thread
		Producer Apple= new Producer(Iphone);
		// implements runabble
		Consumer Users= new Consumer (Iphone);
		Thread t=new Thread(Users);
		
		Apple.start();
		t.start();
	}
}
