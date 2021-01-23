package javaTutorial.chapter6;

public class TestBank {

	public static void main(String args[]) throws Exception
	{
	Bank accountant=new Bank();
	accountant.options(1);
	accountant.withdrawMoney(1000, 250);
	accountant.count();
	accountant.printMoney();
	}

}
