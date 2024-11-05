
/*
 * Partial Implementation
 * ----------------------- 
 		Abstract class can override some  of abstract classes as per need from the implemented Interface
 */


package partial_contract ; 
import contract.C4_Vehicle;


/*
 	Object package in Java 
 	-----------------------
 */

import java.lang.Object;

//C4_TwoWheeler.java

public abstract class C4_TwoWheeler implements C4_Vehicle {
	public void move(){
		System.out.println("Running with two wheels");
	}
	public void stop(){
		System.out.println("Stopping with two wheels and your legs");
	} 
	
	
	// Overriding the toString() method of Object 
	
	public String toString() {
		return this.getClass() + "- toString overriden by Ravi :) "	;
	}
}