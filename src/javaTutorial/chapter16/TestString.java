package javaTutorial.chapter16;

public class TestString  {

	public static void main(String args[])
	{
		String name="john doe"; // group/array of character
		// String is a array of characters.. same as array index starts at zero
		
		// get first character (indexed zero) from the string
		System.out.println(name.charAt(0));// john
		// join name string value with the input  + operator
		System.out.println(name.concat(" , last name")); 
		// return true if input exist inside name variable value
		System.out.println(name.contains("oh"));// @
		// return true if name variable value ends with input 		
		System.out.println(name.endsWith("hn"));//.com  
		// return true if name variable value is equal to input	, case should match as well
		System.out.println(name.equals(" FIRST name ")); // John john 
		// return true if name variable value is equal to input	, case need not match		
		System.out.println(name.equalsIgnoreCase(" FIRST name "));// john JOHN
		// same as contains method, except it returns the index position of input first occurence
		
		//String name="john doe";

		System.out.println(name.indexOf("o")); // 123 8 123 8 123
		// same as contains method, except it returns the index position of input last occurence
		System.out.println(name.lastIndexOf("o")); // 14 8 123 8 123
		// replace all occurence of the input1 with input2
		System.out.println(name.replaceAll(" ", "")); // 1232331234,123 233 1234, 1232331234
		name.replaceAll(" ", "").replaceAll("-", "");
		// replace first occurence of the input1 with input2
		System.out.println(name.replaceFirst("o", "a"));
		// split the string in array of strings by the input "first name" is converted to array containing value first and name
		// if split by space
											// 
											// String number="1231231234", 
											// String[] splitPhoneNumber= number.split("-")
		System.out.println(name.split("-")); // 123
											//  123
											//  1234
											// splitPhoneNumber[0]
		// return substring starting at position provided in input
		
		//String name="JOhn doe";
		String phone="1234567890";
		System.out.println(phone);
		System.out.println(			phone.substring(0,3)     +"-"+   phone.substring(3,6)  +"-"+   phone.substring(6)   );
		System.out.println(name.substring(5)); // 1234567890
		// return substring between starting and ending position provided in inputs
		System.out.println(name.substring(3, 6));  // 1234567890
		// convert all characters in the string to lower case
		System.out.println(name.toLowerCase()); // name="JOhn" ... "john"
		// convert all characters in the string to upper case
		System.out.println(name.toUpperCase());// name="JOhn" ... "JOHN"
		// remove the white space and next line characters from the string in the begining and end of the string
		System.out.println(name.trim()); // "    jo hn      "

		String a="hi hello how are you";
		String aArr[]=a.split(" ");
		for(String x:aArr)
			System.out.println(x);
		 
		StringBuffer sb1=new StringBuffer(a);
		StringBuilder sb2=new StringBuilder (a);
		sb1.append("123");
		
	}
}
