package javaTutorial.chapter15;

import java.util.Date;

public class TestThreads {
	public static void main(String args[]) throws Exception {
		// this is the main thread where JVM started execution	
		System.out.println("Main thread starts :");
		
		PriorityCounter a=new PriorityCounter("thread1");
		PriorityCounter b=new PriorityCounter("thread2");
		PriorityCounter c=new PriorityCounter("thread3");
		
// thread c has the highest priority and will be granted more cpu execution time , hence will count more.
// windows has 10 as the max priority and 1 as the least priority. default priority is 5.
		//System.out.println("Main thread is starting all priority test threads at :"+ThreadStartTime);
		
	c.setPriority(Thread.MAX_PRIORITY);
	a.setPriority(Thread.MIN_PRIORITY);
		
		a.start();
		b.start();
		c.start();
		
		
		System.out.println("Main thread ends now");
		
	}

}
