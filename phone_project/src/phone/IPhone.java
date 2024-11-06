
package phone;
import Health.Health ; 


public class IPhone extends SmartPhone {
    
        public Health myHealth ; 
    
        public IPhone(long phoneNumber){
            super(phoneNumber) ;
            myHealth = new Health() ; 
        }
}
