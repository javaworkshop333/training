package javaTutorial.chapter10b;
// this is dto ( data transfer object)
// this class just carries information
// this class has methods to update or read the information that it carries.
public class Employee {
private String name;
private int role;
private int salary;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRole() {
	return role;
}
public void setRole(int role) {
	this.role = role;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
}
