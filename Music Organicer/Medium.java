import java.util.ArrayList;

/**
 * Write a description of class Medium here.
 * 
 * @Kelvin og Vegard) 
 * @20.04.15
 * 
 */
public class Medium
{
    // instance variables - replace the example below with your own
    private String title;
    private DurationHandeling totalDuration;
    private ArrayList<AudioTrack> trackList;

    /**
     * Constructor for objects of class Medium
     */
    public Medium(String title)
    {
        this.title = title;
        totalDuration = new DurationHandeling();
        trackList = new ArrayList<AudioTrack>();
        
    }
    
    /*
     * Add a track to the mediums track list
     * 
     * @param    track  Track to add (type Track)
     */
    public void addTrack(int index, AudioTrack track)
    {
        trackList.add(index, track);
    }
        
    /**
     * 
     *
     * @return The return value
     */
    public String getTypeOfMedium()
    {
        return null;
    }
    

}
