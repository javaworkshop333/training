
public class Inheritancetest {

	public static void main(String[] args) {
		// Icar - driver, start,stop
		// nissan - start, drive,stop,playmusic
		// nissanz - start, drive,stop,playmusic,takeReverse
		int a=20;
		NissanZ z=new NissanZ();
		Nissan n=new NissanZ(); 
		ICar i=new NissanZ();
		// methods call and variables access -
		// look at  datatype 
		z.takeReverse();// look at methods in z datatype(NissanZ)
		n.takeReverse();// look at methods in n datatype(Nissan)
		i.takeReverse();// look at methods in i datatype(ICar)
		System.out.println(  ((NissanZ)i).c  );
	}

}
