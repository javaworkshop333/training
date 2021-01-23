package javaTutorial.chapter15;

import java.util.Date;

public class TestAlarm {
	public static void main(String args[]) {
		
		
		Alarm alarm1=new Alarm(3, "Alarm one");
		Alarm alarm2=new Alarm(4, "Alarm two");
		Alarm alarm3=new Alarm(5, "Alarm three");
		Alarm alarm4=new Alarm(6, "Alarm four");
		Alarm alarm5=new Alarm(7, "Alarm five");
		
		// thread 2,3,4 all finish at the same time. priortize thread # 3.. 
		//  so thread 3 finish first ( among 2,3,4 ) all the time
		// below is not an ideal test for thread priority. since thread 2 was started before 3 and 4
		//alarm3.setPriority(10);
		
		alarm1.start();
		alarm2.start();
		alarm3.start();
		alarm4.start();
		alarm5.start();

		
		Date ThreadStartTime=new Date();
		System.out.println("All threads started running at :"+ThreadStartTime);
	}

}
