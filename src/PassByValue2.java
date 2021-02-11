public class PassByValue2 {
	
	public boolean test2( StudentClass2 sc1,StudentClass2 sc2) {		
		sc1.name=sc2.name;
		sc1.name="mike";	
		sc2.name="jane";
		sc1.name=sc1.name;
		return true;	
	}
	
	
	public boolean test(float x, StudentClass sc) {					
		x=30.0f;				
		sc.age=12;				
		return true;				
	}					

}
