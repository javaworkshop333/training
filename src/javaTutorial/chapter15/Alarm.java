package javaTutorial.chapter15;

import java.util.Date;

public class Alarm extends Thread{
	
	public int remind;
	public String threadId;
	public Alarm(int remindTime,String id)
	{
		remind=remindTime;
		threadId=id;
	}
	
	public void run()
	{
		try{
		// below method takes time in milli seconds. to convert variable remind to seconds multiply by 1000
		// below line will sleep for specific time then print
		this.currentThread().sleep(remind * 1000 );
		Date currentTime=new Date();
		System.out.println(threadId+" : WAKE UP remind time "+remind+" seconds  is over. Now time is :"+ currentTime);
		}catch(Exception e)
		{
			System.out.println("exception while sleeping, someone interrupted me");
		}
	}
	
}
