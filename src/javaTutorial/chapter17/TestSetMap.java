package javaTutorial.chapter17;

import java.util.HashSet;

public class TestSetMap {

	public static void main(String[] args) {
		HashSet<Product> products= new HashSet<Product> ();
		Product p1=new Product("vegetables","carrot",1);
		Product p2=new Product("vegetables","carrot",1);
		Product p3=new Product("vegetables","onion",2);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		System.out.println(products.size());
	}

}
