
public class Accountnt {
	
	int a; // instance variable (global technicalterm-scope/visibility)
	static int b; // class variable (global technicalterm-scope)
	String name="john"; //1 global
	
	public int add(int a, int b){//2 ,3 // local
		System.out.println(a);
		System.out.println(b);
		int sum=a+b;// local
		 
		return sum;
	}

	public void test() {
		int x=10; // exists - from declaration till end of block
	//System.out.println(  x  );
	{
		int x=10; // exists - from declaration till end of block
		System.out.println(  x  );
		{
			int x=10; // exists - from declaration till end of block
		}
	}
	int a;
	System.out.println(  x  );

}

	public void sum() {
		{
			{
				{
					int a=40; //technicalterm- scope.
								// scope of vairable a here is 35 till 37
				}
				{
					int a=30;
				}
			}
			a=20;
		}
}
}
