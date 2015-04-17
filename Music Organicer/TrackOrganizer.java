import java.util.ArrayList;
/**
 * Generating list of all exsiting tracks, regardless of its medium referance
 * @author Vegard Rogne @ HialsEliten
 */
public class TrackOrganizer {
    
    // Initializing variables
    ArrayList<AudioTrack> tracks; 
    
    // Constructor for TrackOrganizer
    public TrackOrganizer()
    {
        // Assigning variables
        tracks = new ArrayList<AudioTrack>();        
    }

        
    /**
     * Adds track to tacks
     * 
     * @param audioTrack audio track you want to add
     */
    public void addTrack(AudioTrack track) {
        this.tracks.add(track);
    }
}
    
