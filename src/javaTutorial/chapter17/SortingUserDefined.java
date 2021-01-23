package javaTutorial.chapter17;

import java.util.Iterator;
import java.util.TreeSet;

public class SortingUserDefined {

	public static void main(String args[])
	{
		Student a=new Student("ram",85);
		Student b=new Student("krishna",90);
		Student c=new Student("bharat",75);
		TreeSet<Student> sorting=new TreeSet<Student> ();
		sorting.add(a);
		sorting.add(b);
		sorting.add(c);
		
		Iterator<Student> it= sorting.iterator();
		while(it.hasNext())
		{
			Student stu=it.next();
			System.out.println(stu.name+" : "+stu.score);
		}
	}
}
