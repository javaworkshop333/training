package javaTutorial.chapter9;

//BMW4Door extends BMWEngine class and inherits the engine
// implements 4 door body type and launch as 4 door car
// this class has both mandatory methods from BMW interface
// this is a complete BMW type
public class BMW4Door extends BMWEngine{

	public void bodyType()
	{
		System.out.println("Has 4 doors");
	}
}
