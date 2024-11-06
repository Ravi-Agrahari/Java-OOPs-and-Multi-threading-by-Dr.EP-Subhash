
package polymorphismproject;


public class SUV extends Car {
    public SUV(){
        System.out.println("This is an SUV Car") ; 
    }
    
    @Override
    public String getSpeed(){
        return "The current speed of SUV is 100 kmph" ;
    }
}
