package javaTutorial.chapter15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javaTutorial.chapter18.Product;
import javaTutorial.chapter18.Student;

public class Test {
	
	public static void main(String args[]) throws Exception{
		String fileCompletePath="D:\\testing.txt";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to create new object and 2 for read object from persistence storage");
		int opt=sc.nextInt();
		if(opt==1){
			//serizliation
			Product p=new Product();
			System.out.println("enter prd id");
			p.orderId=sc.nextInt();
			System.out.println("enter cus Name");
			p.name=sc.next();
			//seriazation
			FileOutputStream serf=new FileOutputStream(fileCompletePath);
			ObjectOutputStream serO=new ObjectOutputStream(serf);
			serO.writeObject(p);
		}
		else
		{
			FileInputStream serf=new FileInputStream(fileCompletePath);
			ObjectInputStream serO=new ObjectInputStream(serf);
			Product p=(Product)serO.readObject();
			System.out.println(p.orderId);
			System.out.println(p.name);
		}
		
		
		
	}
}
