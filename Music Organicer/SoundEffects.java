import java.time.Duration;

/**
 * Write a description of class SoundEffects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundEffects extends AudioTracks
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class SoundEffects
     */
    public SoundEffects(String title, Duration duration, String description,  Medium medium )
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
        // put your code here
        return x + y;
    }
}
