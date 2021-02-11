public class BankAccount {// class body
	// comments - ignored by java machine, documentation/notes purpose
	// Has -  Balance, accountNumber ( data/variables )
	
	// choose unique names for each of data/variables
	// camelCase coding practice
	// choose appropriate data format/type for the variable 			
			// 1) decimal  = float, double (data format to store decimal)
			// 2) whole number = byte,short,int,long ( data format to store whole numbers)
			// 3) group of alphabets john, building123, streeet 10, city, state = char
											// String ( char = 1 character, string = N characters)
			// 4) yes or no (boolean = data format to store yes/no or true/false information)
	// ensure value data format matches data format / type

//	byte a="john"; byte data type requires whole number upto 127, and not letters(String)
	
	byte accountNumber=127; // upto 127 , 1 byte memory = 8 bits
	byte customerAge=25; // 8 billion byte memory
	byte birthDate=24;
	byte birthMonth=10;
	short birthYear=2020;// upto 32767, 2 byte memory = 16 bits
	long phoneNumber=9123456789l;// more than 2 billion, 8 byte memory
	int zipcode=99999;// upto 2 . billion capacity, 4 byte memory
	
	float scientificValue=1.12345f; // 5 or 6 precision values
	double abc=1.123; // 14 or 15 precision values
	
	String a="john";
	String expDate="02/23";
	byte expMonth=2;
	short expYear=2023;
	
	String name="john#3432432dfds1";
	char favoriteLetter='#';
	
	boolean isAccountActive=true;
	boolean isCustomerPastPaymentDue=false;
	
	
}
