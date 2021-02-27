import java.io.File;
import java.io.IOException;

public class ProgramAExc {
	public void method1() throws IOException {
		System.out.println("1");
		method2();
		System.out.println("a");
	}
	public void method2()  throws IOException {
		System.out.println("2");
		method3();
		System.out.println("b");
	}
	public void method3() throws IOException  {
		System.out.println("3");
		// compile time or checked exception
		File f=new File("w:/myjavafile.txt");
		f.createNewFile();
		System.out.println("c");
	}
}
