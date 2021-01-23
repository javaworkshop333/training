package javaTutorial.chapter18;

public class Singleton {
	public static Singleton  onlyObject
	=new Singleton ();
	private Singleton(){
		
	}
	public static Singleton
	getMeOnlyObject(){
		return onlyObject;
	}
}
