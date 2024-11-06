
package phone;

import contract.PhoneInterface ;
import media.PhoneMedia ;
import media.Camera ; 

public class SmartPhone extends PhoneMedia implements PhoneInterface {
    
    protected long phoneNumber; 
    public Camera myCamera ; 
    
    public SmartPhone( long phoneNumber){
        this.phoneNumber = phoneNumber ; 
        myCamera = new Camera() ;
    }
    
    @Override
    public void makecall(long targetNumber) {
        System.out.println("Calling " + targetNumber ) ; 
    }
    @Override
    public long receiveCall() {
        return phoneNumber ;
    }
    
    @Override
    public void setMediaId(int mediaId){
        this.MediaId = mediaId ; 
    }
    
    @Override
    public int getMediaId(){
        return this.MediaId ;
    }
    
    @Override
    public void setMediaType(String mediaType){
        this.MediaType = mediaType ; 
    }
  
    
    public String getMediaType(){
        return this.MediaType ;
    }
}
