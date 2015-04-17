import java.util.ArrayList;

/**
 *Archive of 
 * 
 * @author Olav Rune
 */
public class AudioTrackArchive {

    private ArrayList<AudioTrack> tracks;
    
    
    
    /**
     * Constructor for AudioTracksArchive.
     */
    public AudioTrackArchive() {

        tracks = new ArrayList<>();

    }
    
    /**
     * Adds a track to the archive
     * @param track
     */
    public void addTrack(AudioTrack track)
    {
        tracks.add(track);
        
    }
    /**
     * Remove a track from the archive
     * @param track 
     */
    public void removeTrack(AudioTrack track)
    {
        tracks.remove(track);
               
    }
    /**
     * Get the size of the archive
     * @return number of tracks in the list as an int.
     */
    public int getArchiveSize()
    {
        int listSize = tracks.size();
        return listSize;
    }
    

}
