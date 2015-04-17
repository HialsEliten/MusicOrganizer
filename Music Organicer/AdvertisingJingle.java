import java.time.Duration;
/**
 * Write a description of class AdvertisingJingle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdvertisingJingle extends AudioTrack
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class AdvertisingJingle
     */
    public AdvertisingJingle(String title, Duration duration,  Medium medium )
    {   
        super(title, duration, medium);  
    }
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        return x + y;
    }
}
