//C4_VehicleApp.java


package client ; 
import concrete_class.* ;

public class C4_VehicleApp {
	public static void main(String []args) {
		C4_MotorBike mbike = new C4_MotorBike();
		C4_BiCycle bicycle = new C4_BiCycle();
//		mbike.move();
//		mbike.speedup();
//		mbike.slowdown();
//		mbike.stop();
//		bicycle.move();
//		bicycle.speedup();
//		bicycle.slowdown();
//		bicycle.stop();	
		
		// toString is not in implementation , so from where toString came :???? 
		// In Java , all the class were 
		System.out.println(mbike.toString());
	}
}