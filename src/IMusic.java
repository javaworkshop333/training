
public interface IMusic {
	public void playMusic();
	default void makeTurns() {
		System.out.println("making turns while playing music");
	}
}
