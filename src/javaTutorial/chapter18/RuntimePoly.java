package javaTutorial.chapter18;
import java.util.Scanner;
public class RuntimePoly {
	public static void main(String[] args) {
		Nissan n=new Nissan();
		n.turn(10);
	}
}
class Car{
	public void turn(int a){
		System.out.println("in Car taking turn");
	}
}
// overwriting
class Nissan extends Car{
	public void turn(String a){
		System.out.println("in Nissan taking turn");
	}
}