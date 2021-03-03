package javaTutorial.chapter18;

import java.io.*;
import java.util.Scanner;

public class FileOperations extends Thread {
	public static void main(String args[]) throws Exception {
		testfil();
	}
	
	public static void testfil() throws Exception {
		 
		File writef = new File("D:\\test.txt12"); // initialize file object with file path
		FileReader readFile = new FileReader(writef); // initialize filereader object with file path
		// decorator = buffered , read more characters
		BufferedReader readBuffered = new BufferedReader(readFile);
		try {
			String line = readBuffered.readLine(); // the first line is copied in a string
			while (line != null) { // if the line is not null enter the loop and print
				System.out.println(line); // standard input , output 
				line = readBuffered.readLine();
			} 
		}catch(Exception e) { e.printStackTrace(); }
		finally
		{
			readBuffered.close(); // connection leakage
		}
		/*
		try {
		File writef = new File("D:\\test.txt123123"); // initialize file object with file path
		FileWriter print= new FileWriter(writef,true) ; // writing content to file
		//print.createNewFile();
		BufferedWriter bw=new BufferedWriter(print); // bulk/buffered writing content to file... decorator design pattern
		bw.write("\n java");
		bw.flush();
		print.close();
		}catch(Exception e) {
			 e.printStackTrace();
		 }
		 */
	}

	public void standardStream() throws Exception {
		System.out.println("hi");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println(name);
	}

	public void binary() throws Exception {
		String toCompletePath = "d:/hello.jar.copy";
		File toCompletePathFile = new File(toCompletePath);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(toCompletePathFile);
			byte[] buffer = new byte[1000000];
			BufferedInputStream bi = new BufferedInputStream(fis);
			bi.read(buffer);
			int noOfBytes = fis.read(buffer);
			while (noOfBytes != -1) {
				System.out.println(noOfBytes);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			fis.close();
		}
		
		
		FileOutputStream fos = null;
 		try {
			fos = new FileOutputStream(toCompletePath);
			byte[] buffer = new byte[1000000];
			fos.write(buffer);
		} catch (Exception e) {
			throw e;
		} finally {
			fos.close();
		}
	}

	public void seriazliation() throws Exception{
		Student s = new Student();
		System.out.println("student object contains :" + s);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		s.name = sc.nextLine();
		System.out.println("student object contains :" + s);

		System.out.println("Enter student age");
		s.age = sc.nextInt();
		System.out.println("student object contains :" + s);
		

		try {
			File f = new File("d:\\javaMemory2HardDrive.obj");
			FileOutputStream fileOut = new FileOutputStream(f);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(s);
			out.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}

	}
/*
	public static void main(String args[]) throws Exception {
		Student s = null;
		try {
			/*
			File f=new File( "d:\\javaMemory2HardDrive.obj");
			FileInputStream fileIn = new FileInputStream( f );
			ObjectInputStream in = new ObjectInputStream(fileIn);
			s = (Student) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("student object contains :" + s );

		} catch (Exception i) {
			i.printStackTrace();
			return;
		}

	}
	*/
}
