package javaTutorial.chapter15;

public class Sibling extends Thread {
	static String toy1="game board";
	static String toy2="chess board";
	int siblingNumber=0;
	String name="";
	public Sibling(String name,int siblingNumber)
	{
		this.siblingNumber=siblingNumber;
		this.name=name;
	}
	public void run()
	{
		while(true)
		{
			
			if(siblingNumber==1)
			{
				String currentToy=toy1;
				String nextToy=toy2;
				synchronized (currentToy) {
					System.out.println(name+" : i am playing with:"+currentToy);
					try { Thread.sleep(1000); } catch (InterruptedException e) {}
					System.out.println(name+" : i need to play with :"+nextToy);
					synchronized (nextToy) {
						System.out.println(name+" : i am playing with:"+nextToy);
					}
				}
			}
			else 
			{
				String currentToy=toy2;
				String nextToy=toy1;
				synchronized (currentToy) {
					System.out.println(name+" : i am playing with:"+currentToy);
					try { Thread.sleep(1000); } catch (InterruptedException e) {}
					System.out.println(name+" : i need to play with :"+nextToy);
					synchronized (nextToy) {
						System.out.println(name+" : i am playing with:"+nextToy);
					}
				}
			}
			
		}
	}
}
