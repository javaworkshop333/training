package javaTutorial.chapter15;

public class Customer2 extends Thread {
	Flight f;
	Hotel h;
	public void run(){
		try{
			synchronized(h){
				h.book("customer2");
				synchronized (f) {
					f.notify();
					System.out.println("customer 2 waiting for flight to  be available ");
					f.wait();
					System.out.println("customer 2 got access to flight");
					f.book("custmer 2");
				}
			}
		}catch(Exception e){
			
		}
		
	}
}
