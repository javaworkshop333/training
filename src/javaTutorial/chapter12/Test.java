package javaTutorial.chapter12;

public class Test {
public static void main(String args[])
{
USCitizen x=new USCitizen();
// x.ssn="11111111"; final variable cannot be assigned any value

//static variable and method can also be accessed by object
System.out.println(x.name);
x.getName();

//static variable and method can be accessed just by class name
System.out.println(USCitizen.name);
USCitizen.getName();

}

}
