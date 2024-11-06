//MusicSystem.java
public class MusicSystem{
	private MusicPlayer player;
	private String []playerNames;
	{
		playerNames=new String[2];
		playerNames[0]="Tape Player";
		playerNames[1]="CD Player";
	}
	public MusicSystem(int i){
		fixPlayer(i);
	}
	public void selectPlayer(int i){
		fixPlayer(i);
	}
	private void fixPlayer(int i){
		if(i<0 || i>1) i=0;
		player=i==0?(new TapeSystem()):(new CDSystem());
		System.out.println("Selected player is "+playerNames[i]);
	}
	public void play(){
		player.play();
	}
	public void stop(){
		player.stop();
	}
	public void selectNext(){
		if(player instanceof TapeSystem){
			TapeSystem tape = (TapeSystem) player;
			tape.forward();
		} else if(player instanceof CDSystem){
			CDSystem cd = (CDSystem) player;
			cd.next();
		}
	}
	public void selectPrevious(){
		if(player instanceof TapeSystem){
			TapeSystem tape = (TapeSystem) player;
			tape.rewind();
		} else if(player instanceof CDSystem){
			CDSystem cd = (CDSystem) player;
			cd.previous();
		}
	}
}
