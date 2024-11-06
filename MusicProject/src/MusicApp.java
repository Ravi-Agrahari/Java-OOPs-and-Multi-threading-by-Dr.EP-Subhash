//MusicApp.java

public class MusicApp {
	public static void main(String []args){
		//First let us create a music system instance with Tape System as preference
		MusicSystem system = new MusicSystem(0);
		system.play();
		system.selectNext();
		system.selectPrevious();
		system.stop();
		//Now let us switch to CD system

		system.selectPlayer(1);
		system.play();
		system.selectNext();
		system.selectPrevious();
		system.stop();
	}
}