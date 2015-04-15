import java.util.ArrayList;

/**
 * Write a description of class Tape here.
 * 
 * @Olav
 * @15.04.15
 */
public class Tape extends ArchivedMedium
{
    private ArrayList<AudioTracks> tapeTracks;
    String type;
    

    /**
     * Constructor for objects of class Tape
     */
    public Tape(String title, String type)
    {
        super(title);
        this.type = type;
        tapeTracks = new ArrayList<AudioTracks>();
        
        
        
    }
    
    
    /**
     * Add a track to the end of the tracklist. 
     * @param track
     */
    public void addTrack(AudioTracks track)
    {
        tapeTracks.add(track);
    }
  
    

    
    
}
