import java.util.ArrayList;

/**
 *
 * @author Olav Rune
 */
public class AudioTracksArchive {

    private ArrayList<AudioTrack> tracks;
    
    
    
    /**
     * 
     */
    public AudioTracksArchive() {

        tracks = new ArrayList<>();

    }
    
    /**
     * 
     * 
     */
    public void addTrack(AudioTrack track)
    {
        tracks.add(track);
        
    }
    
    public void removeTrack(AudioTrack track)
    {
        tracks.add(track);
               
    }

}
