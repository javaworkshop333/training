package javaTutorial.chapter15;

import javaTutorial.chapter18.Student;

public class Thread2  implements 
Runnable
 {
	public void run() {
		while(true) {
			try {
				Thread.currentThread().sleep(100);
				System.out.println("thinking");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
