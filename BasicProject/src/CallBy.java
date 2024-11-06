//CallBy.java

public class CallBy {
	public static void main(String []args){
		Car car = new Car();
		car.color="Red";
		System.out.println("Before, car color is "+car.color);
		carOp(car);
            System.out.println("After, car color is "+car.color);

	}
	private static void carOp(Car car){
//		car = new Car();
		car.color="green";
		System.out.println("Inside carOp, car color is "+car.color);
	}
}
class Car{
	String color;
}