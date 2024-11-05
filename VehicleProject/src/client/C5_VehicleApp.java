//C5_VehicleApp.java

package client ; 
import concrete_class.C4_MotorBike; 
import contract.C4_Vehicle; 


public class C5_VehicleApp {
	public static void main(String []args) {
		C4_Vehicle vehicle = new C4_MotorBike();
		vehicle.move();
	}
}