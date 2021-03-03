package javaTutorial.chapter17;
// by default all classes inherit ffrom Object class
public class Stud {
	int grade;
	String name;
	public Stud(String name,int grade)
	{
		this.name=name;
		this.grade=grade;
	}
	public boolean equals(Object o) {
		Stud otherObj=(Stud)o;
		return otherObj.name.equals(this.name);
	}
	public int hashCode(  ) {
		return grade;
	}	
}