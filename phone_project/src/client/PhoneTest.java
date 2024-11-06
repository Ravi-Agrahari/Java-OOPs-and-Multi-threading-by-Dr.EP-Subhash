
package client;
import phone.SmartPhone ; 
import phone.IPhone ;

public class PhoneTest {
    
    public static void main(String[] args){
        SmartPhone mySmartPhone ; 
        mySmartPhone = new SmartPhone(980079);
        
        
        mySmartPhone.myCamera.setVideo_id(7777) ; 
        
        long myVideo = mySmartPhone.myCamera.getVideo_id(); 
        
        mySmartPhone.setMediaId((int)myVideo);
        mySmartPhone.setMediaType("Video") ; 
        
        System.out.println("This is my media Id :" + mySmartPhone.getMediaId());
        System.out.println("This is my media type : " + mySmartPhone.getMediaType());
        
        
        IPhone myIPhone = new IPhone(980079) ;
        myIPhone.myHealth.setStepsWalked(100);
        myIPhone.myHealth.setFloorsClimb(3);
        
        System.out.println("The health record \n  - Step Walked : " + myIPhone.myHealth.getStepsWalked());
        System.out.println(" - Floor Climbed : " + myIPhone.myHealth.getFloorsClimb());
        
        
    }
    
}
