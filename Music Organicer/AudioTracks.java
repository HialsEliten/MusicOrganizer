import java.time.Duration;
/**
 * Common audiotrack logic
 * 
 * @HialsEliten
 * @10.04.15
 */
public class AudioTracks
{
    // instance variables
    private String title;
    private Duration duration;
    //private REFERANSE!!!!!!!!!!!!!!!!!!!!!

    /**
     * Constructor for objects of class AudioTracks
     */
    public AudioTracks(String title, Duration duration)
    {
        this.title = title;
        this.duration = duration;
    }

    /**
     * Returns the title of the track
     * 
     * @return     title 
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Returns the duration of the track
     * 
     * @return     duration 
     */
    public Duration getDuration()
    {
        return duration;
    }
    
    /**
     * Set new title
     * 
     * @param   newTitle
     */
    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }
    
    /**
     * Set new duration
     * 
     * @param   newDuration
     */
    public void setDuration(Duration newDuration)
    {
        this.duration = newDuration;
    }
    
}
