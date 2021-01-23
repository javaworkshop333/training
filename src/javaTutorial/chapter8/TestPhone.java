package javaTutorial.chapter8;

public class TestPhone {
public static void main(String args[])
{
	Nokia3310 cell1=new NokiaLumia(); 
	
	// this class implemented all methods from interface phone and is a complete class
	// we can create an instance/object of this class
	cell1.makeCall();
	cell1.recieveCall();
	
	NokiaLumia cell2=new NokiaLumia();
	cell2.makeCall(); // inherited from parent class
	cell2.recieveCall(); // inherited from parent class
	cell2.dataPlan();
	
}
}
