package javaTutorial.chapter13;

public class Test {
public static void main(String args[])
{
// arrays contains group if primitive data type or object

// array of primitive data type
char[] alphabets=new char[2];
alphabets[0]='a';
alphabets[1]='b';

// array of objects
String[] names=new String[2];
names[0]="ram";
names[1]="laxman";

String [][] tables=new String [2][2];
tables[0][0]="first";
tables[1][1]="four";

//length gives the size of array
//Array index starts with 0, use [] to read the content of arrays
//loops
for(int i=0; i < names.length ; i++)
{
	String s=names[i];
	System.out.println(s);
}

// this enhanced for loop on array does the same logic as above traditional for loop. 
for(String s : names)
{
	System.out.println(s);
}


}

}