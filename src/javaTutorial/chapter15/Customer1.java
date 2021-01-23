package javaTutorial.chapter15;

public class Customer1 extends Thread{
	Flight f;
	Hotel h;
	public void run(){
		try{
			synchronized(f){
				f.book("customer1");
				synchronized (h) {
					h.notify();
					System.out.println("customer 1 waiting for hotel to  be available ");
					h.wait();
					System.out.println("customer 1 got access to hotel");
					h.book("customer 1");
				}
			}
		}catch(Exception e){
			
		}
	}
}
