
/*
 	
Interface 
---------
    -> It can be analysis as contract , mean the feature in interface must be impletement by subclass , or subinterfaces.
 */

package contract ;


//C4_Vehicle
public interface C4_Vehicle {
	public void move();
	public void stop();
	public void speedup();
	public void slowdown();
}