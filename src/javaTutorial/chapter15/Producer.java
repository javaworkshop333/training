package javaTutorial.chapter15;

import java.util.Random;

public class Producer extends Thread {
	Stock stok;

	public Producer(Stock shareProd) {
		stok=shareProd;
	}

	public void run() {
			try{
			while(true){
			
					synchronized (stok) {
						stok.quantity=stok.quantity+10;
						System.out.println("Notify Consumers NEW STOCK ARRIVAL: Total stocks :"+stok.quantity);
						stok.notify(); // notify the consumers for new stock arrival
						stok.wait();// wait until the product runs out of stock and consumer notifies
						}
				
				//stok.updateStock(10); // add new stock in the product
			}	
			
				
				
			}catch(Exception e){
				
			}
		
	}

	
}
