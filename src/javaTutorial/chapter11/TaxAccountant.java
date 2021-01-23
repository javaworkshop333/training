package javaTutorial.chapter11;
public class TaxAccountant extends Accountant{
	// this class all add and doJob methods from Accountant class.
	// TaxAccountant would prefer doJob method  in another way so
	// it can override
	public void doJob()
	{
		System.out.println("Do profit/loss tax filing job");
	}

}
