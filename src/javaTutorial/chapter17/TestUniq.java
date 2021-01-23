package javaTutorial.chapter17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TestUniq {

	public static void main(String[] args) {
	
		GroceryItem a=new GroceryItem();
		a.category="fruits";
		a.name="mango";
		a.price="10";

		GroceryItem b=new GroceryItem();
		b.category="vegetable";
		b.name="carrot";
		b.price="5";
		
		HashMap<Integer,GroceryItem > stu=new HashMap<Integer,GroceryItem > (); 
		stu.put(1, a);
		stu.put(2, b);
		
		Set<Integer> allKeys=stu.keySet();
		for(   Integer i : allKeys  ) {
			System.out.println(i);
			GroceryItem abc=stu.get(i)  ;
			System.out.println(abc.category);
			System.out.println(abc.name);
			System.out.println(abc.price);
			
		}
		
		
		/*
		HashSet<GroceryItem> allItems = new HashSet<GroceryItem>();
		GroceryItem a=new GroceryItem();
		a.category="fruits";
		a.name="mango";
		a.price="10";
		
		allItems.add(a);
		
		GroceryItem b=new GroceryItem();
		b.category="vegetable";
		b.name="carrot";
		b.price="5";
		
		allItems.add(b);
		
		GroceryItem c=new GroceryItem();
		c.category="fruits";
		c.name="mango";
		c.price="10";
		
		allItems.add(c);
		System.out.println(allItems.size());
	 
		
		/*
		 * HashMap<Integer, St> school=new HashMap<Integer, St>();
		 * 
		 * 
		 * HashSet<Integer> nums=new HashSet<Integer> (); nums.add(10); nums.add(12);
		 * nums.add(10); System.out.println(nums.size());
		 * 
		 * HashSet<String> names=new HashSet<String> (); names.add("john");
		 * names.add("jane"); names.add("jane"); System.out.println(nums.size());
		 * 
		 * // categorization and search = hashCode , equals HashSet<Studnt>
		 * allStudents=new HashSet<Studnt> (); Studnt a=new Studnt(); a.grade=1;
		 * a.studentId=1; a.name="john";
		 * 
		 * Studnt b=new Studnt(); b.grade=2; b.studentId=1; b.name="john";
		 * 
		 * Studnt c=new Studnt(); c.grade=1; c.studentId=1; c.name="john";
		 * 
		 * allStudents.add(a); allStudents.add(b); allStudents.add(c);
		 * System.out.println(allStudents.size());
		 */
	}

}
