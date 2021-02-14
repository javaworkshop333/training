import java.util.Scanner;

public class ControlFlow {
	public static void main(String[] args) {
		int pinOnRecord=1234;
		int userEnteredPin=1234;
		boolean abc=true;
		// either pin match... proceed or pin doesnt match and customer retry
		if ( pinOnRecord == userEnteredPin ) // 1) if condition requires boolean
		{
			System.out.println("customer pin match.. proceed");
			System.out.println("show withdraw/deposit option");
		}
		// 2) if above expression/condition is false... then go to else
		else // 3) else have to followup after if
			System.out.println("invalid pin, please try again....");
		
		// 4) if u have 1 line in if/else u dont need curly brackets. 
		// other wise it is mandatory
		// 5) if, else  never ends with semicolon. upon using semicolon
		// it will be considered as empty block
		int a=20;
		int b=20;
		if(a==b){
			System.out.println("a and b are same");
		}
		// 6) multiple checks can be performed using if elseif elseif ....
		
		System.out.println("press 1 for withdraw, 2 for deposit, 3 to exist");
		int customerOption=2;
		if(  customerOption==1 )// if expression is false, jump to next condition
		{
			System.out.println("enter withdraw amount");
		}
		else if(  customerOption==2 )
		{
			System.out.println("enter deposit amount");
		}
		else // default block
		{
			System.out.println("thank you for using java bank");
		}
		// 7) u can only enter 1 block at a time
		
		System.out.println("bye bye");
		boolean x=true;
		if(   x  ) {
			
		}
		
		// 8) for 1 check use if, for 2 check use if-else combo, for more than 2
		//		checks use if-elseif-elseif....-else combo
		
		
		for(int i=1; i<=4 ; i++) {
			System.out.println("hi");
			if( i==1 )
				continue;
			else if ( i==3 )
				break;
			System.out.println("bye");
		}
		
		System.out.println("last line");
		/* 
		 ICE = i:1 ,  true, hi, bye
		 MCE = i:2, true, hi, 
		 MCE = i:3, true, hi
		 MCE = 	
		 */
		
		
		int i=1;
		while( i <3){
			i++;
			if(i==2){
				System.out.println("while hi"); 
				break;
			}
			else{
				System.out.println("while hello");
			}
		}
		boolean ab=false;
		boolean doExit=ab ;
		// doExist is variable
		// boolean is data type of doExit variable
		// doExit variable is declared
		// doExit is initialized with false value
		// equal sign - assign value of RHS to variable on LHS
		// boolean is a primitive data type with either true or false value
		// equals sign requires RHS and LHS to be of same data type
		
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println(" enter 1 to add, 2 to exit ");
			int option=sc.nextInt();
			if(option == 1) {
				System.out.println(" enter 1st number ");
				int number1=sc.nextInt();
				System.out.println(" enter 2nd number ");
				int number2=sc.nextInt();
				int sum=number1 + number2;
				System.out.println( "sum is :"+sum);
			}
			else if(option == 2) 
				doExit=false;
		}while(  doExit);
		
		System.out.println("done with while loop");
		
		int op=1;
		switch (op)
		{
			case 1:
				System.out.println("in one");
				break;
			case 2:
				System.out.println("in two");
				break;
			case 3:
				System.out.println("in three");
				break;
			default:
				System.out.println("in default");
				break;			
		}
		System.out.println("outside switch loop");
		/*
		 switch case 
1) does not automatically exit.
every case block should end with break;
2) Used for primitive data types or string.
3) not to use for boolean checks.
4) faster than if else. jump table
		 */
	}
}
