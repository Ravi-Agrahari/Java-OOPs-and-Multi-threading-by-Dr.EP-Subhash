//Overload.java
public class Overload {
	public static void main(String []args){
		Calculator calc = new Calculator();
		calc.calculate();
		calc.calculate(10);
		calc = new AdvCalculator();
		// calc.calculate(20,30); //Error - calc cannot call sub class calculate method...
		AdvCalculator calc1 = (AdvCalculator) calc;
		calc1.calculate(20,30);
	}
}

class Calculator{
	public void calculate(){
		System.out.println("Calculate with no Value: "+0);
	}
	public void calculate(int x){
		System.out.println("Calculate with 1 Value: "+x);
	}
}

class AdvCalculator extends Calculator{
	public void calculate(int x, int y){
		System.out.println("Calculate with 1 Value: "+(x+y));
	}
}