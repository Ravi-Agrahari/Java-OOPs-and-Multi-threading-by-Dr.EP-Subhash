
/*
 	Here BiCycle extends twoWheeler , where speedup and slowdown is not implemented , so overriding that , 
 	because in Concrete class all the abstract method should be implemented/ overriden .
 */

package concrete_class ;
import partial_contract.C4_TwoWheeler; 

//C4_BiCycle.java

 public class C4_BiCycle extends C4_TwoWheeler {
	public void speedup(){
		System.out.println("Speediup with pedals");
	}
	public void slowdown(){
		System.out.println("Slowing down with pedals and manual brakes");
	}
}