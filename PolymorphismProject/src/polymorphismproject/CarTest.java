
package polymorphismproject;

public class CarTest {
    public static void main(String[] args){
        
        Car c  = new Car() ; 
        System.out.println(c.getSpeed()); 
        
        c = new SUV() ;
        System.out.println(c.getSpeed()); 
        
        c = new SportCar() ; 
        System.out.println(c.getSpeed()); 
        
        
        
    }
}
