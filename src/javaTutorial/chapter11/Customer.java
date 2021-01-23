package javaTutorial.chapter11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
	static BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in)); // system.in opens read stream from console
	public static void main(String[] args) {
		try{
			System.out.println("1");
			int a=10;
			System.out.println("2");
			int b =a/0;
			System.out.println("3");
		}catch(Throwable ex){
		System.out.println("divide error");	
		}finally{
			System.out.println("thanks for using divide option");
		}
	}
}
