//Super.java

public class Super {
	private static int staticVal;
	private static int instanceVal;
	{
					System.out.println("Before constructor, I am an instance block #"+ ++instanceVal );
	}
	public Super(){
		System.out.println("I am a Super constructor");
	}
	static {
			System.out.println("Before main, I am Static #"+ ++staticVal );
	}
	public static void main(String []args) {
		System.out.println("Before instance created, I am inside main");
		Super s1=new Super();
		System.out.println("After instance created, I am inside main");
	}
	static {
		System.out.println("After main, I am Static #"+ ++staticVal );
	}
	{
				System.out.println("After constructor, I am an instance block #"+ ++instanceVal );
	}
}