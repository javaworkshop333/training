package javaTutorial.chapter11;
public class Enterpris {

	
	public static Car getACar(int options)
	{
		String a;
		if(options==1)
		{
			Nissan n=new Nissan();
			return n;
		}
		else{
			Toyota t=new Toyota();
			return t;
		}
	}
	
	
}
