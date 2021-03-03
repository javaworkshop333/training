package javaTutorial.chapter17;

public class Student implements Comparable<Student> {
	int score;
	String name;
	
	public Student(String name,int score)
	{
		this.name=name;
		this.score=score;
	}
	
public int compareTo(Student anotherObject)
{
	
	// this method has to return int value, which treeset uses to sort in ascending order.
	// if difference is higher, this student record moves to the bottom of treeset
	return this.name.compareTo(anotherObject.name);
	
	/*
	int difference= this.score - anotherObject.score;
	return difference;
	*/
	// String class already has it own way of comparing string values.
	// to compare by string value (this.name)
	// return this.name.compareTo(anotherObject.name);
	 
}

	public boolean equals(Object o) {
		return true;
	}
	public int hashCode(  ) {
		return -1;
	}
	
}
