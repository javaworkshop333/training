package javaTutorial.chapter15;

public class TestPS {
	public static void main(String[] args) {
		p prod=new p();
		c con=new c();
		i inv=new i();
		prod.inverntory=inv;
		con.inverntory=inv;
		
		prod.produce(10);
		con.order(5);
	}

}
