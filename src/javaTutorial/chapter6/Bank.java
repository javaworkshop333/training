package javaTutorial.chapter6;

public class Bank {
	
	public void withdrawMoney(int balance,int withdraw)
	{
		System.out.println("");
		// if condition satisfied print below line
		if(withdraw > 0){
			System.out.println("amount being withdrawn :"+withdraw);
		}
		
		
		// IF condition satisfied go to "if" block, if condition not satisfied go to "else" block
		// used when required in yes or no options.
		if(balance > withdraw){
			System.out.println("you can withdraw");
		}
		else{
			System.out.println("insufficient balance");
		}

		
		// multiple condition check, whichever condition satisfies it goes to that block, if no condition satisfies go to else block
		// used when multiple possible options and 1 default option available
		if(withdraw > 1 && withdraw < 10){
			System.out.println("give 1 dolloar bill");
		}
		else if(withdraw > 10 && withdraw < 100){
			System.out.println("give 10 dolloar bill");
		}
		else{
			System.out.println("give 100 dollar bill");
		}
		
	}
	
	public void count()
	{
		System.out.println("");
		// for loop has 3 part, initialize, condition check, increment/decrement
		// initialize x to 1
		// do the condition check if x<=3 satisfied go inside block
		// increment x by 1 = 2... check condition again x<=3 ... go inside block.. 
		// keep incrementing -> condition check -> inside block. until condition fails 
		System.out.println("Count three, 1 dollar bill");
		for(int x=1;x<=3;x++)
		{
			System.out.println("for loop , Dollar :"+x);
		}
	}
	
	public void printMoney()
	{
		System.out.println("");
		// if condition satisfies execute the inside block. unlike for loop 
		// developer has to initialize the variable before while loop line, and do variable 
		// increment/decrement/true/false inside block
		int y=1; // initialize before while loop
		while(y <=3 )  
		{
			System.out.println("while loop , print money :"+y);
			y++; // incre/decre inside loop
		}
		
		// for and while has disadvantage that if the condition fails the first time the block will never be executed.
		// do while ensure , block is executed atleast once.
		int z=0;
		do{
			System.out.println("do while, print money ");
		}while(z>0);
	}
	
	public void options(int option)
	{
		System.out.println("");
		// switch takes byte, short, char, int primitive data type and String object
		switch(option)
		{
		case 1:	System.out.println("withdraw option chosen");
				break;
		case 2:	System.out.println("Balance check option chosen");
				break;
		case 3:	System.out.println("Transfer option chosen");
				break;
		default:System.out.println("Bank Statement");
				break;
		}
		
		if(option == 1)
			System.out.println("withdraw option chosen");
		else if(option == 2)
			System.out.println("Balance check option chosen");
		else if(option == 3)
			System.out.println("Transfer option chosen");
		else
			System.out.println("Bank Statement");
		
	}
	
}
