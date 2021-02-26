public class PassByValue {
	int a=20;
	public boolean test2( StudentClass sc1,StudentClass sc2) {		
		sc2.age=30;	
		sc1.grade=4	;
		sc2.name="mike";	
		System.out.println(a);
		return true;	
	}
	public static boolean test(float x, StudentClass sc) {					
		x=30.0f;				
		sc.age=12;				
		return true;				
	}					
}
