//TapeSystem.java
public class TapeSystem implements TapePlayer{
	public void play(){
		System.out.println("TapeSystem is playing song");
	}
	public void stop(){
		System.out.println("TapeSystem is stopping");

	}
	public void rewind(){
		System.out.println("TapeSystem is rewinding");

	}
	public void forward(){
		System.out.println("TapeSystem is forwarding");

	}
}
