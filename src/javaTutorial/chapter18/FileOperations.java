package javaTutorial.chapter18;

import java.io.*;
import java.util.Scanner;

public class FileOperations extends Thread {
	public static void main(String args[]) throws Exception {
		// serialization  (from java object - temp memory to hardrive )
		// deserialization ( from harddrive to java objects )
		Student s = new Student();
		try {
			File f=new File("D:\\studentObject.file"); 
			FileInputStream fileIn = new FileInputStream( f );
			ObjectInputStream in = new ObjectInputStream(fileIn);
			s = (Student) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("student object contains :" + s );
			/*
			Scanner sc=new Scanner(System.in);
			System.out.println("enter student name");
			s.name=sc.next();
			System.out.println("student object is:"+s);
			File f=new File( "d:\\studentObject.file");
			FileOutputStream fo=new FileOutputStream(f);
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			oo.writeObject(s);
			oo.close();
			*/
			 
		} catch (Exception i) {
			i.printStackTrace();
			return;
		}

	}
	
	public static void testfil() throws Exception {
		File writef = new File("D:\\test.txt"); // initialize file object with file path
		writef.createNewFile();
		FileReader readFile = new FileReader(writef); // initialize filereader object with file path
		BufferedReader readBuffered = new BufferedReader(readFile);
		try {
		String line = readBuffered.readLine(); // the first line is copied in a string
		while (line != null) { // if the line is not null enter the loop and print
			System.out.println(line); // standard input , output 
			line = readBuffered.readLine();
		} 
		}
		finally
		{
			readBuffered.close(); // connection leakage
		}
		
		/*
		FileWriter print= new FileWriter(writef) ; // writing content to file
		BufferedWriter bw=new BufferedWriter(print); // bulk/buffered writing content to file... decorator design pattern
		bw.write("writing data more efficiently");
		bw.flush();
		print.close();
		
		
		FileReader readFile = new FileReader(writef); // initialize filereader object with file path
		BufferedReader readBuffered = new BufferedReader(readFile);
		String line = readBuffered.readLine(); // the first line is copied in a string
		while (line != null) { // if the line is not null enter the loop and print
			System.out.println(line);
			line = readBuffered.readLine();
		} // when there are no more lines to read in a file .readLine() method returns
			// null
		readBuffered.close();
		/*
		 * File writef=new File("D:\\test.txt"); // initialize file object with file
		 * path FileWriter print= new FileWriter(writef) ; // initialize File writer
		 * BufferedWriter printBuf= new BufferedWriter( print ); // initialize File
		 * writer printBuf.
		 * write("Hello i am learning how to write in file using java \n i am done ");
		 * // write string content on this file printBuf.close();
		 * 
		 * // FileReader readFile= new FileReader(fileCompletePath); // readFile.rea /*
		 * 
		 * FileReader readFilefr= new FileReader(fileCompletePath); // initialize
		 * filereader object with file path BufferedReader readFile = new
		 * BufferedReader(new FileReader(fileCompletePath)); // BufferedReader reader =
		 * new BufferedReader(new FileReader(fileCompletePath)); //BufferedReader reader
		 * = new BufferedReader(readFile); // this wrapper class allows us to read text
		 * content line by line
		 * System.out.println("reading text content from file "+fileCompletePath);
		 * String line = readFile.readLine(); // the first line is copied in a string
		 * while (line != null) { // if the line is not null enter the loop and print
		 * System.out.println(line); line = readFile.readLine(); } // when there are no
		 * more lines to read in a file .readLine() method returns null /* File
		 * createf=new File("D:\\HI.java"); // initialize file object with file path
		 * if(createf.exists() == false) // check if file does not exist {
		 * createf.createNewFile(); // create file if does not exists
		 * System.out.println("created file "+fileCompletePath);
		 * 
		 * if(createf.isDirectory()) // check if the path provided leads to folder or
		 * file type System.out.println("create action is of type folder"); else
		 * System.out.println("create action is of type File"); } else {
		 * System.out.println("file already exists");
		 * System.out.println("deleting file now"); createf.delete(); }
		 */

	}

	public void standardStream() throws Exception {
		System.out.println("\n testing console operation \n ");

		try {
			String consoleFilePath = "D:/ConsoleFileOperation.txt";

			// taking put from command prompt and storing in file
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in)); // system.in opens read
																								// stream from console
			System.out.println("Enter your first name: ");
			String fname = bufferRead.readLine();
			System.out.println("Enter your last name: ");
			String lname = bufferRead.readLine();
			File writef = new File(consoleFilePath);
			if (!writef.exists())
				writef.createNewFile();
			FileWriter print = new FileWriter(writef);
			print.write(fname);
			print.write(" ");
			print.write(lname);
			print.close();

			// reading file content and printing on console
			FileReader readFile = new FileReader(consoleFilePath);
			BufferedReader reader = new BufferedReader(readFile); // this wrapper class allows us to read text content
																	// line by line
			System.out.println("reading console text content from file " + consoleFilePath);
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line); // prints on standard console.
				line = reader.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void binary() throws Exception {
		String toCompletePath = "d:/hello.jar.copy";
		File toCompletePathFile = new File(toCompletePath);
		FileInputStream fis = null;
		FileOutputStream fos = null;
 
		
		try {
			fos = new FileOutputStream(toCompletePath);
			fis = new FileInputStream(toCompletePathFile);
			byte[] buffer = new byte[1000000];
			BufferedInputStream bi = new BufferedInputStream(fis);
			bi.read(buffer);
			int noOfBytes = fis.read(buffer);
			while (noOfBytes != -1) {
				fos.write(buffer, 0, noOfBytes);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			fis.close();
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
