package javaTutorial.chapter15;
public class Thread3 extends Thread{
	// main method version of thread
	public void run() {
		while(true) {
			try {
				// timed waiting
				Thread.currentThread().sleep(100);
				System.out.println("breathing");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
