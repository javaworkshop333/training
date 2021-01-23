package javaTutorial.chapter18;

import java.io.Serializable;

public class Student implements Serializable {
	public long serialVersionUID=1;
	
	public String name;
	public int age;
	
	public String toString() {
		return name+":"+age;
	}
}
