import java.util.ArrayList;

/**
 *
 * @author Olav Rune
 */
public class AudioTracksArchive {

    private ArrayList<AudioTracks> tracks;
    
    
    
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
    public void addTrack(AudioTracks track)
    {
        tracks.add(track);
        
    }
    
    public void removeTrack(AudioTracks track)
    {
        tracks.add(track);
               
    }

}
