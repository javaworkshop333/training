package javaTutorial.chapter9;

// this is an incomplete BMW , it contains BMW engine only, body type is not provided.
// we cannot create object of abstract class since it is incomplete class
// these classes are created when designer/developer wish to keep the common systems aside
// so it can be used by other sub classes
// BMW4Door extends this class and inherits the engine, adds 4 door body type and launch as 4 door car
// BMWCoupe extends this class and inherits the same engine implementation as well, adds 2 door body type and launch as coupe car
public abstract class BMWEngine implements BMW {
	public void engine()
	{
		System.out.println("powerful engine");
	}
}
