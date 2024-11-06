
package polymorphismproject;

public class SportCar extends Car {
    public SportCar(){
        System.out.println("This is sportcar") ; 
    }
    
    @Override
    public String getSpeed(){
        return "the current speed of sportcar is 120 kmph"  ;
    }
}
