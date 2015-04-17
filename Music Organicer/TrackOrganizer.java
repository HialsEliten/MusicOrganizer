
import java.util.ArrayList;

/**
 * Generating list of all exsiting tracks, regardless of its medium referance
 *
 * @author Vegard Rogne @ HialsEliten
 */
public class TrackOrganizer {

    // Initializing variables
    private AudioTrackArchive trackArchive;

    // Constructor for TrackOrganizer
    public TrackOrganizer() {
        // Assigning variables
        trackArchive = new AudioTrackArchive();
    }

    /**
     * Adds track to track archive
     *
     * @param audioTrack audio track you want to add
     */
    public void addTrack(AudioTrack track) {
        this.trackArchive.addTrack(track);
    }

    /**
     * Removes track from track archive
     *
     * @param audioTrack audio track you want to remove
     */
    public void removeTrack(AudioTrack track) {
        this.trackArchive.removeTrack(track);
    }
    
    
}
