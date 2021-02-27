import java.io.File;
import java.io.IOException;

public class ProgramBExc {

	public static void main(String[] args) {
		
		System.out.println("main");
		ProgramAExc a=new ProgramAExc();
		try {
			a.method1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
		
		BankAccountExce bae=new BankAccountExce();
		try {
			bae.withdraw(1000);
		} catch (InsufficientFundException e1) {
			e1.printStackTrace();
		}
		
	}

}
/* call stack trace
   ProgramAExc.method3(line #15)
   ProgramAExc.method2(line #10)
   ProgramAExc.method1(line #5)
   ProgramBExc.main(line #8)   
*/