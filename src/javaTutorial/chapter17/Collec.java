package javaTutorial.chapter17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Collec {

	public static void main(String[] args) {
		// set - not indexed.. no index based methods
		// list - indexed..
		HashSet<String> col=new HashSet<String>();
		col.add("apple");
		col.add("orange");
		col.add("banana");
		col.add("mango");
		col.add("orange");
		// enchanced for loop = good for reading only
		for(String s:col) {
			System.out.println(s);
		}
		
		System.out.println("***************");
		
		// Iterator = good for read & editing 
		Iterator<String> it=col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		/*
		col.add(2,"grapes");
		col.remove(3);
		System.out.println(col.get(4));
		*/
		System.out.println(col);
		col.remove("banana");
		
		// synchronized
		// synchronized
		Hashtable<Integer, String> stu=new Hashtable<Integer, String>();
		stu.put(  1, "john"     );
		stu.put(  123, "jane"     );
		stu.put(  23, "mike"     );
		stu.put(  77, "andy"     );
		stu.remove(23);
		System.out.println(   stu   );
	}

}
