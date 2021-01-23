package javaTutorial.chapter15;

import java.util.Date;

public class PriorityCounter extends Thread{
	String threadName;

	public PriorityCounter(String name) {
		threadName = name;
	}

	public void run() {

		System.out.println("Priority Thread " + threadName + " started running :");

		long i = 0;
		while (true) {
			i++;
			// if thread did count 10 billion print
			if (i % 10000000000l == 0) {
				Date ThreadStartTime = new Date();
				System.out.println(threadName + ":" + (i / 10000000000l) * 10 + " billion - " + ThreadStartTime);
			}
		}
	
	
	}

 
}
