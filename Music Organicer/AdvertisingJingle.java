
/**
 * Write a description of class AdvertisingJingle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdvertisingJingle extends AudioTracks
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class AdvertisingJingle
     */
    public AdvertisingJingle(String title, Duration duration )
    {   
        super(title, duration);
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}