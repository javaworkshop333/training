package javaTutorial.chapter15;

public class TestDeadlock {

	public static void main(String[] args) {
		Sibling brother=new Sibling("john", 1);
		Sibling sister=new Sibling("jane", 2);
		brother.start();
		sister.start();
	}

}
