//C6_Final.java

public class C6_Final {
	public static void main(String []args) {
		NonFinal nf = new NonFinal();
		System.out.println("Toal of Value1 + Value2 + Value3 = "+(nf.value1+nf.value2+nf.value3));
	}
}
class NonFinal {
	public final int value1 = 10;
	public final int value2;
	public final int value3;

	public NonFinal(){
		value2=20;		value3=30;
		//value2=40; Error - you cannot re-assign final variable

	}
	public void changeValue3(){

	}
}