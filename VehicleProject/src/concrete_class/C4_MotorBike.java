


//C4_MotorBike.java

package concrete_class ;
import partial_contract.C4_TwoWheeler; 


 public class C4_MotorBike extends C4_TwoWheeler {
	public void move(){
		System.out.println("Running with two wheels using motors");
	}
	public void stop(){
		System.out.println("Stopping with two wheels, motors and your legs");
	}public void speedup(){
		System.out.println("Speediup with accelerators");
	}
	public void slowdown(){
		System.out.println("Slowing down with pedals and mechanised brakes");
	}
}