package javaTutorial.chapter17;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashSample {
public static void main(String args[]) {
	studentPercentage();
}
	public  static void studentPercentage()
	{
		System.out.println("\n \n \n");
			//LinkedHashMap<String, String> studentPercent =new LinkedHashMap<String, String>();
			//HashMap<String, String> studentPercent =new HashMap<String, String>();
			//TreeMap<String, String> studentPercent =new TreeMap<String, String>();
			Hashtable<String, String> studentPercent =new Hashtable<String, String>();
			studentPercent.put("shyam", "95");
		studentPercent.put("andy", "95");
		studentPercent.put("ram", "65");
		studentPercent.put("bharat", "35");
		
		// get size of hash
		int studentSize=studentPercent.size();
		System.out.println("hash : number of students :"+studentSize);
		
		// remove an items from hash by key
		studentPercent.remove("bharat");
		studentSize=studentPercent.size();
		System.out.println("after removing bharat. hash : number of students :"+studentSize);
		
		// get value by key
		String percent=studentPercent.get("bharat");
		System.out.println("bharat percent"+percent);
		
		// check if key exists 
		if(studentPercent.containsKey("ram"))
		{
			System.out.println("student ram exists");
		}
 
		// get all the keys from hashmap 
		Set<String> studentNameKey=studentPercent.keySet();
		
		
		for(String s:studentNameKey) {
			String studentPer=studentPercent.get(s); // every key retrieved is passed to hastable get method, to read value
			System.out.println("for loop student :"+s+" scored :"+studentPer);
		}
		
		Iterator<String> studentNameKeyIte=studentNameKey.iterator();
		while(studentNameKeyIte.hasNext()) // if there is any items reamining
		{
			String studentName=studentNameKeyIte.next(); // will return you the item
			String studentPer=studentPercent.get(studentName); // every key retrieved is passed to hastable get method, to read value
			System.out.println("iterator student :"+studentName+" scored :"+studentPer);
		}
		
		
	}
}
