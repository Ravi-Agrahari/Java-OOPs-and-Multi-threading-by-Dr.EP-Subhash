//Inherit.java
public class Inherit {
	public static void main(String []args){
		Water w = new Water();
	}
}

class Liquid extends Object {
	private int measure;
	public Liquid(){
		System.out.println("No argument Constructor: Inside Liquid");
		this.measure=0;
	}
	public Liquid(int measure){
		System.out.println("Argumented Constructor: Inside Liquid");
		this.measure=measure;

	}
	public int getMeasure(){
		return measure;
	}
}

class Water extends Liquid {
	public Water(){
		super();
		System.out.println("No argument Constructor: Inside Water");
	}
	public Water(int measure){
		super(measure);
		System.out.println("Argumented Constructor: Inside Water");
	}
}