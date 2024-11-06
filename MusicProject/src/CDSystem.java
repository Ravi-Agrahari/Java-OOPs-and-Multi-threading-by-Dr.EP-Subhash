//CDSystem.java
public class CDSystem implements CDPlayer{
	public void play(){
		System.out.println("CDSystem is playing song");
	}
	public void stop(){
		System.out.println("CDSystem is stopping");

	}
	public void previous(){
		System.out.println("CDSystem is playing previous song");

	}
	public void next(){
		System.out.println("CDSystem is playing next song");

	}
}
