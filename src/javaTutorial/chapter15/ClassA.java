package javaTutorial.chapter15;

public class ClassA extends Thread {
	public void run() {
		System.out.println("hi");
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("bye");
	}
}
