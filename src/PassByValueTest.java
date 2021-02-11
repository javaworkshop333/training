public class PassByValueTest {
	public static void main(String[] args) {
		PassByValue pb=new PassByValue();	
		StudentClass s1=new StudentClass();	
		StudentClass s2=new StudentClass();	
		System.out.println(s1.name);	
		System.out.println(s2.name);	
		System.out.println(s1.age);	
		System.out.println(s2.age);	
		System.out.println(s1.grade);	
		System.out.println(s2.grade);	
		pb.test2(s1,s2);	
		System.out.println(s1.name);	
		System.out.println(s2.name);	
		System.out.println(s1.age);	
		System.out.println(s2.age);	
		System.out.println(s1.grade);	
		System.out.println(s2.grade);	

	}

}
