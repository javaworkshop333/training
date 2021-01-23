package javaTutorial.chapter15;

import java.util.Random;

public class IponeCustomer  extends Thread{
	IponeWarehouse warehouse;
	
	public void run(){
		try{
			while(true){
				synchronized (warehouse) {
					int cusOrder=new Random().
							nextInt(10)+1;
					if(cusOrder>warehouse.stockCount)
					{
						warehouse.notify();
						warehouse.wait();
					}
					warehouse.stockCount=
					warehouse.stockCount-cusOrder;
					System.out.println("Customer order placed for:"+cusOrder+" , latest stock count is:"+warehouse.stockCount);
				}
			}
		}catch(Exception e){
			
		}
		
		
	}
}
