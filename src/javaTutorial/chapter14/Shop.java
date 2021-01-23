package javaTutorial.chapter14;

public class Shop {

	public static int buy(String product,int money) throws InsufficientFundException
	{
		int iphonePrice=500;
		
		String s=null;
		s.toString();
		
		if (product.equalsIgnoreCase("IPHONE") 
				&& money < iphonePrice
				)
			throw new InsufficientFundException("ShopErr1","less money");
		else if
		(product.equalsIgnoreCase("IPHONE") 
				&& money > iphonePrice
				)
			throw new InsufficientFundException("ShopErr2","no change to return back to cusomer");
		else
		{
			int remainingPrice=money-iphonePrice;
			return remainingPrice;
		}
	}
}
