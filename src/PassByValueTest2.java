public class PassByValueTest2 {
	public static void main(String[] args) {
		PassByValue2 pb=new PassByValue2();	
		// pb=#123 , 
		StudentClass2 s1=new StudentClass2();	
		// s1=#234, name=john
		StudentClass2 s2=new StudentClass2();	
		System.out.println(s1.name);	
		System.out.println(s2.name);		
		pb.test2(s1,s2);	
		System.out.println(s1.name);	
		System.out.println(s2.name);	
	}

}
