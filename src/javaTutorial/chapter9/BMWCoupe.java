package javaTutorial.chapter9;

//BMWCoupe extends BMWEngine class and inherits the engine
//implements 2 door body type and launch as coupe car
//this class has both mandatory methods from BMW interface
//this is a complete BMW type
public class BMWCoupe extends BMWEngine{
	public void bodyType()
	{
		System.out.println("Has 2 doors");
	}
}
