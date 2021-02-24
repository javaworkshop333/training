
public class Memory {
	public int a; // primitive , global and has default value
	AddressClass b=new AddressClass();//complex
	boolean c; // primitive
	AddressClass d=new AddressClass();//complex
	
	String firstName=new String("john");
	String lastName="doe";
	String s1;
	
	
	private void abc() {
		System.out.println( a  );
	}
	public void def() {
		abc();
	}
}
