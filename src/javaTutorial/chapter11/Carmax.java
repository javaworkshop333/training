package javaTutorial.chapter11;
public class Carmax {

	public static void main(String[] args) {
		//CarVoiceControl cvc=new CarVoiceControl(new Toyota());
		CarCollisionDetector ccd=new CarCollisionDetector(new FlyingCar());
		ccd.display();
	}
}
