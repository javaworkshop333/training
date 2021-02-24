// implements - Nissan takes reponsibility
// to write the code for all 3 abstract methods from
// ICar
// abstract - didnt complete all 3 methods. 
// stop is missing
// Nissan inherited 4 responsbilities (abstract method)
// implemented 2 of those responsbilites(drive, start)
// pending 2 of the respo (stop, play music)
public abstract  class Nissan implements ICar, IMusic{
	public Nissan() {
		
	}
	
	int b=30;
	public void makeTurns() {
		System.out.println("making fancy turns");
		IMusic.super.makeTurns();
		ICar.super.makeTurns();
	}
	
	public void drive(){
		System.out.println(a);
		//a=20;
		//adssa
		//asdasdasd
		System.out.println("i am driving tesla");
	}
	public void start(){
		//adssa
		System.out.println("i am starting tesla");
	}
	// 2 complete methods
	// 1 abstract method from implements ICar
}
