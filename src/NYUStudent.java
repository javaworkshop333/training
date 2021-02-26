
public class NYUStudent {
	public static String address;
	public String name;
	public int semester;
	// no static method can use both static/non static variable/methods
	public void method1() {
		System.out.println(name);
		System.out.println(address);
	}
	// static method can ONLY use both static variable/methods
	public static void method2() {
		System.out.println(name);
		System.out.println(address);
	}
	public static void method3() {
		method1();
		method2();
		System.out.println(address );
		System.out.println( semester  );
	}
	
}
