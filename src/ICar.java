// to do list
// abstract program
public interface ICar {
	int a=10; // constants 
	// 3 incomplete/abstract methods
	public void drive();
	public void start();
	public void stop();
	default void makeTurns() {
		// a=30;
		System.out.println("making turns");
	}
}
