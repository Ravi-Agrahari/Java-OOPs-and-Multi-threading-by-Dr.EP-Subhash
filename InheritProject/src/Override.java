//Override.java
public class Override {
	public static void main(String []args){
		LivingThing lt = new LivingThing();
		lt.birth();
		lt.death();
		lt = new Moth();
		lt.birth();
		lt.death();
		//lt.fly(); //Error-LivingThing cannot fly. Only its subclass Moth type can fly
		Moth m = (Moth)lt;
		m.fly();
		Cat c = (Cat) lt;
	}
}

class LivingThing {
	public void birth(){
		System.out.println("LT birth");
	}
	public void death(){
		System.out.println("LT death");
	}
}

class Moth extends LivingThing {
	public void birth(){
		System.out.println("Moth birth");
	}
	public void death(){
		System.out.println("Moth death");
	}
	public void fly() {
		System.out.println("Moth flies");
	}
}

class Cat extends LivingThing {
	public void birth(){
		System.out.println("Cat birth");
	}
	public void death(){
		System.out.println("Cat death");
	}
	public void run() {
		System.out.println("Cat runs");
	}
}