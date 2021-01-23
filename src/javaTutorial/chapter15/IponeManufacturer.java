package javaTutorial.chapter15;

public class IponeManufacturer extends Thread{
	IponeWarehouse warehouse;
	
	public void run(){
		try{
			while(true){
				synchronized (warehouse) {
					warehouse.notify();
					warehouse.wait();
					int buildNewProducts=10;
					warehouse.stockCount=
						buildNewProducts+warehouse.stockCount;
					System.out.println("Manufacturer produced 10 products, latest stock count is:"+warehouse.stockCount);
				}
			}
		}
		catch(Exception e){
			
		}
		
	}
}
