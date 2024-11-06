package media;


abstract public class PhoneMedia {
    protected int MediaId ; 
    protected String MediaType ; 
    
    public abstract void setMediaId(int mediaId);
    
    public abstract int getMediaId() ;
    
    public abstract void setMediaType(String mediaType);
    
    public abstract String getMediaType() ;
}
