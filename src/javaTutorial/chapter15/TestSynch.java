package javaTutorial.chapter15;

public class TestSynch {
public static void main(String args[]){
	Hotel hotl=new Hotel();
	Flight fli=new Flight();
	Customer1 cus1=new Customer1();
	Customer2 cus2=new Customer2();
	cus1.f=fli;
	cus2.f=fli;
	
	cus1.h=hotl;
	cus2.h=hotl;
	cus1.start();
	cus2.start();
}
}
