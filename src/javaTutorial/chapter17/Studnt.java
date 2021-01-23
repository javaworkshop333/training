package javaTutorial.chapter17;

public class Studnt {
	public int grade;
	public int studentId;
	public String name;
	
	// categorize
	public int hashCode() {
		return grade;
	}
    
	// search/compare
	public boolean equals(Object otherStudentObjct) {
		Studnt anotherStudent=(Studnt)otherStudentObjct;
		if(this.grade == anotherStudent.grade && this.name.equals(anotherStudent.name)  
				&& this.studentId==anotherStudent.studentId )
			return true;
		else
			return false;
	}
	
}
