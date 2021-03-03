package javaTutorial.chapter17;
import java.util.HashSet;
public class UniqueTest {
	public static void main(String[] args) {
		 HashSet<Stud> st=new HashSet<>();
		 Stud s1=new Stud("john",1);
		 Stud s2=new Stud("jane",1);
		 Stud s3=new Stud("mike",2);
		 Stud s4=new Stud("andy",3);
		 Stud s5=new Stud("john",1);
		 st.add(s1);
		 st.add(s2);
		 st.add(s3);
		 st.add(s4);
		 st.add(s5);
		 System.out.println(st.size());
	}
}