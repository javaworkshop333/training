package javaTutorial.chapter17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
 

public class SetSample {
	
	public void setStudents()
	{
		System.out.println("\n \n \n");
		// List has 3 types - arraylist,linkedlist and vector.

		// unique, not-indexed, fastest among Set
		 HashSet<String> studentsCollection=new HashSet<String> ();

		// unique, not-indexed, ordered
		// LinkedHashSet<String>studentsCollection=new HashSet<String> ();

		// unique, not-indexed, Sorted
		//TreeSet<String>studentsCollection=new TreeSet<String> ();

		 
		// add items to list collection
		studentsCollection.add("ram");
		studentsCollection.add("shyam");
		studentsCollection.add("laxman");
		studentsCollection.add("laxman");
		
		// get size of list collection 
		int no_of_students=studentsCollection.size();
		System.out.println("Set number of students:"+no_of_students);
		
		// get item from specific index ( not part of set collection )
		//String firstStudent=studentsCollection.get(0);
		//System.out.println("List first student:"+firstStudent);
		
		// set item at specific index ( not part of set collection )
		//studentsCollection.set(2, "bharat");

		// find the items index ( not part of set collection )
		//int itemNo=studentsCollection.indexOf("ram");
		//System.out.println("List find index of an item:"+itemNo);
		
		// remove an item by index and by item
		//studentsCollection.remove(0); // ( not part of set collection )
		studentsCollection.remove("shyam");
		
		// iterate items. Read items from the collection list
		Iterator<String> readStudentsCollection=studentsCollection.iterator();
		while(readStudentsCollection.hasNext())
		{
			String studentName=readStudentsCollection.next();
			System.out.println("set student name:"+studentName);
		}
		

	}
	
}
