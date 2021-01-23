package javaTutorial.chapter15;

import java.util.Random;

 
public class Consumer implements Runnable{
	Stock stok;

	public Consumer(Stock shareProd) {
		stok=shareProd;
	}

	public void run() {
			try{
			while(true)
			{
					synchronized (stok) {
						while(stok.quantity < 3) {
							System.out.println("Notify Producer OUT OF STOCK : Total stocks :"+stok.quantity+" orders placed :"+ 3);
							stok.notify();// notify producer thread to start producing
							stok.wait();// wait until producer thread notifies new stock
							}
						stok.quantity=stok.quantity-3;
					}
				
			//	stok.updateStock(-deductStock);
			}
			
		}catch(Exception e)
		{
			
		}
		
	}

	public String searchAndReplace(String address)
	{
		String newAddress=null;
		boolean searc=address.contains("irving");
		if(searc){
			newAddress=address.replaceAll("irving", "dallas");
		}
		return newAddress;
		
	}
	
}
